package com.autoavaliar.support.web.find.exceptionals;

import com.autoavaliar.intern.Instances;

public class PopUps {
    public void accept(){
        Instances.getExecuteClassInstance().execute(()->{
            Instances.getWebDriver().switchTo().alert().accept();
        }, false, true);
    }

    public void deny(){
        Instances.getExecuteClassInstance().execute(()->{
            Instances.getWebDriver().switchTo().alert().dismiss();
        }, false, true);
    }

    public boolean exists(){
        Instances.getExecuteClassInstance().execute(()->{
            Instances.getWebDriver().switchTo().alert().getText();
        }, true, true);
        return Instances.getIsAvailable();
    }

    public GetterPopUps get(){
        return Instances.getGetterPopUpsClassInstance();
    }
}
