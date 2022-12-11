package com.example.skripsi.Gharib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.skripsi.R;

import java.util.ArrayList;

public class GharibActivityMain extends AppCompatActivity {

    private RecyclerView rv_rukun;
    private ArrayList<ModelBacaanGharib> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gharib_main);


        rv_rukun = findViewById(R.id.rvGharib);
        rv_rukun.setHasFixedSize(true);

        list.addAll(DataBacaanGhorib.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rv_rukun.setLayoutManager(new LinearLayoutManager(this));
        AdapterCardViewBacaanGhorib cardViewRukunAdapater = new AdapterCardViewBacaanGhorib(list);
        rv_rukun.setAdapter(cardViewRukunAdapater);

        cardViewRukunAdapater.setOnItemClickCallback(new AdapterCardViewBacaanGhorib.OnItemClickCallback() {
            @Override
            public void onItemClicked(ModelBacaanGharib rukun) {
                Intent move = new Intent(GharibActivityMain.this, DetailBacaanGharib.class);
                move.putExtra(DetailBacaanGharib.ITEM_EXTRA, rukun);
                startActivity(move);
            }
        });
    }
}