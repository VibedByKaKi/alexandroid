package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FinalizeEcdheAuthenticationSessionRequest {
    private final byte[] mAuthEcdheKeyExchangeResponse;
    private final String mContinuationToken;

    public FinalizeEcdheAuthenticationSessionRequest(String str, byte[] bArr) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Continuation Token can not be null");
            throw null;
        }
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Key exchange response can not be null");
            throw null;
        }
        this.mContinuationToken = str;
        this.mAuthEcdheKeyExchangeResponse = Arrays.copyOf(bArr, bArr.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FinalizeEcdheAuthenticationSessionRequest finalizeEcdheAuthenticationSessionRequest = (FinalizeEcdheAuthenticationSessionRequest) obj;
            if (Objects.equal(this.mContinuationToken, finalizeEcdheAuthenticationSessionRequest.mContinuationToken) && Objects.equal(this.mAuthEcdheKeyExchangeResponse, finalizeEcdheAuthenticationSessionRequest.mAuthEcdheKeyExchangeResponse)) {
                return true;
            }
        }
        return false;
    }

    public byte[] getAuthEcdheKeyExchangeResponse() {
        byte[] bArr = this.mAuthEcdheKeyExchangeResponse;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getContinuationToken() {
        return this.mContinuationToken;
    }

    public int hashCode() {
        return Objects.hashCode(this.mContinuationToken, this.mAuthEcdheKeyExchangeResponse);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mContinuationToken", this.mContinuationToken).add("mAuthEcdheKeyExchangeResponse", this.mAuthEcdheKeyExchangeResponse).toString();
    }
}
