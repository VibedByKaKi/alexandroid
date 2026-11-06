package com.amazon.whisperjoin.deviceprovisioningservice.util;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DetectEventRateExceedingThreshold {
    private final Clock mClock;
    private final long mEventsInWindowThreshold;
    private final long mMonitorWindowMs;
    private final LinkedList<Long> mTimestamps = new LinkedList<>();

    public DetectEventRateExceedingThreshold(Clock clock, long j, long j2) {
        this.mClock = clock;
        this.mMonitorWindowMs = j;
        this.mEventsInWindowThreshold = j2;
    }

    public boolean thresholdExceeded() {
        long elapsedRealtime = this.mClock.elapsedRealtime();
        long elapsedRealtime2 = this.mClock.elapsedRealtime() - this.mMonitorWindowMs;
        this.mTimestamps.addLast(Long.valueOf(elapsedRealtime));
        Iterator<Long> it2 = this.mTimestamps.iterator();
        while (it2.hasNext() && it2.next().longValue() < elapsedRealtime2) {
            it2.remove();
        }
        return ((long) this.mTimestamps.size()) > this.mEventsInWindowThreshold;
    }
}
