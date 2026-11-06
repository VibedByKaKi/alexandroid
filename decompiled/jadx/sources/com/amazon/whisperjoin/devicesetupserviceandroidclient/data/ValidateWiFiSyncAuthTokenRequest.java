package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ValidateWiFiSyncAuthTokenRequest {
    private final String mAuthMaterialIndex;
    private final String mProductIndex;
    private final String mSessionToken;
    private final String mWifiSyncAuthToken;

    public ValidateWiFiSyncAuthTokenRequest(String str, String str2, String str3, String str4) {
        this.mWifiSyncAuthToken = str;
        this.mAuthMaterialIndex = str2;
        this.mProductIndex = str3;
        this.mSessionToken = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ValidateWiFiSyncAuthTokenRequest validateWiFiSyncAuthTokenRequest = (ValidateWiFiSyncAuthTokenRequest) obj;
            if (this.mWifiSyncAuthToken.equals(validateWiFiSyncAuthTokenRequest.mWifiSyncAuthToken) && this.mAuthMaterialIndex.equals(validateWiFiSyncAuthTokenRequest.mAuthMaterialIndex) && this.mProductIndex.equals(validateWiFiSyncAuthTokenRequest.mProductIndex) && this.mSessionToken.equals(validateWiFiSyncAuthTokenRequest.mSessionToken)) {
                return true;
            }
        }
        return false;
    }

    public String getAuthMaterialIndex() {
        return this.mAuthMaterialIndex;
    }

    public String getProductIndex() {
        return this.mProductIndex;
    }

    public String getSessionToken() {
        return this.mSessionToken;
    }

    public String getWifiSyncAuthToken() {
        return this.mWifiSyncAuthToken;
    }

    public int hashCode() {
        return Objects.hashCode(this.mWifiSyncAuthToken, this.mAuthMaterialIndex, this.mProductIndex, this.mSessionToken);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mWifiSyncAuthToken", this.mWifiSyncAuthToken).add("mAuthMaterialIndex", this.mAuthMaterialIndex).add("mProductIndex", this.mProductIndex).add("mSessionToken", this.mSessionToken).toString();
    }
}
