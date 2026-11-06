package com.amazon.bluefront.api.v2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WakewordIndices {
    private long mEndSample;
    private long mStartSample;

    public WakewordIndices(long j, long j2) {
        this.mStartSample = j;
        this.mEndSample = j2;
    }

    public long getEndSample() {
        return this.mEndSample;
    }

    public long getStartSample() {
        return this.mStartSample;
    }

    public void setEndSample(long j) {
        this.mEndSample = j;
    }

    public void setStartSample(long j) {
        this.mStartSample = j;
    }

    public WakewordIndices() {
    }
}
