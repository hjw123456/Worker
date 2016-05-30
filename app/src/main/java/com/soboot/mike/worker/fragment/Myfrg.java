package com.soboot.mike.worker.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.soboot.mike.worker.R;
import com.soboot.mike.worker.adapter.WorkListAdapter;
import com.soboot.mike.worker.base.MyBaseFragment;
import com.soboot.mike.worker.enity.WorkListInfo;
import com.soboot.mike.worker.login.RegisterActivity;

/**
 * Created by Wing on 2016/5/28.
 */
public class Myfrg extends MyBaseFragment {
    ListView lv_work;
    private WorkListAdapter adapter;
    private WorkListInfo workListInfo;

    @Override
    public void init() {
        lv_work = (ListView) fragmentView.findViewById(R.id.lv_work);
        initData();
        lv_work.setAdapter(adapter);
    }

    private void initData() {
        adapter = new WorkListAdapter(myActivity);
        String[] workListName = {"需求工单", "服务工单", "发布工单", "电子工牌", "我的收藏", "会员俱乐部"};
        String[] workListState = {"3单待评价", "评价", "进行", "认证", " ", " "};
        for (int i = 0; i < workListName.length; i++) {
            workListInfo = new WorkListInfo(workListState[i], R.mipmap.ic_launcher, workListName[i]);
            adapter.add(workListInfo);
        }
        adapter.notifyDataSetChanged();

    }

    @Override
    public View setFragmentView(LayoutInflater inflater, ViewGroup container, Bundle saveInstaceState) {
        return inflater.inflate(R.layout.my_frg, null);
    }
}
