package com.google.android.gms.internal.mlkit_vision_barcode;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzdz<V> extends zzex implements zzet<V> {
    static final boolean zza;
    static final zzes zzb;
    private static final zza zzc;
    private static final Object zzd;

    @CheckForNull
    private volatile zzd listeners;

    @CheckForNull
    private volatile Object value;

    @CheckForNull
    private volatile zzj waiters;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    abstract class zza {
        public /* synthetic */ zza(zzdy zzdyVar) {
        }

        public abstract zzd zza(zzdz zzdzVar, zzd zzdVar);

        public abstract zzj zzb(zzdz zzdzVar, zzj zzjVar);

        public abstract void zzc(zzj zzjVar, @CheckForNull zzj zzjVar2);

        public abstract void zzd(zzj zzjVar, Thread thread);

        public abstract boolean zze(zzdz zzdzVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzdz zzdzVar, @CheckForNull Object obj, Object obj2);

        public abstract boolean zzg(zzdz zzdzVar, @CheckForNull zzj zzjVar, @CheckForNull zzj zzjVar2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    final class zzb {

        @CheckForNull
        static final zzb zza;

        @CheckForNull
        static final zzb zzb;
        final boolean zzc;

        @CheckForNull
        final Throwable zzd;

        static {
            if (zzdz.zza) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzj, Thread> zza;
        final AtomicReferenceFieldUpdater<zzj, zzj> zzb;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, zzj> zzc;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzdzVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            return this.zzc.getAndSet(zzdzVar, zzjVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzc(zzj zzjVar, @CheckForNull zzj zzjVar2) {
            this.zzb.lazySet(zzjVar, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            this.zza.lazySet(zzjVar, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zze(zzdz zzdzVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzea.zza(this.zzd, zzdzVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzf(zzdz zzdzVar, @CheckForNull Object obj, Object obj2) {
            return zzea.zza(this.zze, zzdzVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzg(zzdz zzdzVar, @CheckForNull zzj zzjVar, @CheckForNull zzj zzjVar2) {
            return zzea.zza(this.zzc, zzdzVar, zzjVar, zzjVar2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    final class zzf<V> implements Runnable {
        final zzdz<V> zza;
        final zzet<? extends V> zzb;

        public zzf(zzdz zzdzVar, zzet zzetVar) {
            this.zza = zzdzVar;
            this.zzb = zzetVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzdz) this.zza).value != this) {
                return;
            }
            zzet<? extends V> zzetVar = this.zzb;
            if (zzdz.zzc.zzf(this.zza, this, zzdz.zzq(zzetVar))) {
                zzdz.zzv(this.zza, false);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    interface zzh<V> extends zzet<V> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        Throwable th;
        zza zzgVar;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zza = z;
        zzb = new zzes(zzdz.class);
        Object[] objArr = 0;
        try {
            zzgVar = new zzi(null);
            th = null;
            th2 = null;
        } catch (Error | Exception e) {
            try {
                th = null;
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzj.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzj.class, zzj.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, zzj.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, Object.class, "value"));
            } catch (Error | Exception e2) {
                th = e2;
                zzgVar = new zzg(objArr == true ? 1 : 0);
                th2 = e;
            }
        }
        zzc = zzgVar;
        if (th != null) {
            zzes zzesVar = zzb;
            Logger zza2 = zzesVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzesVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzq(zzet zzetVar) {
        Throwable zzg2;
        if (zzetVar instanceof zzh) {
            Object obj = ((zzdz) zzetVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((zzetVar instanceof zzex) && (zzg2 = ((zzex) zzetVar).zzg()) != null) {
            return new zzc(zzg2);
        }
        boolean isCancelled = zzetVar.isCancelled();
        if ((!zza) && isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            Objects.requireNonNull(zzbVar2);
            return zzbVar2;
        }
        try {
            Object zzr = zzr(zzetVar);
            return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzetVar)))) : zzr == null ? zzd : zzr;
        } catch (Error | Exception e) {
            return new zzc(e);
        } catch (CancellationException e2) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzetVar)), e2)) : new zzb(false, e2);
        } catch (ExecutionException e3) {
            return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzetVar)), e3)) : new zzc(e3.getCause());
        }
    }

    private static Object zzr(Future future) throws ExecutionException {
        Object obj;
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
        return obj;
    }

    private final void zzs(StringBuilder sb) {
        try {
            Object zzr = zzr(this);
            sb.append("SUCCESS, result=[");
            if (zzr == null) {
                sb.append("null");
            } else if (zzr == this) {
                sb.append("this future");
            } else {
                sb.append(zzr.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzr)));
            }
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzt(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzu(sb, ((zzf) obj).zzb);
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        } else {
            try {
                concat = zzba.zza(zzf());
            } catch (Exception | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null) {
                AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, ", info=[", concat, MarkdownConstants.RIGHT_BRACKET);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzs(sb);
        }
    }

    private final void zzu(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzv(zzdz zzdzVar, boolean z) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            for (zzj zzb2 = zzc.zzb(zzdzVar, zzj.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzdzVar.zzm();
            zzd zzdVar3 = zzdVar2;
            zzd zza2 = zzc.zza(zzdzVar, zzd.zza);
            zzd zzdVar4 = zzdVar3;
            while (zza2 != null) {
                zzd zzdVar5 = zza2.next;
                zza2.next = zzdVar4;
                zzdVar4 = zza2;
                zza2 = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.zzb;
                zzdVar = zzdVar4.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzdzVar = zzfVar.zza;
                    if (zzdzVar.value == zzfVar) {
                        if (zzc.zzf(zzdzVar, zzfVar, zzq(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar4.zzc;
                    Objects.requireNonNull(executor);
                    zzw(runnable2, executor);
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private static void zzw(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a$$ExternalSyntheticOutline0.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    private final void zzx(zzj zzjVar) {
        zzjVar.thread = null;
        while (true) {
            zzj zzjVar2 = this.waiters;
            if (zzjVar2 != zzj.zza) {
                zzj zzjVar3 = null;
                while (zzjVar2 != null) {
                    zzj zzjVar4 = zzjVar2.next;
                    if (zzjVar2.thread != null) {
                        zzjVar3 = zzjVar2;
                    } else if (zzjVar3 != null) {
                        zzjVar3.next = zzjVar4;
                        if (zzjVar3.thread == null) {
                            break;
                        }
                    } else if (!zzc.zzg(this, zzjVar2, zzjVar4)) {
                        break;
                    }
                    zzjVar2 = zzjVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzy(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzd) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj instanceof zzf) && !(obj == null)) {
            return false;
        }
        if (zza) {
            zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z ? zzb.zza : zzb.zzb;
            Objects.requireNonNull(zzbVar);
        }
        boolean z2 = false;
        while (true) {
            if (zzc.zzf(this, obj, zzbVar)) {
                zzv(this, z);
                if (!(obj instanceof zzf)) {
                    break;
                }
                zzet<? extends V> zzetVar = ((zzf) obj).zzb;
                if (!(zzetVar instanceof zzh)) {
                    zzetVar.cancel(z);
                    break;
                }
                this = (zzdz) zzetVar;
                obj = this.value;
                if (!(obj == null) && !(obj instanceof zzf)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = this.value;
                if (!(obj instanceof zzf)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzy(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzj zzjVar = this.waiters;
            if (zzjVar != zzj.zza) {
                zzj zzjVar2 = new zzj();
                do {
                    zza zzaVar = zzc;
                    zzaVar.zzc(zzjVar2, zzjVar);
                    if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzx(zzjVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzy(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzx(zzjVar2);
                    } else {
                        zzjVar = this.waiters;
                    }
                } while (zzjVar != zzj.zza);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzy(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                return zzy(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzdzVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(a$$ExternalSyntheticOutline0.m$1(str, " for ", zzdzVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r2 instanceof zzf));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.value instanceof zzb) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzs(sb);
        } else {
            zzt(sb);
        }
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public String zzf() {
        if (this instanceof ScheduledFuture) {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzex
    @CheckForNull
    public final Throwable zzg() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzet
    public final void zzl(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzaz.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzc.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzw(runnable, executor);
    }

    public final boolean zzn(Throwable th) {
        if (!zzc.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzv(this, false);
        return true;
    }

    public final boolean zzo(zzet zzetVar) {
        zzc zzcVar;
        zzetVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (zzetVar.isDone()) {
                if (!zzc.zzf(this, null, zzq(zzetVar))) {
                    return false;
                }
                zzv(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, zzetVar);
            if (zzc.zzf(this, null, zzfVar)) {
                try {
                    zzetVar.zzl(zzfVar, zzee.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzc.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzetVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzp() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    final class zzg extends zza {
        public /* synthetic */ zzg(zzeb zzebVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzdzVar) {
                try {
                    zzdVar2 = zzdzVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzdzVar.listeners = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            zzj zzjVar2;
            synchronized (zzdzVar) {
                try {
                    zzjVar2 = zzdzVar.waiters;
                    if (zzjVar2 != zzjVar) {
                        zzdzVar.waiters = zzjVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzc(zzj zzjVar, @CheckForNull zzj zzjVar2) {
            zzjVar.next = zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            zzjVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zze(zzdz zzdzVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.listeners != zzdVar) {
                        return false;
                    }
                    zzdzVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzf(zzdz zzdzVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.value != obj) {
                        return false;
                    }
                    zzdzVar.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzg(zzdz zzdzVar, @CheckForNull zzj zzjVar, @CheckForNull zzj zzjVar2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.waiters != zzjVar) {
                        return false;
                    }
                    zzdzVar.waiters = zzjVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private zzg() {
            throw null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    final class zzi extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzi.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzj.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzj.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
                }
            } catch (PrivilegedActionException e2) {
                OnnxMap$$ExternalSyntheticBUOutline0.m("Could not initialize intrinsics", e2.getCause());
            }
        }

        public /* synthetic */ zzi(zzed zzedVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzdzVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzdzVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            zzj zzjVar2;
            do {
                zzjVar2 = zzdzVar.waiters;
                if (zzjVar == zzjVar2) {
                    break;
                }
            } while (!zzg(zzdzVar, zzjVar2, zzjVar));
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzc(zzj zzjVar, @CheckForNull zzj zzjVar2) {
            zza.putObject(zzjVar, zzf, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            zza.putObject(zzjVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zze(zzdz zzdzVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzec.zza(zza, zzdzVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzf(zzdz zzdzVar, @CheckForNull Object obj, Object obj2) {
            return zzec.zza(zza, zzdzVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzg(zzdz zzdzVar, @CheckForNull zzj zzjVar, @CheckForNull zzj zzjVar2) {
            return zzec.zza(zza, zzdzVar, zzc, zzjVar, zzjVar2);
        }

        private zzi() {
            throw null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    final class zzd {
        static final zzd zza = new zzd();

        @CheckForNull
        zzd next;

        @CheckForNull
        final Runnable zzb;

        @CheckForNull
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    final class zzj {
        static final zzj zza = new zzj(false);

        @CheckForNull
        volatile zzj next;

        @CheckForNull
        volatile Thread thread;

        public zzj() {
            zzdz.zzc.zzd(this, Thread.currentThread());
        }

        public zzj(boolean z) {
        }
    }

    public void zzm() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                return zzy(obj2);
            }
            zzj zzjVar = this.waiters;
            if (zzjVar != zzj.zza) {
                zzj zzjVar2 = new zzj();
                do {
                    zza zzaVar = zzc;
                    zzaVar.zzc(zzjVar2, zzjVar);
                    if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzx(zzjVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzy(obj);
                    }
                    zzjVar = this.waiters;
                } while (zzjVar != zzj.zza);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzy(obj3);
        }
        throw new InterruptedException();
    }
}
