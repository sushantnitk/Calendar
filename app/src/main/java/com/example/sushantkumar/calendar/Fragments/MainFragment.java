package com.example.sushantkumar.calendar.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.sushantkumar.calendar.Activity.CircleTransform;
import com.example.sushantkumar.calendar.R;

/**
 * Created by Pandey on 15-10-2016.
 */
public class MainFragment extends Fragment {


    ImageView profilepic;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       super.onCreateView(inflater, container, savedInstanceState);
        View view =inflater.inflate(R.layout.activity_home,null);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        profilepic = (ImageView)getView().findViewById(R.id.profilePic);
        Bundle bundle = getArguments();
        Glide.with(this).load(bundle.get("imageUrl").toString())
                .crossFade()
                .thumbnail(0.5f)
                .bitmapTransform(new CircleTransform(getActivity()))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(profilepic);
    }
}
