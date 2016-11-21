package com.gui.sharemate.viknox.guilevel;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;

import android.os.Bundle;

public class ActivityMain extends FragmentActivity {
    PagerTitleStrip mTitleStrip;
    ViewPager mViewPager = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        mViewPager = (ViewPager)findViewById(R.id.vp_viewPager) ;
        mTitleStrip =(PagerTitleStrip)findViewById(R.id.titleStrip);
        mTitleStrip.inflate(this,R.layout.tab_navigation,mViewPager);
        FragmentManager fm = getSupportFragmentManager();
        mViewPager.setAdapter(new MyPageAdapter(fm));
    }

    private class MyPageAdapter  extends FragmentPagerAdapter{
        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            if (position==0){
                fragment = new FragmentSettings();

            }
            if (position==1){
                fragment = new FragmentChat();

            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
