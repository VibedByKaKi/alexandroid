package com.amazon.deecomms.services.metrics;

import androidx.annotation.VisibleForTesting;
import com.dee.app.metrics.AlexaMetricsEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultAlexaMetricsEvent implements AlexaMetricsEvent {
    private final String componentName;
    private final Map<String, Object> customEntries;
    private final long eventDate;
    private final String eventName;
    private boolean invalidated;

    @VisibleForTesting
    final int priority;

    public DefaultAlexaMetricsEvent(String str, String str2, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        this.customEntries = hashMap;
        this.invalidated = false;
        this.eventName = str;
        this.componentName = str2;
        if (map != null) {
            hashMap.putAll(map);
        }
        this.priority = 0;
        this.eventDate = System.currentTimeMillis();
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public String getComponentName() {
        return this.componentName;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public Map<String, Object> getCustomEntries() {
        return this.customEntries;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public long getEventDate() {
        return this.eventDate;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public void invalidateEvent() {
        this.invalidated = true;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public boolean isInvalidated() {
        return this.invalidated;
    }
}
