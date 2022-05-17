package com.minra.studentmvvm;

import android.app.Application;


/**
 * Created by Mohammed Senan on 10/03/2022.
 */
public class App extends Application {

    private static App sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static App getInstance() {
        return sInstance;
    }

}
