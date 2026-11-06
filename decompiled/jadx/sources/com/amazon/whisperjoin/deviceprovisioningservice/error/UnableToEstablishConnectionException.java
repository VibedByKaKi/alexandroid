package com.amazon.whisperjoin.deviceprovisioningservice.error;

import com.amazon.whisperjoin.common.sharedtypes.exceptions.ConnectionFailureException;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UnableToEstablishConnectionException extends ConnectionFailureException {
    private final Throwable mFailureCause;

    public UnableToEstablishConnectionException(Throwable th) {
        this.mFailureCause = th;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.mFailureCause, ((UnableToEstablishConnectionException) obj).mFailureCause);
    }

    public Throwable getFailureCause() {
        return this.mFailureCause;
    }

    public int hashCode() {
        return Objects.hashCode(this.mFailureCause);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return MoreObjects.toStringHelper(this).add("mFailureCause", this.mFailureCause).toString();
    }
}
