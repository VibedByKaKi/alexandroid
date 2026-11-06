package com.amazon.alexa.mobilytics.connector;

import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import com.amazon.alexa.mobilytics.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class GuardianDisallowedBuffer {
    public static final String COMPONENT = "mobilytics";
    private static final int FLUSH_CADENCE_IN_MS = 300000;
    private static final int FLUSH_ENTRY_NUMBER = 150;
    private static final String GUARDIAN_DISALLOWED_EVENT_NAME = "GuardianDisallowed";
    private static final String SUB_COMPONENT = "platform";
    private static final String TAG = Log.tag((Class<?>) GuardianDisallowedBuffer.class);
    private Map<String, Integer> disallowedEntries = new HashMap();
    private long lastFlushTime = System.currentTimeMillis();

    private void clear() {
        this.disallowedEntries.clear();
    }

    private DefaultMobilyticsOperationalEvent getAggregatedEvent(Map<String, Integer> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        DefaultMobilyticsOperationalEvent defaultMobilyticsOperationalEvent = new DefaultMobilyticsOperationalEvent(GUARDIAN_DISALLOWED_EVENT_NAME, OperationalEventType.DIAGNOSTIC, "mobilytics", "platform", OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND);
        defaultMobilyticsOperationalEvent.withDebugInfo(hashMap);
        return defaultMobilyticsOperationalEvent;
    }

    public void addToBuffer(String str) {
        this.disallowedEntries.put(str, Integer.valueOf((this.disallowedEntries.containsKey(str) ? this.disallowedEntries.get(str).intValue() : 0) + 1));
    }

    public DefaultMobilyticsOperationalEvent flush() {
        Log.d(TAG, "Guardian disallowed buffer needs a flush, current size is [%d]", Integer.valueOf(size()));
        DefaultMobilyticsOperationalEvent aggregatedEvent = getAggregatedEvent(this.disallowedEntries);
        this.lastFlushTime = System.currentTimeMillis();
        clear();
        return aggregatedEvent;
    }

    public boolean flushNeeded() {
        return this.disallowedEntries.size() >= 150 || (((System.currentTimeMillis() - this.lastFlushTime) > 300000L ? 1 : ((System.currentTimeMillis() - this.lastFlushTime) == 300000L ? 0 : -1)) > 0);
    }

    public void setLastFlushTime(long j) {
        this.lastFlushTime = j;
    }

    public int size() {
        return this.disallowedEntries.size();
    }
}
