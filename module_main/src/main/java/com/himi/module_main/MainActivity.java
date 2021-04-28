package com.himi.module_main;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.himi.module_lib.BaseActivity;
import com.himi.module_lib.bean.TestObject;
import com.himi.module_lib.bean.TestParcelable;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    /**
     * 跳转登陆注册组件
     * @param view
     */
    public void onLogin(View view) {
// 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
//        ARouter.getInstance().build("/login/LoginActivity").navigation();

// 2. 跳转并携带参数
        ARouter.getInstance().build("/login/LoginActivity")
                .withLong("key1", 666L)
                .withString("key3", "888")
                .withParcelable("key4", new TestParcelable("Jack", "Rose"))
                .withObject("key5",new TestObject("James"))
                .navigation();
//        try {
//            Class loginClass = Class.forName("com.himi.module_login.LoginActivity");
//            Intent intent = new Intent(this, loginClass);
////            intent.putExtra("params","从首页跳转");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
