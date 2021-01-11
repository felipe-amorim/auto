package com.autoavaliar.support.web.find.exceptionals;

import com.autoavaliar.intern.Instances;

public class GetterPopUps {
    public String text(){
        return Instances.getWebDriver().switchTo().alert().getText();
    }
}
