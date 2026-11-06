package com.bugsnag.android.performance;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J6\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00140\r\"\u0004\b\u0000\u0010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u0002H\u0014\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J0\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J0\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006\u001b"}, d2 = {"Lcom/bugsnag/android/performance/ContextAwareScheduledThreadPoolExecutor;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "corePoolSize", "", "(I)V", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "(ILjava/util/concurrent/ThreadFactory;)V", "handler", "Ljava/util/concurrent/RejectedExecutionHandler;", "(ILjava/util/concurrent/RejectedExecutionHandler;)V", "(ILjava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V", "schedule", "Ljava/util/concurrent/ScheduledFuture;", VoiceBridgePayloadUtil.PayloadKey.COMMAND, "Ljava/lang/Runnable;", "delay", "", "unit", "Ljava/util/concurrent/TimeUnit;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "callable", "Ljava/util/concurrent/Callable;", "scheduleAtFixedRate", "initialDelay", TypedValues.CycleType.S_WAVE_PERIOD, "scheduleWithFixedDelay", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextAwareScheduledThreadPoolExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAwareScheduledThreadPoolExecutor.kt\ncom/bugsnag/android/performance/ContextAwareScheduledThreadPoolExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes6.dex */
public final class ContextAwareScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public ContextAwareScheduledThreadPoolExecutor(int i) {
        super(i);
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

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    @NotNull
    public ScheduledFuture<?> schedule(@Nullable Runnable command, long delay, @Nullable TimeUnit unit) {
        ScheduledFuture<?> schedule = super.schedule(command != null ? SpanContext.INSTANCE.getCurrent().wrap(command) : null, delay, unit);
        schedule.getClass();
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    @NotNull
    public ScheduledFuture<?> scheduleAtFixedRate(@Nullable Runnable command, long initialDelay, long period, @Nullable TimeUnit unit) {
        ScheduledFuture<?> scheduleAtFixedRate = super.scheduleAtFixedRate(command != null ? SpanContext.INSTANCE.getCurrent().wrap(command) : null, initialDelay, period, unit);
        scheduleAtFixedRate.getClass();
        return scheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    @NotNull
    public ScheduledFuture<?> scheduleWithFixedDelay(@Nullable Runnable command, long initialDelay, long delay, @Nullable TimeUnit unit) {
        ScheduledFuture<?> scheduleWithFixedDelay = super.scheduleWithFixedDelay(command != null ? SpanContext.INSTANCE.getCurrent().wrap(command) : null, initialDelay, delay, unit);
        scheduleWithFixedDelay.getClass();
        return scheduleWithFixedDelay;
    }

    public ContextAwareScheduledThreadPoolExecutor(int i, @Nullable ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    public ContextAwareScheduledThreadPoolExecutor(int i, @Nullable RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, rejectedExecutionHandler);
    }

    public ContextAwareScheduledThreadPoolExecutor(int i, @Nullable ThreadFactory threadFactory, @Nullable RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    @NotNull
    public <V> ScheduledFuture<V> schedule(@Nullable Callable<V> callable, long delay, @Nullable TimeUnit unit) {
        ScheduledFuture<V> schedule = super.schedule(callable != null ? SpanContext.INSTANCE.getCurrent().wrap(callable) : null, delay, unit);
        schedule.getClass();
        return schedule;
    }
}
