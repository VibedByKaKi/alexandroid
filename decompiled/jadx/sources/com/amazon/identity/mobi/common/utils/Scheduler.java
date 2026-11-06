package com.amazon.identity.mobi.common.utils;

import android.os.Handler;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Scheduler {
    private static final HashMap SCHEDULER_MAP = new HashMap();
    private final Handler mHandler;

    private Scheduler(String str) {
        this.mHandler = new Handler(DoubleList$$ExternalSyntheticOutline0.m(str).getLooper());
    }

    public static synchronized Scheduler getInstance(String str) {
        Scheduler scheduler;
        synchronized (Scheduler.class) {
            HashMap hashMap = SCHEDULER_MAP;
            scheduler = (Scheduler) hashMap.get(str);
            if (scheduler == null) {
                scheduler = new Scheduler(str);
                hashMap.put(str, scheduler);
            }
        }
        return scheduler;
    }

    public void scheduleJob(Runnable runnable, long j) {
        this.mHandler.postDelayed(runnable, j);
    }
}
