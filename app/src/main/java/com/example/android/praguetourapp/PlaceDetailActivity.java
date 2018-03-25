package com.example.android.praguetourapp;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Resource;

public class PlaceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_detail);

        //Get intent from Fragments
        Places places = getIntent().getExtras().getParcelable("places");

        //Set title image
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load((places.getImage())).centerCrop().into(imageView);

        //Set title text - place name
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(getResources().getString(places.getNamePlace()));

        //Set on second TV intent from array
        TextView first_cv = findViewById(R.id.first_cv_name);
        TextView second_cv = findViewById(R.id.second_cv);
        first_cv.setText(places.getNamePlace());
        second_cv.setText(places.getTextPlace());

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
