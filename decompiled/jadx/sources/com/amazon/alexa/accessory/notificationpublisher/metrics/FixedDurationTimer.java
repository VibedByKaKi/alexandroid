package com.amazon.alexa.accessory.notificationpublisher.metrics;

import androidx.annotation.NonNull;
import com.dee.app.metrics.MetricsTimer;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class FixedDurationTimer implements MetricsTimer {
    private final String componentName;
    private final Map<String, Object> customEntries;
    private final long durationMs;
    private final long eventDate = System.currentTimeMillis();
    private boolean invalidated;
    private final String name;

    public FixedDurationTimer(@NonNull String str, @NonNull String str2, @NonNull Map<String, Object> map, long j) {
        this.name = str;
        this.componentName = str2;
        this.customEntries = map;
        this.durationMs = j;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public String getComponentName() {
        return this.componentName;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public Map<String, Object> getCustomEntries() {
        return this.customEntries;
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public long getElapsedTime() {
        return this.durationMs;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public long getEventDate() {
        return this.eventDate;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public String getEventName() {
        return this.name;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public void invalidateEvent() {
        this.invalidated = true;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public boolean isInvalidated() {
        return this.invalidated;
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void finishTimer(Long l) {
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void finishTimer() {
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void pauseTimer() {
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void resumeTimer() {
    }
}
