package com.nicholasworkshop.library.background;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;

import javax.inject.Inject;

import dagger.Module;

/**
 * Created by nickwph on 10/21/15.
 */
@Module
public class BackgroundService extends Service {

    private static final String TAG = BackgroundService.class.getSimpleName();

    private BackgroundComponent mBackgroundComponent;

    @Inject @BackgroundNamed InputMethodManager mInputMethodManager;

    @Override
    public void onCreate() {
        super.onCreate();
        Application application = getApplication();
        BackgroundModule module;
        if (application instanceof BackgroundComponent.ModuleProvider) {
            module = ((BackgroundComponent.ModuleProvider) application).getBackgroundModule();
        } else {
            module = new BackgroundModule(this);
        }
        mBackgroundComponent = DaggerBackgroundComponent.builder().backgroundModule(module).build();
        mBackgroundComponent.inject(this);
        Log.e(TAG, "mInputMethodManager = " + mInputMethodManager);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public BackgroundComponent getBackgroundComponent() {
        return mBackgroundComponent;
    }
}
