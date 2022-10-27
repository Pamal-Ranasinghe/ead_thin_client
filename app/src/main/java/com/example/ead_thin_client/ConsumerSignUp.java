package com.example.ead_thin_client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConsumerSignUp extends AppCompatActivity {

    private EditText vehicleNumberInput, vehicleTypeInput, fuelTypeInput, passwordInput;
    private Button submitSignUp;
    private DBHelper dbHelper;
    private Context context;
    private EadApi eadApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_sign_up);

        vehicleNumberInput = findViewById(R.id.editTextConsumerSignUpVehicleNumber);
        vehicleTypeInput = findViewById(R.id.editTextConsumerSignUpVehicleType);
        fuelTypeInput = findViewById(R.id.editTextConsumerSignUpFuelType);
        passwordInput = findViewById(R.id.editTextConsumerSignUpPassword);
        submitSignUp = findViewById(R.id.buttonConsumerSignUp);
        context = this;

        RetrofitBuilder retroObj = RetrofitBuilder.getInstance();
        eadApi = retroObj.configure();



        submitSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(vehicleNumberInput.getText().toString());
                System.out.println(vehicleTypeInput.getText().toString());
                System.out.println(fuelTypeInput.getText().toString());
                System.out.println(passwordInput.getText().toString());

                Consumer consumer = new Consumer(vehicleNumberInput.getText().toString(), vehicleTypeInput.getText().toString(), fuelTypeInput.getText().toString(), passwordInput.getText().toString());

                Consumer consumerApi = new Consumer(vehicleNumberInput.getText().toString(), vehicleTypeInput.getText().toString(), fuelTypeInput.getText().toString());
                dbHelper = new DBHelper(context);
                dbHelper.addConsumer(consumer);

                Toast.makeText(getApplicationContext(),"New vehicle is added", Toast.LENGTH_SHORT).show();
                Call<List> call = eadApi.createVehicle(consumerApi);

                call.enqueue(new Callback<List>() {
                    @Override
                    public void onResponse(Call<List> call, Response<List> response) {
                        if(!(response.isSuccessful())){
                            Toast.makeText(context, "Response is not comming ", Toast.LENGTH_SHORT).show();
                    } else {
                        System.out.println(response.toString());
                        Toast.makeText(context, " I hit ", Toast.LENGTH_SHORT).show();
                    }
                    }

                    @Override
                    public void onFailure(Call<List> call, Throwable t) {
                        Toast.makeText(context,  t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
        }
        });
    }
}