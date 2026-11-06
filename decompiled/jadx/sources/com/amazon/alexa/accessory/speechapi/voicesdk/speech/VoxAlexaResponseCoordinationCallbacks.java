package com.amazon.alexa.accessory.speechapi.voicesdk.speech;

import com.amazon.alexa.accessory.speechapi.speech.AlexaResponseCoordinationCallbacks;
import com.amazon.alexa.api.compat.AlexaDialogTurnResponseReservationCallbacks;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.ResponseCoordinationBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/speech/VoxAlexaResponseCoordinationCallbacks;", "Lcom/amazon/alexa/accessory/speechapi/speech/AlexaResponseCoordinationCallbacks;", "alexaCallbacks", "Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseReservationCallbacks;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseReservationCallbacks;)V", "onAgreed", "", ResponseCoordinationBundleKeys.DECISION_TIMESTAMP_EPOCH_MS, "", "onDisputed", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxAlexaResponseCoordinationCallbacks implements AlexaResponseCoordinationCallbacks {

    @NotNull
    private final AlexaDialogTurnResponseReservationCallbacks alexaCallbacks;

    public VoxAlexaResponseCoordinationCallbacks(@NotNull AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks) {
        alexaDialogTurnResponseReservationCallbacks.getClass();
        this.alexaCallbacks = alexaDialogTurnResponseReservationCallbacks;
    }

    @Override // com.amazon.alexa.accessory.speechapi.speech.AlexaResponseCoordinationCallbacks
    public void onAgreed(long decisionTimestampEpochMs) {
        this.alexaCallbacks.onAgreed(decisionTimestampEpochMs);
    }

    @Override // com.amazon.alexa.accessory.speechapi.speech.AlexaResponseCoordinationCallbacks
    public void onDisputed(long decisionTimestampEpochMs) {
        this.alexaCallbacks.onDisputed(decisionTimestampEpochMs);
    }
}
