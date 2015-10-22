package com.nicholasworkshop.daggerized.advanced;

import android.content.Context;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;

import com.nicholasworkshop.library.sdk.SdkModule;
import com.nicholasworkshop.library.sdk.SdkNamed;

/**
 * Created by nickwph on 10/22/15.
 */
public class CustomSdkModule extends SdkModule {

    CustomSdkModule(Context context) {
        super(context);
    }

    @Override
    protected Context provideContext() {
        Log.e("CustomSdkModule", "Returning custom Context");
        return super.provideContext();
    }

    @Override
    protected InputMethodManager provideInputMethodManager(@SdkNamed Context context) {
        Log.e("CustomSdkModule", "Returning custom InputMethodManager");
        return super.provideInputMethodManager(context);
    }
}
