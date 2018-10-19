package com.hamsutel;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;


public class MessageApi {
    String userName,password;

    Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://test.hamsutel.com/")
            .build();
    SmsService service = retrofit.create(SmsService.class);

    public MessageApi(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public MessageResponse send(Message message) throws IOException {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setMessage(message.getContent());
        apiRequest.setPassword(password);
        apiRequest.setUsername(userName);
        apiRequest.setSenderid(message.getSenderId());
        apiRequest.setToken(message.getToken());
        apiRequest.setTo(message.getTo());

        Call<MessageResponse> response = service.send(apiRequest);
        return  response.execute().body();

    }
}
