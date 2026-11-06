package com.amazon.whisperjoin.common.sharedtypes.provisioning.events;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisioningEvent<EventType> {
    private static final String TAG = "com.amazon.whisperjoin.common.sharedtypes.provisioning.events.ProvisioningEvent";
    private final EventType mEvent;
    private final Object mEventData;

    public ProvisioningEvent(EventType eventtype, Object obj) {
        if (eventtype == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("event can not be null");
            throw null;
        }
        this.mEvent = eventtype;
        this.mEventData = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProvisioningEvent provisioningEvent = (ProvisioningEvent) obj;
        return new EqualsBuilder().append(this.mEvent, provisioningEvent.mEvent).append(this.mEventData, provisioningEvent.mEventData).isEquals();
    }

    public EventType getEvent() {
        return this.mEvent;
    }

    public <EventObject> EventObject getEventObject() {
        EventObject eventobject = (EventObject) this.mEventData;
        if (eventobject == null) {
            return null;
        }
        return eventobject;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mEvent).append(this.mEventData).toHashCode();
    }
}
