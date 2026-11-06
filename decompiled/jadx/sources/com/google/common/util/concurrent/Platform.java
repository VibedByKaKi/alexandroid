package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible(emulated = true)
/* loaded from: classes8.dex */
final class Platform {
    private Platform() {
    }

    public static <V> V get(AbstractFuture<V> abstractFuture) throws InterruptedException, ExecutionException {
        return abstractFuture.blockingGet();
    }

    public static void interruptCurrentThread() {
        Thread.currentThread().interrupt();
    }

    public static boolean isInstanceOfThrowableClass(Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }

    public static void restoreInterruptIfIsInterruptedException(Throwable th) {
        Preconditions.checkNotNull(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void rethrowIfErrorOtherThanStackOverflow(Throwable th) {
        Preconditions.checkNotNull(th);
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    public static <V> V get(AbstractFuture<V> abstractFuture, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return abstractFuture.blockingGet(j, timeUnit);
    }
}
