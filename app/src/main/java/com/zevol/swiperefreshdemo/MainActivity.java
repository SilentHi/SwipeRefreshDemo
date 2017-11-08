package com.zevol.swiperefreshdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.zevol.library.activity.TopToolbarActivity;

import java.util.ArrayList;

public class MainActivity extends TopToolbarActivity {

    private HomeViewPager pager;
    private ArrayList<Fragment> fragmentArrayList;

    @Override
    protected String bindTopToolbarTitle() {
        return "下拉刷新";
    }

    @Override
    protected void bindViews() {
        super.bindViews();
        pager = findViewById(R.id.pager);
    }

    @Override
    protected void bindData(Bundle savedInstanceState) {
        super.bindData(savedInstanceState);
        pager.setPagingEnabled(true);
        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new SwipeFragmen());
        fragmentArrayList.add(new SwipeFragmen());
        fragmentArrayList.add(new SwipeFragmen());
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), fragmentArrayList);
        pager.setAdapter(adapter);
    }

    @Override
    protected int bindLayoutId() {
        return R.layout.activity_main;
    }
}
