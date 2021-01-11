package com.autoavaliar.support.rest;

import com.autoavaliar.intern.Instances;

public class SendREST {
    public TypeOfREST endpoint(String endpoint){
        Instances.setRestLastEndPoint(endpoint);
        return Instances.getTypeOfRESTClassInstance();
    }
}
