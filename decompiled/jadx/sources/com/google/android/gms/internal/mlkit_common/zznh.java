package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zznh {
    private final String zza;
    private final String zzb;
    private final zznf zzc;
    private final String zzd;
    private final String zze;
    private final zzne zzf;
    private final Long zzg;
    private final Boolean zzh;
    private final Boolean zzi;

    public /* synthetic */ zznh(zznd zzndVar, zzng zzngVar) {
        String str;
        zznf zznfVar;
        String str2;
        zzne zzneVar;
        str = zzndVar.zza;
        this.zza = str;
        this.zzb = null;
        zznfVar = zzndVar.zzb;
        this.zzc = zznfVar;
        this.zzd = null;
        str2 = zzndVar.zzc;
        this.zze = str2;
        zzneVar = zzndVar.zzd;
        this.zzf = zzneVar;
        this.zzg = null;
        this.zzh = null;
        this.zzi = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zznh)) {
            return false;
        }
        zznh zznhVar = (zznh) obj;
        return Objects.equal(this.zza, zznhVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zznhVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zznhVar.zze) && Objects.equal(this.zzf, zznhVar.zzf) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    @Nullable
    @zzbc(zza = 6)
    public final zzne zza() {
        return this.zzf;
    }

    @Nullable
    @zzbc(zza = 3)
    public final zznf zzb() {
        return this.zzc;
    }

    @Nullable
    @zzbc(zza = 5)
    public final String zzc() {
        return this.zze;
    }

    @Nullable
    @zzbc(zza = 1)
    public final String zzd() {
        return this.zza;
    }
}
