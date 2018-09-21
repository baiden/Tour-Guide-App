package com.example.android.tourguideapp.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.android.tourguideapp.Adapters.TourSideAttractionAdapter;
import com.example.android.tourguideapp.Data.TourSideAttractionData;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfrastructureFragment extends Fragment {

    public InfrastructureFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kakum_park, container, false);

        // Create a list of words
        final ArrayList<TourSideAttractionData> tourSideAttractionData = new ArrayList<TourSideAttractionData>();

        tourSideAttractionData.add(new TourSideAttractionData("Kwame Nkrumah Mausoleum", R.drawable.kwame_nkrumah));
        tourSideAttractionData.add(new TourSideAttractionData("Independence Arc", R.drawable.independence_arc));
        tourSideAttractionData.add(new TourSideAttractionData("Larabanga Mosque", R.drawable.larabanga_mosque_raw));
        tourSideAttractionData.add(new TourSideAttractionData("Cape Coast Castle", R.drawable.cape_coast_castle));
        tourSideAttractionData.add(new TourSideAttractionData("Elmina", R.drawable.elmina_castle));
        tourSideAttractionData.add(new TourSideAttractionData("National Museum of Ghana", R.drawable.national_museum_of_ghana));

        TourSideAttractionAdapter tourSideAttractionAdapter = new TourSideAttractionAdapter(getActivity(), tourSideAttractionData); //Puts the values into the AlbumAdapter class
        GridView gridView = (GridView) rootView.findViewById(R.id.typeOfSideAttractionGridview);
        gridView.setAdapter(tourSideAttractionAdapter); //Displays the data in the AlbumAdapter

        return rootView;
    }

}
