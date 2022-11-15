package com.example.skripsi.Belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_hijaiyyah);
        TampilGambar = findViewById(R.id.huruf_hijaiyyah);

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
                break;
            case R.id.hijaiyyah_ba:
                TampilGambar.setImageResource(R.drawable.pop_ba);
                break;
            case R.id.hijaiyyah_ta:
                TampilGambar.setImageResource(R.drawable.pop_ta);
                break;
            case R.id.hijaiyyah_tsa:
                TampilGambar.setImageResource(R.drawable.pop_tsa);
                break;
            case R.id.hijaiyyah_ja:
                TampilGambar.setImageResource(R.drawable.pop_jim);
                break;
            case R.id.hijaiyyah_ha:
                TampilGambar.setImageResource(R.drawable.pop_ha);
                break;
            case R.id.hijaiyyah_kho:
                TampilGambar.setImageResource(R.drawable.pop_kha);
                break;
            case R.id.hijaiyyah_da:
                TampilGambar.setImageResource(R.drawable.pop_dal);
                break;
            case R.id.hijaiyyah_dza:
                TampilGambar.setImageResource(R.drawable.pop_dzal);
                break;
            case R.id.hijaiyyah_ro:
                TampilGambar.setImageResource(R.drawable.pop_ra);
                break;
            case R.id.hijaiyyah_za:
                TampilGambar.setImageResource(R.drawable.pop_zai);
                break;
            case R.id.hijaiyyah_sin:
                TampilGambar.setImageResource(R.drawable.pop_sin);
                break;
            case R.id.hijaiyyah_syin:
                TampilGambar.setImageResource(R.drawable.pop_syin);
                break;
            case R.id.hijaiyyah_sho:
                TampilGambar.setImageResource(R.drawable.pop_shad);
                break;
            case R.id.hijaiyyah_dho:
                TampilGambar.setImageResource(R.drawable.pop_dhad);
                break;
            case R.id.hijaiyyah_tho:
                TampilGambar.setImageResource(R.drawable.pop_tha);
                break;
            case R.id.hijaiyyah_dzo:
                TampilGambar.setImageResource(R.drawable.pop_zai);
                break;
            case R.id.hijaiyyah_ain:
                TampilGambar.setImageResource(R.drawable.pop_ain);
                break;
            case R.id.hijaiyyah_gho:
                TampilGambar.setImageResource(R.drawable.pop_ghain);
                break;
            case R.id.hijaiyyah_fa:
                TampilGambar.setImageResource(R.drawable.pop_fa);
                break;
            case R.id.hijaiyyah_qof:
                TampilGambar.setImageResource(R.drawable.pop_qaf);
                break;
            case R.id.hijaiyyah_kaf:
                TampilGambar.setImageResource(R.drawable.pop_kaf);
                break;
            case R.id.hijaiyyah_lam:
                TampilGambar.setImageResource(R.drawable.pop_lam);
                break;
            case R.id.hijaiyyah_mim:
                TampilGambar.setImageResource(R.drawable.pop_mim);
                break;
            case R.id.hijaiyyah_nun:
                TampilGambar.setImageResource(R.drawable.pop_nun);
                break;
            case R.id.hijaiyyah_wa:
                TampilGambar.setImageResource(R.drawable.pop_wawu);
                break;
            case R.id.hijaiyyah_haa:
                TampilGambar.setImageResource(R.drawable.pop_haa);
                break;
            case R.id.hijaiyyah_ya:
                TampilGambar.setImageResource(R.drawable.pop_ya);
                break;
        }
   }
    public void click(View v){
        switch (v.getId()) {
            case R.id.help009:
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.toast_layout_root));
                TextView text = layout.findViewById(R.id.mytoast);
                text.setText(R.string.text7);
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
                break;
            case R.id.back009:
                startActivity(new Intent(hijaiyyah_activity.this, MainActivity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                break;
        }
    }
}