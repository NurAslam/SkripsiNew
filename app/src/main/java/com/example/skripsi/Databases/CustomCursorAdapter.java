package com.example.skripsi.Databases;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.skripsi.R;

public class CustomCursorAdapter extends CursorAdapter {
    private LayoutInflater layoutInflater;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public CustomCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        View v = layoutInflater.inflate(R.layout.row_data, parent, false);
        MyHolder holder = new MyHolder();
        holder.ListID = (TextView)v.findViewById(R.id.listID);
        holder.ListNama = (TextView)v.findViewById(R.id.listNama);
        holder.ListNoHp = (TextView)v.findViewById(R.id.NoHp);
        holder.ListKelasT = (TextView)v.findViewById(R.id.ListJurusan);
        v.setTag(holder);
        return v;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        MyHolder holder = (MyHolder)view.getTag();

        holder.ListID.setText(cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_id)));
        holder.ListNama.setText(cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_namalkp)));
        holder.ListNoHp.setText(cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_nohp)));
        holder.ListKelasT.setText(cursor.getString(cursor.getColumnIndex(DatabaseHelper.clm_kelas)));
    }

    class MyHolder{
        TextView ListID;
        TextView ListNama;
        TextView ListKelasT;
        TextView ListNoHp;
    }
}
