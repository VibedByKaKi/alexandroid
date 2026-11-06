package com.amazon.alexa.client.alexaservice.eventing.events;

import android.os.Bundle;
import com.amazon.alexa.api.UiEventName;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UiEventReceivedEvent extends UiEventReceivedEvent {
    private final Bundle eventData;
    private final UiEventName uiEventName;

    public AutoValue_UiEventReceivedEvent(UiEventName uiEventName, Bundle bundle) {
        if (uiEventName == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null uiEventName");
            throw null;
        }
        this.uiEventName = uiEventName;
        if (bundle != null) {
            this.eventData = bundle;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventData");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiEventReceivedEvent) {
            UiEventReceivedEvent uiEventReceivedEvent = (UiEventReceivedEvent) obj;
            if (this.uiEventName.equals(uiEventReceivedEvent.getUiEventName()) && this.eventData.equals(uiEventReceivedEvent.getEventData())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.UiEventReceivedEvent
    public Bundle getEventData() {
        return this.eventData;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.UiEventReceivedEvent
    public UiEventName getUiEventName() {
        return this.uiEventName;
    }

    public int hashCode() {
        return this.eventData.hashCode() ^ ((this.uiEventName.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "UiEventReceivedEvent{uiEventName=" + this.uiEventName + ", eventData=" + this.eventData + StringSubstitutor.DEFAULT_VAR_END;
    }
}
