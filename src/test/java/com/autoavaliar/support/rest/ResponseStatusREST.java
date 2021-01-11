package com.autoavaliar.support.rest;

import com.autoavaliar.intern.Instances;

public class ResponseStatusREST {
    public void mustBe(int status){
        if(Instances.getRestLastStatus()!=status){
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTStatusError().replace("arg0", String.valueOf(status)).replace("arg1", String.valueOf(Instances.getRestLastStatus()))));
        }else
        {
            Instances.getReportClassInstance().stepPass(Instances.getMessageRESTStatusSuccess().replace("arg0", String.valueOf(status)));
        }
    }
}
