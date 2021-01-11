package com.autoavaliar.support.android.find;

import com.autoavaliar.intern.Instances;
import io.appium.java_client.MobileElement;

public class SendsAndroid {
    public void text(String text){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getAndroidLastElements().get(0).sendKeys(text);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", text) + Instances.getAndroidLastXpathLog());
        } else {
            for (MobileElement element : Instances.getAndroidLastElements()) {
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(text);});
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", text) + Instances.getAndroidLastXpathLog());
            }
            Instances.setEach(false);
        }
    }
}
