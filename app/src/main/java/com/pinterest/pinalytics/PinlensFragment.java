package com.pinterest.pinalytics;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.pinalytics.R;

/**
 * Created by ramki on 7/8/15.
 */
public class PinlensFragment extends Fragment {

    public PinlensFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_pinlens, container, false);
        return fragView;
    }

}
