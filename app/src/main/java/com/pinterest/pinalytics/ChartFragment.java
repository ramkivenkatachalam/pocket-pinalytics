package com.pinterest.pinalytics;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.pinalytics.R;

/**
 * Created by ramki on 7/8/15.
 */
public class ChartFragment extends Fragment {
    private String title;
    private TextView tvChartTitle;

    public ChartFragment() {

    }

    public void setChartDetails(String name) {
        this.title = name;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_chart, container, false);
        tvChartTitle = (TextView) fragView.findViewById(R.id.tvChartTitle);
        tvChartTitle.setText(title);
        return fragView;
    }

}
