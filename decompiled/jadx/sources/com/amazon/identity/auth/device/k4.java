package com.amazon.identity.auth.device;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public final vd f763a;

    public k4(Context context) {
        this.f763a = new vd(context);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String c = this.f763a.b.c("com.amazon.identity.auth.device.appinstance", "secure_session_token");
        this.f763a.b.a("com.amazon.identity.auth.device.appinstance", "secure_session_token", str);
        if (TextUtils.isEmpty(c) || c.equals(str)) {
            return;
        }
        jg.a("AppInstanceDataStore:SstReplaced");
    }
}
