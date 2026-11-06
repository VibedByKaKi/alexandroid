package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class CapabilityAgentInteractionEvent extends Event.NotGated {
    public static final String FAILURE = "FAILURE";
    public static final String SUCCESS = "SUCCESS";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FailureReason {
        CONNECTION_FAILURE,
        REMOTE_EXCEPTION,
        NULL_SERVICE,
        UNKNOWN
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Stage {
        PREPROCESS,
        PROCESS,
        CANCEL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class DirectiveDelivery extends CapabilityAgentInteractionEvent {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue
        public static abstract class Success extends DirectiveDelivery {
            public static Success create(Stage stage, String str, String str2, String str3, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
                return new AutoValue_CapabilityAgentInteractionEvent_DirectiveDelivery_Success(stage, str, str2, str3, dialogRequestIdentifier);
            }

            public abstract String getCapabilityAgentName();

            @Nullable
            public abstract DialogRequestIdentifier getDialogRequestIdentifier();

            public abstract String getDirectiveName();

            public abstract String getDirectiveNamespace();

            public abstract Stage getStage();

            public static Success create(Stage stage, String str, String str2, String str3) {
                return create(stage, str, str2, str3, null);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue
        public static abstract class Failure extends DirectiveDelivery {
            public static Failure create(Stage stage, FailureReason failureReason, String str, String str2, String str3, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
                return new AutoValue_CapabilityAgentInteractionEvent_DirectiveDelivery_Failure(stage, failureReason, str, str2, str3, dialogRequestIdentifier);
            }

            public abstract String getCapabilityAgentName();

            @Nullable
            public abstract DialogRequestIdentifier getDialogRequestIdentifier();

            public abstract String getDirectiveName();

            public abstract String getDirectiveNamespace();

            public abstract FailureReason getFailureReason();

            public abstract Stage getStage();

            public static Failure create(Stage stage, FailureReason failureReason, String str, String str2, String str3) {
                return create(stage, failureReason, str, str2, str3, null);
            }
        }
    }
}
