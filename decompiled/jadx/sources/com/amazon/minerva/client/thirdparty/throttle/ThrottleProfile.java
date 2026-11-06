package com.amazon.minerva.client.thirdparty.throttle;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ThrottleProfile {
    private double mCredit;
    private long mTimestampInMillis;

    public ThrottleProfile(long j, double d) {
        setTimestamp(j);
        setCredit(d);
    }

    public double getCredit() {
        return this.mCredit;
    }

    public long getTimestamp() {
        return this.mTimestampInMillis;
    }

    public void setCredit(double d) {
        if (d >= 0.0d) {
            this.mCredit = d;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Credit is invalid!");
        }
    }

    public void setTimestamp(long j) {
        this.mTimestampInMillis = j;
    }
}
