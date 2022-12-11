package com.example.skripsi.Fasur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.skripsi.Belajar.hijaiyyah_activity;
import com.example.skripsi.MainActivity;
import com.example.skripsi.R;

public class FawasActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView TampilGambar;
    ImageButton show,hide;
    Button back;
    private SoundPool soundPool;
    private int SuaraAlifLamMim, SuaraHamim, SuaraKafHaYaAinShod, SuaraThoSin, SuaraShod, SuaraYasin;
    Animation anImScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fawas);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = findViewById(R.id.tampilFawas);
        show = findViewById(R.id.alif_lamMim);
        anImScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TampilGambar.setVisibility(View.VISIBLE);

            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(1).build();
        }else {
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        }
        SuaraAlifLamMim = soundPool.load(this, R.raw.aliflammim_aslam,1);
        SuaraHamim = soundPool.load(this, R.raw.hamim_aslam,1);
        SuaraKafHaYaAinShod = soundPool.load(this, R.raw.kafhayaainshod_aslam, 1);
        SuaraThoSin = soundPool.load(this,R.raw.thosin_aslam, 1);
        SuaraShod = soundPool.load(this, R.raw.shod_aslam, 1);
        SuaraYasin = soundPool.load(this, R.raw.yasin_aslam, 1);
        ImageButton Buttonha_mim = (ImageButton) this.findViewById(R.id.ha_mim);
        ImageButton Buttonalif_lam_mim = (ImageButton) this.findViewById(R.id.alif_lamMim);
        ImageButton ButtonKafHayaAinShod = (ImageButton) this.findViewById(R.id.kaf_ha_ya_ain_shod);
        ImageButton ButtonThoSin = (ImageButton) this.findViewById(R.id.thoSin);
        ImageButton ButtonShod = (ImageButton) this.findViewById(R.id.shod);
        ImageButton ButtonYasin = (ImageButton) this.findViewById(R.id.yasin);

        Buttonha_mim.setOnClickListener(this);
        Buttonalif_lam_mim.setOnClickListener(this);
        ButtonKafHayaAinShod.setOnClickListener(this);
        ButtonThoSin.setOnClickListener(this);
        ButtonShod.setOnClickListener(this);
        ButtonYasin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alif_lamMim:
                TampilGambar.setImageResource(R.drawable.popup_fawas_alif_lammim);
                TampilGambar.startAnimation(anImScale);
                soundPool.play(SuaraAlifLamMim,1,1,0,0,1);
                break;
            case R.id.ha_mim:
                TampilGambar.setImageResource(R.drawable.popup_fawas_ha_mim);
                TampilGambar.startAnimation(anImScale);
                soundPool.play(SuaraHamim,1,1,0,0,1);
                break;
            case R.id.kaf_ha_ya_ain_shod:
                TampilGambar.setImageResource(R.drawable.popup_kaf_ha_ya_ain_shod);
                TampilGambar.startAnimation(anImScale);
                soundPool.play(SuaraKafHaYaAinShod,1,1,0,0,1);
                break;
            case R.id.thoSin:
                TampilGambar.setImageResource(R.drawable.popup_fawas_tho_sin);
                TampilGambar.startAnimation(anImScale);
                soundPool.play(SuaraThoSin,1,1,0,0,1);
                break;
            case R.id.shod:
                TampilGambar.setImageResource(R.drawable.popup_fawas_shod);
                TampilGambar.startAnimation(anImScale);
                soundPool.play(SuaraShod,1,1,0,0,1);
                break;
            case R.id.yasin:
                TampilGambar.setImageResource(R.drawable.popup_fawas_yasin);
                TampilGambar.startAnimation(anImScale);
                soundPool.play(SuaraYasin,1,1,0,0,1);
                break;
        }
    }

    public void click(View v) {
        switch (v.getId()) {
            case R.id.b_back:
                startActivity(new Intent(FawasActivity.this, MainActivity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                break;
        }
    }
}