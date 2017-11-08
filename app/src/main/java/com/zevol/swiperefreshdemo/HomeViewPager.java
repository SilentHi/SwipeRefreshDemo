package com.zevol.swiperefreshdemo;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.blankj.ALog;

/**
 *
 */
public class HomeViewPager extends ViewPager {

    private boolean enabled = true;

    public HomeViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled = false;
    }

    // 触摸没有反应就可以了
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.enabled) {
            ALog.i("HomeViewPager onTouchEvent");
            return super.onTouchEvent(event);
        }
        ALog.i("HomeViewPager onTouchEvent    xxxx");
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enabled) {
            ALog.i("HomeViewPager onInterceptTouchEvent");
            return super.onInterceptTouchEvent(event);
        }
        ALog.i("HomeViewPager onTouchEvent    yyyyy");
        return false;
    }

    public void setPagingEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
