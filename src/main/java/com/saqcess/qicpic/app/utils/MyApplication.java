package com.saqcess.qicpic.app.utils;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    private static MyApplication mInstance;
public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
context=getApplicationContext();
        mInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}