package com.example.android.tourguideapp.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.tourguideapp.Activities.TourPlacesActivity;
import com.example.android.tourguideapp.Adapters.DescriptionOfPlaceAdapter;
import com.example.android.tourguideapp.Data.DescriptionOfPlaceData;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailedManMadePlaceFragment extends Fragment {
    @BindView(R.id.nameOfPlace_text_view) TextView nameOfPlace_text_view;
    @BindView(R.id.singlePlaceImage) ImageView imageOfPlace_image_view;
    @BindView(R.id.back_button) ImageButton upButton;

    public DetailedManMadePlaceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_place_detailed_information, container, false);
        ButterKnife.bind(this, rootView);

        Intent intentThatStartedThisActivity = getActivity().getIntent();

        //Receives the data that was passed through the intent
        if (intentThatStartedThisActivity != null) {
            if (intentThatStartedThisActivity.hasExtra(getString(R.string.name_of_place))) {
                int receiveSongTitle = intentThatStartedThisActivity.getIntExtra(getString(R.string.name_of_place), R.id.nameOfPlace_text_view);
                int receiveAlbumImageArt = intentThatStartedThisActivity.getIntExtra(getString(R.string.image_of_place), R.id.singlePlaceImage);

                nameOfPlace_text_view.setText(receiveSongTitle);
                imageOfPlace_image_view.setImageResource(receiveAlbumImageArt);
            }
        }

        // Create a list of words
        final ArrayList<DescriptionOfPlaceData> descriptionOfPlaceData = new ArrayList<DescriptionOfPlaceData>();

        descriptionOfPlaceData.add(new DescriptionOfPlaceData(R.drawable.ic_play_button));

        DescriptionOfPlaceAdapter descriptionOfPlaceAdapter = new DescriptionOfPlaceAdapter(getActivity(), descriptionOfPlaceData); //Puts the values into the AlbumAdapter class
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(descriptionOfPlaceAdapter); //Displays the data in the DescriptionOfPlaceAdapter

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "Not available yet :(", Toast.LENGTH_SHORT).show();
            }
        });

        //Sets an onClickListener to the upButton created to return to the tour places activity
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backTntent = new Intent(getActivity(), TourPlacesActivity.class);
                startActivity(backTntent);
            }
        });

        return rootView;
    }

}
