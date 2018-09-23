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

    public DescriptionOfPlaceAdapter(Activity context, ArrayList<DescriptionOfPlaceData> pdescriptionOfPlaceData) {
        super(context, 0, pdescriptionOfPlaceData);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View descriptionOfPlaceListView = convertView;

        if (descriptionOfPlaceListView == null) {
            descriptionOfPlaceListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_detailed_information_item, parent, false);
        }

        DescriptionOfPlaceData currentPlaceDescription = getItem(position);

        ImageView descriptionOfPlaces_image_view = (ImageView) descriptionOfPlaceListView.findViewById(R.id.descriptionOfPlace_image_view);
        descriptionOfPlaces_image_view.setImageResource(currentPlaceDescription.getImageOfPlaceResourceID());

        return descriptionOfPlaceListView;

    }
}
