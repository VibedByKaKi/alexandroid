package com.amazon.alexa.client.alexaservice.ui.conversations;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationServiceException;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ConversationsMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class CardTranscriptAttemptEvent extends ConversationsMetricEvent {
        public static CardTranscriptAttemptEvent create() {
            return new AutoValue_ConversationsMetricEvent_CardTranscriptAttemptEvent();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class CardTranscriptFailureEvent extends ConversationsMetricEvent {
        public static CardTranscriptFailureEvent create(int i, ConversationServiceException.ErrorType errorType) {
            return new AutoValue_ConversationsMetricEvent_CardTranscriptFailureEvent(i, errorType);
        }

        public abstract int getErrorCode();

        public abstract ConversationServiceException.ErrorType getErrorType();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class CardTranscriptNoFragmentsFoundEvent extends ConversationsMetricEvent {
        public static CardTranscriptNoFragmentsFoundEvent create() {
            return new AutoValue_ConversationsMetricEvent_CardTranscriptNoFragmentsFoundEvent();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DeleteConversationsSuccessEvent extends ConversationsMetricEvent {
        public static DeleteConversationsSuccessEvent create(long j) {
            return new AutoValue_ConversationsMetricEvent_DeleteConversationsSuccessEvent(j);
        }

        public abstract long getDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DeleteFragmentsSuccessEvent extends ConversationsMetricEvent {
        public static DeleteFragmentsSuccessEvent create(long j) {
            return new AutoValue_ConversationsMetricEvent_DeleteFragmentsSuccessEvent(j);
        }

        public abstract long getDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class GetConversationsFailureEvent extends ConversationsMetricEvent {
        public static GetConversationsFailureEvent create(int i, ConversationServiceException.ErrorType errorType, boolean z) {
            return new AutoValue_ConversationsMetricEvent_GetConversationsFailureEvent(i, errorType, z);
        }

        public abstract int getErrorCode();

        public abstract ConversationServiceException.ErrorType getErrorType();

        public abstract boolean getIsSingleConversation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class GetConversationsSuccessEvent extends ConversationsMetricEvent {
        public static GetConversationsSuccessEvent create(long j, boolean z) {
            return new AutoValue_ConversationsMetricEvent_GetConversationsSuccessEvent(j, z);
        }

        public abstract long getDuration();

        public abstract boolean getIsSingleConversation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class GetFragmentsSuccessEvent extends ConversationsMetricEvent {
        public static GetFragmentsSuccessEvent create(long j) {
            return new AutoValue_ConversationsMetricEvent_GetFragmentsSuccessEvent(j);
        }

        public abstract long getDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DeleteConversationsFailureEvent extends ConversationsMetricEvent {
        public static DeleteConversationsFailureEvent create(int i) {
            return new AutoValue_ConversationsMetricEvent_DeleteConversationsFailureEvent(i, ConversationServiceException.ErrorType.HTTP_ERROR);
        }

        public abstract int getErrorCode();

        public abstract ConversationServiceException.ErrorType getErrorType();

        public static DeleteConversationsFailureEvent create(int i, ConversationServiceException.ErrorType errorType) {
            return new AutoValue_ConversationsMetricEvent_DeleteConversationsFailureEvent(i, errorType);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DeleteFragmentsFailureEvent extends ConversationsMetricEvent {
        public static DeleteFragmentsFailureEvent create(int i) {
            return new AutoValue_ConversationsMetricEvent_DeleteFragmentsFailureEvent(i, ConversationServiceException.ErrorType.HTTP_ERROR);
        }

        public abstract int getErrorCode();

        public abstract ConversationServiceException.ErrorType getErrorType();

        public static DeleteFragmentsFailureEvent create(int i, ConversationServiceException.ErrorType errorType) {
            return new AutoValue_ConversationsMetricEvent_DeleteFragmentsFailureEvent(i, errorType);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class GetFragmentsFailureEvent extends ConversationsMetricEvent {
        public static GetFragmentsFailureEvent create(int i) {
            return new AutoValue_ConversationsMetricEvent_GetFragmentsFailureEvent(i, ConversationServiceException.ErrorType.HTTP_ERROR);
        }

        public abstract int getErrorCode();

        public abstract ConversationServiceException.ErrorType getErrorType();

        public static GetFragmentsFailureEvent create(int i, ConversationServiceException.ErrorType errorType) {
            return new AutoValue_ConversationsMetricEvent_GetFragmentsFailureEvent(i, errorType);
        }
    }
}
