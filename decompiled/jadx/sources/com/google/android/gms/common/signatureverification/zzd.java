package com.google.android.gms.common.signatureverification;

import androidx.annotation.GuardedBy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzd {

    @GuardedBy("Loader.class")
    private static SignatureVerificationConfiguration zza;

    public static synchronized void zza(SignatureVerificationConfiguration signatureVerificationConfiguration) {
        synchronized (zzd.class) {
            if (zza != null) {
                throw new IllegalStateException("Redundantly setting SignatureVerificationConfiguration");
            }
            zza = signatureVerificationConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized SignatureVerificationConfiguration zzc() {
        SignatureVerificationConfiguration signatureVerificationConfiguration;
        synchronized (zzd.class) {
            try {
                if (zza == null) {
                    zza(new zzb());
                }
                signatureVerificationConfiguration = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return signatureVerificationConfiguration;
    }
}
