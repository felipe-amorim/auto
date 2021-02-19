package com.autoavaliar.support.error;

import com.autoavaliar.intern.Instances;

public class Error {

    public void Fail(){
        Instances.getReportClassInstance().stepFail(new NullPointerException(Instances.getMessageFailTests()));
        throw new NullPointerException(Instances.logRed(Instances.getMessageFailTests()));
    }

    public void Warning(String complemento){
        Instances.getReportClassInstance().stepWarning(Instances.logYellow(complemento));
    }

    public void Environment(String complemento){
        Instances.getReportClassInstance().stepFatal(new NullPointerException(complemento));
        throw new NullPointerException(Instances.logRed(Instances.getMessageEnvironmentError()+" - "+complemento));
    }

    public void Interrupt(){
        Instances.getReportClassInstance().stepWarning(Instances.getMessageInterrupt());
        Instances.setTestsKilled(true);
        throw new AssertionError(Instances.getMessageInterrupt());
    }

}
