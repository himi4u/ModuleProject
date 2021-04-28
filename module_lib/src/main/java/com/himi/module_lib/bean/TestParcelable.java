package com.himi.module_lib.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 *
 *  Attempt to invoke interface method 'java.lang.String com.alibaba.android.arouter.facade.service.SerializationService.object2Json(java.lang.Object)' on a null object reference
 */
public class TestParcelable implements Parcelable {

    private String mName1;
    private String mName2;

    public TestParcelable(String name1, String name2) {
        this.mName1 = name1;
        this.mName2 = name2;
    }

    protected TestParcelable(Parcel in) {
        mName1 = in.readString();
        mName2 = in.readString();
    }

    public static final Creator<TestParcelable> CREATOR = new Creator<TestParcelable>() {
        @Override
        public TestParcelable createFromParcel(Parcel in) {
            return new TestParcelable(in);
        }

        @Override
        public TestParcelable[] newArray(int size) {
            return new TestParcelable[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName1);
        parcel.writeString(mName2);
    }
}
