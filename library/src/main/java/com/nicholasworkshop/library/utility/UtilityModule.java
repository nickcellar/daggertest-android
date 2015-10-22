package com.nicholasworkshop.library.utility;

import android.content.Context;
import android.util.DisplayMetrics;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nickwph on 10/21/15.
 */
@Module
public class UtilityModule {

    private final Context mContext;

    public UtilityModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    @UtilityNamed
    protected Context provideContext() {
        return mContext;
    }

    @Provides
    @Singleton
    @UtilityNamed
    protected DisplayMetrics provideDisplayMetrics(@UtilityNamed Context context) {
        return context.getResources().getDisplayMetrics();
    }
}
