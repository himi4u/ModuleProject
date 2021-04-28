package com.himi.module_lib.bean;

import android.os.Parcelable;

import java.io.Serializable;

/**
 *
 *  Attempt to invoke interface method 'java.lang.String com.alibaba.android.arouter.facade.service.SerializationService.object2Json(java.lang.Object)' on a null object reference
 */
public class Test implements Serializable {

    private String mName1;
    private String mName2;

    public Test(String name1, String name2) {
        this.mName1 = name1;
        this.mName2 = name2;
    }

    public String getmName1() {
        return mName1;
    }

    public void setmName1(String mName1) {
        this.mName1 = mName1;
    }

    public String getmName2() {
        return mName2;
    }

    public void setmName2(String mName2) {
        this.mName2 = mName2;
    }

    @Override
    public String toString() {
        return "Test{" +
                "mName1='" + mName1 + '\'' +
                ", mName2='" + mName2 + '\'' +
                '}';
    }
}
