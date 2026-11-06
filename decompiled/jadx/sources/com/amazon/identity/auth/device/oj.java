package com.amazon.identity.auth.device;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class oj {

    /* renamed from: a, reason: collision with root package name */
    public final tn f859a;
    public final u3 b;

    public oj(Context context) {
        tn a2 = tn.a(context);
        this.f859a = a2;
        this.b = (u3) a2.getSystemService("dcp_device_info");
    }
}
