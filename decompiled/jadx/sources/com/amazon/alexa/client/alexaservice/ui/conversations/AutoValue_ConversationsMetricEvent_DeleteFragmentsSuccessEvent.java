package com.amazon.alexa.client.alexaservice.ui.conversations;

import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ConversationsMetricEvent_DeleteFragmentsSuccessEvent extends ConversationsMetricEvent.DeleteFragmentsSuccessEvent {
    private final long duration;

    public AutoValue_ConversationsMetricEvent_DeleteFragmentsSuccessEvent(long j) {
        this.duration = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ConversationsMetricEvent.DeleteFragmentsSuccessEvent) && this.duration == ((ConversationsMetricEvent.DeleteFragmentsSuccessEvent) obj).getDuration();
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent.DeleteFragmentsSuccessEvent
    public long getDuration() {
        return this.duration;
    }

    public int hashCode() {
        long j = this.duration;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.duration, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("DeleteFragmentsSuccessEvent{duration="));
    }
}
