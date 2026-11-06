package com.amazon.identity.auth.device;

import android.os.Build;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class sb extends tb {
    @Override // com.amazon.identity.auth.device.tb
    public final String a(byte[] bArr) {
        yf.a("DummyEncryptionKeyCryptoManager");
        "user".equalsIgnoreCase(Build.TYPE);
        return oo.a(bArr);
    }

    @Override // com.amazon.identity.auth.device.tb
    public final byte[] a(String str) {
        yf.a("DummyEncryptionKeyCryptoManager");
        "user".equalsIgnoreCase(Build.TYPE);
        return oo.a(str);
    }
}
