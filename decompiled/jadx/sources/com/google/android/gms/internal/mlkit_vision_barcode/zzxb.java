package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzxb {

    @Nullable
    private static zzxb zza;

    private zzxb() {
    }

    public static synchronized zzxb zza() {
        zzxb zzxbVar;
        synchronized (zzxb.class) {
            try {
                if (zza == null) {
                    zza = new zzxb();
                }
                zzxbVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzxbVar;
    }
}
