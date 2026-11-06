package com.amazon.whisperbridge.ble;

import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleException extends Exception {
    private static final String TAG = "BleException";

    public BleException(String str, Throwable th) {
        super(str, th);
        String str2 = TAG;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("BleException thrown: ", str, "\ncause: ");
        m2m.append(th.toString());
        WJLog.e(str2, m2m.toString());
    }

    public BleException(String str) {
        super(str);
        WJLog.e(TAG, "BleException thrown: " + str);
    }
}
