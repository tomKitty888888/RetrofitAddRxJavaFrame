package com.example.george.retrofitaddrxjavaframe.dao;

public class GreenDaoManager {

//    private static DaoMaster mDaoMaster;
//    private static DaoSession mDaoSession;
//    private static volatile GreenDaoManager mInstance = null;
//    private static final String DB_NAME = "xx.db";
//
//    private GreenDaoManager() {
//    }
//
//    public static void init(Context context) {
//        DaoMaster.DevOpenHelper devOpenHelper = new
//                DaoMaster.DevOpenHelper(context, DB_NAME);
//        mDaoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
//        mDaoSession = mDaoMaster.newSession();
//    }
//
//    public static GreenDaoManager getInstance() {
//        if (mInstance == null) {
//            synchronized (GreenDaoManager.class) {
//                if (mInstance == null) {
//                    mInstance = new GreenDaoManager();
//                }
//            }
//        }
//        return mInstance;
//    }
//
//    public DaoSession getSession() {
//        return mDaoSession;
//    }

    //DaoMaster 数据库升级
//    	switch (oldVersion) {  //上一个版本的版本号，当前版本号-1
//        case 10:
//            Log.i("MyOpenHelper", "测试升级数据库"+oldVersion);
//            //旧版本的数据库神级操作的case语句后都没有break语句，
//            //这样便可以确保每一次升级当前版本到最新版本的更新操作都可以被执行到了
//
//        case 13:
//            db.execSQL("ALTER TABLE fr_paydetail ADD pay_channel TEXT");
//            break;
//        default:
//            break;
//    }

}
