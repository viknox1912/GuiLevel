package com.gui.sharemate.viknox.guilevel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    SlidingTabLayout mSlidingBar;
    ViewPager mViewPager = null;
    Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        mToolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mViewPager = (ViewPager) findViewById(R.id.vp_viewPager);
        mViewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
        mSlidingBar = (SlidingTabLayout) findViewById(R.id.tabs);
        mSlidingBar.setViewPager(mViewPager);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater infl = getMenuInflater();
        infl.inflate(R.menu.menu_activity_overview, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_splash:
                Toast.makeText(this, "GO back to splash Screen", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(this, "Go to settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_logout:
                Toast.makeText(this, "Log out!", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }



    private class MyPageAdapter extends FragmentPagerAdapter {
        String[] tabs;

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
            tabs = getResources().getStringArray(R.array.tabs);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            if (position == 0) {
                fragment = new FragmentHome();


            }
            if (position == 1) {
                fragment = new FragmentSearch();

            }
            if (position == 2) {
                fragment = new FragmentChat();
            }
            if (position == 3) {
                fragment = new FragmentGroups();
            }
            if (position == 4) {
                fragment = new FragmentSettings();
            }
            return fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];


        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
