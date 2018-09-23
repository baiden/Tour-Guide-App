package com.example.android.tourguideapp.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.example.android.tourguideapp.Fragments.DetailedManMadePlaceFragment;
import com.example.android.tourguideapp.R;

public class DetailedManMadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Sets the view to fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_side_of_attractions);

        //Hosts the DetailedManMadePlaceFragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new DetailedManMadePlaceFragment())
                .commit();
    }
}
