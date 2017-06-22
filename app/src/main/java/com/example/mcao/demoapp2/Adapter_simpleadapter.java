package com.example.mcao.demoapp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.List;

/**
 * Created by m.cao on 2017/6/20.
 */

public class Adapter_simpleadapter extends Activity {

    private String[] says = new String[]{""};
    private int[] imgIds = new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher};
    private String[] names = new String[] {"星宿老仙","法驾中原","攻无不克","战无不胜"};

    ListView itemlist = null;
    List<Map<String, Object>> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_simpleadapter);

        itemlist = (ListView) findViewById(R.id.simple_adapter_list);
        refreshListItems();
    }

    private void refreshListItems() {
        list = buildListForSimpleAdapter();
        //实例适配器
        SimpleAdapter chat = new SimpleAdapter(this, list, R.layout.chata,
                new String[] {"chatportrait","chatinfo"}, new int[] {R.id.imgPortraitA,R.id.txvInfo});
        itemlist.setAdapter(chat);
        itemlist.setSelection(0);
    }

    private List<Map<String, Object>> buildListForSimpleAdapter(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(2);
        ImageView imgA=(ImageView)findViewById(R.id.imgPortraitA);
        //向列表容器中添加数据（每列中包括一个头像和聊天信息）
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("chatportrait",R.mipmap.ic_launcher);
        map.put("chatinfo", "嗨~");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("chatportrait",imgA);
        map.put("chatinfo", "嗨~\n你好！");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("chatportrait",R.mipmap.ic_launcher_round);
        map.put("chatinfo", "嗨~\n你好！\n我是小魏~");
        list.add(map);

        return list;

    }

}
