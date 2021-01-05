package com.reactnativebridge;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class ToastModule extends ReactContextBaseJavaModule {
    //constructor
    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @NonNull
    @Override
    public String getName() {
        return "ToastModule";
    }

    @ReactMethod
    public void showToast(String message) {

        Toast.makeText(getReactApplicationContext(),message,Toast.LENGTH_LONG).show();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getMessageFromOs() {
        return "Hi How r u ";
    }


}

