package com.amazon.identity.auth.device;

import android.content.Context;
import android.util.Log;
import com.amazon.identity.auth.device.attribute.DeviceAttribute;
import com.amazonaws.cognito.clientcontext.datacollection.DataRecordKey;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class bl {
    public static String a(Context context, DeviceAttribute deviceAttribute) {
        Object b = ga.b.b(context, deviceAttribute);
        if (b instanceof String) {
            return (String) b;
        }
        String obj = deviceAttribute.toString();
        Log.e(yf.a(DataRecordKey.PLATFORM), "Device Attribute " + obj + " is not of type String.");
        Single$$ExternalSyntheticBUOutline0.m("Incorrectly called getDeviceAttribute in Platform.  Try calling hasDeviceAttribute.");
        return null;
    }
}
