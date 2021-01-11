package com.autoavaliar.support.web.find.exceptionals;

import com.autoavaliar.intern.Instances;


public class ExceptionalsWeb {
    public PopUps popUp(){
        return Instances.getPopUpsClassInstance();
    }

    public FramesWeb frame(){
        return Instances.getFramesWebClassInstance();
    }
}
