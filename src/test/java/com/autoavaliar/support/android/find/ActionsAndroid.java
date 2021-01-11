package com.autoavaliar.support.android.find;

import com.autoavaliar.intern.Instances;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;

public class ActionsAndroid {
    private void throwExceptionNoElement(){
        if (Instances.getAndroidLastElements().size()<=0) {
            Instances.getReportClassInstance().stepError(new NoSuchElementException("The xpath " + Instances.getAndroidLastXpath() + " returned no elements"));
        }
    }

    public void click() {
        throwExceptionNoElement();
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getAndroidLastElements().get(0).click();});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageClick() + Instances.getAndroidLastXpathLog());
        } else {
            for (MobileElement element : Instances.getAndroidLastElements()) {
                Instances.getExecuteClassInstance().execute(element::click);
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageClickEach() + Instances.getAndroidLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public SendsAndroid send() {
        throwExceptionNoElement();
        return Instances.getSendsAndroidClassInstance();
    }

    public boolean exists(){
        boolean exist = false;
        if (Instances.getAndroidLastElements().size()>0){
            exist = true;
        }
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageExists() + Instances.getAndroidLastXpathLog());
        return exist;
    }

    public GetterActionsAndroid get(){
        return Instances.getGetterActionsAndroidClassInstance();
    }
}
