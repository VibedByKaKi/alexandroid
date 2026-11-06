package com.amazon.alexa.accessory.notificationpublisher.timers;

import androidx.annotation.NonNull;
import java.util.TimerTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class BaseTimerTask extends TimerTask {
    private BaseTimer timer;

    public BaseTimerTask(@NonNull BaseTimer baseTimer) {
        this.timer = baseTimer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.timer.timerExpired();
    }
}
