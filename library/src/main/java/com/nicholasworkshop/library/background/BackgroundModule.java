package com.nicholasworkshop.library.background;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nickwph on 10/21/15.
 */
@Module
public class BackgroundModule {

    private final Context mContext;

    protected BackgroundModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    @BackgroundNamed
    protected Context provideContext() {
        return mContext;
    }

    @Provides
    @Singleton
    @BackgroundNamed
    protected InputMethodManager provideInputMethodManager(@BackgroundNamed Context context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }
}
