package com.amazon.alexa.utils.concurrent;

import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class ExceptionLoggingScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor implements AutoCloseable {
    private final TaskExceptionLogger taskExceptionLogger;

    public ExceptionLoggingScheduledThreadPoolExecutor(int i, NamedThreadFactory namedThreadFactory) {
        this(i, namedThreadFactory, new LoggingRejectionExecutionHandler(), new TaskExceptionLogger());
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

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new NamedTaskFuture(runnable, runnableScheduledFuture, 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NamedTaskFuture<V> implements RunnableScheduledFuture<V> {
        private final RunnableScheduledFuture<V> future;
        private final Object task;

        private NamedTaskFuture(Object obj, RunnableScheduledFuture<V> runnableScheduledFuture) {
            this.task = obj;
            this.future = runnableScheduledFuture;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.future.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public V get() throws InterruptedException, ExecutionException {
            return this.future.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(@NonNull TimeUnit timeUnit) {
            return this.future.getDelay(timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.future.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.future.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return this.future.isPeriodic();
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.future.run();
        }

        public String toString() {
            return this.task.toString();
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull Delayed delayed) {
            return this.future.compareTo(delayed);
        }

        @Override // java.util.concurrent.Future
        public V get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.future.get(j, timeUnit);
        }

        public /* synthetic */ NamedTaskFuture(Object obj, RunnableScheduledFuture runnableScheduledFuture, int i) {
            this(obj, runnableScheduledFuture);
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new NamedTaskFuture(callable, runnableScheduledFuture, 0);
    }

    public ExceptionLoggingScheduledThreadPoolExecutor(int i, NamedThreadFactory namedThreadFactory, RejectedExecutionHandler rejectedExecutionHandler, TaskExceptionLogger taskExceptionLogger) {
        super(i, namedThreadFactory, rejectedExecutionHandler);
        this.taskExceptionLogger = taskExceptionLogger;
    }
}
