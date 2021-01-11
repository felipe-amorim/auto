package com.autoavaliar.support.web.driver;

import com.autoavaliar.intern.Instances;

public class IEOptions {
    public IEOptions compability(){
        Instances.setCompability(true);
        return this;
    }

    public IEOptions cleanSection(){
        Instances.setCleanSection(true);
        return this;
    }
}
