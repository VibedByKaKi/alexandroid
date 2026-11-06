package com.amazon.alexa.device.setup.echo.bouncycastle.jce.spec;

import com.amazon.alexa.device.setup.echo.bouncycastle.jce.interfaces.MQVPrivateKey;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MQVPrivateKeySpec implements KeySpec, MQVPrivateKey {
    private final PrivateKey ephemeralPrivateKey;
    private final PublicKey ephemeralPublicKey;
    private final PrivateKey staticPrivateKey;

    public MQVPrivateKeySpec(PrivateKey privateKey, PrivateKey privateKey2, PublicKey publicKey) {
        this.staticPrivateKey = privateKey;
        this.ephemeralPrivateKey = privateKey2;
        this.ephemeralPublicKey = publicKey;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ECMQV";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.jce.interfaces.MQVPrivateKey
    public PrivateKey getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.jce.interfaces.MQVPrivateKey
    public PublicKey getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.jce.interfaces.MQVPrivateKey
    public PrivateKey getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public MQVPrivateKeySpec(PrivateKey privateKey, PrivateKey privateKey2) {
        this(privateKey, privateKey2, null);
    }
}
