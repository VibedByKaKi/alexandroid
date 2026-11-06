package com.amazon.identity.auth.device;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.identity.mobi.whatsappautoread.api.WhatsAppAutoreadDependency;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class kr implements WhatsAppAutoreadDependency {
    public final void incrementCounterAndRecord(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        jg.a(str);
    }

    public final void recordTimerMetric(String str, long j) {
        Context context = jg.f750a;
        String a2 = s0.a("WhatsAppAutoreadPlugin_", str);
        lg a3 = jg.a();
        a3.f790a = a2;
        a3.h = Double.valueOf(j);
        a3.a().a();
    }
}
