package com.autoavaliar.support.web.driver;

import com.autoavaliar.intern.Instances;

public class DriverOptions {
    public void maximized(){
        Instances.setMaximized(true);
    }

    public void resolution(int width, int height){
        Instances.setResolution(width, height);
    }

    public void withUserData(String userDataPath){
        Instances.setUserData(true, userDataPath);
    }

    public void incognito(boolean state){
        Instances.setIncognito(state);
    }
}
