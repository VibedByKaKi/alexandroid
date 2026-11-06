package com.amazon.alexa.client.metrics.mobilytics;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MetricsConfiguration extends MetricsConfiguration {
    private final String applicationId;
    private final String serviceName;

    public AutoValue_MetricsConfiguration(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null applicationId");
            throw null;
        }
        this.applicationId = str;
        if (str2 != null) {
            this.serviceName = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null serviceName");
            throw null;
        }
    }

    @Override // com.amazon.alexa.client.metrics.mobilytics.MetricsConfiguration
    public String applicationId() {
        return this.applicationId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MetricsConfiguration) {
            MetricsConfiguration metricsConfiguration = (MetricsConfiguration) obj;
            if (this.applicationId.equals(metricsConfiguration.applicationId()) && this.serviceName.equals(metricsConfiguration.serviceName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.serviceName.hashCode() ^ ((this.applicationId.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.metrics.mobilytics.MetricsConfiguration
    public String serviceName() {
        return this.serviceName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MetricsConfiguration{applicationId=");
        sb.append(this.applicationId);
        sb.append(", serviceName=");
        return a$$ExternalSyntheticOutline0.m(sb, this.serviceName, StringSubstitutor.DEFAULT_VAR_END);
    }
}
