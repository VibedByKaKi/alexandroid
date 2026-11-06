package com.amazon.whisperjoin.deviceprovisioningservice.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(21)
/* loaded from: classes20.dex */
public class JobInfoProvider {
    @SuppressLint({"MissingPermission"})
    public JobInfo provide(Context context, int i, Class cls, long j, long j2, long j3, boolean z, PersistableBundle persistableBundle) {
        return new JobInfo.Builder(i, new ComponentName(context, (Class<?>) cls)).setRequiredNetworkType(1).setBackoffCriteria(j3, 1).setMinimumLatency(j).setOverrideDeadline(j2).setPersisted(z).setExtras(persistableBundle).build();
    }

    public JobInfo provide(Context context, int i, Class cls, long j, long j2, long j3, boolean z) {
        return provide(context, i, cls, j, j2, j3, z, new PersistableBundle());
    }
}
