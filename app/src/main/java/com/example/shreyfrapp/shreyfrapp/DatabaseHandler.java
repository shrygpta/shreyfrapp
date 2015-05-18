package com.example.shreyfrapp.shreyfrapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;
/**
 * Created by Shrey Gupta on 18-05-2015.
 */
public class DatabaseHandler {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "order_db";
    private static final String TABLE_OFFER = "offer_table";
    private static final String OFFER_ID = "offerid";
    private static final String KEY_FIRST_NAME = "firstname";
    private static final String KEY_LAST_NAME = "lastname";
    private static final String KEY_ADDR = "addr";
    private static final String KEY_CITY = "city";
    private static final String KEY_STATE = "state";
    private static final String KEY_PINCODE = "pincode";
    private static final String KEY_MOBILE = "mobile";

}
