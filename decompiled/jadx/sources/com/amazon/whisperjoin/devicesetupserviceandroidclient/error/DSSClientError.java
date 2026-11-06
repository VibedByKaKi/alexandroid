package com.amazon.whisperjoin.devicesetupserviceandroidclient.error;

import com.amazon.whisperjoin.devicesetupserviceandroidclient.DSSOperation;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DSSClientError extends Exception {
    private final Throwable mFailureCause;
    private DSSOperation mOperation;

    public DSSClientError(Throwable th, DSSOperation dSSOperation) {
        this.mFailureCause = th;
        this.mOperation = dSSOperation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DSSClientError dSSClientError = (DSSClientError) obj;
            if (Objects.equal(this.mFailureCause, dSSClientError.mFailureCause) && this.mOperation == dSSClientError.mOperation) {
                return true;
            }
        }
        return false;
    }

    public Throwable getFailureCause() {
        return this.mFailureCause;
    }

    public Long getNextRetryTimestampMs() {
        Throwable th = this.mFailureCause;
        if (th instanceof DSSServiceError) {
            return ((DSSServiceError) th).getRetryCallAfterTimestampMs();
        }
        return null;
    }

    public DSSOperation getOperation() {
        return this.mOperation;
    }

    public int hashCode() {
        return Objects.hashCode(this.mFailureCause, this.mOperation);
    }

    public boolean isUnblessedDiscovery() {
        Throwable th = this.mFailureCause;
        return (th instanceof DSSServiceError) && ((DSSServiceError) th).is403Forbidden() && DSSOperation.DISCOVERED_PROVISIONABLE_DEVICE.equals(this.mOperation);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return MoreObjects.toStringHelper(this).add("mFailureCause", this.mFailureCause).add("mOperation", this.mOperation).toString();
    }
}
