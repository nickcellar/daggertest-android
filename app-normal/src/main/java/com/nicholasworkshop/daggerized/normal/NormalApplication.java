package com.nicholasworkshop.daggerized.normal;

import android.app.Application;
import android.content.Intent;

import com.nicholasworkshop.library.background.BackgroundService;

public class NormalApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        startService(new Intent(this, BackgroundService.class));
    }
}
