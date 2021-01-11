package com.autoavaliar.support.db;

import com.autoavaliar.intern.Instances;

public class TypeDB {

    public void oracle(){
        Instances.setDbtype("oracle");
    }

    public void mysql(){
        Instances.setDbtype("mysql");
    }

    public void postgres(){
        Instances.setDbtype("postgres");
    }

    public void sqlServer(){
        Instances.setDbtype("sqlserver");
    }

    public void mongo(){
        Instances.setDbtype("mongo");
    }
}
