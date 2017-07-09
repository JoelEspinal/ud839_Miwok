package com.example.android.miwok;

import android.content.Context;
import android.graphics.pdf.PdfDocument;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by User on 7/9/2017.
 */

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private int PAGE_COUNT = 4;
    private String [] tabTitle = new String[] {"Numbers", "Family", "Colors", "Phrases"};

    public CategoryFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new NumbersFragment();
        } else if(position == 1){
            return new FamilyFragment();
        } else if(position == 2){
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
