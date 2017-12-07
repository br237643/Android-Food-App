package com.project.lunchroomfinder.lunchroomfinderapp.Commons.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ramadevu Srinivas on 12/6/2017.
 */

public class NavViewPagerAdapter extends FragmentPagerAdapter{

    public NavViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return null;
        }
         else if(position == 1){
            return null;
        }
         else if(position == 2){
            return null;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
