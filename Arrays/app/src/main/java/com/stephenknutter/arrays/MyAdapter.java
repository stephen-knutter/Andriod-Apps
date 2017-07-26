package com.stephenknutter.arrays;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MyAdapter extends BaseAdapter {
    List<MyObject> myList = new ArrayList<MyObject>();

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public MyObject getItem(int whichItem) {
        return myList.get(whichItem);
    }

    @Override
    public long getItemId(int whichItem) {
        return whichItem;
    }

    @Override
    public View getView(int whichItem, View view, ViewGroup viewGroup) {
        return view;
    }
}
