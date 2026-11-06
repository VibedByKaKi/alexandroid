package com.amazon.whisperjoin.deviceprovisioningservice.error;

import com.google.common.base.MoreObjects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CustomerNotLoggedInError extends PreconditionFailureException {
    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return MoreObjects.toStringHelper(this).toString();
    }
}
