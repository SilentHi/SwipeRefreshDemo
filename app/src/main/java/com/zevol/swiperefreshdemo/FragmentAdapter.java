package com.zevol.swiperefreshdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8 0008.
 */

public class FragmentAdapter extends FragmentPagerAdapter {


    private List<Fragment> list;


    // 构造器
    public FragmentAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    // 返回 指定 页 显示的fragment
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    // viewpager 有多少页
    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
