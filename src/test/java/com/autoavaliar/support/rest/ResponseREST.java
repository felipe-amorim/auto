package com.autoavaliar.support.rest;

import com.autoavaliar.intern.Instances;

public class ResponseREST {

    public ResponseStatusREST status(){
        return Instances.getResponseStatusRESTClassInstance();
    }

    public ResponseBodyREST body(){
        return Instances.getResponseBodyRESTClassInstance();
    }

    public ResponseResponseTimeREST responseTime(){
        return Instances.getResponseResponseTimeRESTClassInstance();
    }
}
