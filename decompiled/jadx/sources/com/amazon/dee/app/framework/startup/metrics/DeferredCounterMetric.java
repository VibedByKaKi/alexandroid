package com.amazon.dee.app.framework.startup.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class DeferredCounterMetric {
    private String componentName;
    private String metricName;

    public DeferredCounterMetric(@NonNull String str, @Nullable String str2) {
        this.metricName = str;
        this.componentName = str2;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public String getMetricName() {
        return this.metricName;
    }
}
