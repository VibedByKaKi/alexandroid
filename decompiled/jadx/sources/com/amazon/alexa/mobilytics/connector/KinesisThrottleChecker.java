package com.amazon.alexa.mobilytics.connector;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.configuration.ConfigManager;
import com.amazon.alexa.mobilytics.util.Log;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class KinesisThrottleChecker {
    private static final String TAG = "KinesisThrottle";
    private final ConfigManager configManager;
    private final Map<String, ThrottleEntry> throttleMap = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThrottleEntry {
        double credit;
        long lastUpdateTime;

        public ThrottleEntry(long j, double d) {
            this.lastUpdateTime = j;
            this.credit = d;
        }
    }

    @Inject
    public KinesisThrottleChecker(@NonNull ConfigManager configManager) {
        this.configManager = (ConfigManager) Preconditions.checkNotNull(configManager);
    }

    private double updateCredit(long j, long j2, double d, int i, int i2) {
        double d2 = i == 0 ? 0.0d : 3600.0d / i;
        return Math.min(d + (d2 != 0.0d ? (j - j2) / d2 : 0.0d), i2);
    }

    public boolean shouldThrottle(String str) {
        KinesisThrottleChecker kinesisThrottleChecker;
        Throwable th;
        KinesisThrottleChecker kinesisThrottleChecker2;
        synchronized (this) {
            try {
                try {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ConfigManager configManager = this.configManager;
                    if (configManager == null || configManager.throttleConfig() == null) {
                        return false;
                    }
                    int initThrottleCredit = this.configManager.throttleConfig().initThrottleCredit();
                    int maxThrottleCredit = this.configManager.throttleConfig().maxThrottleCredit();
                    int throttleCreditPerHour = this.configManager.throttleConfig().throttleCreditPerHour();
                    if (initThrottleCredit <= 0 || maxThrottleCredit <= 0 || throttleCreditPerHour <= 0) {
                        return false;
                    }
                    ThrottleEntry throttleEntry = this.throttleMap.get(str);
                    if (throttleEntry == null) {
                        try {
                            throttleEntry = new ThrottleEntry(currentTimeMillis, initThrottleCredit);
                            this.throttleMap.put(str, throttleEntry);
                            Log.d(TAG, "Created new ThrottleEntry: " + str);
                        } catch (Throwable th2) {
                            th = th2;
                            kinesisThrottleChecker = this;
                            throw th;
                        }
                    }
                    long j = throttleEntry.lastUpdateTime;
                    if (currentTimeMillis > j) {
                        kinesisThrottleChecker2 = this;
                        throttleEntry.credit = kinesisThrottleChecker2.updateCredit(currentTimeMillis, j, throttleEntry.credit, throttleCreditPerHour, maxThrottleCredit);
                        throttleEntry.lastUpdateTime = currentTimeMillis;
                    } else {
                        kinesisThrottleChecker2 = this;
                    }
                    double d = throttleEntry.credit;
                    if (d <= 1.0d) {
                        return true;
                    }
                    throttleEntry.credit = d - 1.0d;
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                kinesisThrottleChecker = this;
                th = th;
                throw th;
            }
        }
    }
}
