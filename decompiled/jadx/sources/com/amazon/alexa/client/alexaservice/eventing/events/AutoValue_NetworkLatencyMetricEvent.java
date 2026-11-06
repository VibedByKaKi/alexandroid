package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_NetworkLatencyMetricEvent extends NetworkLatencyMetricEvent {
    private final String lifeCycleName;
    private final long processTimeMillis;
    private final String requestType;

    public AutoValue_NetworkLatencyMetricEvent(String str, long j, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null lifeCycleName");
            throw null;
        }
        this.lifeCycleName = str;
        this.processTimeMillis = j;
        if (str2 != null) {
            this.requestType = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null requestType");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkLatencyMetricEvent) {
            NetworkLatencyMetricEvent networkLatencyMetricEvent = (NetworkLatencyMetricEvent) obj;
            if (this.lifeCycleName.equals(networkLatencyMetricEvent.getLifeCycleName()) && this.processTimeMillis == networkLatencyMetricEvent.getProcessTimeMillis() && this.requestType.equals(networkLatencyMetricEvent.getRequestType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.NetworkLatencyMetricEvent
    public String getLifeCycleName() {
        return this.lifeCycleName;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.NetworkLatencyMetricEvent
    public long getProcessTimeMillis() {
        return this.processTimeMillis;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.NetworkLatencyMetricEvent
    public String getRequestType() {
        return this.requestType;
    }

    public int hashCode() {
        int hashCode = (this.lifeCycleName.hashCode() ^ 1000003) * 1000003;
        long j = this.processTimeMillis;
        return this.requestType.hashCode() ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkLatencyMetricEvent{lifeCycleName=");
        sb.append(this.lifeCycleName);
        sb.append(", processTimeMillis=");
        sb.append(this.processTimeMillis);
        sb.append(", requestType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.requestType, StringSubstitutor.DEFAULT_VAR_END);
    }
}
