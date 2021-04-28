package com.himi.module_login;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.himi.module_lib.BaseActivity;
import com.himi.module_lib.bean.TestObject;
import com.himi.module_lib.bean.TestParcelable;

@Route(path = "/login/LoginActivity")
public class LoginActivity extends BaseActivity {
@Autowired
public long key1;
@Autowired
public int key3;
//实现Parcelable的对象，如果实现Parcelable的对象用.withObject传递，这边就是null，一定要对应好，使用withParcelable发送实现Parcelable的对象
@Autowired
public TestParcelable key4;
//普通对象
@Autowired
public TestObject key5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //这个必须要加
        ARouter.getInstance().inject(this);
        System.out.println("key1:"+key1+"key3:"+key3+"key4"+ this.key4+"key5:"+key5);
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
