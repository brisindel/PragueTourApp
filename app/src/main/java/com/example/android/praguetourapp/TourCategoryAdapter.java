package com.example.android.praguetourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourCategoryAdapter extends ArrayAdapter<TourCategoryDetail> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context         The current context. Used to inflate the layout file.
     * @param tourCategories A List of AndroidFlavor objects to display in a list
     */
    public TourCategoryAdapter(Activity context, ArrayList<TourCategoryDetail> tourCategories) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tourCategories);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        TourCategoryDetail gridCategoryItem = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconImageView = (ImageView) gridItemView.findViewById(R.id.grid_item_image);
        iconImageView.setImageResource(gridCategoryItem.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) gridItemView.findViewById(R.id.grid_item_label);
        nameTextView.setText(gridCategoryItem.getTextCategory());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return gridItemView;
    }
}
