package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzqk {
    private final zzqi zza;
    private final Integer zzb;
    private final Integer zzc;
    private final Boolean zzd;

    public /* synthetic */ zzqk(zzqh zzqhVar, zzqj zzqjVar) {
        zzqi zzqiVar;
        Integer num;
        zzqiVar = zzqhVar.zza;
        this.zza = zzqiVar;
        num = zzqhVar.zzb;
        this.zzb = num;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return Objects.equal(this.zza, zzqkVar.zza) && Objects.equal(this.zzb, zzqkVar.zzb) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, null);
    }

    @Nullable
    @zzfe(zza = 1)
    public final zzqi zza() {
        return this.zza;
    }

    @Nullable
    @zzfe(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
