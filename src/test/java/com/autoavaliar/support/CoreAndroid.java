package com.autoavaliar.support;

import com.autoavaliar.intern.Instances;
import com.autoavaliar.support.android.ScrollAndroid;
import com.autoavaliar.support.android.find.ActionsAndroid;
import com.autoavaliar.support.android.find.exceptionals.ExceptionalsAndroid;
import com.autoavaliar.support.android.sleep.SleepAndroid;
import com.autoavaliar.support.convert.Converter;
import com.autoavaliar.support.db.Db;
import com.autoavaliar.support.error.Error;
import com.autoavaliar.support.log.Log;
import com.autoavaliar.support.web.find.AssertThat;

public abstract class CoreAndroid {

    public ActionsAndroid find(String xpath){
        Instances.setLastTechnology(Instances.Technology.MOBILE);
        Instances.setAndroidDriver();
        Instances.setAndroidLastXpath(xpath);
        //System.out.println(Instances.getAndroidLastXpath());
        return Instances.getActionsAndroidClassInstance();
    }

    public ExceptionalsAndroid find(){
        Instances.setLastTechnology(Instances.Technology.MOBILE);
        Instances.setAndroidDriver();
        return Instances.getExceptionalsAndroidClassInstance();
    }

    public Converter convert(){
        return Instances.getConverterClassInstance();
    }

    public ScrollAndroid scroll(){
        Instances.setAndroidDriver();
        return Instances.getScrollAndroidClassInstance();
    }

    public SleepAndroid sleep(){
        Instances.setAndroidDriver();
        return Instances.getSleepAndroidClassInstance();
    }

    public com.autoavaliar.support.android.adriver.AndroidDriver androidDriver(){
        return Instances.getAndroidDriverClassInstance();
    }

    public Log log(){
        return Instances.getLogClassInstance();
    }

    public void evidence(String complemento){
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageScreenshotForced()+complemento);
    }

    public Error error(){
        return Instances.getErrorClassInstance();
    }

    public Db db(){
        return Instances.getDbClassInstance();
    }

    protected CoreAndroid help(){
        return this;
    }

    public AssertThat assertThat(String text){
        Instances.setAssertionText(text);
        return Instances.getAssertThatClassInstance();
    }
}
