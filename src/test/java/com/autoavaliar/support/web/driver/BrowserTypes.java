package com.autoavaliar.support.web.driver;

import com.autoavaliar.intern.Instances;

public class BrowserTypes {
    public ChromeCapabilities chrome(){
        Instances.setWebdriverType(Instances.chrome);
        return Instances.getChromeCapabilitiesClassInstance();
    }

    public void phantomJs(){
        Instances.setWebdriverType(Instances.phantomjs);
    }

    public void fireFox(){
        Instances.setWebdriverType(Instances.firefox);
    }

    public void opera(){
        Instances.setWebdriverType(Instances.opera);
    }

    public IEOptions internetExplorer(){
        Instances.setWebdriverType(Instances.internetExplorer);
        return Instances.getIEOptionsClassInstance();
    }
}
