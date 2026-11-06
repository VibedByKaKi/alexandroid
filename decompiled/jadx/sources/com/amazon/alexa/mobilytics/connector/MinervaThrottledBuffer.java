package com.amazon.alexa.mobilytics.connector;

import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MinervaThrottledBuffer {
    private static final String SUB_COMPONENT = "platform";
    private static final String TAG = Log.tag((Class<?>) MinervaThrottledBuffer.class);
    private static final String THROTTLED_EVENT_NAME = "throttled_event";
    private Map<String, Integer> throttledEntries = new HashMap();

    private void clear() {
        this.throttledEntries.clear();
    }

    public void addToBuffer(String str) {
        this.throttledEntries.put(str, Integer.valueOf((this.throttledEntries.containsKey(str) ? this.throttledEntries.get(str).intValue() : 0) + 1));
    }

    public List<DefaultMobilyticsMetricsCounter> flush() {
        ArrayList arrayList = new ArrayList();
        Log.d(TAG, "Minerva throttled buffer needs a flush, current size is [%d]", Integer.valueOf(size()));
        Iterator<Map.Entry<String, Integer>> it2 = this.throttledEntries.entrySet().iterator();
        while (it2.hasNext()) {
            DefaultMobilyticsMetricsCounter defaultMobilyticsMetricsCounter = new DefaultMobilyticsMetricsCounter(THROTTLED_EVENT_NAME, it2.next().getKey(), "platform", OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND);
            defaultMobilyticsMetricsCounter.incrementCounterByValue(r2.getValue().intValue());
            arrayList.add(defaultMobilyticsMetricsCounter);
        }
        clear();
        return arrayList;
    }

    public Map<String, Integer> getThrottledEntries() {
        return this.throttledEntries;
    }

    public int size() {
        return this.throttledEntries.size();
    }
}
