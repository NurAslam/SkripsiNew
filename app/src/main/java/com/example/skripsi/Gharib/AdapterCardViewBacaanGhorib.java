package com.example.skripsi.Gharib;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skripsi.R;

import java.util.ArrayList;

public class AdapterCardViewBacaanGhorib extends RecyclerView.Adapter<AdapterCardViewBacaanGhorib.CardViewHolder>{

    private ArrayList<ModelBacaanGharib> listRukun;
    private OnItemClickCallback onItemClickCallback;

    public AdapterCardViewBacaanGhorib(ArrayList<ModelBacaanGharib> list) {
        this.listRukun = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_gharib, parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        ModelBacaanGharib rukun = listRukun.get(position);
        holder.tvNama.setText(rukun.getNama());
        holder.tvDetail.setText(rukun.getDetail());
        holder.btnBaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listRukun.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), listRukun.get(holder.getAdapterPosition()).getNama(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listRukun.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), listRukun.get(holder.getAdapterPosition()).getNama(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listRukun.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvNama, tvDetail;
        Button btnBaca;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_item_photo);
            tvNama = itemView.findViewById(R.id.tvHeading);
            tvDetail = itemView.findViewById(R.id.tvDeskripsi);
            btnBaca = itemView.findViewById(R.id.btnBaca);

        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(ModelBacaanGharib rukun);
    }
}
