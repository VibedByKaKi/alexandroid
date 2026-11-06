package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum zzmm implements zzba {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzmm(int i) {
        this.zzd = i;
    }

    public static zzmm zzb(int i) {
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzd;
    }
}
