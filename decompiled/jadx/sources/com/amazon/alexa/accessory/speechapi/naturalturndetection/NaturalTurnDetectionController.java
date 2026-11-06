package com.amazon.alexa.accessory.speechapi.naturalturndetection;

import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionController;", "", "getState", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionState;", "muteSession", "", OperationalEventType.SESSION, "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSession;", "onSessionDenied", "reason", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionDeniedReason;", "startSession", "stopSession", "unmuteSession", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface NaturalTurnDetectionController {
    @NotNull
    NaturalTurnDetectionSessionState getState();

    void muteSession(@NotNull NaturalTurnDetectionSession session);

    void onSessionDenied(@NotNull NaturalTurnDetectionSessionDeniedReason reason);

    void startSession(@NotNull NaturalTurnDetectionSession session);

    void stopSession(@NotNull NaturalTurnDetectionSession session);

    void unmuteSession(@NotNull NaturalTurnDetectionSession session);
}
