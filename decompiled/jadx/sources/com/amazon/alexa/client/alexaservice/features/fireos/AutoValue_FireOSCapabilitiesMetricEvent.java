package com.amazon.alexa.client.alexaservice.features.fireos;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FireOSCapabilitiesMetricEvent extends FireOSCapabilitiesMetricEvent {
    private final String directiveName;
    private final String metricName;

    public AutoValue_FireOSCapabilitiesMetricEvent(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null metricName");
            throw null;
        }
        this.metricName = str;
        if (str2 != null) {
            this.directiveName = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null directiveName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FireOSCapabilitiesMetricEvent) {
            FireOSCapabilitiesMetricEvent fireOSCapabilitiesMetricEvent = (FireOSCapabilitiesMetricEvent) obj;
            if (this.metricName.equals(fireOSCapabilitiesMetricEvent.getMetricName()) && this.directiveName.equals(fireOSCapabilitiesMetricEvent.getDirectiveName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.fireos.FireOSCapabilitiesMetricEvent
    public String getDirectiveName() {
        return this.directiveName;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.fireos.FireOSCapabilitiesMetricEvent
    public String getMetricName() {
        return this.metricName;
    }

    public int hashCode() {
        return this.directiveName.hashCode() ^ ((this.metricName.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FireOSCapabilitiesMetricEvent{metricName=");
        sb.append(this.metricName);
        sb.append(", directiveName=");
        return a$$ExternalSyntheticOutline0.m(sb, this.directiveName, StringSubstitutor.DEFAULT_VAR_END);
    }
}
