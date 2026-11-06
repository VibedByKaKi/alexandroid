package com.amazon.devicesetup.provisioning.data.crypto;

import com.amazon.devicesetup.utility.SecureMessage;
import java.util.Arrays;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UnauthenticatedEcdheKeyExchangeResponse {
    private final byte[] derPublicKey;
    private final SecureMessage secureMessage;

    public UnauthenticatedEcdheKeyExchangeResponse(byte[] bArr) {
        this.derPublicKey = Arrays.copyOf(bArr, bArr.length);
        this.secureMessage = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnauthenticatedEcdheKeyExchangeResponse)) {
            return false;
        }
        UnauthenticatedEcdheKeyExchangeResponse unauthenticatedEcdheKeyExchangeResponse = (UnauthenticatedEcdheKeyExchangeResponse) obj;
        return new EqualsBuilder().append(this.derPublicKey, unauthenticatedEcdheKeyExchangeResponse.derPublicKey).append(this.secureMessage, unauthenticatedEcdheKeyExchangeResponse.secureMessage).isEquals();
    }

    public byte[] getDerPublicKey() {
        byte[] bArr = this.derPublicKey;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public SecureMessage getSecureMessage() {
        return this.secureMessage;
    }

    public boolean hasSecureMessage() {
        return this.secureMessage != null;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.derPublicKey).append(this.secureMessage).toHashCode();
    }

    public UnauthenticatedEcdheKeyExchangeResponse(byte[] bArr, SecureMessage secureMessage) {
        this.derPublicKey = Arrays.copyOf(bArr, bArr.length);
        this.secureMessage = secureMessage;
    }
}
