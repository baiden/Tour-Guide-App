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

    public TourSideAttractionAdapter(Activity context, ArrayList<PlaceData> ptourSideAttractionData) {
        super(context, 0, ptourSideAttractionData);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View tourAttractionListView = convertView;

        if (tourAttractionListView == null) {
            tourAttractionListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_places_item, parent, false);
        }

        PlaceData currentTourAttraction = getItem(position);

        TextView typeOfSideAttraction_text_view = (TextView) tourAttractionListView.findViewById(R.id.nameOfPlace_text_view);
        typeOfSideAttraction_text_view.setText(currentTourAttraction.getNameOfPlace());

        ImageView typeOfSideAttraction_img = (ImageView) tourAttractionListView.findViewById(R.id.imageOfPlace_image_view);
        typeOfSideAttraction_img.setImageResource(currentTourAttraction.getImageOfPlaceResourceID());

        return tourAttractionListView;

    }
}

