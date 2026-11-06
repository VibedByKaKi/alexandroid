package com.amazon.alexa.accessory.notificationpublisher.timers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class ReadBackErrorTimer extends BaseTimer {
    private static final String LOGTAG = "ReadBackErrorTimer";
    private static final long READ_BACK_ERROR_TIMER_DURATION = 10000;

    public ReadBackErrorTimer() {
        super(LOGTAG);
        this.durationInMillis = READ_BACK_ERROR_TIMER_DURATION;
        this.timerType = 6;
    }
}
