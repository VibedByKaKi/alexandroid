package com.amazonaws.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
final class TimingInfoUnmodifiable extends TimingInfo {
    public TimingInfoUnmodifiable(Long l, long j, Long l2) {
        super(l, j, l2);
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo endTiming() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setEndTime(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setEndTimeNano(long j) {
        throw new UnsupportedOperationException();
    }
}
