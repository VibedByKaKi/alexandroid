package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface ListeningScheduledExecutorService extends ScheduledExecutorService, ListeningExecutorService, AutoCloseable {
    @Override // com.amazon.coral.google.common.util.concurrent.ListeningExecutorService, java.lang.AutoCloseable
    /* synthetic */ default void close() {
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

    @Override // java.util.concurrent.ScheduledExecutorService
    ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit);

    default ListenableScheduledFuture<?> schedule(Runnable runnable, Duration duration) {
        return schedule(runnable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    default ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, Duration duration, Duration duration2) {
        return scheduleAtFixedRate(runnable, Internal.toNanosSaturated(duration), Internal.toNanosSaturated(duration2), TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    default ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, Duration duration, Duration duration2) {
        return scheduleWithFixedDelay(runnable, Internal.toNanosSaturated(duration), Internal.toNanosSaturated(duration2), TimeUnit.NANOSECONDS);
    }

    default <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, Duration duration) {
        return schedule((Callable) callable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }
}
