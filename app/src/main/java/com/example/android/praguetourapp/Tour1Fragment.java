package com.example.android.praguetourapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class Tour1Fragment extends android.support.v4.app.Fragment {

    public Tour1Fragment() {
        // Required empty public constructor
    }

    private static final Random RANDOM = new Random();

    public static int getRandomPlacesDrawable() {
        switch (RANDOM.nextInt(4)) {
            default:
            case 0:
                return R.drawable.charlesbridge;
            case 1:
                return R.drawable.kampa;
            case 2:
                return R.drawable.oldtownsquare;
            case 3:
                return R.drawable.wenceslassquare;
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_lv, container, false);

        // Create a list of words
        final ArrayList<Places> placesList = new ArrayList<Places>();
        placesList.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        placesList.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        placesList.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        placesList.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        placesList.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        placesList.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        placesList.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        placesList.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));


        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesList, R.color.yellow);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Create a new object intent (parse on position)
                Intent intent = new Intent(Tour1Fragment.this.getActivity(), PlaceDetailActivity.class);

                Places selectedPlace = placesList.get(position);
                Places places = new Places(0,0,0);
                intent.putExtra("places", places);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
