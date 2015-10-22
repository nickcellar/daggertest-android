package com.nicholasworkshop.daggerized.advanced;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;

import com.nicholasworkshop.library.utility.UtilityModule;
import com.nicholasworkshop.library.utility.UtilityNamed;

/**
 * Created by nickwph on 10/21/15.
 */
public class CustomUtilityModule extends UtilityModule {

    public CustomUtilityModule(Context context) {
        super(context);
    }

    @Override
    protected Context provideContext() {
        Log.e("CustomUtilityModule", "Returning custom Context");
        return super.provideContext();
    }

    @Override
    protected DisplayMetrics provideDisplayMetrics(@UtilityNamed Context context) {
        Log.e("CustomUtilityModule", "Returning custom DisplayMetrics");
        return super.provideDisplayMetrics(context);
    }
}
