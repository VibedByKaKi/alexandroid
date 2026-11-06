package com.amazon.dee.app.framework.startup.taskmanagement;

import android.util.Log;
import com.amazon.dee.app.framework.startup.metrics.DeferredTimerMetric;
import com.amazon.dee.app.framework.startup.metrics.StartupMetric;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class StartupCallable implements Callable<DeferredTimerMetric> {
    private static final String TAG = "StartupCallable";
    StartupRunnable runnable;

    private StartupCallable(StartupRunnable startupRunnable) {
        this.runnable = startupRunnable;
    }

    public static StartupCallable from(StartupRunnable startupRunnable) {
        return new StartupCallable(startupRunnable);
    }

    private void setThreadName(Thread thread, String str) {
        try {
            thread.setName(str);
        } catch (SecurityException e) {
            Log.e(TAG, "Error while changing Thread name", e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public DeferredTimerMetric call() throws Exception {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        setThreadName(currentThread, this.runnable.getComponentName());
        long currentTimeMillis = System.currentTimeMillis();
        this.runnable.run();
        long currentTimeMillis2 = System.currentTimeMillis();
        setThreadName(currentThread, name);
        return new DeferredTimerMetric(StartupMetric.DEPENDENCY_INIT_TIME, this.runnable.getComponentName(), currentTimeMillis, currentTimeMillis2);
    }
}
