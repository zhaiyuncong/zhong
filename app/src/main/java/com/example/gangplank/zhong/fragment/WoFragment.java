package com.example.gangplank.zhong.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gangplank.zhong.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class WoFragment extends Fragment {


    public WoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wo, container, false);
    }

}
