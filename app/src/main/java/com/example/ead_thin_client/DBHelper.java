package com.example.ead_thin_client;

import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "ead.db";

    public DBHelper(Context context) {
        super(context, "ead.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("create table users(username TEXT primary key, password TEXT)");

//        String CONSUMER_TABLE_CREATE_QUERY = "CREATE TABLE " +
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
