package com.nicholasworkshop.library.sdk;

import android.content.Context;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;

import javax.inject.Inject;

/**
 * Created by nickwph on 10/21/15.
 */
public class Sdk {

    private static final String TAG = Sdk.class.getSimpleName();

    private static Sdk sSdk;

    private final SdkComponent mSdkComponent;

    @Inject @SdkNamed Context mContext;
    @Inject @SdkNamed InputMethodManager mInputMethodManager;

    public static Sdk getInstance(Context context) {
        if (sSdk == null) {
            sSdk = new Sdk(context);
        }
        return sSdk;
    }

    public static Sdk getInstance(SdkModule module) {
        if (sSdk == null) {
            sSdk = new Sdk(module);
        }
        return sSdk;
    }

    Sdk(SdkModule module) {
        mSdkComponent = DaggerSdkComponent.builder().sdkModule(module).build();
        mSdkComponent.inject(this);
        Log.e(TAG, "mInputMethodManager = " + mInputMethodManager);
    }

    Sdk(Context context) {
        this(new SdkModule(context));
    }

    public SdkComponent getSdkComponent() {
        return mSdkComponent;
    }

}
