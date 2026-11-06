package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ResponseCoordinationBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseReservationCallbacksAdapterV2Outgoing;", "Lcom/amazon/alexa/api/AlexaDialogTurnResponseReservationCallbacks;", "modelCallbacks", "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseReservationCallbacks;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseReservationCallbacks;)V", "getModelCallbacks", "()Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseReservationCallbacks;", "onAgreed", "", ResponseCoordinationBundleKeys.DECISION_TIMESTAMP_EPOCH_MS, "", "onDisputed", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaDialogTurnResponseReservationCallbacksAdapterV2Outgoing implements com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks {

    @NotNull
    private final com.amazon.alexa.api.compat.model.AlexaDialogTurnResponseReservationCallbacks modelCallbacks;

    public AlexaDialogTurnResponseReservationCallbacksAdapterV2Outgoing(@NotNull com.amazon.alexa.api.compat.model.AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks) {
        alexaDialogTurnResponseReservationCallbacks.getClass();
        this.modelCallbacks = alexaDialogTurnResponseReservationCallbacks;
    }

    @NotNull
    public final com.amazon.alexa.api.compat.model.AlexaDialogTurnResponseReservationCallbacks getModelCallbacks() {
        return this.modelCallbacks;
    }

    @Override // com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks
    public void onAgreed(long decisionTimestampEpochMs) {
        this.modelCallbacks.onAgreed(decisionTimestampEpochMs);
    }

    @Override // com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks
    public void onDisputed(long decisionTimestampEpochMs) {
        this.modelCallbacks.onDisputed(decisionTimestampEpochMs);
    }
}
