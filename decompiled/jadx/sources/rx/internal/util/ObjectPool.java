package rx.internal.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.SchedulerLifecycle;
import rx.internal.util.unsafe.MpmcArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class ObjectPool<T> implements SchedulerLifecycle {
    final int maxSize;
    final int minSize;
    private final AtomicReference<Future<?>> periodicTask;
    Queue<T> pool;
    private final long validationInterval;

    private ObjectPool(int i, int i2, long j) {
        this.minSize = i;
        this.maxSize = i2;
        this.validationInterval = j;
        this.periodicTask = new AtomicReference<>();
        initialize(i);
        start();
    }

    private void initialize(int i) {
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.pool = new MpmcArrayQueue(Math.max(this.maxSize, 1024));
        } else {
            this.pool = new ConcurrentLinkedQueue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.pool.add(createObject());
        }
    }

    public T borrowObject() {
        T poll = this.pool.poll();
        return poll == null ? createObject() : poll;
    }

    public abstract T createObject();

    public void returnObject(T t) {
        if (t == null) {
            return;
        }
        this.pool.offer(t);
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        Future<?> andSet = this.periodicTask.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r0.cancel(false);
     */
    @Override // rx.internal.schedulers.SchedulerLifecycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void start() {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r8.periodicTask
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.concurrent.ScheduledExecutorService r1 = rx.internal.schedulers.GenericScheduledExecutorService.getInstance()
            rx.internal.util.ObjectPool$1 r2 = new rx.internal.util.ObjectPool$1     // Catch: java.util.concurrent.RejectedExecutionException -> L30
            r2.<init>()     // Catch: java.util.concurrent.RejectedExecutionException -> L30
            long r3 = r8.validationInterval     // Catch: java.util.concurrent.RejectedExecutionException -> L30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L30
            r5 = r3
            java.util.concurrent.ScheduledFuture r0 = r1.scheduleAtFixedRate(r2, r3, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L30
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r1 = r8.periodicTask
        L1d:
            r2 = 0
            boolean r2 = r1.compareAndSet(r2, r0)
            if (r2 == 0) goto L25
            return
        L25:
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L1d
            r1 = 0
            r0.cancel(r1)
            goto L0
        L30:
            r0 = move-exception
            r8 = r0
            rx.plugins.RxJavaHooks.onError(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.ObjectPool.start():void");
    }

    public ObjectPool() {
        this(0, 0, 67L);
    }
}
