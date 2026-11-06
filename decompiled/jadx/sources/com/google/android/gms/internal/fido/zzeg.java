package com.google.android.gms.internal.fido;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzeg {
    private static String zza = "com.google.android.gms.internal.fido.zzel";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.gms.internal.fido.zzel", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzfm.zza();
    }

    public static long zzb() {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zzc();
    }

    public static zzdp zzd(String str) {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zze(str);
    }

    public static zzdr zzf() {
        return zzi().zza();
    }

    public static zzef zzg() {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zzh();
    }

    public static zzev zzi() {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zzj();
    }

    public static zzfi zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z) {
        zzi().zzd(str, level, z);
        return false;
    }

    public long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public abstract zzdp zze(String str);

    public abstract zzef zzh();

    public zzev zzj() {
        return zzev.zze();
    }

    public abstract String zzm();
}
