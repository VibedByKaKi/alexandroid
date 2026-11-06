package com.amazon.alexa.identity.p2a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.identity.Utils;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class P2ARecencyGate {
    private static final long NEVER_ACQUIRED_TIMESTAMP = 0;

    @VisibleForTesting
    static final String PREFS_FILE_NAME = "p2a.recency-gate";
    private final SharedPreferences sharedPreferences;
    private static final String TAG = Utils.tag(P2ARecencyGate.class);

    @VisibleForTesting
    static final long RECENCY_WINDOW_MS = 3600000;
    private static final Object LOCK = new Object();

    public P2ARecencyGate(@NonNull Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFS_FILE_NAME, 0);
    }

    @NonNull
    private static String key(@NonNull String str) {
        return a$$ExternalSyntheticOutline0.m("personId.", str);
    }

    private long readLastAcquiredTimestamp(@NonNull String str) {
        try {
            return this.sharedPreferences.getLong(key(str), 0L);
        } catch (Exception e) {
            Log.w(TAG, "Failed to read P2A recency gate timestamp, treating as never acquired", e);
            return 0L;
        }
    }

    private void writeLastAcquiredTimestamp(@NonNull String str, long j) {
        try {
            this.sharedPreferences.edit().putLong(key(str), j).apply();
        } catch (Exception e) {
            Log.w(TAG, "Failed to persist P2A recency gate timestamp, proceeding anyway", e);
        }
    }

    public void markRun(@NonNull String str, long j) {
        synchronized (LOCK) {
            writeLastAcquiredTimestamp(str, j);
        }
    }

    public boolean tryAcquireRun(@NonNull String str, long j) {
        synchronized (LOCK) {
            try {
                if (j - readLastAcquiredTimestamp(str) < RECENCY_WINDOW_MS) {
                    return false;
                }
                writeLastAcquiredTimestamp(str, j);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
