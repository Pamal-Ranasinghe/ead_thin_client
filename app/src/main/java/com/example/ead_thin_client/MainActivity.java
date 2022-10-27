package com.example.ead_thin_client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Button counsumerBtn, fuelStation, existAccount;
    TextView textViewResult;
    private EadApi eadApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counsumerBtn = findViewById(R.id.ConsumerSignUp);
        fuelStation = findViewById(R.id.FuelStationSignUp);
        existAccount = findViewById(R.id.toLoginSignUp);

        textViewResult = findViewById(R.id.testText);

        RetrofitBuilder retroObj = RetrofitBuilder.getInstance();
        eadApi = retroObj.configure();

        Call<List> call = eadApi.getTest();


        call.enqueue(new Callback<List>() {
            @Override
            public void onResponse(Call<List> call, Response<List> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                textViewResult.setText((String.valueOf(response.body())));
                Toast.makeText(MainActivity.this, "I hit", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List> call, Throwable t) {
                Toast.makeText(MainActivity.this, "I Unable", Toast.LENGTH_SHORT).show();
            }
        });


        counsumerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ConsumerSignUp.class);
                startActivity(intent);
            }
        });

        fuelStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FuelStationSignUp.class);
                startActivity(intent);
            }
        });

        existAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), )
            }
        });

    }
}