package com.example.mcao.demoapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

/**
 * Created by m.cao on 2017/6/19.
 */

public class Adapter_compilation extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_compilation);
        btclick();
    }

    //Array Adapter 跳转
    private void btclick(){
        Button button_array_adapter = (Button) findViewById(R.id.array_adapter);
        button_array_adapter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adapter_compilation.this,Adapter_arrayadapter.class );
                startActivity(intent);

            }
        });

        //Simple Adapter 跳转
        Button button_simple_adapter = (Button) findViewById(R.id.simple_adapter);
        button_simple_adapter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adapter_compilation.this, Adapter_simpleadapter.class);
                startActivity(intent);
            }
        });

        //Base Adapter 跳转
        Button button_base_adapter = (Button) findViewById(R.id.base_adapter);
        button_base_adapter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adapter_compilation.this, Adapter_baseadapter.class);
                startActivity(intent);
            }
        });
    }

}
