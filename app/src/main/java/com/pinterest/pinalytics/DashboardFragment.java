package com.pinterest.pinalytics;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.pinalytics.R;
import com.pinterest.pinalytics.ReaderViewPagerTransformer.TransformType;

/**
 * Created by ramki on 7/8/15.
 */
public class DashboardFragment extends Fragment {

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;


    public DashboardFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_dashboard, container, false);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) fragView.findViewById(R.id.chartPager);
        mPagerAdapter = new ChartSlidePagerAdapter(getChildFragmentManager(), getActivity());
        mPager.setAdapter(mPagerAdapter);
        mPager.setPageTransformer(false, new ReaderViewPagerTransformer(TransformType.SLIDE_OVER));

        return fragView;
    }

    private class ChartSlidePagerAdapter extends FragmentStatePagerAdapter {

        private final Activity _activity;
        private int baseId = 0;

        public ChartSlidePagerAdapter(FragmentManager fm, Activity activity) {
            super(fm);
            this._activity = activity;
        }

        @Override
        public Fragment getItem(int position) {
            /**
             * First page is the list (TodoListFragment) and the subsequent ones
             * are detail for each of the todo (TodoDetailsFragment)
             *
             */
            ChartFragment chartFragment = new ChartFragment();
            chartFragment.setChartDetails("Chart " + position);
            return chartFragment;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

}
