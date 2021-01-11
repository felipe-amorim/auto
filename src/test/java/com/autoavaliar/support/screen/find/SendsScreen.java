package com.autoavaliar.support.screen.find;

import com.autoavaliar.intern.Instances;
import org.sikuli.script.Key;
import com.autoavaliar.support.convert.Converter;

public class SendsScreen {

    public SendsScreen nonRobotic(){
        Instances.setNonRobotic(true);
        return this;
    }

    public SendsScreen slow(){
        Instances.setSlow(true);
        return this;
    }

    public void text(String text){
        if(Instances.getSlow()) {
            char[] arrayC = text.toCharArray();
            for (char c:arrayC) {
                Instances.getScreenSikuli().type(String.valueOf(c));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else if (Instances.getNonRobotic()){
            Converter converter = new Converter();
            char[] arrayC = text.toCharArray();
            for (int i = 0; i < arrayC.length; i++) {
                Instances.getScreenSikuli().type(String.valueOf(arrayC[i]));
                int mult = converter.getRandomNumber(1, 16);
                try {
                    Thread.sleep(mult*10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(mult>15){
                    //simular apagar
                    for(int j = 3; j >= 0; j--){
                        Instances.getScreenSikuli().type(Key.BACKSPACE);
                    }
                    if(i<=3){
                        i = -1;
                    }else {
                        i = i - 4;
                    }
                }
            }
        } else {
            Instances.getScreenSikuli().type(text);
        }
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", text) + Instances.getScreenLastLocatorLog());
        Instances.setSlow(false);
        Instances.setNonRobotic(false);
    }

    public void enter(){
        Instances.getScreenSikuli().type(Key.ENTER);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "ENTER") + Instances.getScreenLastLocatorLog());
    }

    public void tab(){
        Instances.getScreenSikuli().type(Key.TAB);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "TAB") + Instances.getScreenLastLocatorLog());
    }

    public void esc(){
        Instances.getScreenSikuli().type(Key.ESC);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "ESC") + Instances.getScreenLastLocatorLog());
    }

    public void backspace(){
        Instances.getScreenSikuli().type(Key.BACKSPACE);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "BACKSPACE") + Instances.getScreenLastLocatorLog());
    }

    public void delete(){
        Instances.getScreenSikuli().type(Key.DELETE);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "DELETE") + Instances.getScreenLastLocatorLog());
    }

    public void arrowRight(){
        Instances.getScreenSikuli().type(Key.RIGHT);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "RIGHT") + Instances.getScreenLastLocatorLog());
    }

    public void arrowLeft(){
        Instances.getScreenSikuli().type(Key.LEFT);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "LEFT") + Instances.getScreenLastLocatorLog());
    }

    public void arrowDown(){
        Instances.getScreenSikuli().type(Key.DOWN);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "DOWN") + Instances.getScreenLastLocatorLog());
    }

    public void arrowUp(){
        Instances.getScreenSikuli().type(Key.UP);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "UP") + Instances.getScreenLastLocatorLog());
    }

    public void pageDown(){
        Instances.getScreenSikuli().type(Key.PAGE_DOWN);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "PAGE DOWN") + Instances.getScreenLastLocatorLog());
    }

    public void pageUp(){
        Instances.getScreenSikuli().type(Key.PAGE_UP);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "PAGE UP") + Instances.getScreenLastLocatorLog());
    }

    public void end(){
        Instances.getScreenSikuli().type(Key.END);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "END") + Instances.getScreenLastLocatorLog());
    }

    public void home(){
        Instances.getScreenSikuli().type(Key.HOME);
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "HOME") + Instances.getScreenLastLocatorLog());
    }

    public void keys(Object keys){
        Instances.getScreenSikuli().type(String.valueOf(keys));
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", String.valueOf(keys)) + Instances.getScreenLastLocatorLog());
    }

    public void keys(Object firstKey, Object secondKey){
        Instances.getScreenSikuli().type(String.valueOf(firstKey), String.valueOf(secondKey));
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", firstKey+" e "+secondKey) + Instances.getScreenLastLocatorLog());
    }
}
