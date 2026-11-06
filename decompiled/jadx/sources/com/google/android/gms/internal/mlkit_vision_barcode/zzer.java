package com.google.android.gms.internal.mlkit_vision_barcode;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class zzer extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzeq(null);
    private static final Runnable zzb = new zzeq(null);

    private final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzeo zzeoVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzeo)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzeoVar = (zzeo) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzeoVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean zzf = zzf();
            if (!zzf) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, zza)) {
                            zzg(currentThread);
                        }
                        zzc(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzg(currentThread);
                        }
                        zzd(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzg(currentThread);
            }
            if (zzf) {
                return;
            }
            zzd(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return a$$ExternalSyntheticOutline0.m$1(runnable == zza ? "running=[DONE]" : runnable instanceof zzeo ? "running=[INTERRUPTED]" : runnable instanceof Thread ? a$$ExternalSyntheticOutline0.m("running=[RUNNING ON ", ((Thread) runnable).getName(), MarkdownConstants.RIGHT_BRACKET) : "running=[NOT STARTED YET]", ", ", zzb());
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzc(Throwable th);

    public abstract void zzd(Object obj);

    public final void zze() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzeo zzeoVar = new zzeo(this, null);
            zzeoVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzeoVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public abstract boolean zzf();
}
