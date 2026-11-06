package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class PrivateKeyReader {
    private final String keyPemString;

    public PrivateKeyReader(String str) {
        this.keyPemString = str;
    }

    public PrivateKey getPrivateKey() throws IOException, InvalidKeySpecException {
        return PEM.readPrivateKey(new ByteArrayInputStream(this.keyPemString.getBytes(StringUtils.UTF8)));
    }
}
