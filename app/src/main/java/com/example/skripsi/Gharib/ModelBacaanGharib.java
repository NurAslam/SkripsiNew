package com.example.skripsi.Gharib;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelBacaanGharib implements Parcelable{
    private String nama, detail;
    private int photo;

    public ModelBacaanGharib(){

    }

    protected ModelBacaanGharib(String nama, String detail, int photo) {
        this.nama = nama;
        this.detail = detail;
        this.photo = photo;
    }

    protected ModelBacaanGharib(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Parcelable.Creator<ModelBacaanGharib> CREATOR = new Parcelable.Creator<ModelBacaanGharib>() {
        @Override
        public ModelBacaanGharib createFromParcel(Parcel in) {
            return new ModelBacaanGharib(in);
        }

        @Override
        public ModelBacaanGharib[] newArray(int size) {
            return new ModelBacaanGharib[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
