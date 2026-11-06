package com.amazon.whisperjoin.common.sharedtypes.cryptography;

import com.amazon.whispercloak.SecureMessage;
import java.util.Arrays;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UnauthenticatedEcdheKeyExchangeResponse {
    private final byte[] mDerPublicKey;
    private final SecureMessage mSecureMessage;

    public UnauthenticatedEcdheKeyExchangeResponse(byte[] bArr) {
        this.mDerPublicKey = Arrays.copyOf(bArr, bArr.length);
        this.mSecureMessage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnauthenticatedEcdheKeyExchangeResponse)) {
            return false;
        }
        UnauthenticatedEcdheKeyExchangeResponse unauthenticatedEcdheKeyExchangeResponse = (UnauthenticatedEcdheKeyExchangeResponse) obj;
        return new EqualsBuilder().append(this.mDerPublicKey, unauthenticatedEcdheKeyExchangeResponse.mDerPublicKey).append(this.mSecureMessage, unauthenticatedEcdheKeyExchangeResponse.mSecureMessage).isEquals();
    }

    public byte[] getDerPublicKey() {
        byte[] bArr = this.mDerPublicKey;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public SecureMessage getSecureMessage() {
        return this.mSecureMessage;
    }

    public boolean hasSecureMessage() {
        return this.mSecureMessage != null;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mDerPublicKey).append(this.mSecureMessage).toHashCode();
    }

    public UnauthenticatedEcdheKeyExchangeResponse(byte[] bArr, SecureMessage secureMessage) {
        this.mDerPublicKey = Arrays.copyOf(bArr, bArr.length);
        this.mSecureMessage = secureMessage;
    }
}
