package com.amazon.alexa.utils.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ExecutorFactory {
    public static ExecutorService newCachedThreadPool(String str, int i) {
        return newThreadPoolExecutor(str, 0, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static ExecutorService newFixedSizeThreadPool(String str, int i) {
        return newThreadPoolExecutor(str, i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static ScheduledExecutorService newScheduledExecutor(int i, String str) {
        return newScheduledThreadPoolExecutor(str, i);
    }

    private static ScheduledExecutorService newScheduledThreadPoolExecutor(String str, int i) {
        return new ExceptionLoggingScheduledThreadPoolExecutor(i, new NamedThreadFactory(str));
    }

    public static ExecutorService newSingleThreadCachedThreadPool(String str) {
        return newThreadPoolExecutor(str, 0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
        return new ExceptionLoggingThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(String str) {
        return newScheduledThreadPoolExecutor(str, 1);
    }

    private static ExecutorService newThreadPoolExecutor(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        return new ExceptionLoggingThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue, new NamedThreadFactory(str));
    }
}
