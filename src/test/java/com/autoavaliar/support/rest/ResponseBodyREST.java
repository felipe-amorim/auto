package com.autoavaliar.support.rest;

import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.autoavaliar.intern.Instances;
import org.json.JSONObject;

import java.util.List;

public class ResponseBodyREST {
    public void mustBe(JSONObject json){
        if(Instances.getRestLastResponse().size()>0){
            JSONObject jsono = Instances.getRestLastResponse().get(0);
            if(json.toString().equals(jsono.toString())){
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTResponseEquals());
                Instances.getReportClassInstance().stepMarkUp(MarkupHelper.createCodeBlock(String.valueOf(Instances.getRestLastResponse().get(0))));
            }else {
                Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals());
                Instances.getReportClassInstance().stepMarkUp(MarkupHelper.createCodeBlock(String.valueOf(json)));
                Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
                Instances.getReportClassInstance().stepMarkUp(MarkupHelper.createCodeBlock(String.valueOf(Instances.getRestLastResponse().get(0))));
                Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNotEqualsMessage()));
            }
        }else {
            Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
            Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNull()));
        }
    }

    public void mustNotHaveString(String key){
        if(Instances.getRestLastResponse().size()>0){
            JSONObject json = Instances.getRestLastResponse().get(0);
            System.out.println("resp "+json.toString());
            if(!json.toString().contains(""+key+"")){
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTResponseNotContainsStringResp().replace("arg0", key));
            }else {
                Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
                Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
                Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNotContainsString().replace("arg0", key)));
            }
        }else {
            Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
            Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNull()));
        }
    }


    public void mustHaveString(String key){
        if(Instances.getRestLastResponse().size()>0){
            JSONObject json = Instances.getRestLastResponse().get(0);
            System.out.println("resp "+json.toString());
            if(json.toString().contains(""+key+"")){
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTResponseContainsString().replace("arg0", key));
            }else {
                Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
                Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
                Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNotContainsString().replace("arg0", key)));
            }
        }else {
            Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
            Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNull()));
        }
    }

    public void mustNotHaveKey(String key){
        if(Instances.getRestLastResponse().size()>0){
            JSONObject json = Instances.getRestLastResponse().get(0);
            System.out.println("resp "+json.toString());
            if(json.has(key) || json.toString().contains("\""+key+"\":")){
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTResponseNotContainsResp().replace("arg0", key));
            }else {
                Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
                Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
                Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNotContains().replace("arg0", key)));
            }
        }else {
            Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
            Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNull()));
        }
    }

    public void mustHaveKey(String key){
        if(Instances.getRestLastResponse().size()>0){
            JSONObject json = Instances.getRestLastResponse().get(0);
            System.out.println("resp "+json.toString());
            if(json.has(key) || json.toString().contains("\""+key+"\":")){
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTResponseContains().replace("arg0", key));
            }else {
                Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
                Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
                Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNotContains().replace("arg0", key)));
            }
        }else {
            Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
            Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNull()));
        }
    }

    public void mustNotHaveKeyAndValue(String key, String value){
        if(Instances.getRestLastResponse().size()>0){
            JSONObject json = Instances.getRestLastResponse().get(0);
            if(!json.toString().contains("\""+key+"\":\""+value+"\"") && !json.toString().contains("\""+key+"\":"+value+"")){
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTResponseNotContainsKeyAndValueResp().replace("arg0", key).replace("arg1", value));
            }else {
                Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
                Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
                Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNotContainsKeyAndValue().replace("arg0", key).replace("arg1", value)));
            }
        }else {
            Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
            Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNull()));
        }
    }

    public void mustHaveKeyAndValue(String key, String value){
        if(Instances.getRestLastResponse().size()>0){
            JSONObject json = Instances.getRestLastResponse().get(0);
            if(json.toString().contains("\""+key+"\":\""+value+"\"") || json.toString().contains("\""+key+"\":"+value+"")){
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTResponseContainsKeyAndValue().replace("arg0", key).replace("arg1", value));
            }else {
                Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
                Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
                Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNotContainsKeyAndValue().replace("arg0", key).replace("arg1", value)));
            }
        }else {
            Instances.getReportClassInstance().stepInfo(Instances.getMessageRESTResponseNotEquals2());
            Instances.getReportClassInstance().stepInfo(Instances.getRestLastResponse().toString());
            Instances.getReportClassInstance().stepFail(new Throwable(Instances.getMessageRESTResponseNull()));
        }
    }

    public JSONObject get(){
        return Instances.getRestLastResponse().get(0);
    }

    public List<JSONObject> getList(){
        return Instances.getRestLastResponse();
    }
}
