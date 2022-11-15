package com.example.skripsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.skripsi.Belajar.hijaiyyah_activity;
import com.example.skripsi.Fasur.Fawas_activity;
import com.example.skripsi.Recording.record_activity;
import com.example.skripsi.quiz.KuisActivity;

public class MainActivity extends AppCompatActivity {
ImageButton pindah;
MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer suarabutton = MediaPlayer.create(this, R.raw.button);

        mp = MediaPlayer.create(getBaseContext(), R.raw.backsound);
        mp.start();

        pindah = (ImageButton) findViewById(R.id.buttonBelajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarabutton.start();
                Intent intent = new Intent(MainActivity.this, hijaiyyah_activity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonKuis);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarabutton.start();
                Intent intent = new Intent(MainActivity.this, KuisActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBiodata);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.skripsi.Databases.MainActivityDatabase.class);
                startActivity(intent);

            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonRecording);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarabutton.start();
                Intent intent = new Intent(MainActivity.this, record_activity.class);
                startActivity(intent);
                mp.stop();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonMad);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarabutton.start();
                Intent intent = new Intent(MainActivity.this, Fawas_activity.class);
                startActivity(intent);
                mp.stop();
            }
        });
        pindah = (ImageButton) findViewById(R.id.aboutme);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarabutton.start();
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });
           }
}