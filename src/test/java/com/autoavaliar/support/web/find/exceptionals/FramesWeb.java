package com.autoavaliar.support.web.find.exceptionals;

public class FramesWeb {
    public void navigate(String xpath) {
        //Instances.setWebLastXpath(xpath);
        //if (!Instances.getEach()) {
        //    Instances.getExecuteClassInstance().execute(()->{
        //        //Instances.getWebLastElements().get(0).click();
        //        Instances.getWebDriver().switchTo().frame(Instances.getWebLastElements().get(0));
        //    });
        //    //Instances.getWebDriver().switchTo().frame(Instances.getWebLastElements().get(0));
        //    System.out.println("Navegando para o frame " + Instances.getWebLastXpath());
        //} else {
        //    for (WebElement element : Instances.getWebLastElements()) {
        //        //Instances.getWebDriver().switchTo().frame(element);
        //        Instances.getExecuteClassInstance().execute(()->{
        //            //Instances.getWebLastElements().get(0).click();
        //            Instances.getWebDriver().switchTo().frame(element);
        //        });
        //    }
        //    Instances.setEach(false);
        //}//todo depreciated
    }

    public void setDefault(){
        //Instances.getWebDriver().switchTo().defaultContent();
        //todo depreciated
    }
}
