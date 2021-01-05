package com.reactnativebridge;

import android.os.Build;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashSet;

public class DeviceInfoModule extends ReactContextBaseJavaModule {
    //constructor
    public DeviceInfoModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @NonNull
    @Override
    public String getName() {
        return "DeviceInfoModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void getDeviceSerialName(Callback callback) {
        String serialName=Build.SERIAL;
        callback.invoke(serialName);
    }
}
