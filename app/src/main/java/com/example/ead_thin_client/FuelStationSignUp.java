package com.example.ead_thin_client;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FuelStationSignUp extends AppCompatActivity {

    private EadApi eadApi;
    private Button fuelStationSubmit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel_station_sign_up);

//        fuelStationSubmit = findViewById(R.id.fuelSignUpStationSignUpBtn);
//
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://10.0.2.2:4000/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        eadApi = retrofit.create(EadApi.class);
//
////        RetrofitBuilder retrofitObj = RetrofitBuilder.getInstance();
////        eadApi  = retrofitObj.configure();
//
//        FuelStation fuelStation = new FuelStation("st005", "Awesome Station", "Kiribathgoda", 6000, 6000);
//        Call<FuelStation> call = eadApi.createFuelStation(fuelStation);
//
//        call.enqueue(new Callback<FuelStation>() {
//            @Override
//            public void onResponse(Call<FuelStation> call, Response<FuelStation> response) {
//                if(!response.isSuccessful()){
//                    Toast.makeText(FuelStationSignUp.this, "Not successfull", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                Toast.makeText(FuelStationSignUp.this, "I hit", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(Call<FuelStation> call, Throwable t) {
//                Toast.makeText(FuelStationSignUp.this, t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });

//        fuelStationSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });




    }
}