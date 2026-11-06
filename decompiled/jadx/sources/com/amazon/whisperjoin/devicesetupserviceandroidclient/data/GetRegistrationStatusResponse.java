package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetRegistrationStatusResponse {
    private final long mDurationToWaitMillis;
    private final String mLastRegisteredTime;
    private final Status mStatus;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Status {
        NOT_REGISTERED,
        PAST_REGISTERED,
        RECENTLY_REGISTERED
    }

    public GetRegistrationStatusResponse(Status status, long j, String str) {
        this.mStatus = status;
        this.mDurationToWaitMillis = j;
        this.mLastRegisteredTime = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GetRegistrationStatusResponse getRegistrationStatusResponse = (GetRegistrationStatusResponse) obj;
            if (this.mDurationToWaitMillis == getRegistrationStatusResponse.mDurationToWaitMillis && this.mStatus == getRegistrationStatusResponse.mStatus && Objects.equal(this.mLastRegisteredTime, getRegistrationStatusResponse.mLastRegisteredTime)) {
                return true;
            }
        }
        return false;
    }

    public long getDurationToWait() {
        return this.mDurationToWaitMillis;
    }

    public String getLastRegisteredTime() {
        return this.mLastRegisteredTime;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int hashCode() {
        return Objects.hashCode(this.mStatus, Long.valueOf(this.mDurationToWaitMillis), this.mLastRegisteredTime);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mStatus", this.mStatus).add("mDurationToWait", this.mDurationToWaitMillis).add("mLastRegisteredTime", this.mLastRegisteredTime).toString();
    }
}
