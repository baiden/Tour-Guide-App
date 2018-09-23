package com.example.android.tourguideapp.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguideapp.Data.DescriptionOfPlaceData;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;

public class DescriptionOfPlaceAdapter extends ArrayAdapter<DescriptionOfPlaceData> {

    private static final String LOG_TAG = DescriptionOfPlaceAdapter.class.getSimpleName();

    /**
     *
     * @param context The current context. Used to inflate the layout file.
     * @param pdescriptionOfPlaceData A List of DescriptionOfPlaceData objects to display in a list
     */
    public DescriptionOfPlaceAdapter(Activity context, ArrayList<DescriptionOfPlaceData> pdescriptionOfPlaceData) {
        super(context, 0, pdescriptionOfPlaceData);
    }

    /**
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View descriptionOfPlaceListView = convertView;
        if (descriptionOfPlaceListView == null) {
            descriptionOfPlaceListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_detailed_information_item, parent, false);
        }

        // Get the DescriptionOfPlaceData object located at this position in the list
        DescriptionOfPlaceData currentPlaceDescription = getItem(position);

        // Find the ImageView in the place_detailed_information_item.xml layout with the ID descriptionOfPlace_image_view
        ImageView descriptionOfPlaces_image_view = (ImageView) descriptionOfPlaceListView.findViewById(R.id.descriptionOfPlace_image_view);
        descriptionOfPlaces_image_view.setImageResource(currentPlaceDescription.getImageOfPlaceResourceID());

        return descriptionOfPlaceListView;

    }
}
