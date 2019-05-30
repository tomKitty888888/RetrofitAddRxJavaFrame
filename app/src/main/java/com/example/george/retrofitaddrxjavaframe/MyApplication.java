package com.example.george.retrofitaddrxjavaframe;

import android.Manifest;
import android.app.Application;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;

import com.example.george.retrofitaddrxjavaframe.dao.GreenDaoManager;
import com.example.george.retrofitaddrxjavaframe.network.NetWorkManager;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        NetWorkManager.getInstance().init();

        //sd卡权限是否获取判断
        if (ContextCompat.checkSelfPermission(getApplicationContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            //GreenDaoManager.init(new GreenDaoContext(this)); //初始数据库
        }
    }
}
