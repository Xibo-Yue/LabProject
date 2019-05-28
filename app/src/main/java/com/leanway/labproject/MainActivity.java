package com.leanway.labproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.leanway.base_lib.ServiceFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getLoginService().launch(MainActivity.this,"");
            }
        });

        findViewById(R.id.gozujian).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getMineService().launch(MainActivity.this,222);
            }
        });

        findViewById(R.id.showUI).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getLoginService().newUserInfoFragment(getSupportFragmentManager(),
                        R.id.container,bundle);
            }
        });
    }



}
