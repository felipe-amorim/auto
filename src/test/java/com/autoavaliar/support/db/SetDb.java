package com.autoavaliar.support.db;

import com.autoavaliar.intern.Instances;

public class SetDb {

    public void user(String user){
        Instances.setDbuser(user);
    }

    public void password(String password){
        Instances.setDbpassword(password);
    }

    public void tnsnames(String tnsnames){
        Instances.setDbtnsnames(tnsnames);
    }

    public void adress(String adress){
        Instances.setDbadress(adress);
    }

    public void port(String port){
        Instances.setDbport(port);
    }

    public void name(String name){
        Instances.setDbname(name);
    }

    public TypeDB type(){
        return Instances.getTypeDBClassInstance();
    }
}
