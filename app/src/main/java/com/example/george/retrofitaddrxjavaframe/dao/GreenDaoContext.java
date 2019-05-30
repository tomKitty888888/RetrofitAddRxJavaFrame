package com.example.george.retrofitaddrxjavaframe.dao;

import android.content.Context;
import android.content.ContextWrapper;

public class GreenDaoContext extends ContextWrapper {
    public GreenDaoContext(Context base) {
        super(base);
    }


//    private String currentUserId;
//    private Context mContext;
//
//    public GreenDaoContext(Context mContext) {
//        super(mContext);
//        //this.mContext = MyApplication.context;
//        this.currentUserId = "1";
//    }
//
//    /**
//     * 获得数据库路径，如果不存在，则创建对象
//     *
//     * @param dbName
//     */
//    @Override
//    public File getDatabasePath(String dbName) {
//        // 判断是否存在sd卡
//        boolean sdExist = android.os.Environment.MEDIA_MOUNTED
//                .equals(android.os.Environment
//                        .getExternalStorageState());
//        if (!sdExist) {// 如果不存在,
//            Log.e("SD卡管理：", "SD卡不存在，请加载SD卡");
//            return null;
//        } else {// 如果存在
//            // 获取sd卡路径
//            String dbDir = android.os.Environment
//                    .getExternalStorageDirectory()
//                    .getAbsolutePath();
//            dbDir += "/com.cz724.pos";// 数据库所在目录
//            String dbPath = dbDir + "/" + dbName;// 数据库路径
//            // 判断目录是否存在，不存在则创建该目录
//            File dirFile = new File(dbDir);
//            if (!dirFile.exists())
//                dirFile.mkdirs();
//
//            // 数据库文件是否创建成功
//            boolean isFileCreateSuccess = false;
//            // 判断文件是否存在，不存在则创建该文件
//            File dbFile = new File(dbPath);
//            if (!dbFile.exists()) {
//                try {
//                    isFileCreateSuccess = dbFile.createNewFile();// 创建文件
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            } else
//                isFileCreateSuccess = true;
//            // 返回数据库文件对象
//            if (isFileCreateSuccess)
//                return dbFile;
//            else
//                return super.getDatabasePath(dbName);
//        }
//    }
//
//    /**
//     * 重载这个方法，是用来打开SD卡上的数据库的，android 2.3及以下会调用这个方法。
//     *
//     * @param name
//     * @param mode
//     * @param factory
//     */
//    @Override
//    public SQLiteDatabase openOrCreateDatabase(String name, int mode,
//                                               SQLiteDatabase.CursorFactory factory) {
//        SQLiteDatabase result = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(name), factory);
//        return result;
//    }
//
//    /**
//     * Android 4.0会调用此方法获取数据库。
//     *
//     * @param name
//     * @param mode
//     * @param factory
//     * @param errorHandler
//     * @see android.content.ContextWrapper#openOrCreateDatabase(java.lang.String, int,
//     * android.database.sqlite.SQLiteDatabase.CursorFactory,
//     * android.database.DatabaseErrorHandler)
//     */
//    @Override
//    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory,
//                                               DatabaseErrorHandler errorHandler) {
//        SQLiteDatabase result = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(name), factory);
//
//        return result;
//    }
}
