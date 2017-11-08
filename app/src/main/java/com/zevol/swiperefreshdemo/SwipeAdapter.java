package com.zevol.swiperefreshdemo;

import android.support.annotation.Nullable;

import com.blankj.ALog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8 0008.
 */

public class SwipeAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public SwipeAdapter(@Nullable List<String> data) {
        super(R.layout.item_string, data);
        ALog.e(data.size());
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        ALog.e(item);
        helper.setText(R.id.textView, item);
    }
}
