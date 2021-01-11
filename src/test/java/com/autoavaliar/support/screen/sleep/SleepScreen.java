package com.autoavaliar.support.screen.sleep;

import com.autoavaliar.intern.Instances;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import java.util.Calendar;

public class SleepScreen {
    public void until(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setMaxTime(int max){
        Instances.setDefaultWaitMilis(max);
    }

    public void setDefaultTime(){
        Instances.setDefaultWaitMilisBackUp();
    }

    public void untilDisapear(String caminhoDaImagem){
        untilDisapear(caminhoDaImagem, Instances.getScreenDefaultPrecision());
    }

    public void untilDisapear(String caminhoDaImagem, float precision){
        Instances.setScreenLastPrecision(precision);
        Instances.setScreenSikuli();
        Instances.setScreenLastXpath(caminhoDaImagem);

        long tempoInicial = Calendar.getInstance().getTimeInMillis();
        int localTime = Instances.getDefaultWaitMilis();
        while (true) {
            final boolean[] existe = {false};
            Instances.getExecuteClassInstance().execute(() -> {
                try {
                    Instances.getScreenSikuli().mouseMove(new Pattern(Instances.getScreenLastLocator()).similar(Instances.getScreenLastPrecision()));
                    existe[0] = true;
                } catch (FindFailed findFailed) {
                    //throw new NoSuchElementException("O localizador " + Instances.getScreenLastLocator() + " não retornou nenhuma imagem\n"+findFailed.getMessage());
                }
            });
            if(!existe[0]){
                break;
            }
            long tempoFinal = Calendar.getInstance().getTimeInMillis();
            int diferenca = (int) (tempoFinal-tempoInicial);
            localTime = localTime - diferenca;
            System.out.println("Tempo decorrido na localização: "+diferenca);
            if(localTime<=0){
                Instances.getErrorClassInstance().Warning(Instances.getMessageUntilDisapearFail().replace("arg0", Instances.getScreenLastLocatorLog()));
                break;
            }
            tempoInicial = Calendar.getInstance().getTimeInMillis();
        }
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageUntilDisapear().replace("arg0", Instances.getScreenLastLocatorLog()));
    }

    public void untilAppear(String caminhoDaImagem){
        untilAppear(caminhoDaImagem, Instances.getScreenLastPrecision());
    }

    public void untilAppear(String caminhoDaImagem, float precision){
        Instances.setScreenLastPrecision(precision);
        Instances.setScreenSikuli();
        Instances.setScreenLastXpath(caminhoDaImagem);

        long tempoInicial = Calendar.getInstance().getTimeInMillis();
        int localTime = Instances.getDefaultWaitMilis();
        while (true) {
            final boolean[] existe = {false};
            Instances.getExecuteClassInstance().execute(() -> {
                try {
                    Instances.getScreenSikuli().mouseMove(new Pattern(Instances.getScreenLastLocator()).similar(Instances.getScreenLastPrecision()));
                    existe[0] = true;
                } catch (FindFailed findFailed) {
                    //throw new NoSuchElementException("O localizador " + Instances.getScreenLastLocator() + " não retornou nenhuma imagem\n"+findFailed.getMessage());
                }
            });
            if(!existe[0]){
                break;
            }
            long tempoFinal = Calendar.getInstance().getTimeInMillis();
            int diferenca = (int) (tempoFinal-tempoInicial);
            localTime = localTime - diferenca;
            System.out.println("Tempo decorrido na localização: "+diferenca);
            if(localTime<=0){
                Instances.getErrorClassInstance().Warning(Instances.getMessageUntilDisapearFail().replace("arg0", Instances.getScreenLastLocatorLog()));
                break;
            }
            tempoInicial = Calendar.getInstance().getTimeInMillis();
        }
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageUntilDisapear().replace("arg0", Instances.getScreenLastLocatorLog()));
    }
}
