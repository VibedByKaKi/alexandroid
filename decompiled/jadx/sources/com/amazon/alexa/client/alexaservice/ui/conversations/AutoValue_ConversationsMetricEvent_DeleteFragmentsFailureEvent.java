package com.amazon.alexa.client.alexaservice.ui.conversations;

import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationServiceException;
import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ConversationsMetricEvent_DeleteFragmentsFailureEvent extends ConversationsMetricEvent.DeleteFragmentsFailureEvent {
    private final int errorCode;
    private final ConversationServiceException.ErrorType errorType;

    public AutoValue_ConversationsMetricEvent_DeleteFragmentsFailureEvent(int i, ConversationServiceException.ErrorType errorType) {
        this.errorCode = i;
        if (errorType != null) {
            this.errorType = errorType;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null errorType");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationsMetricEvent.DeleteFragmentsFailureEvent) {
            ConversationsMetricEvent.DeleteFragmentsFailureEvent deleteFragmentsFailureEvent = (ConversationsMetricEvent.DeleteFragmentsFailureEvent) obj;
            if (this.errorCode == deleteFragmentsFailureEvent.getErrorCode() && this.errorType.equals(deleteFragmentsFailureEvent.getErrorType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent.DeleteFragmentsFailureEvent
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent.DeleteFragmentsFailureEvent
    public ConversationServiceException.ErrorType getErrorType() {
        return this.errorType;
    }

    public int hashCode() {
        return this.errorType.hashCode() ^ ((this.errorCode ^ 1000003) * 1000003);
    }

    public String toString() {
        return "DeleteFragmentsFailureEvent{errorCode=" + this.errorCode + ", errorType=" + this.errorType + StringSubstitutor.DEFAULT_VAR_END;
    }
}
