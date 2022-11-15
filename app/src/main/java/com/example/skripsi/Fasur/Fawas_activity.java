package com.example.skripsi.Fasur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.skripsi.MainActivity;
import com.example.skripsi.R;


public class Fawas_activity extends AppCompatActivity {


    Button back;
    ImageView TampilGambar;
    ImageButton show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fawas_activity);
        TampilGambar = (ImageView) findViewById(R.id.tampilFawas);
        show = (ImageButton) findViewById(R.id.alif_lamMim);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
//        show.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TampilGambar.setVisibility(View.VISIBLE);
//            }
//        });
//        show.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TampilGambar.setVisibility(View.INVISIBLE);
//            }
//        });
//        Menambah Button Suara

        final MediaPlayer SuaraAlifLamMim = MediaPlayer.create(this, R.raw.aliflammim);
        final MediaPlayer SuaraKafHaYaAinShod = MediaPlayer.create(this, R.raw.fawas_kafhayaainshod);
        final MediaPlayer SuaraThoSin = MediaPlayer.create(this, R.raw.fawas_thosin);
        final MediaPlayer SuaraShod = MediaPlayer.create(this, R.raw.fawas_shod);
        final MediaPlayer SuaraHamim = MediaPlayer.create(this, R.raw.fawas_hamim);
        final MediaPlayer SuaraYasin = MediaPlayer.create(this, R.raw.fawas_yasin);

//        Menambah Variabel Button
        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.alif_lamMim);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.thoSin);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.shod);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.ha_mim);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.yasin);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kaf_ha_ya_ain_shod);


//        Menghidupkan suara
        //        fitur buat nambah suara ketika di klik ada animasi
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.popup_fawas_alif_lammim);
                TampilGambar.startAnimation(animScale);
                SuaraAlifLamMim.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.popup_kaf_ha_ya_ain_shod);
                TampilGambar.startAnimation(animScale);
                SuaraKafHaYaAinShod.start();
            }
        });
        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.b_shod);
                TampilGambar.startAnimation(animScale);
                SuaraShod.start();
            }
        });
        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.popup_fawas_tho_sin);
                TampilGambar.startAnimation(animScale);
                SuaraThoSin.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.popup_fawas_ha_mim);
                TampilGambar.startAnimation(animScale);
                SuaraHamim.start();
            }
        });

        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.popup_fawas_yasin);
                TampilGambar.startAnimation(animScale);
                SuaraYasin.start();
            }
        });


        back = findViewById(R.id.b_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

}