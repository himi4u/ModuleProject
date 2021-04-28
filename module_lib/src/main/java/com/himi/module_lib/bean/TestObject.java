package com.himi.module_lib.bean;

public class TestObject {
    private String mName;

    public TestObject(String name) {
        this.mName = name;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
