package com.autoavaliar.support.error;

import com.autoavaliar.intern.Instances;

public class Error {

    public void Fail(){
        Instances.getReportClassInstance().stepFail(new NullPointerException(Instances.getMessageFailTests()));
        throw new NullPointerException(Instances.getMessageFailTests());
    }

    public void Warning(String complemento){
        Instances.getReportClassInstance().stepWarning(complemento);
    }

    public void Environment(String complemento){
        Instances.getReportClassInstance().stepFatal(new NullPointerException(complemento));
        throw new NullPointerException(Instances.getMessageEnvironmentError()+" - "+complemento);
    }

    public void Interrupt(){
        Instances.getReportClassInstance().stepWarning(Instances.getMessageInterrupt());
        Instances.setTestsKilled(true);
        throw new AssertionError(Instances.getMessageInterrupt());
    }

}
