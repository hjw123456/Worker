package com.soboot.mike.worker.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Wing on 2016/5/28.
 */
public abstract class MyBaseAdapter<T> extends BaseAdapter {
    private List<T> list;
    protected Context context;
    protected LayoutInflater inflater;

    public MyBaseAdapter(Context context) {
        this.context = context;
        list = new ArrayList<T>();
        inflater = LayoutInflater.from(context);
    }

    public void add(T t) {
        list.add(t);
    }

    public void addList(List<T> ts) {
        list.addAll(ts);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public void removeList(List<T> ts) {
        list.removeAll(ts);
    }

    public void clearAll() {
        list.clear();
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public T getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent);
}
