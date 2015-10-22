package com.nicholasworkshop.daggerized.normal;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;

import com.nicholasworkshop.library.sdk.Sdk;
import com.nicholasworkshop.library.utility.Utility;

public class NormalActivity extends AppCompatActivity {

    private static final String TAG = NormalActivity.class.getSimpleName();

    private InputMethodManager mInputMethodManager;
    private Sdk mSdk;
    private Utility mUtility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        mInputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mSdk = Sdk.getInstance(this);
        mUtility = new Utility(getResources().getDisplayMetrics());
        Log.e(TAG, "mInputMethodManager = " + mInputMethodManager);
        Log.e(TAG, "mSdk = " + mSdk);
        Log.e(TAG, "mUtility.getPxFromDp(16) = " + mUtility.getPxFromDp(16));
    }
}
