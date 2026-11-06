package com.google.android.gms.internal.playcore_age_signals;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzi extends zze {
    final /* synthetic */ zzo zza;

    public zzi(zzo zzoVar) {
        Objects.requireNonNull(zzoVar);
        this.zza = zzoVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzd zzdVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzd zzdVar2;
        zzo zzoVar = this.zza;
        obj = zzoVar.zzg;
        synchronized (obj) {
            try {
                atomicInteger = zzoVar.zzl;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = zzoVar.zzl;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        zzdVar2 = zzoVar.zzc;
                        zzdVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                iInterface = zzoVar.zzn;
                if (iInterface != null) {
                    zzdVar = zzoVar.zzc;
                    zzdVar.zzc("Unbind from service.", new Object[0]);
                    context = zzoVar.zzb;
                    serviceConnection = zzoVar.zzm;
                    context.unbindService(serviceConnection);
                    zzoVar.zzh = false;
                    zzoVar.zzn = null;
                    zzoVar.zzm = null;
                }
                zzoVar.zzw();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
