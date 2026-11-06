package com.amazon.alexa.accessory.notificationpublisher.timers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
class ReplayTimer extends BaseTimer {
    private static final String LOGTAG = "ReplayTimer";
    private static final long REPLAY_TIMER_DURATION = 3600000;

    public ReplayTimer() {
        super(LOGTAG);
        this.durationInMillis = REPLAY_TIMER_DURATION;
        this.timerType = 3;
    }
}
