package com.zevol.swiperefreshdemo;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zevol.library.fragment.v4.BaseFragment;
import com.zevol.library.widget.RecyclerViewDivider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/8 0008.
 */

public class SwipeFragmen extends BaseFragment {

    //    SwipeRefreshLayout swipeLayout;
    RecyclerView recycler;

    private List<String> stringList;//数据集合

    @Override
    protected int bindLayoutId() {
        return R.layout.fragment_layout;
    }


    @Override
    protected void bindData() {
        super.bindData();
        recycler = getFragmentView().findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.addItemDecoration(new RecyclerViewDivider(getActivity(), LinearLayoutManager.HORIZONTAL,
                getResources().getDimensionPixelSize(R.dimen.dp_01),
                ContextCompat.getColor(getActivity(), R.color.colorPrimary)));

        stringList = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            stringList.add("我是数据" + i);
        SwipeAdapter adapter = new SwipeAdapter(stringList);
        recycler.setAdapter(adapter);
    }
}
