package com.amazon.alexa.accessory.notificationpublisher.timers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class InvitationActionDelayTimer extends BaseTimer {
    private static final long ACT_DELAY_TIMER_DURATION = 5000;
    private static final String LOGTAG = "InvitationActionDelayTimer";

    public InvitationActionDelayTimer() {
        super(LOGTAG);
        this.durationInMillis = ACT_DELAY_TIMER_DURATION;
        this.timerType = 4;
    }
}
