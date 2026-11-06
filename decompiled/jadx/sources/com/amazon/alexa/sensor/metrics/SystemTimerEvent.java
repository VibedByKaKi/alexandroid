package com.amazon.alexa.sensor.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.sensor.api.metrics.events.TimerEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SystemTimerEvent extends TimerEvent {
    private long startTime;

    public SystemTimerEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        super(str, str2, str3);
        this.startTime = -1L;
    }

    @Override // com.amazon.alexa.sensor.api.metrics.events.TimerEvent
    public void startTimer() {
        this.startTime = System.currentTimeMillis();
    }

    @Override // com.amazon.alexa.sensor.api.metrics.events.TimerEvent
    public void stopTimer() {
        if (this.startTime < 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.startTime;
        this.elapsedTime = currentTimeMillis > j ? currentTimeMillis - j : 0L;
        this.startTime = -1L;
    }
}
