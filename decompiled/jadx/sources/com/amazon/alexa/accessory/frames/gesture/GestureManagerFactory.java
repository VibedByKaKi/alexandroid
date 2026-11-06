package com.amazon.alexa.accessory.frames.gesture;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.frames.device.DeviceTypeInfoStore;
import com.amazon.alexa.accessory.frames.provider.FeatureChecker;
import com.amazon.alexa.accessory.frames.utils.Log;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class GestureManagerFactory {
    private static final String TAG = "GestureManagerFactory";

    private GestureManagerFactory() {
    }

    public static GestureManager getGestureManager(@NonNull String str) {
        String upperCase = str.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "A3JKY41C0S05FZ":
            case "A3IYPH06PH1HRA":
            case "A2OUFCM11BT9RB":
                DeviceTypeInfoStore.getInstance().setDeviceType(str.toUpperCase());
                return EchoFramesGestureManager.getInstance();
            case "A21YKVRGQV9TET":
                if (!FeatureChecker.hasSmartPlayAccess(str) && !FeatureChecker.hasTapRoutinesAccess(str)) {
                    Log.d(TAG, "No SmartPlay or TapRoutines access. Skipping processing any gesture");
                    break;
                } else {
                    DeviceTypeInfoStore.getInstance().setDeviceType(str.toUpperCase());
                    return EchoBudsGestureManager.getInstance();
                }
                break;
        }
        Log.d(TAG, "Device Type:" + str + " not supported");
        Buffer$$ExternalSyntheticBUOutline0.m$1("DeviceType not supported");
        return null;
    }
}
