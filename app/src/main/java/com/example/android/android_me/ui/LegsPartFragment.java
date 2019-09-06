package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;


public class LegsPartFragment extends Fragment {

    public LegsPartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_legs_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.legs_part_image_view);

        // Set the image to the first in our list of head images
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        // Return the rootView
        return rootView;
    }
}
