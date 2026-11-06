package com.amazon.alexa.client.alexaservice.ui.conversations;

import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationServiceException;
import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ConversationsMetricEvent_GetConversationsFailureEvent extends ConversationsMetricEvent.GetConversationsFailureEvent {
    private final int errorCode;
    private final ConversationServiceException.ErrorType errorType;
    private final boolean isSingleConversation;

    public AutoValue_ConversationsMetricEvent_GetConversationsFailureEvent(int i, ConversationServiceException.ErrorType errorType, boolean z) {
        this.errorCode = i;
        if (errorType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null errorType");
            throw null;
        }
        this.errorType = errorType;
        this.isSingleConversation = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationsMetricEvent.GetConversationsFailureEvent) {
            ConversationsMetricEvent.GetConversationsFailureEvent getConversationsFailureEvent = (ConversationsMetricEvent.GetConversationsFailureEvent) obj;
            if (this.errorCode == getConversationsFailureEvent.getErrorCode() && this.errorType.equals(getConversationsFailureEvent.getErrorType()) && this.isSingleConversation == getConversationsFailureEvent.getIsSingleConversation()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent.GetConversationsFailureEvent
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent.GetConversationsFailureEvent
    public ConversationServiceException.ErrorType getErrorType() {
        return this.errorType;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent.GetConversationsFailureEvent
    public boolean getIsSingleConversation() {
        return this.isSingleConversation;
    }

    public int hashCode() {
        return (this.isSingleConversation ? 1231 : 1237) ^ ((((this.errorCode ^ 1000003) * 1000003) ^ this.errorType.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetConversationsFailureEvent{errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorType=");
        sb.append(this.errorType);
        sb.append(", isSingleConversation=");
        return a$$ExternalSyntheticOutline0.m(sb, this.isSingleConversation, StringSubstitutor.DEFAULT_VAR_END);
    }
}
