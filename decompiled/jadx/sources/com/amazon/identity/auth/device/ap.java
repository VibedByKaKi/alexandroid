package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.amazon.identity.auth.device.utils.ReflectionHelper$CannotCallMethodException;
import com.dee.app.metrics.MetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    public final com.amazon.identity.auth.device.utils.b f465a = new com.amazon.identity.auth.device.utils.b();

    public final String a(String str) {
        Object obj;
        if (str.length() > 31) {
            str = str.substring(0, 31);
        }
        yf.a("SystemPropertiesWrapper");
        "user".equalsIgnoreCase(Build.TYPE);
        Class[] clsArr = {String.class};
        Object[] objArr = {str};
        try {
            this.f465a.getClass();
            obj = com.amazon.identity.auth.device.utils.b.a(MetricsConstants.Method.CACHE_GET, "android.os.SystemProperties", clsArr, objArr);
        } catch (ReflectionHelper$CannotCallMethodException unused) {
            Locale locale = Locale.US;
            Log.e(yf.a("SystemPropertiesWrapper"), a$$ExternalSyntheticOutline0.m(Build.VERSION.SDK_INT, "Cannot call such method get in SystemProperties in Android "));
            obj = null;
        }
        return (String) obj;
    }

    public final String a(Context context, String str) {
        if (!gl.f()) {
            return a(str);
        }
        if (str.length() > 31) {
            str = str.substring(0, 31);
        }
        yf.a("SystemPropertiesWrapper");
        "user".equalsIgnoreCase(Build.TYPE);
        return Settings.Global.getString(context.getContentResolver(), str);
    }
}
