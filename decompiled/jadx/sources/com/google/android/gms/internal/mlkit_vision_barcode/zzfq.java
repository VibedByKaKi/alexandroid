package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzfq {
    private zzft zza;
    private Integer zzb;
    private zzqd zzc;

    public final zzfq zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzfq zzb(zzqd zzqdVar) {
        this.zzc = zzqdVar;
        return this;
    }

    public final zzfq zzc(zzft zzftVar) {
        this.zza = zzftVar;
        return this;
    }

    public final zzfv zze() {
        return new zzfv(this, null);
    }
}
