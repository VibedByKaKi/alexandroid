package com.amazon.alexa.accessory.notificationpublisher.timers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
class ActiveWindowTimer extends BaseTimer {
    private static final long ACTIVE_WINDOW_TIMER_DURATION = 300000;
    private static final String LOGTAG = "ActiveWindowTimer";

    public ActiveWindowTimer() {
        super(LOGTAG);
        this.durationInMillis = ACTIVE_WINDOW_TIMER_DURATION;
        this.timerType = 2;
    }
}
