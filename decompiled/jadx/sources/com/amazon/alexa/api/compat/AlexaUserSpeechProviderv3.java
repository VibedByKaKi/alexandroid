package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ResponseCoordinationBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaUserSpeechProviderv3;", "Lcom/amazon/alexa/api/compat/AlexaUserSpeechProviderv2;", "onDialogTurnResponsePending", "", "dialogTurnData", "Lcom/amazon/alexa/api/compat/DialogTurnData;", "coordinator", "Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinator;", "onDialogTurnReserveResponse", ResponseCoordinationBundleKeys.DECISION_TIMESTAMP_EPOCH_MS, "", ResponseCoordinationBundleKeys.COORDINATION_POLICY, "Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinationPolicy;", "callbacks", "Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseReservationCallbacks;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaUserSpeechProviderv3 extends AlexaUserSpeechProviderv2 {
    void onDialogTurnReserveResponse(@NotNull DialogTurnData dialogTurnData, long decisionTimestampEpochMs, @NotNull AlexaDialogTurnResponseCoordinationPolicy coordinationPolicy, @NotNull AlexaDialogTurnResponseReservationCallbacks callbacks);

    void onDialogTurnResponsePending(@NotNull DialogTurnData dialogTurnData, @NotNull AlexaDialogTurnResponseCoordinator coordinator);
}
