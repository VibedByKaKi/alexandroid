package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StartEcdheAuthenticationSessionRequest {
    private final String mAuthMaterialIndex;
    private final String mNonce;
    private final String mProductIndex;
    private final String mSoftwareVersionIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mAuthMaterialIndex;
        private String mNonce;
        private String mProductIndex;
        private String mSoftwareVersionIndex;

        private void validate() {
            RequestInputValidator.validateProductIndex(this.mProductIndex);
            RequestInputValidator.validateSoftwareVersionIndex(this.mSoftwareVersionIndex);
            RequestInputValidator.validateAuthMaterialIndex(this.mAuthMaterialIndex);
            RequestInputValidator.validateAdvertisementNonce(this.mNonce);
        }

        public StartEcdheAuthenticationSessionRequest createRequest() {
            validate();
            return new StartEcdheAuthenticationSessionRequest(this.mProductIndex, this.mSoftwareVersionIndex, this.mAuthMaterialIndex, this.mNonce);
        }

        public Builder setAuthMaterialIndex(String str) {
            this.mAuthMaterialIndex = str;
            return this;
        }

        public Builder setNonce(String str) {
            this.mNonce = str;
            return this;
        }

        public Builder setProductIndex(String str) {
            this.mProductIndex = str;
            return this;
        }

        public Builder setSoftwareVersionIndex(String str) {
            this.mSoftwareVersionIndex = str;
            return this;
        }
    }

    private StartEcdheAuthenticationSessionRequest(String str, String str2, String str3, String str4) {
        this.mProductIndex = str;
        this.mSoftwareVersionIndex = str2;
        this.mAuthMaterialIndex = str3;
        this.mNonce = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StartEcdheAuthenticationSessionRequest startEcdheAuthenticationSessionRequest = (StartEcdheAuthenticationSessionRequest) obj;
            if (Objects.equal(this.mProductIndex, startEcdheAuthenticationSessionRequest.mProductIndex) && Objects.equal(this.mSoftwareVersionIndex, startEcdheAuthenticationSessionRequest.mSoftwareVersionIndex) && Objects.equal(this.mAuthMaterialIndex, startEcdheAuthenticationSessionRequest.mAuthMaterialIndex) && Objects.equal(this.mNonce, startEcdheAuthenticationSessionRequest.mNonce)) {
                return true;
            }
        }
        return false;
    }

    public String getAuthMaterialIndex() {
        return this.mAuthMaterialIndex;
    }

    public String getNonce() {
        return this.mNonce;
    }

    public String getProductIndex() {
        return this.mProductIndex;
    }

    public String getSoftwareVersionIndex() {
        return this.mSoftwareVersionIndex;
    }

    public int hashCode() {
        return Objects.hashCode(this.mProductIndex, this.mSoftwareVersionIndex, this.mAuthMaterialIndex, this.mNonce);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mProductIndex", this.mProductIndex).add("mSoftwareVersionIndex", this.mSoftwareVersionIndex).add("mAuthMaterialIndex", this.mAuthMaterialIndex).add("mNonce", this.mNonce).toString();
    }
}
