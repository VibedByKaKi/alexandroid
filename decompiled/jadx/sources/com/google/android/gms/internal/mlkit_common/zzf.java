package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzf {
    private final zzac zza = new zzac();
    private Boolean zzb;

    private zzf() {
    }

    public final zzf zza(zzk zzkVar) {
        zzt.zzc(this.zzb, "Must call internal() or external() before appending rules.");
        this.zza.zzb(zzkVar);
        return this;
    }

    public final zzf zzb() {
        zzt.zze(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.FALSE;
        return this;
    }

    public final zzf zzc() {
        zzt.zze(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.TRUE;
        return this;
    }

    public final zzh zzd() {
        zzt.zzc(this.zzb, "Must call internal() or external() when building a SourcePolicy.");
        return new zzh(this.zzb.booleanValue(), false, this.zza.zzc(), null);
    }

    public /* synthetic */ zzf(zze zzeVar) {
    }
}
