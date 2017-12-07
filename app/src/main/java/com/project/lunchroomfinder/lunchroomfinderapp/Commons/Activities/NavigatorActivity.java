package com.project.lunchroomfinder.lunchroomfinderapp.Commons.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.project.lunchroomfinder.lunchroomfinderapp.Commons.Adapters.NavViewPagerAdapter;
import com.project.lunchroomfinder.lunchroomfinderapp.R;

/**
 * Created by Ramadevu Srinivas on 11/5/2017.
 */

public class NavigatorActivity extends AppCompatActivity{

    private TabLayout navTabLayout;
    private ViewPager navViewPager;
    private NavViewPagerAdapter mNavViewPagerAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigatormainactivity);

        navTabLayout = findViewById(R.id.navtabLayout);
        navViewPager = findViewById(R.id.navpagerLayout);
        mNavViewPagerAdapter = new NavViewPagerAdapter(getApplicationContext(), getSupportFragmentManager());

        navViewPager.setAdapter(mNavViewPagerAdapter);
        navTabLayout.setupWithViewPager(navViewPager);


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
