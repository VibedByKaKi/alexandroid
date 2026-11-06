package com.amazon.alexa.crashreporting;

import android.os.SystemClock;
import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
abstract class CrashReportingComponent {
    private static final String TAG = "CrashReportingComponent";
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
    private final AtomicBoolean initialized = new AtomicBoolean(false);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InitializationException extends Exception {
        public InitializationException(String str, Throwable th) {
            super(str, th);
        }
    }

    public abstract String getFriendlyName();

    public final void handleCrash(Thread thread, Throwable th) {
        if (!isInitialized()) {
            Log.w(TAG, getFriendlyName() + " won't handle crash, not initialized yet.", th);
            return;
        }
        try {
            this.uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Throwable th2) {
            Log.w(TAG, "Failed to handle exception in " + getFriendlyName() + ". Gobbling it.", th2);
        }
    }

    public final synchronized void initialize() throws InitializationException {
        if (isInitialized()) {
            Log.w(TAG, getFriendlyName() + " is already initialized. Won't initialize again.");
            return;
        }
        String str = TAG;
        Log.i(str, "Starting initialization of " + getFriendlyName() + " now.");
        long uptimeMillis = SystemClock.uptimeMillis();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new CrashReportingComponent$$ExternalSyntheticLambda0());
        try {
            registerDefaultUncaughtExceptionHandler();
            this.uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            this.initialized.set(true);
            Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            Log.i(str, getFriendlyName() + " initialization succeeded. It took " + String.valueOf(SystemClock.uptimeMillis() - uptimeMillis) + " ms.");
        } finally {
        }
    }

    public boolean isInitialized() {
        return this.initialized.get();
    }

    public abstract void putMetadata(String str, String str2);

    public abstract void registerDefaultUncaughtExceptionHandler() throws InitializationException;

    public abstract void reportNonFatal(Throwable th);

    public abstract void setAccount(String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(Thread thread, Throwable th) {
    }
}
