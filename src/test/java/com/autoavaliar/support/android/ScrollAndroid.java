package com.autoavaliar.support.android;

import com.autoavaliar.intern.Instances;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class ScrollAndroid {
    public void down(int amount) {
        Dimension dim = Instances.getAndroidDriver().manage().window().getSize();
        int width = dim.getWidth() / 2;
        for (int i = 0; i < amount; i++) {
            int startY = (int) (dim.getHeight() * 0.7);
            int endY = (int) (dim.getHeight() * 0.5);
            new TouchAction(Instances.getAndroidDriver()).press(point(width, startY)).waitAction(waitOptions(Duration.ofSeconds(1)))
                    .moveTo(point(width, endY)).release().perform();
        }
    }

    public void up(int amount) {
        Dimension dim = Instances.getAndroidDriver().manage().window().getSize();
        int width = dim.getWidth() / 2;
        for (int i = 0; i < amount; i++) {
            int startY = (int) (dim.getHeight() * 0.7);
            int endY = (int) (dim.getHeight() * 0.5);
            new TouchAction(Instances.getAndroidDriver()).press(point(width, endY)).waitAction(waitOptions(Duration.ofSeconds(1)))
                    .moveTo(point(width, startY)).release().perform();
        }
    }
}
