package com.example.ead_thin_client;

public class Consumer {
    private int id;
    private String vehicleNumber;
    private String vehicleType;
    private String fuelType;
    private String password;

    public Consumer(int id, String vehicleNumber, String vehicleType, String fuelType, String password) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.password = password;
    }

    public Consumer(String vehicleNumber, String vehicleType, String fuelType, String password) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
