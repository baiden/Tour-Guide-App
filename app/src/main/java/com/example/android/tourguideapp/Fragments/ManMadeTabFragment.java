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
public class ManMadeTabFragment extends Fragment {

    public ManMadeTabFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_places_list, container, false);

        // Create a list of words
        final ArrayList<PlaceData> tourSideAttractionData = new ArrayList<PlaceData>();

        tourSideAttractionData.add(new PlaceData(R.string.KN_Mausoleum, R.drawable.kwame_nkrumah));
        tourSideAttractionData.add(new PlaceData(R.string.Independence_Arc, R.drawable.independence_arc));
        tourSideAttractionData.add(new PlaceData(R.string.CapeCoast_Castle, R.drawable.cape_coast_castle));
        tourSideAttractionData.add(new PlaceData(R.string.NMuseum_ofGhana, R.drawable.national_museum_of_ghana));
        tourSideAttractionData.add(new PlaceData(R.string.Elmina_Castle, R.drawable.elmina_castle));

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