package com.example.android.praguetourapp;

public class Places {

    private int mImage;
    private int mNamePlace;
    private int mTextPlace;
    private int mStreetPlace;
    private int mPhonePlace;
    private int mWebPlace;
    private int mStreetPlaceLong;
    private int mStreetPlaceLat;

    public Places(int Image, int NamePlace, int TextPlace) {
        mImage = Image;
        mNamePlace = NamePlace;
        mTextPlace = TextPlace;
//        mStreetPlace = StreetPlace;
//        mPhonePlace = PhonePlace;
//        mWebPlace = WebPlace;
//        mStreetPlaceLong = StreetPlaceLong;
//        mStreetPlaceLat = StreetPlaceLat;
    }

    public int getImage () {return mImage;}
    public int getNamePlace () {return mNamePlace;}
    public int getTextPlace () {return mTextPlace;}
    //public int getStreetPlace () {return mStreetPlace;}
    //    public int getPhonePlace () {return mPhonePlace;}
    //public int getWebPlace () {return mWebPlace;}
    //public int getStreetPlaceLong () {return mStreetPlaceLong;}
    //public int getStreetPlaceLat () {return mStreetPlaceLat;}

}
