package com.amazon.alexa.location.networking.utils;

import android.app.ActivityManager;
import android.content.Context;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class AppLifecycleUtil {
    private AppLifecycleUtil() {
    }

    public static String getRunningStateMetricName(String str, boolean z) {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        m.append(z ? "_foreground" : "_background");
        return m.toString();
    }

    public static boolean isAppRunningForeground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        String packageName = context.getPackageName();
        if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (100 == runningAppProcessInfo.importance && runningAppProcessInfo.processName.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
