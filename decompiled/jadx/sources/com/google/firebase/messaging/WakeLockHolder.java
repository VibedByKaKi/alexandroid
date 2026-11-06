package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.stats.WakeLock;
import com.google.errorprone.annotations.RestrictedApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class WakeLockHolder {
    private static final String EXTRA_WAKEFUL_INTENT = "com.google.firebase.iid.WakeLockHolder.wakefulintent";
    static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = 60000;
    private static final Object syncObject = new Object();

    @GuardedBy("WakeLockHolder.syncObject")
    private static WakeLock wakeLock;

    @RestrictedApi(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void acquireWakeLock(Intent intent, long j) {
        synchronized (syncObject) {
            try {
                if (wakeLock != null) {
                    setAsWakefulIntent(intent, true);
                    wakeLock.acquire(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("WakeLockHolder.syncObject")
    private static void checkAndInitWakeLock(Context context) {
        if (wakeLock == null) {
            WakeLock wakeLock2 = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            wakeLock = wakeLock2;
            wakeLock2.setReferenceCounted(true);
        }
    }

    public static void completeWakefulIntent(@NonNull Intent intent) {
        synchronized (syncObject) {
            try {
                if (wakeLock != null && isWakefulIntent(intent)) {
                    setAsWakefulIntent(intent, false);
                    wakeLock.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RestrictedApi(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void initWakeLock(Context context) {
        synchronized (syncObject) {
            checkAndInitWakeLock(context);
        }
    }

    @VisibleForTesting
    public static boolean isWakefulIntent(@NonNull Intent intent) {
        return intent.getBooleanExtra(EXTRA_WAKEFUL_INTENT, false);
    }

    @RestrictedApi(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void reset() {
        synchronized (syncObject) {
            wakeLock = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    public static void sendWakefulServiceIntent(Context context, WithinAppServiceConnection withinAppServiceConnection, Intent intent) {
        synchronized (syncObject) {
            try {
                checkAndInitWakeLock(context);
                boolean isWakefulIntent = isWakefulIntent(intent);
                setAsWakefulIntent(intent, true);
                if (!isWakefulIntent) {
                    wakeLock.acquire(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
                }
                withinAppServiceConnection.sendIntent(intent).addOnCompleteListener(new GmsRpc$$ExternalSyntheticLambda0(intent, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void setAsWakefulIntent(@NonNull Intent intent, boolean z) {
        intent.putExtra(EXTRA_WAKEFUL_INTENT, z);
    }

    public static ComponentName startWakefulService(@NonNull Context context, @NonNull Intent intent) {
        synchronized (syncObject) {
            try {
                checkAndInitWakeLock(context);
                boolean isWakefulIntent = isWakefulIntent(intent);
                setAsWakefulIntent(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!isWakefulIntent) {
                    wakeLock.acquire(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
