package com.example.r3l0ad3d.pendentapp;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Token {
    private Retrofit retrofit;
    private TokenService tokenService;

    private static final String BASE_URL="http://109.235.65.112:3030/";

    public Token(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        tokenService=retrofit.create(TokenService.class);
    }

    public Call<TokenClass> getToken(String identity, String roomName){
        return tokenService.getToken(identity,roomName);
    }
}
