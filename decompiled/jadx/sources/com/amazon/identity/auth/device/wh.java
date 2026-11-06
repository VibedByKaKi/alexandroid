package com.amazon.identity.auth.device;

import android.os.Build;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class wh {
    public static void a(nq nqVar, String str) {
        String str2 = "BeginAccountMigrationWithUIV2.Error:" + a(nqVar) + ":" + str;
        yf.a("P2AMetrics");
        "user".equalsIgnoreCase(Build.TYPE);
        nqVar.a(str2);
        nqVar.a(false);
        nqVar.c.c = str;
        nqVar.a();
    }

    public static String a(nq nqVar) {
        String str = nqVar.f843a;
        if (str != null && str.contains("P2AFeatureHandler")) {
            return "JS_BRIDGE";
        }
        return "NATIVE";
    }
}
