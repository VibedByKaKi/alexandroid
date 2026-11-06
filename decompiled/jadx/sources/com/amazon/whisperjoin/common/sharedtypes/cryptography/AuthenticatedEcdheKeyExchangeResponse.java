package com.amazon.whisperjoin.common.sharedtypes.cryptography;

import com.amazon.whispercloak.SecureMessage;
import java.util.Arrays;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AuthenticatedEcdheKeyExchangeResponse {
    private final byte[] mProvisionableDerPublicKey;
    private final SecureMessage mSecureMessage;

    public AuthenticatedEcdheKeyExchangeResponse(byte[] bArr, SecureMessage secureMessage) {
        this.mProvisionableDerPublicKey = Arrays.copyOf(bArr, bArr.length);
        this.mSecureMessage = secureMessage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthenticatedEcdheKeyExchangeResponse authenticatedEcdheKeyExchangeResponse = (AuthenticatedEcdheKeyExchangeResponse) obj;
        return new EqualsBuilder().append(this.mProvisionableDerPublicKey, authenticatedEcdheKeyExchangeResponse.mProvisionableDerPublicKey).append(this.mSecureMessage, authenticatedEcdheKeyExchangeResponse.mSecureMessage).isEquals();
    }

    public byte[] getProvisionableDerPublicKey() {
        byte[] bArr = this.mProvisionableDerPublicKey;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public SecureMessage getSecureMessage() {
        return this.mSecureMessage;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mProvisionableDerPublicKey).append(this.mSecureMessage).toHashCode();
    }
}
