package com.amazon.identity.auth.device;

import android.os.Build;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class dl extends mg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(String str, String str2, String str3, String str4, String str5, String str6, Long l, Double d, Boolean bool, String str7, String str8) {
        super(str, str2, str3, str4, str5, str6, l, d, bool, str7, str8);
        boolean z = bg.e;
    }

    @Override // com.amazon.identity.auth.device.mg
    public final void a() {
        toString();
        yf.a("PlatformLoggingMetricEvent");
        "user".equalsIgnoreCase(Build.TYPE);
    }
}
