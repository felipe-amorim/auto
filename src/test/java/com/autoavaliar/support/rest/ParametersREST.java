package com.autoavaliar.support.rest;

import com.autoavaliar.intern.Instances;

public class ParametersREST {

    public void put(String key, String value){
        Instances.putRestLastParameters(key, value);
    }
}
