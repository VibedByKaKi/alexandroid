package com.amazon.whisperjoin.provisioning.security;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.amazon.whisperjoin.utils.InputValidator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class KeyExchangeRequest implements Validatable {
    private final String publicKey;
    private final int scheme;

    public KeyExchangeRequest(String str, int i) {
        this.publicKey = str;
        this.scheme = i;
        validate();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof KeyExchangeRequest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyExchangeRequest)) {
            return false;
        }
        KeyExchangeRequest keyExchangeRequest = (KeyExchangeRequest) obj;
        if (!keyExchangeRequest.canEqual(this) || getScheme() != keyExchangeRequest.getScheme()) {
            return false;
        }
        String publicKey = getPublicKey();
        String publicKey2 = keyExchangeRequest.getPublicKey();
        return publicKey != null ? publicKey.equals(publicKey2) : publicKey2 == null;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public int getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        int scheme = getScheme() + 59;
        String publicKey = getPublicKey();
        return (scheme * 59) + (publicKey == null ? 43 : publicKey.hashCode());
    }

    public String toString() {
        return "KeyExchangeRequest(publicKey=" + getPublicKey() + ", scheme=" + getScheme() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        if (InputValidator.isValidKeyExchangeRequest(this.publicKey)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("ECDH Public key cannot be empty. Please use InputValidator methods to validate parameters.");
    }
}
