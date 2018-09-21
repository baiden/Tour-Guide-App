package com.example.android.tourguideapp.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.android.tourguideapp.Fragments.InfrastructureFragment;
import com.example.android.tourguideapp.R;

public class KakumParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_of_attractions);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new InfrastructureFragment())
                .commit();
    }
}
