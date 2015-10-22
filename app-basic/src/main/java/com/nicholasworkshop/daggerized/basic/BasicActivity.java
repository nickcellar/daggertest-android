package com.nicholasworkshop.daggerized.basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;

import com.nicholasworkshop.library.sdk.Sdk;
import com.nicholasworkshop.library.utility.Utility;

import javax.inject.Inject;

public class BasicActivity extends AppCompatActivity {

    private static final String TAG = BasicActivity.class.getSimpleName();

    @Inject InputMethodManager mInputMethodManager;
    @Inject Sdk mSdk;
    @Inject Utility mUtility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        ((BasicApplication) getApplication()).getComponent().inject(this);
        Log.e(TAG, "mInputMethodManager = " + mInputMethodManager);
        Log.e(TAG, "mSdk = " + mSdk);
        Log.e(TAG, "mUtility.getPxFromDp(16) = " + mUtility.getPxFromDp(16));
    }
}
