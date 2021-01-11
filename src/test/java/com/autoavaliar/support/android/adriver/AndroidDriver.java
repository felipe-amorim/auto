package com.autoavaliar.support.android.adriver;

import com.autoavaliar.intern.Instances;

public class AndroidDriver {
    public Capabilities capabilities(){
        return Instances.getCapabilitiesClassInstance();
    }

    public void back(){
        Instances.getAndroidDriver().navigate().back();
    }

    public void foward(){
        Instances.getAndroidDriver().navigate().forward();
    }

    public void enter(){
        //((io.appium.java_client.android.AndroidDriver) Instances.getAndroidDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
        //Actions action = new Actions(Instances.getAndroidDriver());
        //action.sendKeys(Keys.ENTER).perform();
    }
}


