package com.example.android.praguetourapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by uLeho on 18.03.2018.
 */

public class Tour2Fragment extends android.support.v4.app.Fragment {

    public Tour2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_lv, container, false);

        // Create a list of words
        final ArrayList<Places> placesListTour2 = new ArrayList<Places>();
        placesListTour2.add(new Places(R.drawable.ministerstvopr_myslu, R.string.place23, R.string.place23text));
        placesListTour2.add(new Places(R.drawable.anezskyklaster, R.string.place24, R.string.place24text));
        placesListTour2.add(new Places(R.drawable.pravdnickafakulta, R.string.place25, R.string.place25text));
        placesListTour2.add(new Places(R.drawable.rudolfinum, R.string.place26, R.string.place26text));
        placesListTour2.add(new Places(R.drawable.manesuvmost, R.string.place27, R.string.place27text));
        placesListTour2.add(new Places(R.drawable.klementinum, R.string.place28, R.string.place28text));
        placesListTour2.add(new Places(R.drawable.karluvmost, R.string.place29, R.string.place29text));
        placesListTour2.add(new Places(R.drawable.smetanovonabrezi, R.string.place30, R.string.place30text));
        placesListTour2.add(new Places(R.drawable.krannerovaka_na, R.string.place31, R.string.place31text));
        placesListTour2.add(new Places(R.drawable.narodnidivadlo, R.string.place32, R.string.place32text));
        placesListTour2.add(new Places(R.drawable.slovanskyostrov, R.string.place33, R.string.place33text));
        placesListTour2.add(new Places(R.drawable.manes, R.string.place34, R.string.place34text));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesListTour2, R.color.green);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_item.xml layout file.
        ListView listViewTour2 = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listViewTour2.setAdapter(adapter);

        listViewTour2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Create a new object intent (parse on position)
                Intent intent = new Intent(Tour2Fragment.this.getActivity(), PlaceDetailActivity.class);

                Places selectedPlace = placesListTour2.get(position);
                intent.putExtra("places", selectedPlace);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
