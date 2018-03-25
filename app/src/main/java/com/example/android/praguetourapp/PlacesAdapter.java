package com.example.android.praguetourapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {

    // Resource ID for the background color for this list of words
    private int mColorResourceId;

    /**
     * Create a new {@link PlacesAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param places          is the list of {@link Places}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public PlacesAdapter(Context context, ArrayList<Places> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_item, parent, false);
        }

        // Get the {@link Places} object located at this position in the list
        Places currentPlaces = getItem(position);

        // Find the ImageView in the tour_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img_detail);
        imageView.setImageResource(currentPlaces.getImage());

        // Find the TextView in the tour_item.xml layout with name place.
        TextView namePlaceTV = (TextView) listItemView.findViewById(R.id.tv_namePlace);
        // Set this text on TV
        namePlaceTV.setText(currentPlaces.getNamePlace());

        // Find the TextView in the tour_item.xml layout with the text place.
        TextView textPlaceTV = (TextView) listItemView.findViewById(R.id.tv_textPlace);
        // Set this text on TV
        textPlaceTV.setText(currentPlaces.getTextPlace());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_containter);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout that can be shown in the ListView.
        return listItemView;
    }
}