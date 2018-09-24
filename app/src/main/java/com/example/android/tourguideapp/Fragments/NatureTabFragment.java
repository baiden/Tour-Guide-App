package com.example.android.tourguideapp.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.tourguideapp.Activities.DetailedManMadeActivity;
import com.example.android.tourguideapp.Adapters.TourSideAttractionAdapter;
import com.example.android.tourguideapp.Data.PlaceData;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureTabFragment extends Fragment {

    public NatureTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_places_list, container, false);

        // Create a list of words
        final ArrayList<PlaceData> tourSideAttractionData = new ArrayList<PlaceData>();

        tourSideAttractionData.add(new PlaceData(R.string.KN_Park, R.drawable.kakum));
        tourSideAttractionData.add(new PlaceData(R.string.MN_Park, R.drawable.mole_national_park));
        tourSideAttractionData.add(new PlaceData(R.string.DN_Park, R.drawable.digya_national_park));
        tourSideAttractionData.add(new PlaceData(R.string.SH_Resource_Reserve, R.drawable.shai_hills));
        tourSideAttractionData.add(new PlaceData(R.string.Mountain_Afadjato, R.drawable.mount_afadjato));

        //Puts the values into the TourSideAttractionAdapter class
        TourSideAttractionAdapter tourSideAttractionAdapter = new TourSideAttractionAdapter(getActivity(), tourSideAttractionData);
        GridView gridView = (GridView) rootView.findViewById(R.id.typeOfSideAttractionGridview);

        //Displays the data in the TourSideAttractionAdapter
        gridView.setAdapter(tourSideAttractionAdapter);

        //Passes the name and image id of the current position to DetailedManMadeActivity
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playtrack = new Intent(getContext(), DetailedManMadeActivity.class);
                PlaceData sideAttractionData = tourSideAttractionData.get(position);

                playtrack.putExtra(getString(R.string.name_of_place),sideAttractionData.getNameOfPlace());
                playtrack.putExtra(getString(R.string.image_of_place), sideAttractionData.getImageOfPlaceResourceID());
                startActivity(playtrack);
            }
        });

        return rootView;
    }

}
