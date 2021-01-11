package com.autoavaliar.support.rest;

import com.autoavaliar.intern.Instances;

public class ResponseResponseTimeREST {

    public void mustBeLessThan(int timeInMs){
        if(Instances.getRestLastResponseTime()<timeInMs){
            Instances.getReportClassInstance().stepPass(Instances.getMessageRESTResponseTimeOK().replace("arg0", String.valueOf(timeInMs)));
        }else {
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseTimeLessThan().replace("arg0", String.valueOf(timeInMs)).replace("arg1", String.valueOf(Instances.getRestLastResponseTime()))));
        }
    }
}
