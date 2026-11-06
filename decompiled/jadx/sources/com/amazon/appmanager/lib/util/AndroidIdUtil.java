package com.amazon.appmanager.lib.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AndroidIdUtil {
    private static final String TAG = "AndroidIdUtil";
    private static volatile String androidId;

    @SuppressLint({"HardwareIds"})
    public static String getAndroidId(Context context) {
        if (androidId == null) {
            androidId = Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        return androidId;
    }
}
