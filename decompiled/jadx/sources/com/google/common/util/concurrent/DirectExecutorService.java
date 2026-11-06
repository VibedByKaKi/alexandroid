package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.JoinPoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes8.dex */
final class DirectExecutorService extends AbstractListeningExecutorService {
    private final Object lock = new Object();

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private int runningTasks = 0;

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private boolean shutdown = false;

    private void endTask() {
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    this.lock.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startTask() {
        synchronized (this.lock) {
            try {
                if (this.shutdown) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.runningTasks++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.lock) {
            while (true) {
                try {
                    if (this.shutdown && this.runningTasks == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.lock, nanos);
                    nanos -= System.nanoTime() - nanoTime;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        startTask();
        try {
            runnable.run();
        } finally {
            endTask();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z;
        synchronized (this.lock) {
            z = this.shutdown;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean z;
        synchronized (this.lock) {
            try {
                z = this.shutdown && this.runningTasks == 0;
            } finally {
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.lock) {
            try {
                this.shutdown = true;
                if (this.runningTasks == 0) {
                    this.lock.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}
