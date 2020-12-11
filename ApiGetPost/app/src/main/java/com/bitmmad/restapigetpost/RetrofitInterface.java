package com.bitmmad.restapigetpost;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitInterface {

    @GET("posts")
    Call<List<User>> getAllData();

    @POST("posts")
    Call<ResponseBody> postData(@Body User user);

}
