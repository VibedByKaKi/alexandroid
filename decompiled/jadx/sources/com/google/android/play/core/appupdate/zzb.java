package com.google.android.play.core.appupdate;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzb {
    private static zza zza;

    public static synchronized zza zza(Context context) {
        zza zzaVar;
        synchronized (zzb.class) {
            try {
                if (zza == null) {
                    zzab zzabVar = new zzab(null);
                    zzabVar.zzb(new zzi(com.google.android.play.core.appupdate.internal.zzz.zza(context)));
                    zza = zzabVar.zza();
                }
                zzaVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaVar;
    }
}
