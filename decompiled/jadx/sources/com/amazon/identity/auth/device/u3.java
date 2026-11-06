package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class u3 {
    public static final String b = UUID.randomUUID().toString().replace("-", "");

    /* renamed from: a, reason: collision with root package name */
    public final tn f997a;

    public u3(Context context) {
        this.f997a = tn.a(context.getApplicationContext());
    }

    public static long a() {
        Log.i(yf.a("SSODeviceInfo"), "Amazon Device Info will try to get build number");
        yf.a("ClientSideAmazonPlatformDependencyImpl");
        "user".equalsIgnoreCase(Build.TYPE);
        return h7.a().f696a;
    }

    public static void b() {
        Log.i(yf.a("SSODeviceInfo"), "Amazon Device Info will try to get device secret");
        Log.w(yf.a("ClientSideAmazonPlatformDependencyImpl"), "getDeviceSecret() in ClientSideAmazonPlatformDependencyImpl is called which is not expected");
    }

    public String c() {
        Log.i(yf.a("SSODeviceInfo"), "Amazon Device Info will try to get central device serial");
        tn tnVar = this.f997a;
        String a2 = b4.a(tnVar);
        if (!TextUtils.isEmpty(a2) && !a2.toLowerCase(Locale.US).equals("unknown")) {
            return a2;
        }
        yf.a("ClientSideAmazonPlatformDependencyImpl");
        "user".equalsIgnoreCase(Build.TYPE);
        j8 b2 = j8.b(tnVar);
        b2.c();
        String c = b2.b.c("dcp.third.party.device.state", "serial.number");
        if (c == null) {
            Log.e(yf.a("CommonInfoGetter"), "Cannot generate the dsn", new Throwable());
        }
        return c;
    }

    public final String d() {
        Log.i(yf.a("SSODeviceInfo"), "Amazon Device Info will try to get central device type");
        return ta.b(this.f997a);
    }
}
