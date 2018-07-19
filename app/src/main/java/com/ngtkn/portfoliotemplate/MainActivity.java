package com.ngtkn.portfoliotemplate;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ngtkn.portfoliotemplate.controller.AppPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new AppPagerAdapter(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.tab_layout_id);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabTextColors(Color.GRAY, Color.parseColor("#0069c0"));

    }
}
