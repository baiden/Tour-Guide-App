package com.example.android.tourguideapp.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguideapp.Data.PlaceData;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;

public class TourSideAttractionAdapter extends ArrayAdapter<PlaceData> {

    private static final String LOG_TAG = TourSideAttractionAdapter.class.getSimpleName();

    /**
     *
     * @param context The current context. Used to inflate the layout file.
     * @param ptourSideAttractionData A List of PlaceData objects to display in a list
     */
    public TourSideAttractionAdapter(Activity context, ArrayList<PlaceData> ptourSideAttractionData) {
        super(context, 0, ptourSideAttractionData);
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
        View tourAttractionListView = convertView;
        if (tourAttractionListView == null) {
            tourAttractionListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_places_item, parent, false);
        }

        // Get the PlaceData object located at this position in the list
        PlaceData currentTourAttraction = getItem(position);

        TextView typeOfSideAttraction_text_view = (TextView) tourAttractionListView.findViewById(R.id.nameOfPlace_text_view);
        typeOfSideAttraction_text_view.setText(currentTourAttraction.getNameOfPlace());

        // Find the ImageView in the place_detailed_information_item.xml layout with the ID imageOfPlace_image_view
        ImageView typeOfSideAttraction_img = (ImageView) tourAttractionListView.findViewById(R.id.imageOfPlace_image_view);
        typeOfSideAttraction_img.setImageResource(currentTourAttraction.getImageOfPlaceResourceID());

        return tourAttractionListView;

    }
}

