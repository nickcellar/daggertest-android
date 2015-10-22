package com.nicholasworkshop.daggerized.advanced;

import android.content.Context;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;

import com.nicholasworkshop.library.background.BackgroundModule;
import com.nicholasworkshop.library.background.BackgroundNamed;

/**
 * Created by nickwph on 10/22/15.
 */
public class CustomBackgroundModule extends BackgroundModule {

    CustomBackgroundModule(Context context) {
        super(context);
    }

    @Override
    protected Context provideContext() {
        Log.e("CustomBackgroundModule", "Returning custom Context");
        return super.provideContext();
    }

    @Override
    protected InputMethodManager provideInputMethodManager(@BackgroundNamed Context context) {
        Log.e("CustomBackgroundModule", "Returning custom InputMethodManager");
        return super.provideInputMethodManager(context);
    }
}
