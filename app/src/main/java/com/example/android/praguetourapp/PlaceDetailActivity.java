package com.example.android.praguetourapp;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class PlaceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_detail);

        Places places = getIntent().getExtras().getParcelable("places");

        //Set on second TV intent from array
        TextView second_cv = findViewById(R.id.second_cv);
        second_cv.getResources().getString(places.getTextPlace());

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.getResources().getString(places.getTextPlace());

        loadBackdrop();
    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(Tour1Fragment.getRandomPlacesDrawable()).centerCrop().into(imageView);

    // imageView.setImageResource(places.getImage());
    //    Glide.with(this).load(imageView).centerCrop().into(imageView);

    }
}
