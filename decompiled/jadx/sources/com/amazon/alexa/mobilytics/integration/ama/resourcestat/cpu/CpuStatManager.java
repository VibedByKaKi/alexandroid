package com.amazon.alexa.mobilytics.integration.ama.resourcestat.cpu;

import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class CpuStatManager {
    private Context context;

    @Inject
    public CpuStatManager(@NonNull Context context) {
        this.context = context;
    }

    public float getCpuUtilization(CpuStat cpuStat, CpuStat cpuStat2) {
        if (cpuStat2.totalTicks - cpuStat.totalTicks <= 0 || !cpuStat2.isValid()) {
            return -1.0f;
        }
        return ((cpuStat2.totalCpuTicks - cpuStat.totalCpuTicks) / (cpuStat2.totalTicks - cpuStat.totalTicks)) * 100.0f;
    }

    public CpuStat init() {
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            return new CpuStat(0L, 0L, 0L, 0L, 0);
        }
        ArrayList newArrayList = Lists.newArrayList();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo != null && runningAppProcessInfo.processName.contains(this.context.getApplicationInfo().packageName)) {
                newArrayList.add(runningAppProcessInfo);
            }
        }
        return new CpuStat(newArrayList);
    }
}
