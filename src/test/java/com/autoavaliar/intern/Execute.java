package com.autoavaliar.intern;

import com.autoavaliar.support.web.ScrollWeb;
import com.autoavaliar.support.web.driver.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

public class Execute {

    public void execute(Runnable runnable){
        execute(runnable, false, false);
    }

    public void execute(Runnable runnable, boolean isAvailable){execute(runnable, isAvailable, false); }


    public void execute(Runnable runnable, boolean isAvailable, boolean isExceptional){
        String erroE = "";
        int scrollSwitch = 1;
        ScrollWeb scrollWeb = new ScrollWeb();
        int amoutToScroll = 50;
        int scrollInterval = 50;
        int contadorDePaginas = 0;
        boolean executed = false;
        long tempoMaximo = Instances.getDefaultWaitMilis();
        while (true){
            long ti = Calendar.getInstance().getTimeInMillis();
            try {
                if (!isExceptional){
                    JavascriptExecutor js = (JavascriptExecutor) Instances.getWebDriver();
                    for (WebElement element : Instances.getWebLastElements()) {
                        js.executeScript("arguments[0].style.border='3px solid red'", element);
                    }
                }
                runnable.run();
                executed = true;
                break;
            } catch (WebDriverException e){
                erroE = e.getMessage();
            }
            if (erroE.length() == 0){
                break;
            } else {
                if(erroE.contains("element click intercepted:")){
                    if(scrollSwitch>0){
                        scrollWeb.up(amoutToScroll);
                    }else {
                        scrollWeb.down(amoutToScroll);
                    }
                    amoutToScroll+=scrollInterval;
                    scrollSwitch = scrollSwitch*-1;
                } else if(erroE.contains("Unable to get browser") || erroE.contains("No alert is active")) {
                    System.out.println("Page not found, trying another...");
                    Set<String> windows = Instances.getWebDriver().getWindowHandles();
                    List<String> windowsStrings = new ArrayList<>(windows);
                    Instances.getWebDriver().switchTo().window(windowsStrings.get(contadorDePaginas));
                    System.out.println("Trying the page: " + contadorDePaginas);
                    contadorDePaginas++;
                }
            }
            long tf = Calendar.getInstance().getTimeInMillis();
            long dif = tf - ti;
            if (dif < 100){
                dif = 100;
            }
            tempoMaximo -= dif;
            System.out.println("Tempo decorrido na execução - execute: "+dif);
            System.out.println("Tempo restante para a execução - execute: "+tempoMaximo);
            if (tempoMaximo <= 0) {
                break;
            }
        }
        if(!executed){
            if(!isAvailable) {
                Instances.getReportClassInstance().stepFail(Instances.getLastException());
            }else {
                Instances.setIsAvailable(false);
            }
        }
    }
}

