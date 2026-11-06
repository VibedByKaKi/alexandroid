package com.amazon.alexa.utils.concurrent;

import com.amazon.alexa.client.annotations.Nullable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class ExceptionLoggingThreadPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    private final TaskExceptionLogger taskExceptionLogger;

    public ExceptionLoggingThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, NamedThreadFactory namedThreadFactory) {
        this(i, i2, j, timeUnit, blockingQueue, namedThreadFactory, new LoggingRejectionExecutionHandler(), new TaskExceptionLogger());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, @Nullable Throwable th) {
        super.afterExecute(runnable, th);
        this.taskExceptionLogger.logExceptions(runnable, th);
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

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new utilszZm(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new utilszZm(callable);
    }

    public ExceptionLoggingThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, NamedThreadFactory namedThreadFactory, LoggingRejectionExecutionHandler loggingRejectionExecutionHandler, TaskExceptionLogger taskExceptionLogger) {
        super(i, i2, j, timeUnit, blockingQueue, namedThreadFactory, loggingRejectionExecutionHandler);
        this.taskExceptionLogger = taskExceptionLogger;
    }
}
