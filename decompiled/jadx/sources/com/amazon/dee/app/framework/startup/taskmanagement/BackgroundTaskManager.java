package com.amazon.dee.app.framework.startup.taskmanagement;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class BackgroundTaskManager {
    private static final int MAX_THREADS = 10;
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public Executor getExecutor() {
        return this.executorService;
    }

    public Future<?> submitBackgroundTask(Runnable runnable) {
        return this.executorService.submit(runnable);
    }

    public <T> Future<T> submitBackgroundTask(Callable<T> callable) {
        return this.executorService.submit(callable);
    }
}
