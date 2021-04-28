package com.himi.module_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.himi.module_lib.bean.Test;

@Route(path = "/login/LoginActivity")
public class LoginActivity extends AppCompatActivity {
@Autowired
public long key1;
@Autowired
public int key3;
@Autowired
public Test key4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String params = getIntent().getStringExtra("params");
//        System.out.println("himi ========="+params);
        System.out.println("key1:"+key1+"key3:"+key3+"key4"+key4);
    }

}
