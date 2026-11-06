package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.AlexaMetricsName;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum DialogFailureReason implements DialogInteractionResult.Reason {
    ATTACHMENT_READ_FAILURE,
    BINDING_ERROR,
    LOCAL_SERVICE_DISCONNECTED,
    LEADER_SELECTION_ERROR,
    LEADER_DISABLED_ERROR,
    NETWORK_UNAVAILABLE,
    NETWORK_LOST,
    NETWORK_SWITCHED,
    AVS_UNAVAILABLE_MISSING,
    AVS_UNAVAILABLE_DOWNCHANNEL,
    AVS_ERROR,
    AVS_CONNECTION_TIMEOUT,
    AVS_CONNECTION_TIMEOUT_UNINITIALIZED,
    AVS_CONNECTION_TIMEOUT_UNAUTHORIZED,
    AVS_CONNECTION_TIMEOUT_NETWORK,
    AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_ESTABLISHED,
    AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_CONNECTED,
    AVS_CONNECTION_TIMEOUT_DOWNCHANNEL_AVAILABLE,
    AVS_CONNECTION_TIMEOUT_CAPABILITY_PUBLISH,
    AVS_CONNECTION_TIMEOUT_SYNCHRONIZE_STATE,
    AVS_CONNECTION_TIMEOUT_VERIFY_ALEXA_GATEWAY,
    TURN_TIMEOUT,
    NETWORK_REQUEST_ERROR,
    START_RECORDING_ERROR,
    RESPONSE_PARSING_ERROR_MULTIPART,
    RESPONSE_PARSING_ERROR,
    REQUEST_PARSING_ERROR,
    AUTHORIZATION_ERROR,
    INTERNAL_CLIENT_ERROR_CLIENT_TIMEOUT_EXCEEDED,
    INTERNAL_CLIENT_ERROR_MESSAGE_TIMEOUT_EXCEEDED,
    INTERNAL_CLIENT_ERROR_CONCURRENT_REGISTER_ATTEMPT,
    INTERNAL_CLIENT_ERROR_INCOMPLETE_INTERACTION,
    INTERNAL_CLIENT_ERROR_UNKNOWN_FAILURE,
    INTERNAL_CLIENT_ERROR_MESSAGING,
    INTERNAL_CLIENT_ERROR_CONCURRENT_WAKEWORD_VERIFICATION,
    INTERNAL_CLIENT_ERROR_WAKEWORD_VERIFICATION_BLOCKED,
    RECORDING_ERROR_AUDIO_RECORD_NOT_INITIALIZED,
    RECORDING_ERROR_FAILED_TO_START_RECORDING,
    RECORDING_ERROR_FAILED_TO_ACQUIRE_MIC,
    RECORDING_ERROR_START_TIMEOUT,
    RECORDING_ERROR_STOP_TIMEOUT,
    RECORDING_ERROR_FAILED_TO_READ_FROM_AUDIO_RECORD,
    RECORDING_ERROR_IO_EXCEPTION,
    RECORDING_ERROR_INITIALIZATION_EXCEPTION,
    RECORDING_ERROR_STOPPED_THREAD,
    CANNOT_EXPECT_SPEECH,
    CANCELLED;

    public static final Map<DialogFailureReason, AlexaMetricsName> textFailureReasonToMetricsName;
    public static final Map<DialogFailureReason, AlexaMetricsName> voiceFailureReasonToMetricsName;
    private boolean isTextDialog = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.eventing.events.DialogFailureReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$client$alexaservice$eventing$events$DialogFailureReason;

        static {
            int[] iArr = new int[DialogFailureReason.values().length];
            $SwitchMap$com$amazon$alexa$client$alexaservice$eventing$events$DialogFailureReason = iArr;
            try {
                iArr[DialogFailureReason.NETWORK_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$eventing$events$DialogFailureReason[DialogFailureReason.NETWORK_SWITCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$eventing$events$DialogFailureReason[DialogFailureReason.NETWORK_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$eventing$events$DialogFailureReason[DialogFailureReason.NETWORK_REQUEST_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        DialogFailureReason dialogFailureReason = ATTACHMENT_READ_FAILURE;
        DialogFailureReason dialogFailureReason2 = BINDING_ERROR;
        DialogFailureReason dialogFailureReason3 = LOCAL_SERVICE_DISCONNECTED;
        DialogFailureReason dialogFailureReason4 = LEADER_SELECTION_ERROR;
        DialogFailureReason dialogFailureReason5 = LEADER_DISABLED_ERROR;
        DialogFailureReason dialogFailureReason6 = NETWORK_UNAVAILABLE;
        DialogFailureReason dialogFailureReason7 = NETWORK_LOST;
        DialogFailureReason dialogFailureReason8 = NETWORK_SWITCHED;
        DialogFailureReason dialogFailureReason9 = AVS_UNAVAILABLE_MISSING;
        DialogFailureReason dialogFailureReason10 = AVS_UNAVAILABLE_DOWNCHANNEL;
        DialogFailureReason dialogFailureReason11 = AVS_ERROR;
        DialogFailureReason dialogFailureReason12 = AVS_CONNECTION_TIMEOUT;
        DialogFailureReason dialogFailureReason13 = AVS_CONNECTION_TIMEOUT_UNINITIALIZED;
        DialogFailureReason dialogFailureReason14 = AVS_CONNECTION_TIMEOUT_UNAUTHORIZED;
        DialogFailureReason dialogFailureReason15 = AVS_CONNECTION_TIMEOUT_NETWORK;
        DialogFailureReason dialogFailureReason16 = AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_ESTABLISHED;
        DialogFailureReason dialogFailureReason17 = AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_CONNECTED;
        DialogFailureReason dialogFailureReason18 = AVS_CONNECTION_TIMEOUT_DOWNCHANNEL_AVAILABLE;
        DialogFailureReason dialogFailureReason19 = AVS_CONNECTION_TIMEOUT_CAPABILITY_PUBLISH;
        DialogFailureReason dialogFailureReason20 = AVS_CONNECTION_TIMEOUT_SYNCHRONIZE_STATE;
        DialogFailureReason dialogFailureReason21 = AVS_CONNECTION_TIMEOUT_VERIFY_ALEXA_GATEWAY;
        DialogFailureReason dialogFailureReason22 = TURN_TIMEOUT;
        DialogFailureReason dialogFailureReason23 = NETWORK_REQUEST_ERROR;
        DialogFailureReason dialogFailureReason24 = START_RECORDING_ERROR;
        DialogFailureReason dialogFailureReason25 = RESPONSE_PARSING_ERROR_MULTIPART;
        DialogFailureReason dialogFailureReason26 = RESPONSE_PARSING_ERROR;
        DialogFailureReason dialogFailureReason27 = REQUEST_PARSING_ERROR;
        DialogFailureReason dialogFailureReason28 = AUTHORIZATION_ERROR;
        DialogFailureReason dialogFailureReason29 = INTERNAL_CLIENT_ERROR_CLIENT_TIMEOUT_EXCEEDED;
        DialogFailureReason dialogFailureReason30 = INTERNAL_CLIENT_ERROR_MESSAGE_TIMEOUT_EXCEEDED;
        DialogFailureReason dialogFailureReason31 = INTERNAL_CLIENT_ERROR_CONCURRENT_REGISTER_ATTEMPT;
        DialogFailureReason dialogFailureReason32 = INTERNAL_CLIENT_ERROR_INCOMPLETE_INTERACTION;
        DialogFailureReason dialogFailureReason33 = INTERNAL_CLIENT_ERROR_UNKNOWN_FAILURE;
        DialogFailureReason dialogFailureReason34 = INTERNAL_CLIENT_ERROR_MESSAGING;
        DialogFailureReason dialogFailureReason35 = INTERNAL_CLIENT_ERROR_CONCURRENT_WAKEWORD_VERIFICATION;
        DialogFailureReason dialogFailureReason36 = INTERNAL_CLIENT_ERROR_WAKEWORD_VERIFICATION_BLOCKED;
        DialogFailureReason dialogFailureReason37 = RECORDING_ERROR_AUDIO_RECORD_NOT_INITIALIZED;
        DialogFailureReason dialogFailureReason38 = RECORDING_ERROR_FAILED_TO_START_RECORDING;
        DialogFailureReason dialogFailureReason39 = RECORDING_ERROR_FAILED_TO_ACQUIRE_MIC;
        DialogFailureReason dialogFailureReason40 = RECORDING_ERROR_START_TIMEOUT;
        DialogFailureReason dialogFailureReason41 = RECORDING_ERROR_STOP_TIMEOUT;
        DialogFailureReason dialogFailureReason42 = RECORDING_ERROR_FAILED_TO_READ_FROM_AUDIO_RECORD;
        DialogFailureReason dialogFailureReason43 = RECORDING_ERROR_IO_EXCEPTION;
        DialogFailureReason dialogFailureReason44 = RECORDING_ERROR_INITIALIZATION_EXCEPTION;
        DialogFailureReason dialogFailureReason45 = RECORDING_ERROR_STOPPED_THREAD;
        DialogFailureReason dialogFailureReason46 = CANNOT_EXPECT_SPEECH;
        DialogFailureReason dialogFailureReason47 = CANCELLED;
        HashMap hashMap = new HashMap();
        voiceFailureReasonToMetricsName = hashMap;
        HashMap hashMap2 = new HashMap();
        textFailureReasonToMetricsName = hashMap2;
        hashMap.put(dialogFailureReason, AlexaMetricsName.VoiceInteraction.Failure.ATTACHMENT_READ_FAILURE);
        hashMap.put(dialogFailureReason2, AlexaMetricsName.VoiceInteraction.Failure.BINDING_ERROR);
        hashMap.put(dialogFailureReason3, AlexaMetricsName.VoiceInteraction.Failure.LOCAL_SERVICE_DISCONNECTED);
        hashMap.put(dialogFailureReason4, AlexaMetricsName.VoiceInteraction.Failure.LEADER_SELECTION_ERROR);
        hashMap.put(dialogFailureReason5, AlexaMetricsName.VoiceInteraction.Failure.LEADER_DISABLED_ERROR);
        hashMap.put(dialogFailureReason6, AlexaMetricsName.VoiceInteraction.Failure.NETWORK_UNAVAILABLE);
        hashMap.put(dialogFailureReason7, AlexaMetricsName.VoiceInteraction.Failure.NETWORK_LOST);
        hashMap.put(dialogFailureReason8, AlexaMetricsName.VoiceInteraction.Failure.NETWORK_SWITCHED);
        hashMap.put(dialogFailureReason9, AlexaMetricsName.VoiceInteraction.Failure.AVS_UNAVAILABLE_MISSING);
        hashMap.put(dialogFailureReason10, AlexaMetricsName.VoiceInteraction.Failure.AVS_UNAVAILABLE_DOWNCHANNEL);
        hashMap.put(dialogFailureReason11, AlexaMetricsName.VoiceInteraction.Failure.AVS_ERROR);
        hashMap.put(dialogFailureReason12, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT);
        hashMap.put(dialogFailureReason13, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_UNINITIALIZED);
        hashMap.put(dialogFailureReason14, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_UNAUTHORIZED);
        hashMap.put(dialogFailureReason15, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_NETWORK);
        hashMap.put(dialogFailureReason16, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_ESTABLISHED);
        hashMap.put(dialogFailureReason17, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_CONNECTED);
        hashMap.put(dialogFailureReason18, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_DOWNCHANNEL_AVAILABLE);
        hashMap.put(dialogFailureReason19, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_CAPABILITY_PUBLISH);
        hashMap.put(dialogFailureReason20, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_SYNCHRONIZE_STATE);
        hashMap.put(dialogFailureReason21, AlexaMetricsName.VoiceInteraction.Failure.AVS_CONNECTION_TIMEOUT_VERIFY_ALEXA_GATEWAY);
        hashMap.put(dialogFailureReason22, AlexaMetricsName.VoiceInteraction.Failure.TURN_TIMEOUT);
        hashMap.put(dialogFailureReason23, AlexaMetricsName.VoiceInteraction.Failure.NETWORK_REQUEST_ERROR);
        hashMap.put(dialogFailureReason24, AlexaMetricsName.VoiceInteraction.Failure.START_RECORDING_ERROR);
        hashMap.put(dialogFailureReason25, AlexaMetricsName.VoiceInteraction.Failure.RESPONSE_PARSING_ERROR_MULTIPART);
        hashMap.put(dialogFailureReason26, AlexaMetricsName.VoiceInteraction.Failure.RESPONSE_PARSING_ERROR);
        hashMap.put(dialogFailureReason27, AlexaMetricsName.VoiceInteraction.Failure.REQUEST_PARSING_ERROR);
        hashMap.put(dialogFailureReason28, AlexaMetricsName.VoiceInteraction.Failure.AUTHORIZATION_ERROR);
        hashMap.put(dialogFailureReason29, AlexaMetricsName.VoiceInteraction.Failure.INTERNAL_CLIENT_ERROR_CLIENT_TIMEOUT_EXCEEDED);
        hashMap.put(dialogFailureReason30, AlexaMetricsName.VoiceInteraction.Failure.INTERNAL_CLIENT_ERROR_MESSAGE_TIMEOUT_EXCEEDED);
        hashMap.put(dialogFailureReason31, AlexaMetricsName.VoiceInteraction.Failure.INTERNAL_CLIENT_ERROR_CONCURRENT_REGISTER_ATTEMPT);
        hashMap.put(dialogFailureReason32, AlexaMetricsName.VoiceInteraction.Failure.INTERNAL_CLIENT_ERROR_INCOMPLETE_INTERACTION);
        hashMap.put(dialogFailureReason33, AlexaMetricsName.VoiceInteraction.Failure.INTERNAL_CLIENT_ERROR_UNKNOWN_FAILURE);
        hashMap.put(dialogFailureReason34, AlexaMetricsName.VoiceInteraction.Failure.INTERNAL_CLIENT_ERROR_MESSAGING);
        hashMap.put(dialogFailureReason35, AlexaMetricsName.VoiceInteraction.Failure.INTERNAL_CLIENT_ERROR_CONCURRENT_WAKEWORD_VERIFICATION);
        hashMap.put(dialogFailureReason36, AlexaMetricsName.VoiceInteraction.Failure.INTERNAL_CLIENT_ERROR_WAKEWORD_VERIFICATION_BLOCKED);
        hashMap.put(dialogFailureReason37, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_AUDIO_RECORD_NOT_INITIALIZED);
        hashMap.put(dialogFailureReason38, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_FAILED_TO_START_RECORDING);
        hashMap.put(dialogFailureReason39, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_FAILED_TO_ACQUIRE_MIC);
        hashMap.put(dialogFailureReason40, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_START_TIMEOUT);
        hashMap.put(dialogFailureReason41, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_STOP_TIMEOUT);
        hashMap.put(dialogFailureReason43, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_IO_EXCEPTION);
        hashMap.put(dialogFailureReason44, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_INITIALIZATION_EXCEPTION);
        hashMap.put(dialogFailureReason45, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_STOPPED_THREAD);
        hashMap.put(dialogFailureReason46, AlexaMetricsName.VoiceInteraction.Failure.CANNOT_EXPECT_SPEECH);
        hashMap.put(dialogFailureReason42, AlexaMetricsName.VoiceInteraction.Failure.RECORDING_ERROR_FAILED_TO_READ_FROM_AUDIO_RECORD);
        hashMap.put(dialogFailureReason47, AlexaMetricsName.VoiceInteraction.Failure.INVOCATION_CANCELLED);
        hashMap2.put(dialogFailureReason2, AlexaMetricsName.TextInteraction.Failure.BINDING_ERROR);
        hashMap2.put(dialogFailureReason3, AlexaMetricsName.TextInteraction.Failure.LOCAL_SERVICE_DISCONNECTED);
        hashMap2.put(dialogFailureReason4, AlexaMetricsName.TextInteraction.Failure.LEADER_SELECTION_ERROR);
        hashMap2.put(dialogFailureReason5, AlexaMetricsName.TextInteraction.Failure.LEADER_DISABLED_ERROR);
        hashMap2.put(dialogFailureReason6, AlexaMetricsName.TextInteraction.Failure.NETWORK_UNAVAILABLE);
        hashMap2.put(dialogFailureReason9, AlexaMetricsName.TextInteraction.Failure.AVS_UNAVAILABLE_MISSING);
        hashMap2.put(dialogFailureReason10, AlexaMetricsName.TextInteraction.Failure.AVS_UNAVAILABLE_DOWNCHANNEL);
        hashMap2.put(dialogFailureReason11, AlexaMetricsName.TextInteraction.Failure.AVS_ERROR);
        hashMap2.put(dialogFailureReason12, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT);
        hashMap2.put(dialogFailureReason13, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_UNINITIALIZED);
        hashMap2.put(dialogFailureReason14, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_UNAUTHORIZED);
        hashMap2.put(dialogFailureReason15, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_NETWORK);
        hashMap2.put(dialogFailureReason16, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_ESTABLISHED);
        hashMap2.put(dialogFailureReason17, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_CONNECTION_NOT_CONNECTED);
        hashMap2.put(dialogFailureReason18, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_DOWNCHANNEL_AVAILABLE);
        hashMap2.put(dialogFailureReason19, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_CAPABILITY_PUBLISH);
        hashMap2.put(dialogFailureReason20, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_SYNCHRONIZE_STATE);
        hashMap2.put(dialogFailureReason22, AlexaMetricsName.TextInteraction.Failure.TURN_TIMEOUT);
        hashMap2.put(dialogFailureReason23, AlexaMetricsName.TextInteraction.Failure.NETWORK_REQUEST_ERROR);
        hashMap2.put(dialogFailureReason25, AlexaMetricsName.TextInteraction.Failure.RESPONSE_PARSING_ERROR_MULTIPART);
        hashMap2.put(dialogFailureReason26, AlexaMetricsName.TextInteraction.Failure.RESPONSE_PARSING_ERROR);
        hashMap2.put(dialogFailureReason27, AlexaMetricsName.TextInteraction.Failure.REQUEST_PARSING_ERROR);
        hashMap2.put(dialogFailureReason28, AlexaMetricsName.TextInteraction.Failure.AUTHORIZATION_ERROR);
        hashMap2.put(dialogFailureReason29, AlexaMetricsName.TextInteraction.Failure.INTERNAL_CLIENT_ERROR_CLIENT_TIMEOUT_EXCEEDED);
        hashMap2.put(dialogFailureReason30, AlexaMetricsName.TextInteraction.Failure.INTERNAL_CLIENT_ERROR_MESSAGE_TIMEOUT_EXCEEDED);
        hashMap2.put(dialogFailureReason31, AlexaMetricsName.TextInteraction.Failure.INTERNAL_CLIENT_ERROR_CONCURRENT_REGISTER_ATTEMPT);
        hashMap2.put(dialogFailureReason32, AlexaMetricsName.TextInteraction.Failure.INTERNAL_CLIENT_ERROR_INCOMPLETE_INTERACTION);
        hashMap2.put(dialogFailureReason33, AlexaMetricsName.TextInteraction.Failure.INTERNAL_CLIENT_ERROR_UNKNOWN_FAILURE);
        hashMap2.put(dialogFailureReason34, AlexaMetricsName.TextInteraction.Failure.INTERNAL_CLIENT_ERROR_MESSAGING);
        hashMap2.put(dialogFailureReason47, AlexaMetricsName.TextInteraction.Failure.INVOCATION_CANCELLED);
        hashMap2.put(dialogFailureReason, AlexaMetricsName.TextInteraction.Failure.ATTACHMENT_READ_FAILURE);
        hashMap2.put(dialogFailureReason7, AlexaMetricsName.TextInteraction.Failure.NETWORK_LOST);
        hashMap2.put(dialogFailureReason8, AlexaMetricsName.TextInteraction.Failure.NETWORK_SWITCHED);
        hashMap2.put(dialogFailureReason21, AlexaMetricsName.TextInteraction.Failure.AVS_CONNECTION_TIMEOUT_VERIFY_ALEXA_GATEWAY);
        hashMap2.put(dialogFailureReason46, AlexaMetricsName.TextInteraction.Failure.CANNOT_EXPECT_SPEECH);
        hashMap2.put(dialogFailureReason24, AlexaMetricsName.TextInteraction.Failure.START_RECORDING_ERROR);
        hashMap2.put(dialogFailureReason35, AlexaMetricsName.TextInteraction.Failure.INTERNAL_CLIENT_ERROR_CONCURRENT_WAKEWORD_VERIFICATION);
        hashMap2.put(dialogFailureReason36, AlexaMetricsName.TextInteraction.Failure.INTERNAL_CLIENT_ERROR_WAKEWORD_VERIFICATION_BLOCKED);
        hashMap2.put(dialogFailureReason37, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_AUDIO_RECORD_NOT_INITIALIZED);
        hashMap2.put(dialogFailureReason38, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_FAILED_TO_START_RECORDING);
        hashMap2.put(dialogFailureReason39, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_FAILED_TO_ACQUIRE_MIC);
        hashMap2.put(dialogFailureReason40, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_START_TIMEOUT);
        hashMap2.put(dialogFailureReason41, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_STOP_TIMEOUT);
        hashMap2.put(dialogFailureReason42, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_FAILED_TO_READ_FROM_AUDIO_RECORD);
        hashMap2.put(dialogFailureReason43, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_IO_EXCEPTION);
        hashMap2.put(dialogFailureReason44, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_INITIALIZATION_EXCEPTION);
        hashMap2.put(dialogFailureReason45, AlexaMetricsName.TextInteraction.Failure.RECORDING_ERROR_STOPPED_THREAD);
    }

    DialogFailureReason() {
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public AlexaMetricsName getMetricName() {
        return this.isTextDialog ? textFailureReasonToMetricsName.get(this) : voiceFailureReasonToMetricsName.get(this);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public DialogInteractionResult.Type getType() {
        return DialogInteractionResult.Type.FAILURE;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public boolean isNetworkFailure() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$client$alexaservice$eventing$events$DialogFailureReason[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public void setTextDialog(boolean z) {
        this.isTextDialog = z;
    }
}
