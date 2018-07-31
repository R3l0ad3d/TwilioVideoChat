package com.example.r3l0ad3d.pendentapp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TokenService {
    @FormUrlEncoded
    @POST("twilio-api/video")
    Call<TokenClass> getToken(@Field("identity") String identity, @Field("room_name") String roomName);
}
