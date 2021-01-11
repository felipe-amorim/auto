package com.autoavaliar.support.web.find;

import com.autoavaliar.intern.Instances;
import org.openqa.selenium.WebElement;

public class ClicksWeb {
    public void twice(){
        if (!Instances.getEach()) {
            org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
            actions.doubleClick(Instances.getWebLastElements().get(0)).perform();
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageDoubleClick() + Instances.getWebLastXpath());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                actions.doubleClick(element).perform();
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageDoubleClickEach() + Instances.getWebLastXpath());
            }
            Instances.setEach(false);
        }
    }
}
