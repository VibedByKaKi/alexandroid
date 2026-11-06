package com.amazon.alexa.accessory.speechapi.speech;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ResponseCoordinationBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/DialogTurnResponseCoordinator;", "", "onReservedResponseStarted", "", "startTimestampEpochMs", "", "reserveResponse", ResponseCoordinationBundleKeys.DECISION_TIMESTAMP_EPOCH_MS, "policy", "Lcom/amazon/alexa/accessory/speechapi/speech/ResponseCoordinationPolicy;", "callbacks", "Lcom/amazon/alexa/accessory/speechapi/speech/ResponseCoordinationCallbacks;", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface DialogTurnResponseCoordinator {
    void onReservedResponseStarted(long startTimestampEpochMs);

    void reserveResponse(long decisionTimestampEpochMs, @NotNull ResponseCoordinationPolicy policy, @NotNull ResponseCoordinationCallbacks callbacks);
}
