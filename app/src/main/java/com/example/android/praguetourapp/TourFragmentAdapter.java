package com.example.android.praguetourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link TourFragmentAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Places} objects.
 */
public class TourFragmentAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link TourFragmentAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public TourFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Tour1Fragment();
        } else if (position == 1) {
            return new Tour2Fragment();
        } else if (position == 2) {
            return new Tour3Fragment();
        } else {
            return new Tour4Fragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tour1);
        } else if (position == 1) {
            return mContext.getString(R.string.tour2);
        } else if (position == 2) {
            return mContext.getString(R.string.tour3);
        } else {
            return mContext.getString(R.string.tour4);
        }
    }
}
