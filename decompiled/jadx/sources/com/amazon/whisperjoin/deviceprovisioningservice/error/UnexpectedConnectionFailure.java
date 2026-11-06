package com.amazon.whisperjoin.deviceprovisioningservice.error;

import com.amazon.whisperjoin.common.sharedtypes.exceptions.ConnectionFailureException;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UnexpectedConnectionFailure extends ConnectionFailureException {
    private final int mGattStatus;

    public UnexpectedConnectionFailure(int i) {
        this.mGattStatus = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.mGattStatus == ((UnexpectedConnectionFailure) obj).mGattStatus;
    }

    public int getGattStatus() {
        return this.mGattStatus;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mGattStatus));
    }

    @Override // java.lang.Throwable
    public String toString() {
        return MoreObjects.toStringHelper(this).add("mGattStatus", this.mGattStatus).toString();
    }
}
