package com.autoavaliar.intern;

import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

public class LocatorWeb {
    public void locate(String input) {
        JavascriptExecutor js = (JavascriptExecutor) Instances.getWebDriver();
        if (Instances.getWebLastElements() != null) {
            try {
                for (WebElement element : Instances.getWebLastElements()) {
                    js.executeScript("arguments[0].style.border='1px solid orange'", element);
                }
            } catch (WebDriverException e) {
                System.out.println("exception pintando pagina laranja: ");
            }
        }
        //if (Instances.getWebLastModal() != null) {
        //    try {
        //        for (WebElement element : Instances.getWebLastModal()) {
        //            js.executeScript("arguments[0].style.border='1px solid orange'", element);
        //        }
        //    } catch (WebDriverException e) {
        //        System.out.println("exception pintando pagina laranja: ");
        //    }
        //}
        int tempoDeEspera = Instances.getDefaultWaitMilis();
        try {
            String estadoDaPagina = String.valueOf(((JavascriptExecutor) Instances.getWebDriver()).executeScript("return document.readyState"));
            System.out.println("Page loading status: " + estadoDaPagina);

            if (Instances.getPageLoad()) {
                if (estadoDaPagina.equals("complete")) {
                    tempoDeEspera = 1000;
                }
            }
        }catch (WebDriverException e){
            System.out.println("exception javascript: "+String.valueOf(e).split("\n")[0]);
        }

        List<WebElement> elements = new ArrayList<>();
        Set<String> windows = Instances.getWebDriver().getWindowHandles();
        System.out.println("Amount of pages found: " + windows.size());
        int contadorDePagina = 1;
        for (String pagina : windows) {
            System.out.println("Trying the page: " + contadorDePagina);
            contadorDePagina ++;
            int localTime = tempoDeEspera;
            while (true) {
                long ti = Calendar.getInstance().getTimeInMillis();
                long tf;
                int tr;
                Instances.getWebDriver().switchTo().window(pagina);
                try {
                    if (input.startsWith("/") || input.startsWith("(")) {
                        elements = Instances.getWebDriver().findElements(By.xpath(input));
                    } else {
                        elements = Instances.getWebDriver().findElements(By.id(input));
                    }
                } catch (IllegalArgumentException e1) {
                    Instances.getWebDriver().switchTo().alert();
                } catch (NoAlertPresentException ignored) {
                }

                if (elements.size() > 0) {
                    break;
                } else {
                    int quantidadeDeFrames = Instances.getWebDriver().findElements(By.xpath("//frame")).size();
                    quantidadeDeFrames += Instances.getWebDriver().findElements(By.xpath("//iframe")).size();
                    if (quantidadeDeFrames > 0) {
                        for (int i = 0; i < quantidadeDeFrames; i++) {
                            ti = Calendar.getInstance().getTimeInMillis();
                            try {
                                Instances.getWebDriver().switchTo().frame(i);
                                if (input.startsWith("/") || input.startsWith("(")) {
                                    elements = Instances.getWebDriver().findElements(By.xpath(input));
                                } else {
                                    elements = Instances.getWebDriver().findElements(By.id(input));
                                }
                                if (elements.size() > 0) {
                                    break;
                                }
                            } catch (IllegalArgumentException e1) {
                                Instances.getWebDriver().switchTo().alert();
                            } catch (NoAlertPresentException | org.openqa.selenium.NoSuchFrameException ignored) {

                            }
                            tf = Calendar.getInstance().getTimeInMillis();
                            tr = (int) (tf - ti);
                            localTime = localTime - tr;
                            if (localTime <= 0) {
                                break;
                            }
                        }
                    }
                }
                tf = Calendar.getInstance().getTimeInMillis();
                tr = (int) (tf - ti);


                if(tr<100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tr = tr + 100;
                }

                localTime = localTime - tr;

                System.out.println("Tempo decorrido na execução - locator web: "+tr);
                System.out.println("Tempo restante para a execução - locator web: "+localTime);

                if (localTime <= 0) {
                    break;
                }
                if (elements.size() > 0) {
                    break;
                }
            }
            if (elements.size() > 0) {
                break;
            }
        }

        int count = elements.size();
        if (count > 1) {
            System.out.println("The xpath '" + input + "' returned " + count + " elements");
        } else if (count == 1) {
            System.out.println("The xpath '" + input + "' returned one element");
        } else {
            String msg = "The xpath '" + input + "' returned no elements";
            Instances.setWebLastLocatorResult(msg);
            System.out.println(msg);
        }


        Instances.setLastWindows(Instances.getWebDriver().getWindowHandles());
        Instances.setLastIeratos(Instances.getLastWindows().iterator());

        //if(!modal) {
            Instances.setWebLastElements(elements);
        //}else {
        //    //Instances.setWebLastModal(elements);
        //}
    }
}
