package com.example.skripsi.Databases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.skripsi.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static android.graphics.BlendMode.CLEAR;

public class MainActivityDatabase extends AppCompatActivity {
    EditText  editText_NamaLengkap, editText_No_HP;
    DatabaseHelper dbhelper;
    Spinner kelasT;
    Button button,clear,tampilData;
    long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_database);
        dbhelper = new DatabaseHelper(this);

        id = getIntent().getLongExtra(DatabaseHelper.clm_id, 0);

        editText_NamaLengkap = findViewById(R.id.editText_NamaLengkap);
        editText_No_HP = findViewById(R.id.editText_No_HP);
        tampilData = findViewById(R.id.tampildata);
        kelasT = findViewById(R.id.kelasT);

        tampilData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityDatabase. this, TampilkanData.class);
                startActivity(intent);
            }
        });
        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CLEAR();
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Database();
            }
        });

    }

    private void Database() {

        String Nama = editText_NamaLengkap.getText().toString().trim();
        String Nohp = editText_No_HP.getText().toString().trim();
        String kelasTahfidz = kelasT.getSelectedItem().toString().trim();

        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.clm_namalkp, Nama);
        values.put(DatabaseHelper.clm_nohp, Nohp);
        values.put(DatabaseHelper.clm_kelas, kelasTahfidz);

        if (Nama.equals("") || Nohp.equals("") || kelasTahfidz.equals("")){
            Toast.makeText(MainActivityDatabase.this, "Data Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }else {
            dbhelper.insertData(values);
            Toast.makeText(MainActivityDatabase.this, "Data Berhasil Tersimpan", Toast.LENGTH_SHORT).show();
        }
    }

    private void CLEAR() {
        editText_NamaLengkap.setText("");
        editText_No_HP.setText("");

    }
}