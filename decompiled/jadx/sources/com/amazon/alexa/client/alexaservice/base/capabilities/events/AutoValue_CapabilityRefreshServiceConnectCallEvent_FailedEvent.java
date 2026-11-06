package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import android.content.ComponentName;
import com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshServiceConnectCallEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CapabilityRefreshServiceConnectCallEvent_FailedEvent extends CapabilityRefreshServiceConnectCallEvent.FailedEvent {
    private final ComponentName componentName;
    private final long timeTaken;

    public AutoValue_CapabilityRefreshServiceConnectCallEvent_FailedEvent(ComponentName componentName, long j) {
        if (componentName == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null componentName");
            throw null;
        }
        this.componentName = componentName;
        this.timeTaken = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CapabilityRefreshServiceConnectCallEvent.FailedEvent) {
            CapabilityRefreshServiceConnectCallEvent.FailedEvent failedEvent = (CapabilityRefreshServiceConnectCallEvent.FailedEvent) obj;
            if (this.componentName.equals(failedEvent.getComponentName()) && this.timeTaken == failedEvent.getTimeTaken()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshServiceConnectCallEvent.FailedEvent
    public ComponentName getComponentName() {
        return this.componentName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshServiceConnectCallEvent.FailedEvent
    public long getTimeTaken() {
        return this.timeTaken;
    }

    public int hashCode() {
        int hashCode = (this.componentName.hashCode() ^ 1000003) * 1000003;
        long j = this.timeTaken;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FailedEvent{componentName=");
        sb.append(this.componentName);
        sb.append(", timeTaken=");
        return a$$ExternalSyntheticOutline0.m(this.timeTaken, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
