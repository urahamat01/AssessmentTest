package com.urahamat01.surveyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import java.util.ArrayList;
import java.util.List;

public class DropdownActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdaper adapter;
    private List<User> users;
    private RetrofitInterface retrofitInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropdown);

        init();

        getData();
    }

    private void getData() {
        retrofitInterface = ApiClient.getInstance().getApi();

        Call<List<User>> call = retrofitInterface.getAllData();

        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {

                users = response.body();
                adapter = new UserAdaper(users);
                recyclerView.setAdapter(adapter);


            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Toast.makeText(DropdownActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void init() {

        recyclerView = findViewById(R.id.userRecyclerviewDrop);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        users = new ArrayList<>();

    }
}
