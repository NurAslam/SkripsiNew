package com.example.skripsi.Gharib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.skripsi.R;

public class DetailBacaanGharib extends AppCompatActivity {
    private ImageView imgPhoto;
    private TextView tvNama, tvDesc;
    private Button btnShare;

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bacaan_gharib);
        tvNama = findViewById(R.id.tvHeading);
        tvDesc = findViewById(R.id.tvDeskripsi);
        btnShare = findViewById(R.id.share);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String bodytext = "Baca Selengkapnya Di:https://tafsiralquran.id/bacaan-gharib-dalam-al-quran-menurut-riwayat-imam-hafs/";
                share.putExtra(Intent.EXTRA_SUBJECT, "");
                share.putExtra(Intent.EXTRA_TEXT, bodytext);
                share = Intent.createChooser(share, " Share Via :");
                startActivity(share);
            }
        });

        ModelBacaanGharib rukun = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (rukun != null){
            tvNama.setText(rukun.getNama());
            tvDesc.setText(rukun.getDetail());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Bacaan Bacaan Gharib");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}