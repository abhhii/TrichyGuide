package com.example.abhishek.trichyguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm ){ super(fm); }

    @Override
    public Fragment getItem(int position) {
        //Designating order of fragments
        if(position == 0)
            return HotelsFragment.newInstance();
        else if(position == 1)
            return PlacesFragment.newInstance();
        else if(position == 2)
            return FoodFragment.newInstance();
        else
            return EventsFragment.newInstance();

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //setting page title according to position
        if(position == 0){
            return "Hotels";
        }
        else if(position == 1){
            return "Places";
        }
        else if(position == 2){
            return "Food";
        }
        else{
            return "Events & Transport";
        }
    }
}
