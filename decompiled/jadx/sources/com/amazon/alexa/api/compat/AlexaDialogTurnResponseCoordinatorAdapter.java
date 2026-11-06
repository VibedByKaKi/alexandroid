package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ResponseCoordinationBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinatorAdapter;", "Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinator;", "noncompatCoordinator", "Lcom/amazon/alexa/api/AlexaDialogTurnResponseCoordinator;", "<init>", "(Lcom/amazon/alexa/api/AlexaDialogTurnResponseCoordinator;)V", "getNoncompatCoordinator", "()Lcom/amazon/alexa/api/AlexaDialogTurnResponseCoordinator;", "reserveResponse", "", ResponseCoordinationBundleKeys.DECISION_TIMESTAMP_EPOCH_MS, "", ResponseCoordinationBundleKeys.SENDER_POLICY, "Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinationPolicy;", "callbacks", "Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseReservationCallbacks;", "onReservedResponseStarted", "startTimestampEpochMs", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaDialogTurnResponseCoordinatorAdapter implements AlexaDialogTurnResponseCoordinator {

    @NotNull
    private final com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator noncompatCoordinator;

    public AlexaDialogTurnResponseCoordinatorAdapter(@NotNull com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator alexaDialogTurnResponseCoordinator) {
        alexaDialogTurnResponseCoordinator.getClass();
        this.noncompatCoordinator = alexaDialogTurnResponseCoordinator;
    }

    @NotNull
    public final com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator getNoncompatCoordinator() {
        return this.noncompatCoordinator;
    }

    @Override // com.amazon.alexa.api.compat.AlexaDialogTurnResponseCoordinator
    public void onReservedResponseStarted(long startTimestampEpochMs) {
        this.noncompatCoordinator.onReservedResponseStarted(startTimestampEpochMs);
    }

    @Override // com.amazon.alexa.api.compat.AlexaDialogTurnResponseCoordinator
    public void reserveResponse(long decisionTimestampEpochMs, @Nullable AlexaDialogTurnResponseCoordinationPolicy senderPolicy, @Nullable AlexaDialogTurnResponseReservationCallbacks callbacks) {
        com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator alexaDialogTurnResponseCoordinator = this.noncompatCoordinator;
        com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy convertToApi = AlexaDialogTurnResponseCoordinationPolicy.INSTANCE.convertToApi(senderPolicy);
        callbacks.getClass();
        alexaDialogTurnResponseCoordinator.reserveResponse(decisionTimestampEpochMs, convertToApi, new AlexaDialogTurnResponseReservationCallbacksAdapterOutgoing(callbacks));
    }
}
