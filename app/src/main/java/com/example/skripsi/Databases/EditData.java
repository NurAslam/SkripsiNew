package com.example.skripsi.Databases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.skripsi.R;

public class EditData extends AppCompatActivity {
    EditText  editText_NamaLengkap, editText_No_HP;
    DatabaseHelper dbhelper;
    Spinner kelas;
    Button button,clear,tampilData;
    long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);
        dbhelper = new DatabaseHelper(this);

        id = getIntent().getLongExtra(DatabaseHelper.clm_id, 0);
        editText_NamaLengkap = findViewById(R.id.editText_NamaLengkap);
        editText_No_HP = findViewById(R.id.editText_No_HP);
        kelas = findViewById(R.id.kelas);
        tampilData = findViewById(R.id.Back);
        tampilData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditData. this, TampilkanData.class);
                startActivity(intent);


            }
        });
        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CLEAR();//membersihkan data
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Database(); // menyimpang data yang baru
            }
        });

        getData(); //fungsinya yaitu mendapatkan data dari tampilan data yang mau di edit
    }
    private void Database(){
        String Nama = editText_NamaLengkap.getText().toString().trim();
        String Nohp = editText_No_HP.getText().toString().trim();
        String kelasTahfidz = kelas.getSelectedItem().toString().trim();
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.clm_namalkp, Nama);
        values.put(DatabaseHelper.clm_nohp, Nohp);
        values.put(DatabaseHelper.clm_kelas, kelasTahfidz);

        if ( Nama.equals("") || Nohp.equals("") ) {
            Toast.makeText(EditData.this, "Data Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            dbhelper.updateData(values, id);
            Toast.makeText(EditData.this, "Data Berhasil Tersimpan", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
    private void getData(){
        Cursor cursor = dbhelper.oneData(id);
        if(cursor.moveToFirst()){

            String Nama = cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_namalkp));
            String Nohp = cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_nohp));
            String jur = cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_kelas));
            editText_NamaLengkap.setText(Nama);
            editText_No_HP.setText(Nohp);

            if (jur.equals("صغير (1)")){
                kelas.setSelection(0);
            }else if(jur.equals("كبير (2)")){
                kelas.setSelection(1);
            } else if(jur.equals("خير كبير (3)")){
                kelas.setSelection(2);
                kelas.setSelection(2);
                kelas.setSelection(2);
            }
        }
    }

    private void CLEAR() {
        editText_NamaLengkap.setText("");
        editText_No_HP.setText("");
    }
}