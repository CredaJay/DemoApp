package com.example.mcao.demoapp2;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by m.cao on 2017/6/17.
 */

public class List extends AppCompatActivity  {
    //要显示的数据
    //private String[] names = new String[]{"月夜枫","农民周","龙弟弟","奶子D","566"};
    //private String[] says = new String[]{"无形被黑，最为致命", "大神好厉害~", "我将带头日狗~"};
    //private int[] imgIds = new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        Context mContext = List.this;
        ListView list_animal = (ListView) findViewById(R.id.list_test);
        //动态加载顶部View和底部View
        final LayoutInflater inflater = LayoutInflater.from(this);
        View headView = inflater.inflate(R.layout.view_header, null, false);

        LinkedList<Animal> mData = new LinkedList<Animal>();
        mData.add(new Animal("狗说", "你是狗么?", R.mipmap.ic_launcher));
        mData.add(new Animal("牛说", "你是牛么?", R.mipmap.ic_launcher_round));
        mData.add(new Animal("鸭说", "你是鸭么?", R.mipmap.ic_launcher));
        mData.add(new Animal("鱼说", "你是鱼么?", R.mipmap.ic_launcher_round));
        mData.add(new Animal("马说", "你是马么?", R.mipmap.ic_launcher));
        AnimalAdapter mAdapter = new AnimalAdapter((LinkedList<Animal>) mData, mContext);
        list_animal.setAdapter(mAdapter);
        list_animal.addHeaderView(headView);

    }


}

