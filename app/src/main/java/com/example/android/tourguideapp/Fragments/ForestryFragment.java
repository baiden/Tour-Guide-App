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
public class ForestryFragment extends Fragment {


    public ForestryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kakum_park, container, false);

        // Create a list of words
        final ArrayList<TourSideAttractionData> tourSideAttractionData = new ArrayList<TourSideAttractionData>();

        tourSideAttractionData.add(new TourSideAttractionData("Kakum National Park", R.drawable.kakum));
        tourSideAttractionData.add(new TourSideAttractionData("Mole National Park", R.drawable.mole_national_park));
        tourSideAttractionData.add(new TourSideAttractionData("Digya National Park", R.drawable.digya_national_park));
        tourSideAttractionData.add(new TourSideAttractionData("Shai Hills Resource Reserve", R.drawable.shai_hills));
        tourSideAttractionData.add(new TourSideAttractionData("Mountain Afadjato", R.drawable.mount_afadjato));

        TourSideAttractionAdapter tourSideAttractionAdapter = new TourSideAttractionAdapter(getActivity(), tourSideAttractionData); //Puts the values into the AlbumAdapter class
        GridView gridView = (GridView) rootView.findViewById(R.id.typeOfSideAttractionGridview);
        gridView.setAdapter(tourSideAttractionAdapter); //Displays the data in the AlbumAdapter

        return rootView;
    }

}
