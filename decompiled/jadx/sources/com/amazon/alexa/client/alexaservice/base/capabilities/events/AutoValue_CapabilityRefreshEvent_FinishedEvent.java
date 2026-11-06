package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent;
import com.amazon.alexa.client.core.capabilities.Capability;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CapabilityRefreshEvent_FinishedEvent extends CapabilityRefreshEvent.FinishedEvent {
    private final boolean areCapabilityAgentsInternal;
    private final boolean getCapabilitiesWereUpdated;
    private final int getCountOfCapabilityAgentsResponded;
    private final int getCountOfCapabilityAgentsToContact;
    private final long getTimeToRefreshCapabilitiesMs;
    private final Set<Capability> getUpdatedCapabilities;

    public AutoValue_CapabilityRefreshEvent_FinishedEvent(boolean z, boolean z2, Set<Capability> set, long j, int i, int i2) {
        this.getCapabilitiesWereUpdated = z;
        this.areCapabilityAgentsInternal = z2;
        if (set == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getUpdatedCapabilities");
            throw null;
        }
        this.getUpdatedCapabilities = set;
        this.getTimeToRefreshCapabilitiesMs = j;
        this.getCountOfCapabilityAgentsToContact = i;
        this.getCountOfCapabilityAgentsResponded = i2;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent.FinishedEvent
    public boolean areCapabilityAgentsInternal() {
        return this.areCapabilityAgentsInternal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CapabilityRefreshEvent.FinishedEvent) {
            CapabilityRefreshEvent.FinishedEvent finishedEvent = (CapabilityRefreshEvent.FinishedEvent) obj;
            if (this.getCapabilitiesWereUpdated == finishedEvent.getCapabilitiesWereUpdated() && this.areCapabilityAgentsInternal == finishedEvent.areCapabilityAgentsInternal() && this.getUpdatedCapabilities.equals(finishedEvent.getUpdatedCapabilities()) && this.getTimeToRefreshCapabilitiesMs == finishedEvent.getTimeToRefreshCapabilitiesMs() && this.getCountOfCapabilityAgentsToContact == finishedEvent.getCountOfCapabilityAgentsToContact() && this.getCountOfCapabilityAgentsResponded == finishedEvent.getCountOfCapabilityAgentsResponded()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent.FinishedEvent
    public boolean getCapabilitiesWereUpdated() {
        return this.getCapabilitiesWereUpdated;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent.FinishedEvent
    public int getCountOfCapabilityAgentsResponded() {
        return this.getCountOfCapabilityAgentsResponded;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent.FinishedEvent
    public int getCountOfCapabilityAgentsToContact() {
        return this.getCountOfCapabilityAgentsToContact;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent.FinishedEvent
    public long getTimeToRefreshCapabilitiesMs() {
        return this.getTimeToRefreshCapabilitiesMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent.FinishedEvent
    public Set<Capability> getUpdatedCapabilities() {
        return this.getUpdatedCapabilities;
    }

    public int hashCode() {
        int hashCode = ((((((this.getCapabilitiesWereUpdated ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.areCapabilityAgentsInternal ? 1231 : 1237)) * 1000003) ^ this.getUpdatedCapabilities.hashCode()) * 1000003;
        long j = this.getTimeToRefreshCapabilitiesMs;
        return this.getCountOfCapabilityAgentsResponded ^ ((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.getCountOfCapabilityAgentsToContact) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FinishedEvent{getCapabilitiesWereUpdated=");
        sb.append(this.getCapabilitiesWereUpdated);
        sb.append(", areCapabilityAgentsInternal=");
        sb.append(this.areCapabilityAgentsInternal);
        sb.append(", getUpdatedCapabilities=");
        sb.append(this.getUpdatedCapabilities);
        sb.append(", getTimeToRefreshCapabilitiesMs=");
        sb.append(this.getTimeToRefreshCapabilitiesMs);
        sb.append(", getCountOfCapabilityAgentsToContact=");
        sb.append(this.getCountOfCapabilityAgentsToContact);
        sb.append(", getCountOfCapabilityAgentsResponded=");
        return a$$ExternalSyntheticOutline0.m(sb, this.getCountOfCapabilityAgentsResponded, StringSubstitutor.DEFAULT_VAR_END);
    }
}
