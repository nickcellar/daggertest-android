package com.nicholasworkshop.daggerized.advanced;

import android.app.Application;
import android.content.Intent;

import com.nicholasworkshop.library.background.BackgroundComponent;
import com.nicholasworkshop.library.background.BackgroundModule;
import com.nicholasworkshop.library.background.BackgroundService;

/**
 * Created by nickwph on 10/21/15.
 */
public class AdvancedApplication extends Application implements BackgroundComponent.ModuleProvider {

    private AdvancedComponent mMainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mMainComponent = DaggerAdvancedComponent.builder()
                .advancedModule(new AdvancedModule(this))
                .utilityModule(new CustomUtilityModule(this))
                .build();
        startService(new Intent(this, BackgroundService.class));
    }

    public AdvancedComponent getComponent() {
        return mMainComponent;
    }

    @Override
    public BackgroundModule getBackgroundModule() {
        return new CustomBackgroundModule(this);
    }
}
