package com.autoavaliar.support;

import com.autoavaliar.intern.Instances;
import com.autoavaliar.support.convert.Converter;
import com.autoavaliar.support.db.Db;
import com.autoavaliar.support.error.Error;
import com.autoavaliar.support.log.Log;
import com.autoavaliar.support.screen.driver.Screen;
import com.autoavaliar.support.screen.find.ActionsScreen;
import com.autoavaliar.support.screen.find.MoveScreen;
import com.autoavaliar.support.screen.find.SendsScreen;
import com.autoavaliar.support.screen.sleep.SleepScreen;
import com.autoavaliar.support.tbi.JRobot;
import org.sikuli.basics.Settings;

public abstract class CoreScreen {

    public Converter convert(){
        return Instances.getConverterClassInstance();
    }

    public SleepScreen sleep(){
        return Instances.getSleepScreenClassInstance();
    }

    public Screen screen(){
        return Instances.getScreenClassInstance();
    }

    public ActionsScreen find(String caminhoDaImagem){
        return find(caminhoDaImagem, Instances.getScreenDefaultPrecision());
    }

    public static void click(){
        JRobot.robotClick();
    }

    public SendsScreen send(){
        return Instances.getSendsScreenClassInstance();
    }

    public ActionsScreen find(String caminhoDaImagem, float precision){
        Instances.setLastTechnology(Instances.Technology.SCREEN);
        Instances.setScreenLastPrecision(precision);
        Instances.setScreenSikuli();
        Instances.setScreenLastXpath(caminhoDaImagem);
        return Instances.getActionsScreenClassInstance();
    }

    public void evidence(String complemento){
        Instances.setScreenSikuli();
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageScreenshotForced()+complemento);
    }

    /*public RegionScreen region(){

    }

    public AssertScreen assertThat(){

    }*/

    public MoveScreen move(){
        return Instances.getMoveScreenClassInstance();
    }

    public Log log(){
        return Instances.getLogClassInstance();
    }

    public Error error(){
        return Instances.getErrorClassInstance();
    }

    public Db db(){
        return Instances.getDbClassInstance();
    }

    protected CoreScreen help(){
        return this;
    }
}
