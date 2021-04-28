package com.himi.module_login;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.himi.module_lib.BaseActivity;
import com.himi.module_lib.bean.Test;

@Route(path = "/login/LoginActivity")
public class LoginActivity extends BaseActivity {
@Autowired
public long key1;
@Autowired
public int key3;
@Autowired
public Test key4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        String params = getIntent().getStringExtra("params");
//        System.out.println("himi ========="+params);
        System.out.println("key1:"+key1+"key3:"+key3+"key4"+key4);
    }

    /**
     * 注意这里，不同module的布局文件一定要做到命名不同，否则会出问题，这里如果改成R.layout.activity_main，在MainActivity中点击跳转会再次打开首页，不会跳转LoginActivity
     * R.layout.activity_main1
     * @return
     */
    @Override
    protected int getLayout() {
        return R.layout.activity_main1;
    }

}
