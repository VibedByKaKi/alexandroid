package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AlexaNextDialogTurn {
    String getDialogTurnId();

    void startTurn(@NonNull AlexaAudioSink alexaAudioSink, @NonNull AlexaDialogTurnStopCallback alexaDialogTurnStopCallback);

    void startTurn(@NonNull AlexaAudioSink alexaAudioSink, @NonNull AlexaDialogTurnStopCallback alexaDialogTurnStopCallback, @NonNull AlexaAudioMetadata alexaAudioMetadata);

    void startTurn(@NonNull AlexaAudioSink alexaAudioSink, @NonNull AlexaDialogTurnStopCallback alexaDialogTurnStopCallback, @NonNull AlexaAudioMetadata alexaAudioMetadata, @NonNull AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback);

    void startTurn(@NonNull AlexaAudioSink alexaAudioSink, @NonNull AlexaDialogTurnStopCallback alexaDialogTurnStopCallback, @NonNull AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback);
}
