package com.urahamat01.surveyapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitInterface {

    @GET("getSurvey")
    Call<List<User>> getAllData();


}
