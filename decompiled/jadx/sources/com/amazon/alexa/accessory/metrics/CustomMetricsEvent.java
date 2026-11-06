package com.amazon.alexa.accessory.metrics;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class CustomMetricsEvent implements MetricsEvent {
    private final Map<String, Integer> counters;
    private long eventDate;
    private final String eventName;
    private final Map<String, String> strings;
    private final Map<String, Double> timers;

    public CustomMetricsEvent(MetricsEvent metricsEvent) {
        Preconditions.notNull(metricsEvent, "metricsEvent");
        this.timers = new HashMap(metricsEvent.getTimerEntries());
        this.counters = new HashMap(metricsEvent.getCounterEntries());
        this.strings = new HashMap(metricsEvent.getStringEntries());
        this.eventName = metricsEvent.getEventName();
        this.eventDate = metricsEvent.getEventDate();
    }

    @Override // com.amazon.alexa.accessory.metrics.MetricsEvent
    public Map<String, Integer> getCounterEntries() {
        return Collections.unmodifiableMap(this.counters);
    }

    @Override // com.amazon.alexa.accessory.metrics.MetricsEvent
    public long getEventDate() {
        return this.eventDate;
    }

    @Override // com.amazon.alexa.accessory.metrics.MetricsEvent
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.amazon.alexa.accessory.metrics.MetricsEvent
    public Map<String, String> getStringEntries() {
        return Collections.unmodifiableMap(this.strings);
    }

    @Override // com.amazon.alexa.accessory.metrics.MetricsEvent
    public Map<String, Double> getTimerEntries() {
        return Collections.unmodifiableMap(this.timers);
    }

    public void putCounter(String str, int i) {
        Preconditions.notEmpty(str, "key");
        this.counters.put(str, Integer.valueOf(i));
    }

    public void putString(String str, String str2) {
        Preconditions.notEmpty(str, "key");
        Preconditions.notNull(str2, "value");
        this.strings.put(str, str2);
    }

    public void putTimer(String str, double d) {
        Preconditions.notEmpty(str, "key");
        this.timers.put(str, Double.valueOf(d));
    }

    public void setEventDate(long j) {
        this.eventDate = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomMetricsEvent{timers=");
        sb.append(this.timers);
        sb.append(", counters=");
        sb.append(this.counters);
        sb.append(", strings=");
        sb.append(this.strings);
        sb.append(", eventName='");
        sb.append(this.eventName);
        sb.append("', eventDate=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.eventDate, AbstractJsonLexerKt.END_OBJ);
    }

    public CustomMetricsEvent(String str) {
        Preconditions.notEmpty(str, "eventName");
        this.eventName = str;
        this.timers = new HashMap();
        this.counters = new HashMap();
        this.strings = new HashMap();
        this.eventDate = System.currentTimeMillis();
    }
}
