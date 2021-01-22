package com.autoavaliar.intern;

import com.autoavaliar.support.android.ScrollAndroid;
import com.autoavaliar.support.web.ScrollWeb;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.*;

import java.util.List;

public class LocatorAndroid {

    void locate() {
        int scrollSwitch = 1;
        ScrollAndroid scrollAndroid = new ScrollAndroid();
        int amoutToScroll = 1;
        int scrollInterval = 1;
        List<MobileElement> elements = null;
        try {
            int localTime = Instances.getDefaultWaitMilis();
            while (true) {
                if (Instances.getAndroidLastXpath().startsWith("/") || Instances.getAndroidLastXpath().startsWith("(")) {
                    elements = Instances.getAndroidDriver().findElements(By.xpath(Instances.getAndroidLastXpath()));
                } else {
                    elements = Instances.getAndroidDriver().findElements(By.id(Instances.getAndroidLastXpath()));
                }
                if (elements.size() > 0) {
                    break;
                } else {
                    try {
                        if (scrollSwitch < 0) {
                            scrollAndroid.up(amoutToScroll);
                        } else {
                            scrollAndroid.down(amoutToScroll);
                        }
                        amoutToScroll += scrollInterval;
                        scrollSwitch = scrollSwitch * -1;
                    } catch (InvalidArgumentException | InvalidElementStateException ignore) {
                    }
                }

                localTime = localTime - 100;
                Instances.getSleepAndroidClassInstance().until(100);
                System.out.println("Remaining time: " + localTime);
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
            } else {
                e.printStackTrace();
            }
        }
        Instances.setAndroidLastElements(elements);
    }
}
