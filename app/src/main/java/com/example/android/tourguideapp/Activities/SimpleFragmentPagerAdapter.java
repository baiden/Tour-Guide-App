/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguideapp.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguideapp.Fragments.ForestryFragment;
import com.example.android.tourguideapp.Fragments.InfrastructureFragment;
import com.example.android.tourguideapp.Fragments.WaterfallFragment;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new InfrastructureFragment();
        } else if (position == 1){
            return new ForestryFragment();
        } else if (position == 2) {
            return new WaterfallFragment();
        }
        else {
            return new InfrastructureFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
