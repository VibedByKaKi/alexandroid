package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum ExternalMediaPlayerTimerMetricEnum {
    SET_TIMER("EMP_PLAYBACK_SESSION_ENDED_TIMER_SET"),
    CANCEL_TIMER("EMP_PLAYBACK_SESSION_ENDED_TIMER_CANCELLED"),
    ELAPSED_TIMER("EMP_PLAYBACK_SESSION_ENDED_TIMER_ELAPSED");

    private final String timerEvent;

    ExternalMediaPlayerTimerMetricEnum(String str) {
        this.timerEvent = str;
    }

    public String getTimerMetric() {
        return this.timerEvent;
    }
}
