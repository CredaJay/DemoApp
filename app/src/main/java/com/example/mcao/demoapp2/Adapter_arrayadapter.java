package com.example.mcao.demoapp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by m.cao on 2017/6/20.
 */

public class Adapter_arrayadapter extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_arrayadapter);

        //这里列出来需要显示的数据
        String[] str = {"星宿老仙","法驾中原","攻无不克","战无不胜"};
        String[] str2 = {"南慕容","北乔峰","东邪西毒","中神通"};

        //创建ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice,str2);
        //simple_expandable_list_item_1 是Android自带的布局样式，这是单行显示内容，2显示两行内容
        ListView list_view = (ListView) findViewById(R.id.list_view);
        list_view.setAdapter(adapter);
    }
}
