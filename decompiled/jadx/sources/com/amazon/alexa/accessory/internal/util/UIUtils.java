package com.amazon.alexa.accessory.internal.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class UIUtils {
    private static final Handler handler = new Handler(Looper.getMainLooper());

    private UIUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> T execute(Callable<T> callable) throws Exception {
        Preconditions.notNull(callable, "callable");
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        handler.post(futureTask);
        return (T) futureTask.get();
    }

    public static void schedule(Runnable runnable) {
        Preconditions.notNull(runnable, "runnable");
        handler.post(runnable);
    }
}
