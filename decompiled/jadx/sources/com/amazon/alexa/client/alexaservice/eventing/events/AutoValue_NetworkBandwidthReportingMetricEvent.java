package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_NetworkBandwidthReportingMetricEvent extends NetworkBandwidthReportingMetricEvent {
    private final int networkUpstreamBandwidthKbps;

    public AutoValue_NetworkBandwidthReportingMetricEvent(int i) {
        this.networkUpstreamBandwidthKbps = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof NetworkBandwidthReportingMetricEvent) && this.networkUpstreamBandwidthKbps == ((NetworkBandwidthReportingMetricEvent) obj).getNetworkUpstreamBandwidthKbps();
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.NetworkBandwidthReportingMetricEvent
    public int getNetworkUpstreamBandwidthKbps() {
        return this.networkUpstreamBandwidthKbps;
    }

    public int hashCode() {
        return this.networkUpstreamBandwidthKbps ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("NetworkBandwidthReportingMetricEvent{networkUpstreamBandwidthKbps="), this.networkUpstreamBandwidthKbps, StringSubstitutor.DEFAULT_VAR_END);
    }
}
