package com.amazon.identity.auth.device;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.identity.auth.device.attribute.DeviceAttribute;
import java.util.EnumMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ga {
    public static final ga b = new ga();

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f675a = new EnumMap(DeviceAttribute.class);

    public final synchronized Object a(Context context, DeviceAttribute deviceAttribute) {
        Object fetchValue = deviceAttribute.fetchValue(context);
        if ((fetchValue instanceof String) && TextUtils.isEmpty((String) fetchValue)) {
            return fetchValue;
        }
        Log.i(yf.a("DeviceAttributeCache"), String.format("Setting device attribute %s to %s", deviceAttribute, fetchValue));
        this.f675a.put((EnumMap) deviceAttribute, (DeviceAttribute) fetchValue);
        return fetchValue;
    }

    public final synchronized Object b(Context context, DeviceAttribute deviceAttribute) {
        Object obj = this.f675a.get(deviceAttribute);
        if (obj != null) {
            return obj;
        }
        return a(context, deviceAttribute);
    }

    public final synchronized void a() {
        this.f675a.clear();
    }
}
