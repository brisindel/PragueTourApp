package com.example.android.praguetourapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Places implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Places createFromParcel(Parcel in) {
            return new Places(in);
        }

        public Places[] newArray(int size) {
            return new Places[size];
        }
    };

    private int mImage;
    private int mNamePlace;
    private int mTextPlace;

    public Places(int Image, int NamePlace, int TextPlace) {
        this.mImage = Image;
        this.mNamePlace = NamePlace;
        this.mTextPlace = TextPlace;

    }

    public int getImage() {
        return mImage;
    }

    public int getNamePlace() {
        return mNamePlace;
    }

    public int getTextPlace() {
        return mTextPlace;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.mImage);
        dest.writeInt(this.mNamePlace);
        dest.writeInt(this.mTextPlace);
    }

    //parceling part
    public Places(Parcel parcel) {
        this.mImage = parcel.readInt();
        this.mNamePlace = parcel.readInt();
        this.mTextPlace = parcel.readInt();
    }
}
