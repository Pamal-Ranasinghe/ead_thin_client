package com.example.ead_thin_client;

import android.content.ContentValues;
import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static int VERSION = 1;
    private static final String DBNAME = "ead.db";
    private static final String FUEL_STATION_TABLE_NAME = "fuelstation";
    private static final String CONSUMER_TABLE_NAME = "consumer";

//---COMMON COLUMN NAMES---//
    private static final String ID = "id";
    private static final String PASSWORD = "password";

//---FUEL STATION TABLE COLUMNS---//
    private static final String STATION_ID = "stationid";
    private static final String STATION_NAME = "stationname";
    private static final String STATION_LOCATION = "location";
    private static final String DIESEL_AMOUNT = "dieselamount";
    private static final String PATROL_AMOUNT = "patrolamount";


//---CONSUMER TABLE COLUMNS---//
    private static final String VEHICLE_NUMBER = "vehiclenumber";
    private static final String VEHICLE_TYPE = "vehicletype";
    private static final String FUEL_TYPE = "fueltype";


    public DBHelper(@Nullable  Context context) {
        super(context, DBNAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_FUEL_STATION_TABLE_QUERY = "CREATE TABLE " + FUEL_STATION_TABLE_NAME + " " +
                    "(" +
                    ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    STATION_ID + " TEXT," +
                    STATION_NAME + " TEXT," +
                    STATION_LOCATION + " TEXT," +
                    DIESEL_AMOUNT + " DOUBLE," +
                    PATROL_AMOUNT + " DOUBLE," +
                    PASSWORD + " TEXT"
                    +");";

        String CREATE_CUSTOMER_TABLE_QUERY = "CREATE TABLE " + CONSUMER_TABLE_NAME + " " +
                "(" +
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                VEHICLE_NUMBER + " TEXT," +
                VEHICLE_TYPE + " TEXT," +
                FUEL_TYPE + " TEXT," +
                PASSWORD + " TEXT"
                + ");";



        db.execSQL(CREATE_FUEL_STATION_TABLE_QUERY);
        db.execSQL(CREATE_CUSTOMER_TABLE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String DROP_FUEL_STATION_TABLE_QUERY = "DROP TABLE IF EXISTS " + FUEL_STATION_TABLE_NAME;
        String DROP_CONSUMER_TABLE_QUERY = "DROP TABLE IF EXISTS " + CONSUMER_TABLE_NAME;
        db.execSQL(DROP_FUEL_STATION_TABLE_QUERY);
        db.execSQL(DROP_CONSUMER_TABLE_QUERY);
        onCreate(db);

    }


    public void addFuelStation(FuelStation fuelStation){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(STATION_ID, fuelStation.getStationId());
        contentValues.put(STATION_NAME, fuelStation.getStationName());
        contentValues.put(STATION_LOCATION, fuelStation.getStationLocation());
        contentValues.put(DIESEL_AMOUNT, fuelStation.getDieselAmount());
        contentValues.put(PATROL_AMOUNT, fuelStation.getPetrolAmount());
        contentValues.put(DIESEL_AMOUNT, fuelStation.getDieselAmount());

        sqLiteDatabase.insert(FUEL_STATION_TABLE_NAME, null, contentValues);
        sqLiteDatabase.close();

    }

    public void addConsumer(Consumer consumer){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(VEHICLE_NUMBER, consumer.getVehicleNumber());
        contentValues.put(VEHICLE_TYPE, consumer.getVehicleType());
        contentValues.put(FUEL_TYPE, consumer.getFuelType());
        contentValues.put(PASSWORD, consumer.getPassword());

        sqLiteDatabase.insert(CONSUMER_TABLE_NAME, null, contentValues);
        sqLiteDatabase.close();

    }


}
