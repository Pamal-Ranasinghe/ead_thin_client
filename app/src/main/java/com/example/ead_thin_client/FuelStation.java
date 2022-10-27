package com.example.ead_thin_client;

import com.google.gson.annotations.SerializedName;

public class FuelStation {
    private int id;
    private String stationName;
    private String stationID;


    private String location;


    private double patrolAmount;


    private double dieselAmount;

    private String password;

    public FuelStation() {

    }

    public FuelStation(int id, String stationID, String stationName, String location, double patrolAmount, double dieselAmount, String password  ) {
        this.id = id;
        this.stationID = stationID;
        this.stationName = stationName;
        this.location = location;
        this.patrolAmount = patrolAmount;
        this.dieselAmount = dieselAmount;
        this.password = password;
    }

    public FuelStation(String stationID, String stationName, String location, double patrolAmount, double dieselAmount ) {
        this.stationID = stationID;
        this.stationName = stationName;
        this.location = location;
        this.patrolAmount = patrolAmount;
        this.dieselAmount = dieselAmount;
    }

    public int getId() {
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getStationId(){
        return stationID;
    }

    public void setStationID(String stationID){
        this.stationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName){
        this.stationName = stationName;
    }

    public void setStationLocation(String location){
        this.location = location;
    }

    public String getStationLocation(){
        return location;
    }

    public void setPetrolAmount(double patrolAmount) {
        this.patrolAmount = patrolAmount;
    }

    public double getPetrolAmount() {
        return patrolAmount;
    }

    public void setDieselAmount(double dieselAmount) {
        this.dieselAmount = dieselAmount;
    }

    public double getDieselAmount(){
        return dieselAmount;
    }





}
