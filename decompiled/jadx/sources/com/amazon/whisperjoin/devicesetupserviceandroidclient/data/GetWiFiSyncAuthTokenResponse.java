package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetWiFiSyncAuthTokenResponse {
    private final int mResponseCode;
    private final Long mRetryAfter;
    private final String mWiFiSyncAuthToken;

    public GetWiFiSyncAuthTokenResponse(String str, int i, Long l) {
        this.mWiFiSyncAuthToken = str;
        this.mResponseCode = i;
        this.mRetryAfter = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mWiFiSyncAuthToken.equals(((GetWiFiSyncAuthTokenResponse) obj).mWiFiSyncAuthToken);
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public Long getRetryAfter() {
        return this.mRetryAfter;
    }

    public String getWiFiSyncAuthToken() {
        return this.mWiFiSyncAuthToken;
    }

    public int hashCode() {
        return this.mWiFiSyncAuthToken.hashCode();
    }

    public boolean isSuccess() {
        return this.mResponseCode == 200;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mWiFiSyncAuthToken", this.mWiFiSyncAuthToken).add("mResponseCode", this.mResponseCode).add("mRetryAfter", this.mRetryAfter).toString();
    }

    public GetWiFiSyncAuthTokenResponse(String str) {
        this(str, 200, null);
    }
}
