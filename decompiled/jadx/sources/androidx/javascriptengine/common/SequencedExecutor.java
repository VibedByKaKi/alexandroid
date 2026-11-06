package androidx.javascriptengine.common;

import androidx.annotation.GuardedBy;
import androidx.paging.LivePagedList$$ExternalSyntheticLambda0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class SequencedExecutor implements Executor {
    private final Executor mInner;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private ArrayDeque<Runnable> mQueue = new ArrayDeque<>();

    @GuardedBy("mLock")
    private boolean mIsDraining = false;

    public SequencedExecutor(Executor executor) {
        this.mInner = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drainOnInner() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.Runnable> r1 = r6.mQueue     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            if (r1 != 0) goto Lf
            r6.mIsDraining = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r6 = move-exception
            goto L88
        Lf:
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> Lc
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto L1b
            r6.mIsDraining = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            r3 = 1
            r1.run()     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r6.mLock
            monitor-enter(r1)
            java.util.ArrayDeque<java.lang.Runnable> r4 = r6.mQueue     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L34
            goto L31
        L2f:
            r6 = move-exception
            goto L51
        L31:
            r6.mIsDraining = r2     // Catch: java.lang.Throwable -> L2f
            r3 = r2
        L34:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L50
            java.util.concurrent.Executor r1 = r6.mInner     // Catch: java.util.concurrent.RejectedExecutionException -> L44
            androidx.paging.LivePagedList$$ExternalSyntheticLambda0 r3 = new androidx.paging.LivePagedList$$ExternalSyntheticLambda0     // Catch: java.util.concurrent.RejectedExecutionException -> L44
            r4 = 14
            r3.<init>(r6, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L44
            r1.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L44
            return
        L44:
            java.lang.Object r1 = r6.mLock
            monitor-enter(r1)
            r6.mIsDraining = r2     // Catch: java.lang.Throwable -> L4d
            r6.mQueue = r0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            throw r6
        L50:
            return
        L51:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r6
        L53:
            r1 = move-exception
            java.lang.Object r4 = r6.mLock
            monitor-enter(r4)
            java.util.ArrayDeque<java.lang.Runnable> r5 = r6.mQueue     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L66
            java.util.ArrayDeque<java.lang.Runnable> r5 = r6.mQueue     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L69
            goto L66
        L64:
            r6 = move-exception
            goto L86
        L66:
            r6.mIsDraining = r2     // Catch: java.lang.Throwable -> L64
            r3 = r2
        L69:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L85
            java.util.concurrent.Executor r3 = r6.mInner     // Catch: java.util.concurrent.RejectedExecutionException -> L79
            androidx.paging.LivePagedList$$ExternalSyntheticLambda0 r4 = new androidx.paging.LivePagedList$$ExternalSyntheticLambda0     // Catch: java.util.concurrent.RejectedExecutionException -> L79
            r5 = 14
            r4.<init>(r6, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L79
            r3.execute(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L79
            goto L85
        L79:
            java.lang.Object r3 = r6.mLock
            monitor-enter(r3)
            r6.mIsDraining = r2     // Catch: java.lang.Throwable -> L82
            r6.mQueue = r0     // Catch: java.lang.Throwable -> L82
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
            goto L85
        L82:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
            throw r6
        L85:
            throw r1
        L86:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L64
            throw r6
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.javascriptengine.common.SequencedExecutor.drainOnInner():void");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.mLock) {
            try {
                ArrayDeque<Runnable> arrayDeque = this.mQueue;
                if (arrayDeque == null) {
                    return;
                }
                arrayDeque.add(runnable);
                if (this.mIsDraining) {
                    return;
                }
                this.mIsDraining = true;
                try {
                    this.mInner.execute(new LivePagedList$$ExternalSyntheticLambda0(this, 14));
                } catch (RejectedExecutionException unused) {
                    synchronized (this.mLock) {
                        this.mIsDraining = false;
                        this.mQueue = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
