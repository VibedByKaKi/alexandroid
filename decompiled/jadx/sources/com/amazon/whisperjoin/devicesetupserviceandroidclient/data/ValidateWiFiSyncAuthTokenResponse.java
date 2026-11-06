package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ValidateWiFiSyncAuthTokenResponse {
    private final boolean mIsValidToken;

    public ValidateWiFiSyncAuthTokenResponse(boolean z) {
        this.mIsValidToken = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.mIsValidToken == ((ValidateWiFiSyncAuthTokenResponse) obj).mIsValidToken;
    }

    public boolean isValidToken() {
        return this.mIsValidToken;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mIsValidToken", this.mIsValidToken).toString();
    }
}
