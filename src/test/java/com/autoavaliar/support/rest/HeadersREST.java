package com.autoavaliar.support.rest;

import com.autoavaliar.intern.Instances;

public class HeadersREST {
    public void put(String key, String value){
        Instances.putRestLastHeaders(key, value);
    }

    public void putToken(String token){
        Instances.setRestLastToken(token);
    }
}
