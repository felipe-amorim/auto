package com.autoavaliar.support.rest;

import com.autoavaliar.intern.Instances;
import org.json.JSONObject;

public class BodyREST {

    public void put(JSONObject json){
        Instances.setRestLastBody(json);
    }

}
