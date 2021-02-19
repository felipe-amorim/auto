package com.autoavaliar.support.log;

import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.Markup;
import com.autoavaliar.intern.Instances;
import java.util.LinkedHashMap;

public class Log {

    public void setLocator(LinkedHashMap<String, String> locator) {
        Instances.setLocator(locator);
    }

    public LinkedHashMap<String, String> getLocator() {
        return Instances.getLocator();
    }

    public void type(String text){
        if(Instances.getReportClassInstance()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
        }else {
            Instances.getReportClassInstance().stepInfo(text);
        }
    }

    public void typeBlock(String text){
        if(Instances.getReportClassInstance()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
        }else {
            Instances.getReportClassInstance().stepBlock(text);
        }
    }

    public void pass(String text){
        if(Instances.getReportClassInstance()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
        }else {
            Instances.getReportClassInstance().stepPass(text);
        }
    }

    public void typeThrowable(Markup text){
        if(Instances.getReportClassInstance()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
        }else {
            Instances.getReportClassInstance().stepInfoThrowable(text);
        }
    }
}
