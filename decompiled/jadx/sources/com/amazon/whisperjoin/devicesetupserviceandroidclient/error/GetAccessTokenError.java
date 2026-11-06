package com.amazon.whisperjoin.devicesetupserviceandroidclient.error;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetAccessTokenError extends Exception {
    private final int mErrorCode;

    public GetAccessTokenError(int i) {
        this.mErrorCode = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.mErrorCode == ((GetAccessTokenError) obj).mErrorCode;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mErrorCode));
    }

    @Override // java.lang.Throwable
    public String toString() {
        return MoreObjects.toStringHelper(this).add("mErrorCode", this.mErrorCode).toString();
    }
}
