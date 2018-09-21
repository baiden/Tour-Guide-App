package com.example.android.tourguideapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.tourguideapp.Adapters.TourSideAttractionAdapter;
import com.example.android.tourguideapp.Data.TourSideAttractionData;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WaterfallFragment extends Fragment {


    public WaterfallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kakum_park, container, false);

        // Create a list of words
        final ArrayList<TourSideAttractionData> tourSideAttractionData = new ArrayList<TourSideAttractionData>();

        tourSideAttractionData.add(new TourSideAttractionData("Boti Falls", R.drawable.boti_falls));
        tourSideAttractionData.add(new TourSideAttractionData("Kintampo Waterfalls", R.drawable.kintampo_waterfalls));
        tourSideAttractionData.add(new TourSideAttractionData("Dodi", R.drawable.boti_falls));
        tourSideAttractionData.add(new TourSideAttractionData("Nzulezo", R.drawable.boti_falls));
        tourSideAttractionData.add(new TourSideAttractionData("Lake Bosumtwi", R.drawable.boti_falls));

        TourSideAttractionAdapter tourSideAttractionAdapter = new TourSideAttractionAdapter(getActivity(), tourSideAttractionData); //Puts the values into the AlbumAdapter class
        GridView gridView = (GridView) rootView.findViewById(R.id.typeOfSideAttractionGridview);
        gridView.setAdapter(tourSideAttractionAdapter); //Displays the data in the AlbumAdapter

        return rootView;
    }

}
