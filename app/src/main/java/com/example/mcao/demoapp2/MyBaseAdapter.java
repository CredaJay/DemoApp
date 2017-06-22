package com.example.mcao.demoapp2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by m.cao on 2017/6/21.
 */

public class MyBaseAdapter extends BaseAdapter {

    private String[] data;
    private Context mContext;
    public MyBaseAdapter(Context mContext, String[] data) {
        super();
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setText(data[position]);
        return textView;
    }
}
