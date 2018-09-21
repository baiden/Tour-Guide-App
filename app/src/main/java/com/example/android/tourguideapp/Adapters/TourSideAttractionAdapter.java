package com.example.android.tourguideapp.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguideapp.Data.TourSideAttractionData;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;

import butterknife.BindView;

public class TourSideAttractionAdapter extends ArrayAdapter<TourSideAttractionData> {

    public TourSideAttractionAdapter(Activity context, ArrayList<TourSideAttractionData> ptourSideAttractionData) {
        super(context, 0, ptourSideAttractionData);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View tourAttractionListView = convertView;

        if (tourAttractionListView == null) {
            tourAttractionListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_side_attractions_item, parent, false);
        }

        TourSideAttractionData currentTourAttraction = getItem(position);

        TextView typeOfSideAttraction_text_view = (TextView) tourAttractionListView.findViewById(R.id.typeOfAttractionTxt);
        typeOfSideAttraction_text_view.setText(currentTourAttraction.getTypeOfSideAttraction());

        ImageView typeOfSideAttraction_img = (ImageView) tourAttractionListView.findViewById(R.id.typeOfSideAttractionImage);
        typeOfSideAttraction_img.setImageResource(currentTourAttraction.getSideAttractionImageResourceID());

        return tourAttractionListView;

    }
}

