package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzei implements Runnable {
    final Future zza;
    final zzeh zzb;

    public zzei(Future future, zzeh zzehVar) {
        this.zza = future;
        this.zzb = zzehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable zza = zzey.zza((zzex) this.zza);
        if (zza != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            Future future = this.zza;
            if (!future.isDone()) {
                throw new IllegalStateException(zzba.zzb("Future was expected to be done: %s", future));
            }
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzav zza = zzaw.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
