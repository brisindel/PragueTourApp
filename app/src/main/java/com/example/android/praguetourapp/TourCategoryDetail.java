package com.example.android.praguetourapp;

public class TourCategoryDetail {
    // Drawable resource ID
    private int mImageResourceId;

    // Music category
    private int mTextCategory;

    /*
    * Create a new TourCategoryDetail object.
    *
    * @param mImageResourceID is drawable reference ID that corresponds with TourCategoryDetail
    * @param mTextCategory is list of TourCategoryDetail
    * */
    public TourCategoryDetail(int imageResourceId, int vCategory) {
        mImageResourceId = imageResourceId;
        mTextCategory = vCategory;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the Tour text category name
     */
    public int getTextCategory() {
        return mTextCategory;
    }
}

