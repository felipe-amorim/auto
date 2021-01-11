package com.autoavaliar.support.web.driver;

import com.autoavaliar.intern.Instances;

public class GetterConfig {
    public String browser(){
        return Instances.getWebdriverType();
    }

    public int[] resolution(){
        return Instances.getResolution();
    }

    public String activeUrl(){
        return Instances.getWebDriver().getCurrentUrl();
    }
}
