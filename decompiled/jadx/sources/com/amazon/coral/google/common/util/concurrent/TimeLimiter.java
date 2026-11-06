package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;
import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@GwtIncompatible
@DoNotMock("Use FakeTimeLimiter")
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface TimeLimiter {
    @CanIgnoreReturnValue
    <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException;

    @CanIgnoreReturnValue
    default <T> T callUninterruptiblyWithTimeout(Callable<T> callable, Duration duration) throws TimeoutException, ExecutionException {
        return (T) callUninterruptiblyWithTimeout(callable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    @CanIgnoreReturnValue
    <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException;

    @CanIgnoreReturnValue
    default <T> T callWithTimeout(Callable<T> callable, Duration duration) throws TimeoutException, InterruptedException, ExecutionException {
        return (T) callWithTimeout(callable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit);

    default <T> T newProxy(T t, Class<T> cls, Duration duration) {
        return (T) newProxy(t, cls, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    void runUninterruptiblyWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException;

    default void runUninterruptiblyWithTimeout(Runnable runnable, Duration duration) throws TimeoutException {
        runUninterruptiblyWithTimeout(runnable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    void runWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException;

    default void runWithTimeout(Runnable runnable, Duration duration) throws TimeoutException, InterruptedException {
        runWithTimeout(runnable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }
}
