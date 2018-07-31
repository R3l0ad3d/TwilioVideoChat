package com.example.r3l0ad3d.pendentapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TokenClass {

    @SerializedName("token")
    @Expose
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "TokenClass{" +
                "token='" + token + '\'' +
                '}';
    }
}

