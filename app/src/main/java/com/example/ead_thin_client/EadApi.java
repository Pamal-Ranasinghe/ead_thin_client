package com.example.ead_thin_client;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EadApi {

    //Fuel Station Endpoints
    @GET("test")
    Call<JsonObject> getTest();

    @POST("fuelStation/addFuelStation")
    Call <FuelStation> d(@Body FuelStation fuelStation);

    @GET("fuelStation/addFuelStation")
    Call <List<FuelStation>> getFuelStation();

    @PATCH("fuelStation/updateFuelStation/{id}")
    Call <FuelStation> updateFuelStation(@Path("id") int id, @Body FuelStation fuelStation);

    @DELETE("fuelStation/deleteFuelStation/{id}")
    Call <Void> deleteFuelStation(@Path("id") int id);


    //Consumer Endpoints
//    @POST("vehicle/addVehicle")
//    Call <List> createVehicle(
//            @Field("vehicleNumber") String vehicleNumber,
//            @Field("vehicleType") String vehicleType,
//            @Field("fuelType") String fuelType
//    );

    @POST("vehicle/addVehicle")
    Call <List> createVehicle(@Body Consumer consumer);

    @GET("vehicle/getVehicles")
    Call<List<Consumer>> getVehicles();

    @PUT("vehicle/updateVehicle/{id}")
    Call<Consumer> updateVehicle(@Path("id") int id, @Body Consumer consumer);

    @POST("vehicle/addVehcleToQueue/{id}")
    Call <Consumer> addVehicleToQueue(@Path("id") int id, @Body Consumer consumer);

    @PUT("vehicle/removeVehicleFromQueueWithFuel/{id}")
    Call<FuelStation> removeVehicleFromQueueWithFuel(
            @Field("vehicleId") String vehicleId,
            @Field("fuelStationId") String fuelStationId
    );

    @PUT("vehicle/removeVehicleFromQueueWithoutFuel/{id}")
    Call<FuelStation> removeVehicleFromQueueWithoutFuel(
            @Field("vehicleId") String vehicleId,
            @Field("fuelStationId") String fuelStationId
    );


}
