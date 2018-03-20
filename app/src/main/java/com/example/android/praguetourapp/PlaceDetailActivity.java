package com.example.android.praguetourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class PlaceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_detail);

        Places places = getIntent().getExtras().getParcelable("places");
        TextView first_cv = findViewById(R.id.first_cv);
        TextView second_cv = findViewById(R.id.second_cv);
        TextView third_cv = findViewById(R.id.third_cv);

        first_cv.setText(String.valueOf(places.getTextPlace()));
        second_cv.setText(String.valueOf(places.getNamePlace()));
        third_cv.setText(String.valueOf(places.getTextPlace()));


        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("TEST");

        loadBackdrop();
    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(Tour1Fragment.getRandomPlacesDrawable()).centerCrop().into(imageView);
    }
}
