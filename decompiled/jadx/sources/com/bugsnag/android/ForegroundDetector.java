package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ForegroundDetector {
    private static final int IMPORTANCE_FOREGROUND_SERVICE = 125;

    @Nullable
    private final ActivityManager activityManager;

    public ForegroundDetector(Context context) {
        this.activityManager = ContextExtensionsKt.getActivityManagerFrom(context);
    }

    private ActivityManager.RunningAppProcessInfo getProcessInfo() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Nullable
    private ActivityManager.RunningAppProcessInfo getProcessInfoPreApi16() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = this.activityManager;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (myPid == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    @Nullable
    public Boolean isInForeground() {
        try {
            ActivityManager.RunningAppProcessInfo processInfo = getProcessInfo();
            if (processInfo != null) {
                return Boolean.valueOf(processInfo.importance <= 125);
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }
}
