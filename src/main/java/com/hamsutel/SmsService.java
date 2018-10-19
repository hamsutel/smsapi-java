package com.hamsutel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SmsService {
    @POST("smsapi")
    Call<MessageResponse> send(@Body ApiRequest apiRequest);
}
