package com.emericoapp.upload.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConstants {

    //==== Base Url
    public static String BASE_URL = "https://api.ederma.be";

    //==== End point
    public static final String ENDPOINT = "";

    //===== Retrofit Client
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
