package com.nicholasworkshop.daggerized.advanced;

import android.app.Application;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

import com.nicholasworkshop.library.sdk.Sdk;
import com.nicholasworkshop.library.sdk.SdkModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nickwph on 10/21/15.
 */
@Module
public class AdvancedModule {

    private final Application mApplication;

    AdvancedModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }

    @Provides
    @Singleton
    SdkModule provideSdkModule(Context context) {
        return new CustomSdkModule(context);
    }

    @Provides
    @Singleton
    Sdk provideSdk(SdkModule module) {
        return Sdk.getInstance(module);
    }

    @Provides
    @Singleton
    InputMethodManager provideInputMethodManager(Context context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }
}
