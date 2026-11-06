package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FinalizeEcdheAuthenticationSessionResponse {
    private final byte[] mSessionKeyDEREncoded;

    public FinalizeEcdheAuthenticationSessionResponse(byte[] bArr) {
        this.mSessionKeyDEREncoded = Arrays.copyOf(bArr, bArr.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.mSessionKeyDEREncoded, ((FinalizeEcdheAuthenticationSessionResponse) obj).getSessionKeyDEREncoded());
    }

    public byte[] getSessionKeyDEREncoded() {
        return this.mSessionKeyDEREncoded;
    }

    public int hashCode() {
        return Objects.hashCode(this.mSessionKeyDEREncoded);
    }
}
