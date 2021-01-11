package com.autoavaliar.intern;

import com.autoavaliar.support.web.ScrollWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.Set;

public class Execute {

    public void execute(Runnable runnable){
        execute(runnable, false);
    }

    public void execute(Runnable runnable, boolean isAvailable){
        boolean executed = false;
        int amoutToScroll = 50;
        int scrollInterval = 50;
        int scrollSwitch = 1;
        ScrollWeb scrollWeb = new ScrollWeb();
        try {
            runnable.run();
            executed = true;
            Instances.setIsAvailable(true);
        }catch (WebDriverException e){
            Instances.setLastException(e);
            int localTime = Instances.getDefaultWaitMilis();
            while (true) {
                long tempoInicial = Calendar.getInstance().getTimeInMillis();
                try {
                    runnable.run();
                    Instances.setIsAvailable(true);
                    executed = true;
                    break;
                }catch (WebDriverException ee){
                    System.out.println("exxxxx "+String.valueOf(ee).split("\n")[0]);
                    if(ee.getMessage().contains("Invalid internal element ID requested:") || ee.getMessage().contains("Element does not exist in cache") || ee.getMessage().contains("Element is no longer valid")){
                        executed = true;
                        break;
                    }
                    if(ee.getMessage().contains("Unable to get browser") || ee.getMessage().contains("No alert is active")) {
                        System.out.println("Page not found, trying another...");
                        Set<String> windows = Instances.getWebDriver().getWindowHandles();
                        int contadorDePaginas = 0;
                        for (String pagina : windows) {
                            try {
                                Instances.getWebDriver().switchTo().window(pagina);
                                System.out.println("Trying the page: " + contadorDePaginas);
                                contadorDePaginas++;
                                runnable.run();
                                Instances.setIsAvailable(true);
                                executed = true;
                                break;
                            } catch (WebDriverException ignored) {
                            }
                        }
                        if (executed) {
                            break;
                        }
                    }
                    if(ee.getMessage().contains("element click intercepted:")){
                        if(scrollSwitch>0){
                            scrollWeb.up(amoutToScroll);
                        }else {
                            scrollWeb.down(amoutToScroll);
                        }
                        amoutToScroll+=scrollInterval;
                        scrollSwitch = scrollSwitch*-1;

                    }
                    Instances.setLastException(ee);
                    //tempoInicial = Calendar.getInstance().getTimeInMillis();
                }
                long tempoFinal = Calendar.getInstance().getTimeInMillis();
                int diferenca = (int) (tempoFinal-tempoInicial);
                if(diferenca < 100){
                    diferenca += 100;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
                localTime = localTime - diferenca;
                System.out.println("Tempo decorrido na execução - execute: "+diferenca);
                System.out.println("Tempo restante para a execução - execute: "+localTime);
                if(localTime<=0){
                    break;
                }
            }
        }
        if(!executed){
            if(!isAvailable) {
                Instances.getReportClassInstance().stepFail(Instances.getLastException());
            }else {
                Instances.setIsAvailable(false);
            }
        }else {
            try {
                if(Instances.getWebLastElements()!=null){
                    JavascriptExecutor js = (JavascriptExecutor) Instances.getWebDriver();
                    for (WebElement element : Instances.getWebLastElements()) {
                        js.executeScript("arguments[0].style.border='3px solid red'", element);
                    }
                }
            }catch (WebDriverException e){
                System.out.println("exception pintando borda vermelho: "+String.valueOf(e).split("\n")[0]);
            }
        }
    }
}

