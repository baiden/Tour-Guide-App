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

        tourSideAttractionData.add(new PlaceData("Kwame Nkrumah Mausoleum", R.drawable.kwame_nkrumah));
        tourSideAttractionData.add(new PlaceData("Independence Arc", R.drawable.independence_arc));
        tourSideAttractionData.add(new PlaceData("Cape Coast Castle", R.drawable.cape_coast_castle));
        tourSideAttractionData.add(new PlaceData("National Museum of Ghana", R.drawable.national_museum_of_ghana));
        tourSideAttractionData.add(new PlaceData("Elmina Castle", R.drawable.elmina_castle));

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