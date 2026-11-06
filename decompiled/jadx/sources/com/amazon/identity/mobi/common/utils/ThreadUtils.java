package com.amazon.identity.mobi.common.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ThreadUtils {
    private static Handler sMapLooperHandler;
    static final HashMap MAP_BACKGROUND_SERIAL_THREAD_POOL = new HashMap();
    private static final ExecutorService MAP_COMMON_THREAD_POOL = Executors.newCachedThreadPool(new NamedThreadFactory("MAPCommonThreadPool", 0));
    private static final Object[] LOCK = new Object[0];

    public static Handler getMapLooperHandler() {
        synchronized (LOCK) {
            try {
                Handler handler = sMapLooperHandler;
                if (handler != null) {
                    return handler;
                }
                new Thread() { // from class: com.amazon.identity.mobi.common.utils.ThreadUtils.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        Looper.prepare();
                        ThreadUtils.sMapLooperHandler = new Handler();
                        Looper.loop();
                    }
                }.start();
                return sMapLooperHandler;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static NamedThreadFactory getNamedThreadFactory(String str) {
        return new NamedThreadFactory(str, 0);
    }

    public static boolean isRunningOnMainThread() {
        return Looper.getMainLooper() != null && Looper.getMainLooper() == Looper.myLooper();
    }

    public static void runOffMainThread(Runnable runnable) {
        if (isRunningOnMainThread()) {
            submitToBackgroundThread(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static synchronized void submitToBackgroundSerialThread(String str, Runnable runnable) {
        synchronized (ThreadUtils.class) {
            try {
                HashMap hashMap = MAP_BACKGROUND_SERIAL_THREAD_POOL;
                Executor executor = (Executor) hashMap.get(str);
                if (executor == null) {
                    executor = Executors.newSingleThreadExecutor();
                    hashMap.put(str, executor);
                }
                executor.execute(runnable);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void submitToBackgroundThread(Runnable runnable) {
        MAP_COMMON_THREAD_POOL.execute(runnable);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NamedThreadFactory implements ThreadFactory {
        private final String mName;
        private final AtomicInteger mThreadNum;

        private NamedThreadFactory(String str) {
            this.mThreadNum = new AtomicInteger(1);
            this.mName = str;
        }

        public String getName() {
            return this.mName;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Locale locale = Locale.US;
            return new Thread(runnable, TableInfo$$ExternalSyntheticOutline0.m(this.mThreadNum.getAndIncrement(), this.mName, "#"));
        }

        public /* synthetic */ NamedThreadFactory(String str, int i) {
            this(str);
        }
    }
}
