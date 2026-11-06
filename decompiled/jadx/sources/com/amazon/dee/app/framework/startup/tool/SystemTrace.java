package com.amazon.dee.app.framework.startup.tool;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.tracing.Trace;
import com.amazon.dee.app.core.BuildConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class SystemTrace {
    private static final String TAG = "SystemTrace";

    private SystemTrace() {
    }

    public static void beginAsyncSection(@NonNull String str) {
        if (shouldLogTrace()) {
            Log.i(TAG, "Begin Trace (Async) " + str);
            Trace.beginAsyncSection(str, str.hashCode());
        }
    }

    @SuppressLint({"UnclosedTrace"})
    public static void beginSection(@NonNull String str) {
        if (shouldLogTrace()) {
            Log.i(TAG, "Begin Trace " + str);
            Trace.beginSection(str);
        }
    }

    public static void endAsyncSection(@NonNull String str) {
        if (shouldLogTrace()) {
            Log.i(TAG, "End Trace (Async) " + str);
            Trace.endAsyncSection(str, str.hashCode());
        }
    }

    public static void endSection(@NonNull String str) {
        if (shouldLogTrace()) {
            Log.i(TAG, "End Trace " + str);
            Trace.endSection();
        }
    }

    public static boolean shouldLogTrace() {
        return BuildConfig.IS_PRE_PROD_ENVIRONMENT;
    }
}
