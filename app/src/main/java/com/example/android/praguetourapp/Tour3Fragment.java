package com.example.android.praguetourapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Tour3Fragment extends android.support.v4.app.Fragment {

    public Tour3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_lv, container, false);

        // Create a list of words
        final ArrayList<Places> placesListTour3 = new ArrayList<Places>();
        placesListTour3.add(new Places(R.drawable.valdstejnskypalac, R.string.place35, R.string.place35text));
        placesListTour3.add(new Places(R.drawable.palacovezahrady, R.string.place36, R.string.place36text));
        placesListTour3.add(new Places(R.drawable.kostelsvtomase, R.string.place37, R.string.place37text));
        placesListTour3.add(new Places(R.drawable.malostranskenamesti, R.string.place38, R.string.place38text));
        placesListTour3.add(new Places(R.drawable.nerudova, R.string.place39, R.string.place39text));
        placesListTour3.add(new Places(R.drawable.sloupnejsvetejsitrojice, R.string.place40, R.string.place40text));
        placesListTour3.add(new Places(R.drawable.chramsvatehomikulase, R.string.place41, R.string.place41text));
        placesListTour3.add(new Places(R.drawable.kostelpanymarievitezne, R.string.place42, R.string.place42text));
        placesListTour3.add(new Places(R.drawable.pannymariepodretezem, R.string.place43, R.string.place43text));
        placesListTour3.add(new Places(R.drawable.sovovymlyny, R.string.place44, R.string.place44text));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesListTour3, R.color.purple3);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_item.xml layout file.
        ListView listViewTour3 = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listViewTour3.setAdapter(adapter);

        listViewTour3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Create a new object intent (parse on position)
                Intent intent = new Intent(Tour3Fragment.this.getActivity(), PlaceDetailActivity.class);

                Places selectedPlace = placesListTour3.get(position);
                intent.putExtra("places", selectedPlace);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
