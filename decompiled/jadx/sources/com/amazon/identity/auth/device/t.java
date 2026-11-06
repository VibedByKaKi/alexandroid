package com.amazon.identity.auth.device;

import android.text.TextUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class t extends q {
    public final b d;

    public t(String str, String str2) {
        this.d = new b(str, str2);
    }

    @Override // com.amazon.identity.auth.device.q
    public final b a() {
        return this.d;
    }

    @Override // com.amazon.identity.auth.device.q
    public final boolean b() {
        return TextUtils.isEmpty(this.d.f524a) || TextUtils.isEmpty(this.d.b);
    }
}
