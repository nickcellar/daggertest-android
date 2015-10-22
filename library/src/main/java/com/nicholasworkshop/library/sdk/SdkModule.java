package com.nicholasworkshop.library.sdk;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nickwph on 10/21/15.
 */
@Module
public class SdkModule {

    private final Context mContext;

    protected SdkModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    @SdkNamed
    protected Context provideContext() {
        return mContext;
    }

    @Provides
    @Singleton
    @SdkNamed
    protected InputMethodManager provideInputMethodManager(@SdkNamed Context context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }
}
