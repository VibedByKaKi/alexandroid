package com.google.android.gms.internal.fido;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzah {
    private static final Object zza = new Object();
    private static volatile boolean zzb = false;
    private static volatile zzag zzc = null;
    private static volatile boolean zzd = false;
    private static volatile zzag zze;

    public static void zza() {
        zzd = true;
    }

    public static void zzb() {
        if (zze == null) {
            zze = new zzag(null);
        }
    }

    public static void zzc() {
        if (zzc == null) {
            zzc = new zzag(null);
        }
    }

    public static boolean zzd() {
        synchronized (zza) {
        }
        return false;
    }
}
