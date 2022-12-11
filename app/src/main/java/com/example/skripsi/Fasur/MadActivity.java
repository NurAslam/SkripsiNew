package com.example.skripsi.Fasur;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.skripsi.R;

public class MadActivity extends AppCompatActivity implements View.OnClickListener {
    private SoundPool soundPool;
    private int SuaraAlifLamMim, SuaraKafHaYaAinShod, SuaraThoSin, SuaraShod, SuaraHamim, SuaraYasin;
    ImageView gambarTampil;
    ImageButton show, hide;
    Animation animScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad);

        gambarTampil = findViewById(R.id.tampilFawas);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        show = findViewById(R.id.alif_lamMim);
        hide = findViewById(R.id.thoSin);

        animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gambarTampil.setVisibility(View.VISIBLE);
            }
        });
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gambarTampil.setVisibility(View.VISIBLE);
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(28)
                    .setAudioAttributes(audioAttributes).build();

        } else {
            soundPool = new SoundPool(28, AudioManager.STREAM_MUSIC, 0);
        }
        SuaraAlifLamMim = soundPool.load(this, R.raw.aliflammim_aslam, 1);
        SuaraThoSin = soundPool.load(this, R.raw.thosin_aslam, 1);
        SuaraKafHaYaAinShod = soundPool.load(this, R.raw.kafhayaainshod_aslam, 1);
        SuaraShod = soundPool.load(this, R.raw.shod_aslam, 1);
        SuaraHamim = soundPool.load(this, R.raw.hamim_aslam, 1);
        SuaraYasin = soundPool.load(this,R.raw.yasin_aslam,1);

        ImageButton buttonAlifLamMim = findViewById(R.id.alif_lamMim);
        ImageButton buttonThoSin = findViewById(R.id.thoSin);
        ImageButton buttonKafHaYaAinShod = findViewById(R.id.kaf_ha_ya_ain_shod);
        ImageButton buttonShod = findViewById(R.id.shod);
        ImageButton buttonHamim = findViewById(R.id.ha_mim);
        ImageButton buttonYasin = findViewById(R.id.yasin);

        buttonAlifLamMim.setOnClickListener(this);
        buttonThoSin.setOnClickListener(this);
        buttonKafHaYaAinShod.setOnClickListener(this);
        buttonShod.setOnClickListener(this);
        buttonHamim.setOnClickListener(this);
        buttonYasin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.alif_lamMim:
                soundPool.stop(SuaraThoSin);
                soundPool.play(SuaraAlifLamMim,1,1,1,0,1);
                gambarTampil.setImageResource(R.drawable.popup_fawas_alif_lammim);
                gambarTampil.startAnimation(animScale);
                break;
            case R.id.thoSin:
                soundPool.stop(SuaraAlifLamMim);
                soundPool.play(SuaraThoSin,1,1,0,0,1);
                gambarTampil.setImageResource(R.drawable.popup_fawas_tho_sin);
                gambarTampil.startAnimation(animScale);
                break;
        }
    }
    void stopSuara() {

    }
}