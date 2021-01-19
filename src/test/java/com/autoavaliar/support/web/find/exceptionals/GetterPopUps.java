package com.autoavaliar.support.web.find.exceptionals;

import com.autoavaliar.intern.Instances;

public class GetterPopUps {
    public String text(){
        final String[] retorno = {""};
        Instances.getExecuteClassInstance().execute(()->{
            retorno[0] = Instances.getWebDriver().switchTo().alert().getText();
        }, false, true);
        return retorno[0];
    }
}
