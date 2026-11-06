package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StartEcdheAuthenticationSessionResponse {
    private final String mContinuationToken;
    private final String mEcdsaSignatureBase64Encoded;
    private final String mProvisionerEcdhePublicKeyPemEncoded;

    public StartEcdheAuthenticationSessionResponse(String str, String str2, String str3) {
        this.mContinuationToken = str;
        this.mProvisionerEcdhePublicKeyPemEncoded = str2;
        this.mEcdsaSignatureBase64Encoded = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StartEcdheAuthenticationSessionResponse startEcdheAuthenticationSessionResponse = (StartEcdheAuthenticationSessionResponse) obj;
            if (Objects.equal(this.mContinuationToken, startEcdheAuthenticationSessionResponse.mContinuationToken) && Objects.equal(this.mProvisionerEcdhePublicKeyPemEncoded, startEcdheAuthenticationSessionResponse.mProvisionerEcdhePublicKeyPemEncoded) && Objects.equal(this.mEcdsaSignatureBase64Encoded, startEcdheAuthenticationSessionResponse.mEcdsaSignatureBase64Encoded)) {
                return true;
            }
        }
        return false;
    }

    public String getContinuationToken() {
        return this.mContinuationToken;
    }

    public String getEcdsaSignatureBase64Encoded() {
        return this.mEcdsaSignatureBase64Encoded;
    }

    public String getProvisionerEcdhePublicKeyPemEncoded() {
        return this.mProvisionerEcdhePublicKeyPemEncoded;
    }

    public int hashCode() {
        return Objects.hashCode(this.mContinuationToken, this.mProvisionerEcdhePublicKeyPemEncoded, this.mEcdsaSignatureBase64Encoded);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mContinuationToken", this.mContinuationToken).add("mProvisionerEcdhePublicKeyPemEncoded", this.mProvisionerEcdhePublicKeyPemEncoded).add("mEcdsaSignatureBase64Encoded", this.mEcdsaSignatureBase64Encoded).toString();
    }
}
