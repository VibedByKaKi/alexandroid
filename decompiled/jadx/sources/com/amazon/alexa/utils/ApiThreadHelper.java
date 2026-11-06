package com.amazon.alexa.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ApiThreadHelper {
    private static Handler handler = new Handler(Looper.getMainLooper());

    private ApiThreadHelper() {
        throw new UnsupportedOperationException();
    }

    public static boolean runOnDefaultHandler(Handler handler2, Runnable runnable) {
        if (handler2.getLooper() != Looper.myLooper()) {
            return handler2.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static <T> T runOnUiThread(Callable<T> callable, long j) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        handler.post(futureTask);
        return (T) futureTask.get(j, TimeUnit.MILLISECONDS);
    }

    public static boolean runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }
}
