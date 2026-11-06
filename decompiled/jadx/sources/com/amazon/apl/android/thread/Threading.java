package com.amazon.apl.android.thread;

import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Threading {
    public static final String TAG = "Threading";
    public static final ExecutorService THREAD_POOL_EXECUTOR = createExecutorService();

    private Threading() {
    }

    private static ExecutorService createExecutorService() {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        if (executor instanceof ExecutorService) {
            return (ExecutorService) executor;
        }
        Log.e(TAG, "Falling back to unoptimised thread pool");
        return Executors.newCachedThreadPool();
    }

    public static ScheduledExecutorService createScheduledExecutor() {
        return Executors.newSingleThreadScheduledExecutor();
    }

    public static SequentialExecutor createSequentialExecutor() {
        return new SequentialExecutor(THREAD_POOL_EXECUTOR);
    }
}
