package com.amazon.alexa.client.metrics.core;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DefaultAlexaMetricsEvent implements AlexaMetricsEvent {
    private final String componentName;
    public final Map<String, Object> customEntries;
    private final long eventDate;
    private final String eventName;
    private boolean invalidated;
    private final String serviceName;

    public DefaultAlexaMetricsEvent(String str, String str2, @Nullable String str3, Map<String, Object> map) {
        this.invalidated = false;
        this.eventName = str;
        this.componentName = str2;
        this.serviceName = str3;
        map = map == null ? new HashMap<>() : map;
        this.customEntries = map;
        Object obj = map.get("EventTimestamp");
        if (obj == null || !(obj instanceof Number)) {
            this.eventDate = System.currentTimeMillis();
        } else {
            this.eventDate = ((Number) obj).longValue();
            map.remove("EventTimestamp");
        }
    }

    @Override // com.amazon.alexa.client.metrics.core.AlexaMetricsEvent
    public String getComponentName() {
        return this.componentName;
    }

    @Override // com.amazon.alexa.client.metrics.core.AlexaMetricsEvent
    public Map<String, Object> getCustomEntries() {
        return this.customEntries;
    }

    @Override // com.amazon.alexa.client.metrics.core.AlexaMetricsEvent
    public long getEventDate() {
        return this.eventDate;
    }

    @Override // com.amazon.alexa.client.metrics.core.AlexaMetricsEvent
    public String getEventName() {
        return this.eventName;
    }

    @Nullable
    public String getServiceName() {
        return this.serviceName;
    }

    @Override // com.amazon.alexa.client.metrics.core.AlexaMetricsEvent
    public void invalidateEvent() {
        this.invalidated = true;
    }

    @Override // com.amazon.alexa.client.metrics.core.AlexaMetricsEvent
    public boolean isInvalidated() {
        return this.invalidated;
    }

    public DefaultAlexaMetricsEvent(String str, String str2, Map<String, Object> map) {
        this(str, str2, null, map);
    }
}
