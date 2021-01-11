package com.autoavaliar.support.screen.find;

import com.autoavaliar.intern.Instances;
import org.openqa.selenium.NoSuchElementException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import com.autoavaliar.support.tbi.JRobot;

public class ActionsScreen {

    public ActionsScreen precision(float precision){
        Instances.setScreenLastPrecision(precision);
        return this;
    }

    public ClicksScreen click() {
        Instances.getExecuteClassInstance().execute(() -> {
            try {
                int a = 0;
                Pattern p = new Pattern(Instances.getScreenLastLocator()).similar(0.1f);
                Match m = Instances.getScreenSikuli().find(p);
                System.out.println("SCORE1: "+m.getScore());
                m.highlight(1);

                p = new Pattern(Instances.getScreenLastLocator()).similar(0.2f);
                m = Instances.getScreenSikuli().find(p);
                System.out.println("SCORE2: "+m.getScore());
                m.highlight(1);

                p = new Pattern(Instances.getScreenLastLocator()).similar(0.3f);
                m = Instances.getScreenSikuli().find(p);
                System.out.println("SCORE3: "+m.getScore());
                m.highlight(1);
                //result.highlight(1)
                System.out.println(m);
                System.out.println(m.getScore());

                Instances.getScreenSikuli().click(p);
                //Instances.getScreenSikuli().click(new Pattern(Instances.getScreenLastLocator()).similar(Instances.getScreenLastPrecision()));
            } catch (Exception e) {
                System.out.println("AAAAAAK "+e);
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
