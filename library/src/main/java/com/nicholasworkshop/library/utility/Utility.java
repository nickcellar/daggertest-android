package com.nicholasworkshop.library.utility;

import android.util.DisplayMetrics;
import android.util.TypedValue;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by nickwph on 10/21/15.
 */
@Singleton
public class Utility {

    private final DisplayMetrics mDisplayMetrics;

    @Inject
    public Utility(@UtilityNamed DisplayMetrics metrics) {
        // this class is injectable
        mDisplayMetrics = metrics;
    }

    public int getPxFromDp(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, mDisplayMetrics);
    }
}
