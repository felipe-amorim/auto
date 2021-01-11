package com.autoavaliar.support.screen.find;

import com.autoavaliar.intern.Instances;

public class MoveScreen {
    public void relative(int x, int y){
        Instances.getExecuteClassInstance().execute(() -> {
            Instances.getScreenSikuli().mouseMove(x, y);
        });
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageMoveScreenRelative().replace("arg0", String.valueOf(x)).replace("arg1", String.valueOf(y)) + Instances.getScreenLastLocatorLog());
    }
}
