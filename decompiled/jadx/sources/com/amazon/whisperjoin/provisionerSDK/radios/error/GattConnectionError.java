package com.amazon.whisperjoin.provisionerSDK.radios.error;

import com.amazon.whisperjoin.common.sharedtypes.exceptions.ConnectionFailureException;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class GattConnectionError extends ConnectionFailureException {
    final int mGattStatusCode;

    public GattConnectionError(int i) {
        this.mGattStatusCode = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.mGattStatusCode == ((GattConnectionError) obj).mGattStatusCode;
    }

    public int getGattStatusCode() {
        return this.mGattStatusCode;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mGattStatusCode));
    }

    @Override // java.lang.Throwable
    public String toString() {
        return MoreObjects.toStringHelper(this).add("mGattStatusCode", this.mGattStatusCode).toString();
    }
}
