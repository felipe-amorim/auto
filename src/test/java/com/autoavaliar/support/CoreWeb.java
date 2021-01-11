package com.autoavaliar.support;

import com.autoavaliar.intern.Instances;
import com.autoavaliar.support.db.Db;
import com.autoavaliar.support.web.driver.WebDriver;
import com.autoavaliar.support.web.find.AssertThat;
import com.autoavaliar.support.web.sleep.SleepWeb;
import com.autoavaliar.support.convert.Converter;
import com.autoavaliar.support.error.Error;
import com.autoavaliar.support.web.find.exceptionals.ExceptionalsWeb;
import com.autoavaliar.support.log.Log;
import com.autoavaliar.support.web.find.ActionsWeb;
import com.autoavaliar.support.web.ScrollWeb;

public abstract class CoreWeb {

    //region NAVIGATION CLASSES
    public ActionsWeb find(String xpath){
        Instances.setLastTechnology(Instances.Technology.WEB);
        Instances.setWebDriver();
        Instances.setWebLastXpath(xpath);
        return Instances.getActionsClassInstance();
    }

    public ExceptionalsWeb find(){
        Instances.setLastTechnology(Instances.Technology.WEB);
        Instances.setWebDriver();
        return Instances.getExceptionalsWebClassInstance();
    }

    public Converter convert(){
        return Instances.getConverterClassInstance();
    }

    public ScrollWeb scroll(){
        Instances.setWebDriver();
        return Instances.getScrollWebClassInstance();
    }

    public SleepWeb sleep(){
        Instances.setWebDriver();
        return Instances.getSleepWebClassInstance();
    }

    public WebDriver webDriver(){
        return Instances.getWebDriverClassInstance();
    }

    public Log log(){
        return Instances.getLogClassInstance();
    }

    public void evidence(String complemento){
        Instances.setWebDriver();
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageScreenshotForced()+complemento);
    }

    public Error error(){
        return Instances.getErrorClassInstance();
    }

    public Db db(){
        return Instances.getDbClassInstance();
    }
    //endregion

    protected CoreWeb help(){
        return this;
    }

    public AssertThat assertThat(String text){
        Instances.setWebDriver();
        Instances.setAssertionText(text);
        return Instances.getAssertThatClassInstance();
    }
}
