package com.amazon.whisperjoin.deviceprovisioningservice.arcus;

import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ArcusSyncThrottled extends Exception {
    private final long mWaitTime;

    public ArcusSyncThrottled(long j) {
        this.mWaitTime = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcusSyncThrottled) && this.mWaitTime == ((ArcusSyncThrottled) obj).mWaitTime;
    }

    public long getWaitTime() {
        return this.mWaitTime;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.mWaitTime));
    }
}
