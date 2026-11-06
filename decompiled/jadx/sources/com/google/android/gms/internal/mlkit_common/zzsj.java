package com.google.android.gms.internal.mlkit_common;

import com.amazon.credentiallocker.CustomerRegion;
import com.google.mlkit.common.sdkinternal.ModelType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzsj {
    public static zzsi zzh() {
        zzrv zzrvVar = new zzrv();
        zzrvVar.zzg(CustomerRegion.NA);
        zzrvVar.zzf(false);
        zzrvVar.zze(false);
        zzrvVar.zzd(ModelType.UNKNOWN);
        zzrvVar.zzb(zzmu.NO_ERROR);
        zzrvVar.zza(zzna.UNKNOWN_STATUS);
        zzrvVar.zzc(0);
        return zzrvVar;
    }

    public abstract int zza();

    public abstract ModelType zzb();

    public abstract zzmu zzc();

    public abstract zzna zzd();

    public abstract String zze();

    public abstract boolean zzf();

    public abstract boolean zzg();
}
