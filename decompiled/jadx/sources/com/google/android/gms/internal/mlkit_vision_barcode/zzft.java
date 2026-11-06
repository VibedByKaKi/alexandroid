package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzft {
    private final zzrb zza;
    private final Boolean zzb;
    private final Boolean zzc;
    private final zzqk zzd;
    private final zzvz zze;
    private final zzcs zzf;
    private final zzcs zzg;

    public /* synthetic */ zzft(zzfr zzfrVar, zzfs zzfsVar) {
        zzrb zzrbVar;
        Boolean bool;
        zzvz zzvzVar;
        zzcs zzcsVar;
        zzcs zzcsVar2;
        zzrbVar = zzfrVar.zza;
        this.zza = zzrbVar;
        this.zzb = null;
        bool = zzfrVar.zzb;
        this.zzc = bool;
        this.zzd = null;
        zzvzVar = zzfrVar.zzc;
        this.zze = zzvzVar;
        zzcsVar = zzfrVar.zzd;
        this.zzf = zzcsVar;
        zzcsVar2 = zzfrVar.zze;
        this.zzg = zzcsVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        return Objects.equal(this.zza, zzftVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzftVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzftVar.zze) && Objects.equal(this.zzf, zzftVar.zzf) && Objects.equal(this.zzg, zzftVar.zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
    }

    @Nullable
    @zzfe(zza = 6)
    public final zzcs zza() {
        return this.zzf;
    }

    @Nullable
    @zzfe(zza = 7)
    public final zzcs zzb() {
        return this.zzg;
    }

    @Nullable
    @zzfe(zza = 1)
    public final zzrb zzc() {
        return this.zza;
    }

    @Nullable
    @zzfe(zza = 5)
    public final zzvz zzd() {
        return this.zze;
    }

    @Nullable
    @zzfe(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}
