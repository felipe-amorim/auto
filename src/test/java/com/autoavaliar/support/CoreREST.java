package com.autoavaliar.support;

import com.google.api.client.http.*;
import com.google.api.client.http.apache.ApacheHttpTransport;
import com.autoavaliar.intern.Instances;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.autoavaliar.support.db.Db;
import com.autoavaliar.support.error.Error;
import com.autoavaliar.support.log.Log;
import com.autoavaliar.support.rest.*;

import java.io.IOException;
import java.util.*;

public abstract class CoreREST {

    public Log log(){
        return Instances.getLogClassInstance();
    }

    public Error error(){
        return Instances.getErrorClassInstance();
    }

    public Db db(){
        return Instances.getDbClassInstance();
    }

    public SendREST createRequest(String uri) {
        Instances.setRestLastEndPoint("");
        Instances.setRestLastResponse(new ArrayList<>());
        Instances.setRestLastResponseTime(0);
        Instances.setRestLastStatus(0);
        Instances.setRestLastHeaders(new HashMap<>());
        Instances.setRestLastParameters(new HashMap<>());
        Instances.setRestLastToken("");
        Instances.setRestLastURI(uri);
        return Instances.getSendRESTClassInstance();
    }

    public ParametersREST parameters() {
        return Instances.getParametersRESTClassInstance();
    }

    public HeadersREST headers() {
        return Instances.getHeadersRESTClassInstance();
    }

    public BodyREST body() {
        return Instances.getBodyRESTClassInstance();
    }

    public void send() {
        String rawResponse = "";
        int status = 0;
        try {
            GenericUrl genericUri = new GenericUrl(Instances.getRestLastURI() + Instances.getRestLastEndPoint());
            for (Map.Entry<String, String> entry : Instances.getRestLastParameters().entrySet()) {
                genericUri.put(entry.getKey(), entry.getValue());
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTSendParameter().replace("arg0", entry.getKey()).replace("arg1", entry.getValue()));
            }
            ApacheHttpTransport transport = new ApacheHttpTransport();
            HttpRequestFactory requestFactory = transport.createRequestFactory();
            HttpRequest request = null;
            switch (Instances.getRestLastTypeOfRequest()) {
                case "get":
                    request = requestFactory.buildGetRequest(genericUri);
                    break;
                case "post":
                    request = requestFactory.buildPostRequest(genericUri, ByteArrayContent.fromString(null, String.valueOf(Instances.getRestLastBody())));
                    break;
                case "put":
                    request = requestFactory.buildPutRequest(genericUri, ByteArrayContent.fromString(null, String.valueOf(Instances.getRestLastBody())));
                    break;
                case "delete":
                    request = requestFactory.buildDeleteRequest(genericUri);
                    break;
            }
            if (request != null) {
                HttpHeaders h = new HttpHeaders();
                if (Instances.getRestLastHeaders().size() > 0) {
                    for (Map.Entry<String, String> entry : Instances.getRestLastHeaders().entrySet()) {
                        h.set(entry.getKey(), entry.getValue());
                        Instances.getReportClassInstance().stepPass(Instances.getMessageRESTSendHeader().replace("arg0", entry.getKey()).replace("arg1", entry.getValue()));
                    }
                    h.setContentType("application/json");
                    if (Instances.getRestLastToken().length() > 0) {
                        h.setAuthorization(Instances.getRestLastToken());
                        Instances.getReportClassInstance().stepPass(Instances.getMessageRESTSendToken().replace("arg0", Instances.getRestLastToken()));
                    }
                }
                request.setHeaders(h);
            }
            HttpResponse resp = null;
            long ti = Calendar.getInstance().getTimeInMillis();
            if (request != null) {
                Instances.getReportClassInstance().stepPass(Instances.getMessageRESTSendRequest().replace("arg0", Instances.getRestLastURI()).replace("arg1", Instances.getRestLastEndPoint()));
                resp = request.execute();
            }
            long tf = Calendar.getInstance().getTimeInMillis();
            int diff = (int) (tf - ti);
            Instances.setRestLastResponseTime(diff);
            if (resp != null) {
                rawResponse = resp.parseAsString();
                status = resp.getStatusCode();
            }

        } catch (HttpResponseException ex) {
            rawResponse = ex.getContent();
            status = ex.getStatusCode();
        } catch (NullPointerException | IOException ex) {
            System.out.println("Exception error: " + ex.getMessage());
            System.out.println("WARNING");
        } finally {
            System.out.println(rawResponse);
            Instances.setRestLastStatus(status);

            List<JSONObject> jsons = new ArrayList<>();
            if (rawResponse.startsWith("[")) {
                try {
                    JSONArray jsonArr = new JSONArray(rawResponse);
                    for (int i = 0; i < jsonArr.length(); i++) {
                        JSONObject jsonObj = jsonArr.getJSONObject(i);
                        jsons.add(jsonObj);
                    }
                } catch (JSONException e) {
                    jsons.add(new JSONObject(status));
                }
            }else {
                jsons.add(new JSONObject(rawResponse));
            }
            Instances.setRestLastResponse(jsons);
        }
    }

    public ResponseREST response() {
        return Instances.getResponseRESTClassInstance();
    }

    public void evidence(String text){
        Instances.getReportClassInstance().stepPass(text);
    }
}
