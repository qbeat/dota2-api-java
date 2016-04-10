package com.qbeat.dota2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.qbeat.dota2.util.CommonDota2ApiDeserializer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

abstract public class ApiCall {

    private static final String BASE_URL = "https://api.steampowered.com";

    private final ApiConfig config;

    private String apiCallUrl;

    private Map<String, String> queryParams = new LinkedHashMap<>();

    private String body;

    private Type returnType;

    public ApiCall(ApiConfig config) {
        putParam("key", config.getApiKey());

        this.config = config;
    }

    protected void putParam(String key, String value) {
        queryParams.put(key, value);
    }

    protected String request(String reqUrl) {
        HttpURLConnection connection = null;
        String response = "";

        try {
            URL url = new URL(reqUrl);

            connection = (HttpURLConnection) url.openConnection();
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() != 200) {
                throw new Dota2ApiException();
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            StringBuilder resBuilder = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {
                resBuilder.append(line)
                        .append(System.lineSeparator());
            }
            br.close();

            response = resBuilder.toString();

        } catch (IOException | Dota2ApiException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return response;
    }

    protected <T> T getDto() {
        T dto = null;

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(returnType, new CommonDota2ApiDeserializer<>())
                .create();

        try {
            dto = gson.fromJson(body, returnType);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }

        return dto;
    }

    protected <T> T callAndGet() {
        String url = getUrl();
        body = request(url);

        return getDto();
    }

    private String getUrl() {
        StringBuilder url = new StringBuilder(BASE_URL + getApiCallUrl());

        char connector = '?';
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            url.append(connector)
                .append(entry.getKey())
                .append("=")
                .append(entry.getValue());

            connector = '&';
        }

        return url.toString();
    }

    public String getApiCallUrl() {
        return apiCallUrl;
    }

    public String getBody() {
        return body;
    }

    public Type getReturnType() {
        return returnType;
    }

    protected void setApiCallUrl(String apiCallUrl) {
        this.apiCallUrl = apiCallUrl;
    }

    protected void setBody(String body) {
        this.body = body;
    }

    protected void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
}
