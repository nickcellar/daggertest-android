package com.nicholasworkshop.daggerized.basic;

import android.app.Application;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

import com.nicholasworkshop.library.sdk.Sdk;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nickwph on 10/21/15.
 */
@Module
public class BasicModule {

    private final Application mApplication;

    BasicModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }

    @Provides
    @Singleton
    Sdk provideSdk(Context context) {
        return Sdk.getInstance(context);
    }

    @Provides
    @Singleton
    InputMethodManager provideInputMethodManager(Context context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }
}
