package com.amazon.alexa.client.metrics.core;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DefaultMetricsCounter extends DefaultAlexaMetricsEvent implements MetricsCounter {
    private double currentCount;

    public DefaultMetricsCounter(String str, String str2, @Nullable String str3, Map<String, Object> map) {
        super(str, str2, str3, map);
        init();
    }

    private void init() {
        this.currentCount = 0.0d;
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsCounter
    public double getCount() {
        return this.currentCount;
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsCounter
    public void incrementCounter() {
        this.currentCount += 1.0d;
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsCounter
    public void incrementCounterByValue(double d) {
        this.currentCount += d;
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsCounter
    public void restartCounter() {
        this.currentCount = 0.0d;
    }

    public DefaultMetricsCounter(String str, String str2, Map<String, Object> map) {
        this(str, str2, null, map);
    }
}
