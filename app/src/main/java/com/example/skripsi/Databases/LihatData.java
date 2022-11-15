package com.example.skripsi.Databases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.skripsi.R;

public class LihatData extends AppCompatActivity {
    TextView NamaLengkap, No_HP, kelasTahfidz;
    DatabaseHelper dbhelper;

    Button tampilData;
    long id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        dbhelper = new DatabaseHelper(this);

        id = getIntent().getLongExtra(DatabaseHelper.clm_id, 0);

        NamaLengkap = findViewById(R.id.nama);
        No_HP = findViewById(R.id.nohp);
        kelasTahfidz = findViewById(R.id.jur);
        tampilData = findViewById(R.id.tampildata);
        tampilData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LihatData. this, TampilkanData.class);
                startActivity(intent);
            }
        });

        getData(); //fungsinya yaitu mendapatkan data dari tampilan data yang di edit
    }

    private void getData(){
        Cursor cursor = dbhelper.oneData(id);


        if(cursor.moveToFirst()){
            String Nama = cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_namalkp));
            String Nohp = cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_nohp));
            String kelas = cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_kelas));

            NamaLengkap.setText(Nama);
            No_HP.setText(Nohp);
            kelasTahfidz.setText(kelas);
        }
    }
}