package com.example.android.praguetourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Tour1Fragment extends android.support.v4.app.Fragment {

    public Tour1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_lv, container, false);

        // Create a list of words
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.charlesbridge, R.string.place1, R.string.place1text));


        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.yellow);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
