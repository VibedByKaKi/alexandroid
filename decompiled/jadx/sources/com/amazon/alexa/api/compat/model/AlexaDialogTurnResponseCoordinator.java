package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ResponseCoordinationBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseCoordinator;", "", "reserveResponse", "", ResponseCoordinationBundleKeys.DECISION_TIMESTAMP_EPOCH_MS, "", ResponseCoordinationBundleKeys.SENDER_POLICY, "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseCoordinationPolicy;", "callbacks", "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseReservationCallbacks;", "onReservedResponseStarted", "startTimestampEpochMs", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaDialogTurnResponseCoordinator {
    void onReservedResponseStarted(long startTimestampEpochMs);

    void reserveResponse(long decisionTimestampEpochMs, @Nullable AlexaDialogTurnResponseCoordinationPolicy senderPolicy, @Nullable AlexaDialogTurnResponseReservationCallbacks callbacks);
}
