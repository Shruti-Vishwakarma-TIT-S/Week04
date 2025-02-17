package com.reflection.intermediatelevel.staticfields;

public class Configuration {
    private static String API_KEY = "default_api_key";

    public static String getApiKey() {
        return API_KEY;
    }
}
