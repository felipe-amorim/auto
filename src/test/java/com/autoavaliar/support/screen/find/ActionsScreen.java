package com.autoavaliar.support.screen.find;

import com.autoavaliar.intern.Instances;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import com.autoavaliar.support.tbi.JRobot;
import org.sikuli.script.Screen;

public class ActionsScreen {

    public ActionsScreen precision(float precision){
        Instances.setScreenLastPrecision(precision);
        return this;
    }

    public ClicksScreen click() {
        Instances.getExecuteClassInstance().execute(() -> {
            try {
                Pattern p = new Pattern(Instances.getScreenLastLocator()).similar(Instances.getScreenLastPrecision());
                Match m = Instances.getScreenSikuli().find(p);
                m.highlight(1);
                Instances.getScreenSikuli().click(p);
            } catch (Exception e) {
                throw new NoSuchElementException("O localizador " + Instances.getScreenLastLocator() + " não retornou nenhuma imagem\n"+e.getMessage());
            }
        });
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageClick() + Instances.getScreenLastLocatorLog());
        return Instances.getClicksScreenClassInstance();
    }

    public MoveScreen move() {
        Instances.getExecuteClassInstance().execute(() -> {
            try {
                Instances.getScreenSikuli().mouseMove(new Pattern(Instances.getScreenLastLocator()).similar(Instances.getScreenLastPrecision()));
            } catch (FindFailed findFailed) {
                throw new NoSuchElementException("O localizador " + Instances.getScreenLastLocator() + " não retornou nenhuma imagem\n"+findFailed.getMessage());
            }
        });
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageMove() + Instances.getScreenLastLocatorLog());
        return Instances.getMoveScreenClassInstance();
    }

    public boolean exists() {
        final boolean[] existe = {false};
        Instances.getExecuteClassInstance().execute(() -> {
            try {
                Instances.getScreenSikuli().mouseMove(new Pattern(Instances.getScreenLastLocator()).similar(Instances.getScreenLastPrecision()));
                existe[0] = true;
            } catch (FindFailed findFailed) {
                existe[0] = false;
            }
        });
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageExists() + Instances.getScreenLastLocatorLog());
        return existe[0];
    }
}
