package com.facebook.common.executors;

import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class ConstrainedExecutorService extends AbstractExecutorService implements AutoCloseable {
    private static final Class<?> TAG = ConstrainedExecutorService.class;
    private final Executor mExecutor;
    private volatile int mMaxConcurrency;
    private final AtomicInteger mMaxQueueSize;
    private final String mName;
    private final AtomicInteger mPendingWorkers;
    private final Worker mTaskRunner;
    private final BlockingQueue<Runnable> mWorkQueue;

    public ConstrainedExecutorService(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("max concurrency must be > 0");
            throw null;
        }
        this.mName = str;
        this.mExecutor = executor;
        this.mMaxConcurrency = i;
        this.mWorkQueue = blockingQueue;
        this.mTaskRunner = new Worker(this, 0);
        this.mPendingWorkers = new AtomicInteger(0);
        this.mMaxQueueSize = new AtomicInteger(0);
    }

    public static ConstrainedExecutorService newConstrainedExecutor(String str, int i, int i2, Executor executor) {
        return new ConstrainedExecutorService(str, i, executor, new LinkedBlockingQueue(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startWorkerIfNeeded() {
        int i = this.mPendingWorkers.get();
        while (i < this.mMaxConcurrency) {
            int i2 = i + 1;
            boolean compareAndSet = this.mPendingWorkers.compareAndSet(i, i2);
            String str = this.mName;
            if (compareAndSet) {
                FLog.v(TAG, "%s: starting worker %d of %d", str, Integer.valueOf(i2), Integer.valueOf(this.mMaxConcurrency));
                this.mExecutor.execute(this.mTaskRunner);
                return;
            } else {
                FLog.v(TAG, "%s: race in startWorkerIfNeeded; retrying", str);
                i = this.mPendingWorkers.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("runnable parameter is null");
            return;
        }
        if (this.mWorkQueue.offer(runnable)) {
            int size = this.mWorkQueue.size();
            int i = this.mMaxQueueSize.get();
            if (size > i && this.mMaxQueueSize.compareAndSet(i, size)) {
                FLog.v(TAG, "%s: max pending work in queue = %d", this.mName, Integer.valueOf(size));
            }
            startWorkerIfNeeded();
            return;
        }
        throw new RejectedExecutionException(this.mName + " queue is full, size=" + this.mWorkQueue.size());
    }

    public boolean isIdle() {
        return this.mWorkQueue.isEmpty() && this.mPendingWorkers.get() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Worker implements Runnable {
        private Worker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) ConstrainedExecutorService.this.mWorkQueue.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    FLog.v((Class<?>) ConstrainedExecutorService.TAG, "%s: Worker has nothing to run", ConstrainedExecutorService.this.mName);
                }
                int decrementAndGet = ConstrainedExecutorService.this.mPendingWorkers.decrementAndGet();
                if (ConstrainedExecutorService.this.mWorkQueue.isEmpty()) {
                    FLog.v((Class<?>) ConstrainedExecutorService.TAG, "%s: worker finished; %d workers left", ConstrainedExecutorService.this.mName, Integer.valueOf(decrementAndGet));
                } else {
                    ConstrainedExecutorService.this.startWorkerIfNeeded();
                }
            } catch (Throwable th) {
                int decrementAndGet2 = ConstrainedExecutorService.this.mPendingWorkers.decrementAndGet();
                if (ConstrainedExecutorService.this.mWorkQueue.isEmpty()) {
                    FLog.v((Class<?>) ConstrainedExecutorService.TAG, "%s: worker finished; %d workers left", ConstrainedExecutorService.this.mName, Integer.valueOf(decrementAndGet2));
                } else {
                    ConstrainedExecutorService.this.startWorkerIfNeeded();
                }
                throw th;
            }
        }

        public /* synthetic */ Worker(ConstrainedExecutorService constrainedExecutorService, int i) {
            this();
        }
    }
}
