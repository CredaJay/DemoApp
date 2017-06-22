package com.example.mcao.demoapp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by m.cao on 2017/6/21.
 */

public class Adapter_baseadapter extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_baseadapter);

        //找到需要传入值的ListView
        ListView listView = (ListView) findViewById(R.id.listview_base_adapter);
        //定义传入的变量
        String[] strings = {"a","b","c"};
        //调用MybaseAdapter.java 中写好的类
        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(getApplicationContext(),strings);

        //使用定义的myBaseAdapter 传入变量

        listView.setAdapter(myBaseAdapter);

    }
}
