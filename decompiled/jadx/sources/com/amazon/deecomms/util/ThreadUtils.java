package com.amazon.deecomms.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ThreadUtils {
    private static final Executor THREAD_POOL = Executors.newCachedThreadPool(new NamedThreadFactory("DCALThreadPool"));

    private ThreadUtils() {
    }

    public static void checkMainThread() {
        if (!isRunningOnMainThread()) {
            throw new IllegalAccessError("UI Thread should execute this.");
        }
    }

    public static void checkNotMainThread() {
        if (isRunningOnMainThread()) {
            throw new IllegalAccessError("UI Thread should not execute this.");
        }
    }

    public static boolean isRunningOnMainThread() {
        return Looper.getMainLooper() != null && Looper.getMainLooper() == Looper.myLooper();
    }

    public static void runOffMainThread(Runnable runnable) {
        if (isRunningOnMainThread()) {
            THREAD_POOL.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnBackgroundThreadAlways(Runnable runnable) {
        THREAD_POOL.execute(runnable);
    }

    public static void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
