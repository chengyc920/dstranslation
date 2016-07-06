package com.derbysoft.dhplatform.dhtranslation.proxy.impl;


import com.derbysoft.dhplatform.dhtranslation.proxy.Authentication;
import com.derbysoft.dhplatform.dhtranslation.proxy.SmartlingProxy;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class SmartlingProxyImpl implements SmartlingProxy{
    private String baseURL = "https://api.smartling.com";
    private String userIdentifier  = "ytfapiylffmyzpnlzysuvqvpvdxuor";
    private String userSecret = "5sfca1mcoml0ojelsn1khb08jvDG#fnvcfth1etv7sl9hn5g3p1dnl9";

    public String authenticate() throws UnsupportedEncodingException {
        HttpPost httpPost = new HttpPost(baseURL + "/auth-api/v2/authenticate");
//        httpPost.addHeader("userIdentifier ", userIdentifier);
//        httpPost.addHeader("userSecret", userSecret);

        Gson gson = new GsonBuilder().create();

        Authentication authentication = new Authentication();
        authentication.setUserIdentifier(userIdentifier);
        authentication.setUserSecret(userSecret);
        String json = gson.toJson(authentication);
        httpPost.setEntity(new StringEntity(json, ContentType.create("application/json", "utf-8")));

        String rsp = null;
        try {
            rsp = HttpClients.createDefault().execute(httpPost, new BasicResponseHandler());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rsp;
    }

    public String getProject(String projectId) {
        HttpGet httpGet = new HttpGet(baseURL + "/projects-api/v2/projects/" + projectId);
        String rsp = null;
        try {
            rsp = HttpClients.createDefault().execute(httpGet, new BasicResponseHandler());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rsp;
    }
}
