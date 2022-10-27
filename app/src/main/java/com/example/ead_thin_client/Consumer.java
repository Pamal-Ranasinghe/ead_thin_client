package com.example.ead_thin_client;

public class Consumer {
    private int id;
    private String vehicleNumber;
    private String vehicleType;
    private String fuelType;

    public Consumer(int id, String vehicleNumber, String vehicleType, String fuelType) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
    }

    public Consumer(String vehicleNumber, String vehicleType, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
    }

    public int getId() {
        return id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
