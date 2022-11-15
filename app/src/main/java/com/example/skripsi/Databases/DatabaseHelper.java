package com.example.skripsi.Databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String database_name = "DB_Santri";
    public static final String table_name = "santri";
    public static final String clm_id = "_id";
    public static final String clm_namalkp = "Nama";
    public static final String clm_nohp = "Nohp";
    public static final String clm_kelas = "kelas_tahfidz";

    private SQLiteDatabase db;

    public DatabaseHelper (Context context) {
        super(context, database_name, null, 2);
        db = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + table_name + "(" + clm_id + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + clm_namalkp + " TEXT, " + clm_nohp + " TEXT, " + clm_kelas +" TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + table_name);
    }

    //Get All SQLite Data
    public Cursor allData(){
        Cursor cur = db.rawQuery("SELECT * FROM " + table_name , null);
        return cur;
    }

    //Get 1 Data By ID
    public Cursor oneData(Long id){
        Cursor cur = db.rawQuery("SELECT * FROM " + table_name + " WHERE " + clm_id + "=" + id, null);
        return cur;
    }

    //Insert Data to Database
    public void insertData(ContentValues values){
        db.insert(table_name, null, values);
    }

    //Update Data
    public void updateData(ContentValues values, long id){
        db.update(table_name, values, clm_id + "=" + id, null);
    }

    //Delete Data
    public void deleteData(long id){
        db.delete(table_name, clm_id + "=" + id, null);
    }
}
