package com.amazon.identity.auth.device.features;

import android.content.Context;
import android.util.Log;
import com.amazon.identity.auth.device.cc;
import com.amazon.identity.auth.device.dc;
import com.amazon.identity.auth.device.yf;
import java.util.EnumMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a extends cc {
    public static a c;

    /* renamed from: a, reason: collision with root package name */
    public final dc f619a;
    public final EnumMap b = new EnumMap(Feature.class);

    public a(dc dcVar) {
        this.f619a = dcVar;
    }

    public final synchronized boolean a(Feature feature) {
        Boolean bool = (Boolean) this.b.get(feature);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean fetchValue = feature.fetchValue(this.f619a.f576a);
        this.b.put((EnumMap) feature, (Feature) Boolean.valueOf(fetchValue));
        Log.i(yf.a("FeatureSetCache"), "Caching feature " + feature.toString() + " as " + fetchValue);
        return fetchValue;
    }

    public static synchronized a a(dc dcVar) {
        a aVar;
        synchronized (a.class) {
            try {
                if (c == null) {
                    c = new a(dcVar);
                }
                aVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final synchronized void a(Feature feature, Context context) {
        boolean fetchValue = feature.fetchValue(context);
        this.b.put((EnumMap) feature, (Feature) Boolean.valueOf(fetchValue));
        Log.i(yf.a("FeatureSetCache"), String.format("Resetting feature cache %s as %s", feature, Boolean.valueOf(fetchValue)));
    }
}
