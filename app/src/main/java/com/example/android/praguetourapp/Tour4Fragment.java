package com.example.android.praguetourapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Tour4Fragment extends android.support.v4.app.Fragment {

    public Tour4Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_lv, container, false);

        // Create a list of words
        final ArrayList<Places> placesListTour4 = new ArrayList<Places>();
        placesListTour4.add(new Places(R.drawable.kampa, R.string.place45, R.string.place45text));
        placesListTour4.add(new Places(R.drawable.malostranskemosteckeveze, R.string.place46, R.string.place46text));
        placesListTour4.add(new Places(R.drawable.karluvmost, R.string.place47, R.string.place47text));
        placesListTour4.add(new Places(R.drawable.staromestskamosteckavez, R.string.place48, R.string.place48text));
        placesListTour4.add(new Places(R.drawable.krizovnicenamesti, R.string.place49, R.string.place49text));
        placesListTour4.add(new Places(R.drawable.kostelsvatehofrantiskazasisi, R.string.place50, R.string.place50text));
        placesListTour4.add(new Places(R.drawable.klementinum, R.string.place51, R.string.place51text));
        placesListTour4.add(new Places(R.drawable.novotneholavka, R.string.place52, R.string.place52text));
        placesListTour4.add(new Places(R.drawable.krannerovaka_na, R.string.place53, R.string.place53text));
        placesListTour4.add(new Places(R.drawable.narodnidivadlo, R.string.place54, R.string.place54text));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesListTour4, R.color.colorPrimary);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_item.xml layout file.
        ListView listViewTour4 = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listViewTour4.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listViewTour4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Create a new object intent (parse on position)
                Intent intent = new Intent(Tour4Fragment.this.getActivity(), PlaceDetailActivity.class);

                Places selectedPlace = placesListTour4.get(position);
                intent.putExtra("places", selectedPlace);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
