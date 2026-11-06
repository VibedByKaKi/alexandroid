package com.amazon.whisperjoin.provisioning.security;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.amazon.whisperjoin.utils.InputValidator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class KeyExchangeResponse implements Validatable {
    private final String publicKey;

    public KeyExchangeResponse(String str) {
        this.publicKey = str;
        validate();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof KeyExchangeResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyExchangeResponse)) {
            return false;
        }
        KeyExchangeResponse keyExchangeResponse = (KeyExchangeResponse) obj;
        if (!keyExchangeResponse.canEqual(this)) {
            return false;
        }
        String publicKey = getPublicKey();
        String publicKey2 = keyExchangeResponse.getPublicKey();
        return publicKey != null ? publicKey.equals(publicKey2) : publicKey2 == null;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        String publicKey = getPublicKey();
        return 59 + (publicKey == null ? 43 : publicKey.hashCode());
    }

    public String toString() {
        return "KeyExchangeResponse(publicKey=" + getPublicKey() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        if (InputValidator.isValidKeyExchangeResponse(this.publicKey)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("ECDH Public key cannot be empty. Please use InputValidator methods to validate parameters.");
    }
}
