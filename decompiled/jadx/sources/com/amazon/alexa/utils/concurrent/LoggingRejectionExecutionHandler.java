package com.amazon.alexa.utils.concurrent;

import android.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class LoggingRejectionExecutionHandler implements RejectedExecutionHandler {
    private static final String TAG = "LoggingRejectionExecutionHandler";

    private String getExecutorDescription(ThreadPoolExecutor threadPoolExecutor) {
        ThreadFactory threadFactory = threadPoolExecutor.getThreadFactory();
        return threadPoolExecutor.toString() + ", named: " + (threadFactory instanceof NamedThreadFactory ? ((NamedThreadFactory) threadFactory).getName() : "unknown");
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Log.e(TAG, "rejected execution of " + runnable + " on: " + getExecutorDescription(threadPoolExecutor));
    }
}
