package com.amazon.identity.auth.device;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.identity.auth.device.attribute.DeviceAttribute;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class lo {
    public static String a(Context context, String str, String str2) {
        return TextUtils.equals(bl.a(context, DeviceAttribute.CentralDeviceType), str) ? str2 : i3.a(str, "/", str2);
    }

    public static String a(String str, String str2) {
        return str == null ? str2 : a$$ExternalSyntheticOutline0.m$1(str, "/", str2);
    }
}
