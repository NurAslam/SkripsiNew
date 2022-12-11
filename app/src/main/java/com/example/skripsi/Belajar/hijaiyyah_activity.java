package com.example.skripsi.Belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.skripsi.MainActivity;
import com.example.skripsi.R;

public class hijaiyyah_activity extends AppCompatActivity implements View.OnClickListener {
    ImageView TampilGambar;
    private SoundPool soundPool;
    private int alif, ba, ta, tsa, jim, ha , kho, dal ,dzal, ro, zain, sin, syin, sho, dho, tho, dzo, ain, ghain, fa, qof, kaf, lam, mim, nun, waw, hah, ya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_hijaiyyah);
        TampilGambar = findViewById(R.id.huruf_hijaiyyah);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(1).build();
        }else {
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        }
        alif = soundPool.load(this, R.raw.alif_aslam,1);
        ba = soundPool.load(this, R.raw.ba_aslam,1);
        ta = soundPool.load(this, R.raw.ta_aslam,1);
        tsa = soundPool.load(this, R.raw.tsa_aslam,1);
        jim = soundPool.load(this, R.raw.dal_aslam,1);
        ha = soundPool.load(this, R.raw.dzal_aslam,1);
        kho = soundPool.load(this, R.raw.kho_aslam,1);
        dal = soundPool.load(this, R.raw.dal_aslam,1);
        dzal = soundPool.load(this, R.raw.dzal_aslam,1);
        ro = soundPool.load(this, R.raw.ro_aslam,1);
        zain = soundPool.load(this, R.raw.za_aslam,1);
        syin = soundPool.load(this, R.raw.syin_aslam,1);
        sho = soundPool.load(this, R.raw.shod_aslam,1);
        dho = soundPool.load(this, R.raw.dho_aslam,1);
        tho = soundPool.load(this, R.raw.tho_aslam,1);
        dzo = soundPool.load(this, R.raw.dzo_aslam,1);
        ain = soundPool.load(this, R.raw.ain_aslam,1);
        ghain = soundPool.load(this, R.raw.ghain_aslam,1);
        fa = soundPool.load(this, R.raw.ghain_aslam,1);
        qof = soundPool.load(this, R.raw.aliflammim_aslam,1);
        kaf = soundPool.load(this, R.raw.aliflammim_aslam,1);
        lam = soundPool.load(this, R.raw.aliflammim_aslam,1);
        mim = soundPool.load(this, R.raw.aliflammim_aslam,1);
        nun = soundPool.load(this, R.raw.aliflammim_aslam,1);
        waw = soundPool.load(this, R.raw.aliflammim_aslam,1);
        hah = soundPool.load(this, R.raw.aliflammim_aslam,1);
        ya = soundPool.load(this, R.raw.aliflammim_aslam,1);





        ImageButton tombol_alif = findViewById(R.id.hijaiyyah_alif);
        ImageButton tombol_ba = findViewById(R.id.hijaiyyah_ba);
        ImageButton tombol_ta = findViewById(R.id.hijaiyyah_ta);
        ImageButton tombol_tsa = findViewById(R.id.hijaiyyah_tsa);
        ImageButton tombol_ja = findViewById(R.id.hijaiyyah_ja);
        ImageButton tombol_ha = findViewById(R.id.hijaiyyah_ha);
        ImageButton tombol_kho = findViewById(R.id.hijaiyyah_kho);
        ImageButton tombol_da = findViewById(R.id.hijaiyyah_da);
        ImageButton tombol_dza = findViewById(R.id.hijaiyyah_dza);
        ImageButton tombol_ro = findViewById(R.id.hijaiyyah_ro);
        ImageButton tombol_za = findViewById(R.id.hijaiyyah_za);
        ImageButton tombol_sa = findViewById(R.id.hijaiyyah_sin);
        ImageButton tombol_sya = findViewById(R.id.hijaiyyah_syin);
        ImageButton tombol_sho = findViewById(R.id.hijaiyyah_sho);
        ImageButton tombol_dho = findViewById(R.id.hijaiyyah_dho);
        ImageButton tombol_tho = findViewById(R.id.hijaiyyah_tho);
        ImageButton tombol_dzo = findViewById(R.id.hijaiyyah_dzo);
        ImageButton tombol_ain = findViewById(R.id.hijaiyyah_ain);
        ImageButton tombol_gho = findViewById(R.id.hijaiyyah_gho);
        ImageButton tombol_fa = findViewById(R.id.hijaiyyah_fa);
        ImageButton tombol_qo = findViewById(R.id.hijaiyyah_qof);
        ImageButton tombol_ka = findViewById(R.id.hijaiyyah_kaf);
        ImageButton tombol_la = findViewById(R.id.hijaiyyah_lam);
        ImageButton tombol_ma = findViewById(R.id.hijaiyyah_mim);
        ImageButton tombol_na = findViewById(R.id.hijaiyyah_nun);
        ImageButton tombol_wa = findViewById(R.id.hijaiyyah_wa);
        ImageButton tombol_haa = findViewById(R.id.hijaiyyah_haa);
        ImageButton tombol_ya = findViewById(R.id.hijaiyyah_ya);

        tombol_alif.setOnClickListener(this);
        tombol_ba.setOnClickListener(this);
        tombol_ta.setOnClickListener(this);
        tombol_tsa.setOnClickListener(this);
        tombol_ja.setOnClickListener(this);
        tombol_ha.setOnClickListener(this);
        tombol_kho.setOnClickListener(this);
        tombol_da.setOnClickListener(this);
        tombol_dza.setOnClickListener(this);
        tombol_ro.setOnClickListener(this);
        tombol_za.setOnClickListener(this);
        tombol_sa.setOnClickListener(this);
        tombol_sya.setOnClickListener(this);
        tombol_sho.setOnClickListener(this);
        tombol_dho.setOnClickListener(this);
        tombol_tho.setOnClickListener(this);
        tombol_dzo.setOnClickListener(this);
        tombol_ain.setOnClickListener(this);
        tombol_gho.setOnClickListener(this);
        tombol_fa.setOnClickListener(this);
        tombol_qo.setOnClickListener(this);
        tombol_ka.setOnClickListener(this);
        tombol_la.setOnClickListener(this);
        tombol_ma.setOnClickListener(this);
        tombol_na.setOnClickListener(this);;
        tombol_wa.setOnClickListener(this);
        tombol_haa.setOnClickListener(this);
        tombol_ya.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hijaiyyah_alif:
                TampilGambar.setImageResource(R.drawable.pop_alif);
                soundPool.play(alif,1,1,0,0,1);
                break;
            case R.id.hijaiyyah_ba:
                TampilGambar.setImageResource(R.drawable.pop_ba);
                soundPool.play(ba,1,1,0,0,1);
                break;
            case R.id.hijaiyyah_ta:
                soundPool.play(ta,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_ta);
                break;
            case R.id.hijaiyyah_tsa:
                soundPool.play(tsa,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_tsa);
                break;
            case R.id.hijaiyyah_ja:
                soundPool.play(jim,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_jim);
                break;
            case R.id.hijaiyyah_ha:
                soundPool.play(ha,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_ha);
                break;
            case R.id.hijaiyyah_kho:
                soundPool.play(kho,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_kha);
                break;
            case R.id.hijaiyyah_da:
                soundPool.play(dal,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_dal);
                break;
            case R.id.hijaiyyah_dza:
                soundPool.play(dzal,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_dzal);
                break;
            case R.id.hijaiyyah_ro:
                soundPool.play(ro,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_ra);
                break;
            case R.id.hijaiyyah_za:
                soundPool.play(zain,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_zai);
                break;
            case R.id.hijaiyyah_sin:
                soundPool.play(sin,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_sin);
                break;
            case R.id.hijaiyyah_syin:
                soundPool.play(syin,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_syin);
                break;
            case R.id.hijaiyyah_sho:
                soundPool.play(sho,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_shad);
                break;
            case R.id.hijaiyyah_dho:
                soundPool.play(dho,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_dhad);
                break;
            case R.id.hijaiyyah_tho:
                soundPool.play(tho,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_tha);
                break;
            case R.id.hijaiyyah_dzo:
                soundPool.play(dzo,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_zai);
                break;
            case R.id.hijaiyyah_ain:
                soundPool.play(ain,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_ain);
                break;
            case R.id.hijaiyyah_gho:
                soundPool.play(ghain,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_ghain);
                break;
            case R.id.hijaiyyah_fa:
                soundPool.play(fa,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_fa);
                break;
            case R.id.hijaiyyah_qof:
                soundPool.play(qof,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_qaf);
                break;
            case R.id.hijaiyyah_kaf:
                soundPool.play(kaf,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_kaf);
                break;
            case R.id.hijaiyyah_lam:
                soundPool.play(lam,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_lam);
                break;
            case R.id.hijaiyyah_mim:
                soundPool.play(mim,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_mim);
                break;
            case R.id.hijaiyyah_nun:
                soundPool.play(nun,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_nun);
                break;
            case R.id.hijaiyyah_wa:
                soundPool.play(waw,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_wawu);
                break;
            case R.id.hijaiyyah_haa:
                soundPool.play(hah,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_haa);
                break;
            case R.id.hijaiyyah_ya:
                soundPool.play(ya,1,1,0,0,1);
                TampilGambar.setImageResource(R.drawable.pop_ya);
                break;
        }
   }
    public void click(View v){
        switch (v.getId()) {

            case R.id.back009:
                startActivity(new Intent(hijaiyyah_activity.this, MainActivity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                break;
        }
    }
}