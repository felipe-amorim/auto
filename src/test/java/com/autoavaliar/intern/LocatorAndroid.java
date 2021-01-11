package com.autoavaliar.intern;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriverException;

import java.util.List;

public class LocatorAndroid {

    void locate() {
        List<MobileElement> elements = null;
        try {
            int localTime = Instances.getDefaultWaitMilis();
            while (true) {
                if(Instances.getAndroidLastXpath().startsWith("/")||Instances.getAndroidLastXpath().startsWith("(")) {
                    elements = Instances.getAndroidDriver().findElements(By.xpath(Instances.getAndroidLastXpath()));
                }else{
                    elements = Instances.getAndroidDriver().findElements(By.id(Instances.getAndroidLastXpath()));
                }
                if (elements.size() > 0) {
                    break;
                }
                localTime = localTime - 100;
                Instances.getSleepAndroidClassInstance().until(100);
                System.out.println("Remaining time: "+localTime);
                if (localTime <= 0) {
                    break;
                }
            }
            int count = elements.size();
            if (count > 1) {
                System.out.println("The xpath '" + Instances.getAndroidLastXpath() + "' returned " + count + " elements");
            } else if (count == 1) {
                System.out.println("The xpath '" + Instances.getAndroidLastXpath() + "' returned one element");
            } else {
                System.out.println("The xpath '" + Instances.getAndroidLastXpath() + "' returned no elements");
            }
        } catch (InvalidSelectorException e) {
            System.out.println("The xpath '" + Instances.getAndroidLastXpath() + "' is not valid");
        } catch (WebDriverException e) {
            if (e.getMessage().contains("ocalhost/0:0:0:0:0:")) {
                Instances.getReportClassInstance().stepFatal(e);
            }else {
                e.printStackTrace();
            }
        }
        Instances.setAndroidLastElements(elements);
    }
}
