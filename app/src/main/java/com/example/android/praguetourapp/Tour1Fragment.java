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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_lv, container, false);

        // Create a list of words
        final ArrayList<Places> placesListTour1 = new ArrayList<Places>();
        placesListTour1.add(new Places(R.drawable.obecnidum, R.string.place11, R.string.place11text));
        placesListTour1.add(new Places(R.drawable.prasnabrana, R.string.place12, R.string.place12text));
        placesListTour1.add(new Places(R.drawable.ucernematkybozi, R.string.place13, R.string.place13text));
        placesListTour1.add(new Places(R.drawable.ujakuba, R.string.place14, R.string.place14text));
        placesListTour1.add(new Places(R.drawable.ungelt, R.string.place15, R.string.place15text));
        placesListTour1.add(new Places(R.drawable.staromestskenamesti, R.string.place16, R.string.place16text));
        placesListTour1.add(new Places(R.drawable.predtynem, R.string.place17, R.string.place17text));
        placesListTour1.add(new Places(R.drawable.ukamenehozvonu, R.string.place18, R.string.place18text));
        placesListTour1.add(new Places(R.drawable.pomnikmistrajanahusa, R.string.place19, R.string.place19text));
        placesListTour1.add(new Places(R.drawable.staromestskaradnice, R.string.place20, R.string.place20text));
        placesListTour1.add(new Places(R.drawable.kostelsvatehomikulase, R.string.place21, R.string.place21text));
        placesListTour1.add(new Places(R.drawable.zidovskyhrbitov, R.string.place22, R.string.place22text));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesListTour1, R.color.purple1);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_item.xml layout file.
        ListView listViewTour1 = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listViewTour1.setAdapter(adapter);

        listViewTour1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Create a new object intent (parse on position)
                Intent intent = new Intent(Tour1Fragment.this.getActivity(), PlaceDetailActivity.class);

                Places selectedPlace = placesListTour1.get(position);
                intent.putExtra("places", selectedPlace);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
