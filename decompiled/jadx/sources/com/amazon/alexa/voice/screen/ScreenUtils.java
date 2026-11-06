package com.amazon.alexa.voice.screen;

import android.content.Context;
import android.util.Log;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.api.DeviceInformation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ScreenUtils {
    private static final String TAG = "com.amazon.alexa.voice.screen.ScreenUtils";

    private ScreenUtils() {
    }

    public static double getScreenSize(Context context) {
        DeviceInformation deviceInformation = (DeviceInformation) Automotive$$ExternalSyntheticOutline0.m(DeviceInformation.class);
        if (deviceInformation != null) {
            return deviceInformation.getScreenSize();
        }
        Log.w(TAG, "DeviceInformation not available, falling back to 0.0");
        return 0.0d;
    }

    public static boolean isPhoneFormFactor(Context context) {
        DeviceInformation deviceInformation = (DeviceInformation) Automotive$$ExternalSyntheticOutline0.m(DeviceInformation.class);
        if (deviceInformation != null) {
            return deviceInformation.isPhoneFormFactor();
        }
        Log.w(TAG, "DeviceInformation not available, falling back to false");
        return false;
    }
}
