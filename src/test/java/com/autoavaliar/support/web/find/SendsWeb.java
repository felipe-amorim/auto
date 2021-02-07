package com.autoavaliar.support.web.find;

import com.autoavaliar.intern.Instances;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.autoavaliar.support.convert.Converter;
import org.openqa.selenium.interactions.Actions;

public class SendsWeb {
    public SendsWeb slow(){
        Instances.setSlow(true);
        return this;
    }

    public SendsWeb nonRobotic(){
        Instances.setNonRobotic(true);
        return this;
    }

    public SendsWeb pageDown(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.PAGE_DOWN);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "PAGE DOWN") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.PAGE_DOWN);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "PAGE DOWN") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb space(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.SPACE);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "SPACE") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.SPACE);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "SPACE") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }


    public SendsWeb arrowDown(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.ARROW_DOWN);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "ARROW DOWN") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.ARROW_DOWN);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "ARROW DOWN") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb esc(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.ESCAPE);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "ESCAPE") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.ESCAPE);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "ESCAPE") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb enter(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.ENTER);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "ENTER") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.ENTER);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "ENTER") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb tabEnter(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.TAB, Keys.ENTER);
            });
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "TAB+ENTER") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.TAB, Keys.ENTER);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "TAB+ENTER") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb tab(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.TAB);
            });
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "TAB") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.TAB);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "TAB") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb delete(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.DELETE);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "DELETE") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.DELETE);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "DELETE") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb end(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.END);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "END") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.END);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "END") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb home(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.HOME);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "HOME") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.HOME);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "HOME") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb backspace(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.BACK_SPACE);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "BACK_SPACE") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.BACK_SPACE);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "BACK_SPACE") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return this;
    }

    public SendsWeb setValueThroughJavaScript(String value){
        JavascriptExecutor jse = (JavascriptExecutor) Instances.getWebDriver();
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()-> {
                jse.executeScript("arguments[0].value='" + value + "';", Instances.getWebLastElements().get(0));
            });
        }else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(()-> {
                    jse.executeScript("arguments[0].value='" + value + "';", element);
                });
            }
        }
        return this;
    }

    public SendsWeb text(String text){
        System.out.println("text");
        if(!Instances.getSlow()) {
            System.out.println("send !slow");
            if (!Instances.getEach()) {
                if(!Instances.getNonRobotic()) {
                    Instances.getExecuteClassInstance().execute(() -> {
                        Instances.getWebLastElements().get(0).sendKeys(text);
                    });
                }else {
                    Converter converter = new Converter();
                    char[] arrayC = text.toCharArray();
                    for (int i = 0; i < arrayC.length; i++) {
                        Instances.getWebLastElements().get(0).sendKeys(String.valueOf(arrayC[i]));
                        int mult = converter.getRandomNumber(1, 16);
                        try {
                            Thread.sleep(mult*10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if(mult>15){
                            for(int j = 3; j >= 0; j--){
                                Instances.getWebLastElements().get(0).sendKeys(Keys.BACK_SPACE);
                            }
                            if(i<=3){
                                i = -1;
                            }else {
                                i = i - 4;
                            }
                        }
                    }
                }
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", text) + Instances.getWebLastXpathLog());
            } else {
                for (WebElement element : Instances.getWebLastElements()) {
                    if(!Instances.getNonRobotic()) {
                        Instances.getExecuteClassInstance().execute(() -> {
                            element.sendKeys(text);
                        });
                    }else {
                        Converter converter = new Converter();
                        char[] arrayC = text.toCharArray();
                        for (int i = 0; i < arrayC.length; i++) {
                            element.sendKeys(String.valueOf(arrayC[i]));
                            int mult = converter.getRandomNumber(1, 16);
                            try {
                                Thread.sleep(mult*10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            if(mult>15){
                                for(int j = 3; j >= 0; j--){
                                    element.sendKeys(Keys.BACK_SPACE);
                                }
                                if(i<=3){
                                    i = -1;
                                }else {
                                    i = i - 4;
                                }
                            }
                        }
                    }
                    Instances.getScreenshotClassInstance().print();
                    Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", text) + Instances.getWebLastXpathLog());
                }
            }
        }else {
            if (!Instances.getEach()) {
                for (char c : text.toCharArray()) {
                    Instances.getExecuteClassInstance().execute(()->{
                        Instances.getWebLastElements().get(0).sendKeys(String.valueOf(c));});
                    Instances.getSleepWebClassInstance().until(50);
                }
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendSlow().replace("arg0", text) + Instances.getWebLastXpathLog());
            }else {
                for (WebElement element : Instances.getWebLastElements()) {
                    for (char c : text.toCharArray()) {
                        Instances.getExecuteClassInstance().execute(()->{element.sendKeys(String.valueOf(c));});
                        Instances.getSleepWebClassInstance().until(50);
                    }
                    Instances.getScreenshotClassInstance().print();
                    Instances.getReportClassInstance().stepPass(Instances.getMessageSendSlowEach().replace("arg0", text) + Instances.getWebLastXpathLog());
                }
            }
        }
        Instances.setEach(false);
        Instances.setNonRobotic(false);
        return this;
    }

}
