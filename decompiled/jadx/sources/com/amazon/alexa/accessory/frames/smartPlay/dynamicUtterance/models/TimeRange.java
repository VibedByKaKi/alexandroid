package com.amazon.alexa.accessory.frames.smartPlay.dynamicUtterance.models;

import java.time.LocalTime;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class TimeRange {
    private LocalTime endTime;
    private LocalTime startTime;

    public TimeRange(LocalTime localTime, LocalTime localTime2) {
        this.startTime = localTime;
        this.endTime = localTime2;
    }

    public boolean inTimeRange(LocalTime localTime) {
        return !localTime.isBefore(this.startTime) && localTime.isBefore(this.endTime);
    }
}
