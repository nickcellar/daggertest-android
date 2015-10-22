package com.nicholasworkshop.daggerized.basic;

import android.app.Application;
import android.content.Intent;

import com.nicholasworkshop.library.background.BackgroundService;
import com.nicholasworkshop.library.utility.UtilityModule;

/**
 * Created by nickwph on 10/21/15.
 */
public class BasicApplication extends Application {

    private BasicComponent mMainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mMainComponent = DaggerBasicComponent.builder()
                .basicModule(new BasicModule(this))
                .utilityModule(new UtilityModule(this))
                .build();
        startService(new Intent(this, BackgroundService.class));
    }

    public BasicComponent getComponent() {
        return mMainComponent;
    }
}
