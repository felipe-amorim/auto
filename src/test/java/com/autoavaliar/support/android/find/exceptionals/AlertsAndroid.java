package com.autoavaliar.support.android.find.exceptionals;

import com.autoavaliar.intern.Instances;

public class AlertsAndroid {
    public void accept(){
        Instances.getAndroidDriver().switchTo().alert().accept();
    }

    public void deny(){
        Instances.getAndroidDriver().switchTo().alert().dismiss();
    }
}
