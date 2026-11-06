package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzh {
    public static final zzh zza;
    private final boolean zzb;
    private final boolean zzc = false;
    private final zzaf zzd;

    static {
        zze zzeVar = null;
        zzf zzfVar = new zzf(zzeVar);
        zzfVar.zzb();
        zza = zzfVar.zzd();
        zzf zzfVar2 = new zzf(zzeVar);
        zzfVar2.zzb();
        zzfVar2.zza(new zzd());
        zzfVar2.zzd();
        zzf zzfVar3 = new zzf(zzeVar);
        zzfVar3.zzc();
        zzfVar3.zzd();
    }

    public /* synthetic */ zzh(boolean z, boolean z2, zzaf zzafVar, zzg zzgVar) {
        this.zzb = z;
        this.zzd = zzafVar;
    }

    public static /* bridge */ /* synthetic */ boolean zza(zzh zzhVar) {
        boolean z = zzhVar.zzc;
        return false;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzh zzhVar, Context context, zzj zzjVar) {
        zzaf zzafVar = zzhVar.zzd;
        int size = zzafVar.size();
        int i = 0;
        while (i < size) {
            int zza2 = ((zzk) zzafVar.get(i)).zza(context, zzjVar, zzhVar.zzb) - 1;
            i++;
            if (zza2 == 1) {
                return 2;
            }
        }
        return 3;
    }
}
