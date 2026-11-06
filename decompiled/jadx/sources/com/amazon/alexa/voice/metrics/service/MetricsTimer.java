package com.amazon.alexa.voice.metrics.service;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface MetricsTimer extends AlexaMetricsEvent {
    void finishTimer();

    void finishTimer(Long l);

    long getElapsedTime();

    void pauseTimer();

    void resumeTimer();
}
