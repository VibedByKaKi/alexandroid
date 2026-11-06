package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzvz {
    private final zzcs zza;

    public /* synthetic */ zzvz(zzvx zzvxVar, zzvy zzvyVar) {
        zzcs zzcsVar;
        zzcsVar = zzvxVar.zza;
        this.zza = zzcsVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzvz) {
            return Objects.equal(this.zza, ((zzvz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Nullable
    @zzfe(zza = 1)
    public final zzcs zza() {
        return this.zza;
    }
}
