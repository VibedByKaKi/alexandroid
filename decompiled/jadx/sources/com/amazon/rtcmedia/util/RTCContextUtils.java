package com.amazon.rtcmedia.util;

import android.content.Context;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTCContextUtils {
    private static Context applicationContext;
    private static RtcscLogger mLog = RtcscLogger.getLogger(RTCContextUtils.class);

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Application context cannot be null for ContextUtils.initialize.");
        } else {
            applicationContext = context;
            mLog.i("initialize: Application context has been set.");
        }
    }
}
