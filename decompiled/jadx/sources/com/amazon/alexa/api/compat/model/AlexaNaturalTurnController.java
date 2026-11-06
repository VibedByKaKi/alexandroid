package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaNaturalTurnController;", "", "getConfiguration", "Lcom/amazon/alexa/api/compat/model/NaturalTurnControllerConfiguration;", "startSession", "", OperationalEventType.SESSION, "Lcom/amazon/alexa/api/compat/model/NaturalTurnSession;", "stopSession", "muteSession", "unmuteSession", "onSessionDenied", "reason", "Lcom/amazon/alexa/api/compat/model/NaturalTurnSessionDeniedReason;", "getState", "Lcom/amazon/alexa/api/compat/model/NaturalTurnSessionState;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaNaturalTurnController {
    @NotNull
    NaturalTurnControllerConfiguration getConfiguration();

    @NotNull
    NaturalTurnSessionState getState();

    void muteSession(@NotNull NaturalTurnSession session);

    void onSessionDenied(@NotNull NaturalTurnSessionDeniedReason reason);

    void startSession(@NotNull NaturalTurnSession session);

    void stopSession(@NotNull NaturalTurnSession session);

    void unmuteSession(@NotNull NaturalTurnSession session);
}
