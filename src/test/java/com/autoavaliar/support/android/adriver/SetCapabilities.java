package com.autoavaliar.support.android.adriver;

import com.autoavaliar.intern.Instances;
import org.openqa.selenium.remote.SessionId;

import java.util.ArrayList;
import java.util.List;

public class SetCapabilities {
    public SetCapabilities deviceName(String deviceName){
        Instances.setAndroidDeviceName(deviceName);
        return this;
    }

    public SetCapabilities udid(String udid){
        Instances.setAndroidUdid(udid);
        return this;
    }

    public SetCapabilities platformName(String platformName){
        Instances.setAndroidPlatformName(platformName);
        return this;
    }

    public SetCapabilities platformVersion (String platformVersion){
        Instances.setAndroidPlatformVersion(platformVersion);
        return this;
    }

    public SetCapabilities skipUnlock (String skipUnlock){
        Instances.setAndroidSkipUnlock(skipUnlock);
        return this;
    }

    public SetCapabilities appPackage (String appPackage){
        Instances.setAndroidAppPackage(appPackage);
        return this;
    }

    public SetCapabilities appActivity (String appActivity){
        Instances.setAndroidAppActivity(appActivity);
        return this;
    }

    public SetCapabilities androidUrl(String androidUrl){
        Instances.setAndroidUrl(androidUrl);
        return this;
    }

    public void load(){
        boolean eraIgual = Instances.checkLastDevice();
        System.out.println("actual device: "+Instances.getAndroidDeviceName());
        System.out.println("last device: "+Instances.androidLastDeviceName);

        boolean sessionIDnull = false;
        try {
            SessionId session = (Instances.getAndroidDriver()).getSessionId();
            if(session.toString().equals("null")){
                sessionIDnull = true;
            }
        }catch (NullPointerException e)
        {
            sessionIDnull = true;
        }
        if(Instances.getAndroidDriver() != null) {
            if (!eraIgual) {
                List<String> cmd = new ArrayList<>();
                cmd = Instances.commandEx("adb devices -l");
                System.out.println("cmd: "+cmd);
                int tamanhoListaDevices = cmd.size();

                Instances.commandEx("adb -s " + Instances.androidLastUdid + " emu kill");

                System.out.println("Aguardando o device encerrar...");
                int tempoMaximo = Instances.getDefaultWaitMilis();
                while (true) {
                    cmd = Instances.commandEx("adb devices -l");
                    int tamanhoAtual = cmd.size();
                    if (tamanhoAtual < tamanhoListaDevices) {
                        break;
                    }
                    tempoMaximo = tempoMaximo - 100;
                    if (tempoMaximo <= 0) {
                        System.out.println("O device não fechou dentro do tempo esperado");
                        break;
                    }
                }
            }
        }
    }
}
