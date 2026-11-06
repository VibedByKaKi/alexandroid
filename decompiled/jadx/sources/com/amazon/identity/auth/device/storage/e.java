package com.amazon.identity.auth.device.storage;

import android.security.keystore.KeyProtection;
import com.amazon.identity.auth.device.api.MAPError;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyStore;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final KeyStore f958a;
    public final String b;

    public e(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f958a = keyStore;
            this.b = str;
        } catch (Exception e) {
            throw new KeystoreProvider$KeystoreProviderException(MAPError.CommonError.INTERNAL_ERROR, e.getMessage(), e);
        }
    }

    public final void a(SecretKeySpec secretKeySpec) {
        this.f958a.setEntry(this.b, new KeyStore.SecretKeyEntry(secretKeySpec), new KeyProtection.Builder(3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
    }

    public final SecretKey a() {
        try {
            return (SecretKey) this.f958a.getKey(this.b, null);
        } catch (Exception e) {
            throw new KeystoreProvider$KeystoreProviderException(MAPError.CommonError.INTERNAL_ERROR, e.getMessage(), e);
        }
    }
}
