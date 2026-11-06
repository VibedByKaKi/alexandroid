package com.amazon.alexa.client.metrics.mobilytics;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class MetricsConfiguration {
    public static final MetricsConfiguration create(String str, String str2) {
        return new AutoValue_MetricsConfiguration(str, str2);
    }

    public abstract String applicationId();

    public abstract String serviceName();
}
