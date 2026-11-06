package com.amazon.alexa.client.alexaservice.ui.conversations;

import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ConversationsMetricEvent_GetConversationsSuccessEvent extends ConversationsMetricEvent.GetConversationsSuccessEvent {
    private final long duration;
    private final boolean isSingleConversation;

    public AutoValue_ConversationsMetricEvent_GetConversationsSuccessEvent(long j, boolean z) {
        this.duration = j;
        this.isSingleConversation = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationsMetricEvent.GetConversationsSuccessEvent) {
            ConversationsMetricEvent.GetConversationsSuccessEvent getConversationsSuccessEvent = (ConversationsMetricEvent.GetConversationsSuccessEvent) obj;
            if (this.duration == getConversationsSuccessEvent.getDuration() && this.isSingleConversation == getConversationsSuccessEvent.getIsSingleConversation()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent.GetConversationsSuccessEvent
    public long getDuration() {
        return this.duration;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent.GetConversationsSuccessEvent
    public boolean getIsSingleConversation() {
        return this.isSingleConversation;
    }

    public int hashCode() {
        long j = this.duration;
        return (this.isSingleConversation ? 1231 : 1237) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetConversationsSuccessEvent{duration=");
        sb.append(this.duration);
        sb.append(", isSingleConversation=");
        return a$$ExternalSyntheticOutline0.m(sb, this.isSingleConversation, StringSubstitutor.DEFAULT_VAR_END);
    }
}
