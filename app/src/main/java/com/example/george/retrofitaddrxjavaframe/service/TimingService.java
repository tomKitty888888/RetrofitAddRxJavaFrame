package com.example.george.retrofitaddrxjavaframe.service;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;

public class TimingService extends Service {


    private int time = 1*60*1000;

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @SuppressLint("NewApi")
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(){
            public void run() {
                Log.i("tag","AlarmService-------onStartCommand()");
            };
        }.start();

        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
        long atTime = SystemClock.elapsedRealtime() + time;
        Intent i = new Intent(this,TimingService.class);
        PendingIntent pIntent = PendingIntent.getService(this, 0, i, 0);
        manager.setExact(AlarmManager.ELAPSED_REALTIME_WAKEUP, atTime, pIntent);

        return super.onStartCommand(intent, flags, startId);
    }
}
