package com.amazon.minerva.client.thirdparty.sample;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LocalSamplingKeyGenerator {
    private static final String TAG = "MetricEventSampler";
    private static int sLocalSamplingKey = -1;
    private static int sResetSamplingKeyInSeconds = 86400;
    private static ScheduledExecutorService sScheduler;

    public static int getLocalSamplingKey() {
        if (sLocalSamplingKey == -1) {
            setLocalSamplingKey();
            scheduleUpdateSamplingKey();
        }
        return sLocalSamplingKey;
    }

    private static void scheduleUpdateSamplingKey() {
        Runnable runnable = new Runnable() { // from class: com.amazon.minerva.client.thirdparty.sample.LocalSamplingKeyGenerator.1
            @Override // java.lang.Runnable
            public void run() {
                LocalSamplingKeyGenerator.setLocalSamplingKey();
            }
        };
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        sScheduler = newSingleThreadScheduledExecutor;
        int i = sResetSamplingKeyInSeconds;
        newSingleThreadScheduledExecutor.scheduleWithFixedDelay(runnable, i, i, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setLocalSamplingKey() {
        sLocalSamplingKey = new Random().nextInt(100);
        Automotive$$ExternalSyntheticOutline0.m(TAG, sLocalSamplingKey, new StringBuilder("Set local sampling key to "));
    }
}
