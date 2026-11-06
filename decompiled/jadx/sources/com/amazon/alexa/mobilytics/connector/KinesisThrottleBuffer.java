package com.amazon.alexa.mobilytics.connector;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import com.amazon.alexa.mobilytics.util.Log;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class KinesisThrottleBuffer {
    private static final String COMPONENT = "mobilytics";
    private static final int FLUSH_CADENCE_IN_MS = 60000;
    private static final int FLUSH_OWNER_NUMBER = 3;
    private static final String SUB_COMPONENT = "platform";
    private static final String TAG = Log.tag((Class<?>) KinesisThrottleBuffer.class);
    private static final String THROTTLED_EVENT_NAME = "KinesisThrottledEvent";
    private long lastFlushTime = System.currentTimeMillis();
    private final Map<String, Integer> kinesisThrottledMap = new HashMap();

    @Inject
    public KinesisThrottleBuffer() {
    }

    private synchronized void clear() {
        this.kinesisThrottledMap.clear();
    }

    private DefaultMobilyticsOperationalEvent getAggregatedEvent(Map<String, Integer> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        DefaultMobilyticsOperationalEvent defaultMobilyticsOperationalEvent = new DefaultMobilyticsOperationalEvent(THROTTLED_EVENT_NAME, OperationalEventType.DIAGNOSTIC, "mobilytics", "platform", OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND);
        defaultMobilyticsOperationalEvent.withDebugInfo(hashMap);
        return defaultMobilyticsOperationalEvent;
    }

    public synchronized void addToBuffer(@NonNull String str) {
        try {
            this.kinesisThrottledMap.put(str, Integer.valueOf((this.kinesisThrottledMap.containsKey(str) ? this.kinesisThrottledMap.get(str).intValue() : 0) + 1));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized DefaultMobilyticsOperationalEvent flush() {
        DefaultMobilyticsOperationalEvent aggregatedEvent;
        Log.d(TAG, "Kinesis throttled buffer needs a flush, current size is [%d]", Integer.valueOf(size()));
        aggregatedEvent = getAggregatedEvent(this.kinesisThrottledMap);
        this.lastFlushTime = System.currentTimeMillis();
        clear();
        return aggregatedEvent;
    }

    public synchronized boolean flushNeeded() {
        return size() >= 3 || (((System.currentTimeMillis() - this.lastFlushTime) > 60000L ? 1 : ((System.currentTimeMillis() - this.lastFlushTime) == 60000L ? 0 : -1)) > 0);
    }

    @VisibleForTesting
    public void setLastFlushTime(long j) {
        this.lastFlushTime = j;
    }

    public synchronized int size() {
        return this.kinesisThrottledMap.size();
    }
}
