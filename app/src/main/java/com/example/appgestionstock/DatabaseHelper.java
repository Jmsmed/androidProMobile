package com.example.appgestionstock;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(@Nullable Context context) {
        super(context, Constants.DB_Name, null, Constants.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.CREATE_TABLE1);
        db.execSQL(Constants.CREATE_TABLE2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Constants.TABLE1);
        db.execSQL("DROP TABLE IF EXISTS " + Constants.TABLE2);
        onCreate(db);
    }


    public long insertInfoArt(String Label, String Qte){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Constants.A_LABEL, Label);
        values.put(Constants.A_QTE, Qte);
        long id = db.insert(Constants.TABLE1, null, values);
        db.close();
        return id;
    }
    public long insertInfoOp(String quantity, String a_id, String ADD_TIMESTAMP){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Constants.O_QTE, quantity);
        values.put(Constants.O_A_ID, a_id);
        values.put(Constants.O_ADD_TIMESTAMP, ADD_TIMESTAMP);

        long id = db.insert(Constants.TABLE2, null, values);
        db.close();
        return id;
    }
}
