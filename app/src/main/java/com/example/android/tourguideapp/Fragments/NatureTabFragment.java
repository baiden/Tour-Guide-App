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

        tourSideAttractionData.add(new PlaceData("Kakum National Park", R.drawable.kakum));
        tourSideAttractionData.add(new PlaceData("Mole National Park", R.drawable.mole_national_park));
        tourSideAttractionData.add(new PlaceData("Digya National Park", R.drawable.digya_national_park));
        tourSideAttractionData.add(new PlaceData("Shai Hills Resource Reserve", R.drawable.shai_hills));
        tourSideAttractionData.add(new PlaceData("Mountain Afadjato", R.drawable.mount_afadjato));

        TourSideAttractionAdapter tourSideAttractionAdapter = new TourSideAttractionAdapter(getActivity(), tourSideAttractionData); //Puts the values into the AlbumAdapter class
        GridView gridView = (GridView) rootView.findViewById(R.id.typeOfSideAttractionGridview);
        gridView.setAdapter(tourSideAttractionAdapter); //Displays the data in the AlbumAdapter

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playtrack = new Intent(getContext(), DetailedManMadeActivity.class);
                PlaceData sideAttractionData = tourSideAttractionData.get(position);

                playtrack.putExtra("NameOfPlace",sideAttractionData.getNameOfPlace());
                playtrack.putExtra("ImageOfPlace", sideAttractionData.getImageOfPlaceResourceID());
                startActivity(playtrack);
            }
        });

        return rootView;
    }

}
