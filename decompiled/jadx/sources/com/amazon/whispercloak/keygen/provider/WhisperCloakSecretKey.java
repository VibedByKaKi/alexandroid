package com.amazon.whispercloak.keygen.provider;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.capabilityagent.cardstudiosurface.common.SurfaceWire;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class WhisperCloakSecretKey implements SecretKey {
    private static final int AES_KEY_LENGTH = 16;
    private final String algorithm;
    private final byte[] encodedKey;

    public WhisperCloakSecretKey(SecretKey secretKey) {
        byte[] bArr = new byte[16];
        this.encodedKey = bArr;
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-256").digest(secretKey.getEncoded()), 0, bArr, 0, 16);
            this.algorithm = secretKey.getAlgorithm();
        } catch (NoSuchAlgorithmException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("SHA-256 algorithm not supported", e);
            throw null;
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.encodedKey;
    }

    @Override // java.security.Key
    public String getFormat() {
        return SurfaceWire.RENDER_TYPE_RAW;
    }
}
