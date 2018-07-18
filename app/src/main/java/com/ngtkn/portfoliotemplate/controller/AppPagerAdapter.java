package com.ngtkn.portfoliotemplate.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ngtkn.portfoliotemplate.views.AboutFragment;
import com.ngtkn.portfoliotemplate.views.ContactFragment;
import com.ngtkn.portfoliotemplate.views.SkillsFragment;
import com.ngtkn.portfoliotemplate.views.WorkFragment;

public class AppPagerAdapter extends FragmentPagerAdapter {

    public AppPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "About";
            case 1: return "Work";
            case 2: return "Skills";
            case 3: return "Contact";
        }
        return null;
    }
}
