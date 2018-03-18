package com.example.android.praguetourapp;

import android.app.Fragment;
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
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.drawable.oldtownsquare, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.oldtownsquare, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.oldtownsquare, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.oldtownsquare, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.oldtownsquare, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.oldtownsquare, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.oldtownsquare, R.string.place1, R.string.place1text));
        places.add(new Places(R.drawable.oldtownsquare, R.string.place1, R.string.place1text));


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

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file

                // Get the {@link Word} object at the given position the user clicked on
                Places places1 = places.get(position);


            }
        });

        return rootView;
    }
}
