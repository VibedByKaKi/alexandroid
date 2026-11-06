package com.amazon.alexa.client.alexaservice.audio.core;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SpeechPlayerEventListener {
    void onBuffering(SpeechItem speechItem);

    void onError(SpeechItem speechItem, Exception exc);

    void onSpeechFinished(SpeechItem speechItem);

    void onSpeechStarted(SpeechItem speechItem, long j);

    void onSpeechStarting(SpeechItem speechItem);

    void onSpeechStopped(SpeechItem speechItem);
}
