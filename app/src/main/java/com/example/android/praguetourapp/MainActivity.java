package com.example.android.praguetourapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        viewPager.setAdapter(viewPagerAdapter);
        indicator.setViewPager(viewPager);

        // Create an arrayList of words
        ArrayList<TourCategoryDetail> tourCategoryList = new ArrayList<TourCategoryDetail>();
        tourCategoryList.add(new TourCategoryDetail(R.drawable.wenceslassquare, R.string.tour1));
        tourCategoryList.add(new TourCategoryDetail(R.drawable.oldtownsquare, R.string.tour2));
        tourCategoryList.add(new TourCategoryDetail(R.drawable.charlesbridge, R.string.tour3));
        tourCategoryList.add(new TourCategoryDetail(R.drawable.praguecastle, R.string.tour4));
        tourCategoryList.add(new TourCategoryDetail(R.drawable.kampa, R.string.tour5));

        // Create adapter
        TourCategoryAdapter itemsAdapter = new TourCategoryAdapter(this, tourCategoryList);

        // Find the object for arrayList
        GridView tourCategoryGridView = (GridView) findViewById(R.id.gv_categories);

        // Set adapter on object of arrayList
        tourCategoryGridView.setAdapter(itemsAdapter);

        // Set a click listener on that View
        tourCategoryGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), TourActivity.class);
                        intent.putExtra("pageID", 0);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), TourActivity.class);
                        intent.putExtra("pageID", 1);
                        break;
                    default:
                        intent = new Intent(getApplicationContext(), TourActivity.class);
                        intent.putExtra("pageID", 2);
                        break;
                }

                if (intent != null) {
                    startActivity(intent);

                }
            }
        });
    }
}