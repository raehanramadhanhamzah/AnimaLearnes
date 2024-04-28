package com.example.animalearnes;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

public class DataHewan implements Parcelable {
    Integer imgHewan;
    String namaHewan,descHewan,habitatHewan,makananHewan,funfactHewan;

    public DataHewan(Integer imgHewan, String namaHewan, String descHewan, String habitatHewan, String makananHewan, String funfactHewan) {
        this.imgHewan = imgHewan;
        this.namaHewan = namaHewan;
        this.descHewan = descHewan;
        this.habitatHewan = habitatHewan;
        this.makananHewan = makananHewan;
        this.funfactHewan = funfactHewan;
    }

    protected DataHewan(Parcel in) {
        if (in.readByte() == 0) {
            imgHewan = null;
        } else {
            imgHewan = in.readInt();
        }
        namaHewan = in.readString();
        descHewan = in.readString();
        habitatHewan = in.readString();
        makananHewan = in.readString();
        funfactHewan = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (imgHewan == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(imgHewan);
        }
        dest.writeString(namaHewan);
        dest.writeString(descHewan);
        dest.writeString(habitatHewan);
        dest.writeString(makananHewan);
        dest.writeString(funfactHewan);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DataHewan> CREATOR = new Creator<DataHewan>() {
        @Override
        public DataHewan createFromParcel(Parcel in) {
            return new DataHewan(in);
        }

        @Override
        public DataHewan[] newArray(int size) {
            return new DataHewan[size];
        }
    };

    public Integer getImgHewan() {
        return imgHewan;
    }

    public void setImgHewan(Integer imgHewan) {
        this.imgHewan = imgHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getDescHewan() {
        return descHewan;
    }

    public void setDescHewan(String descHewan) {
        this.descHewan = descHewan;
    }

    public String getHabitatHewan() {
        return habitatHewan;
    }

    public void setHabitatHewan(String habitatHewan) {
        this.habitatHewan = habitatHewan;
    }

    public String getMakananHewan() {
        return makananHewan;
    }

    public void setMakananHewan(String makananHewan) {
        this.makananHewan = makananHewan;
    }

    public String getFunfactHewan() {
        return funfactHewan;
    }

    public void setFunfactHewan(String funfactHewan) {
        this.funfactHewan = funfactHewan;
    }
}
