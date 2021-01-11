package com.autoavaliar.support.web.driver;

import com.autoavaliar.intern.Instances;

public class SetterConfig {
    public BrowserTypes browser(){
        return Instances.getBrowserTypesClassInstance();
    }

    public DriverOptions options(){
        return Instances.getDriverOptionsClassInstance();
    }
}
