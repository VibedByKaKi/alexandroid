package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzin {
    private Long zza;
    private zzio zzb;
    private zzii zzc;
    private Integer zzd;
    private Integer zze;
    private Integer zzf;
    private Integer zzg;

    public final zzin zzb(Long l) {
        this.zza = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzin zzc(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzin zzd(zzii zziiVar) {
        this.zzc = zziiVar;
        return this;
    }

    public final zzin zze(Integer num) {
        this.zzf = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzin zzf(zzio zzioVar) {
        this.zzb = zzioVar;
        return this;
    }

    public final zzin zzg(Integer num) {
        this.zze = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzin zzh(Integer num) {
        this.zzg = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zziq zzj() {
        return new zziq(this, null);
    }
}
