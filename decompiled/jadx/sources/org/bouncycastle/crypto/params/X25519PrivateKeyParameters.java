package org.bouncycastle.crypto.params;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public final class X25519PrivateKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    public static final int SECRET_SIZE = 32;
    private final byte[] data;

    public X25519PrivateKeyParameters(InputStream inputStream) throws IOException {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        if (32 == Streams.readFully(inputStream, bArr)) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3("EOF encountered in middle of X25519 private key");
        throw null;
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("'buf' must have length 32");
        return null;
    }

    public void encode(byte[] bArr, int i) {
        System.arraycopy(this.data, 0, bArr, i, 32);
    }

    public X25519PublicKeyParameters generatePublicKey() {
        byte[] bArr = new byte[32];
        X25519.generatePublicKey(this.data, 0, bArr, 0);
        return new X25519PublicKeyParameters(bArr, 0);
    }

    public void generateSecret(X25519PublicKeyParameters x25519PublicKeyParameters, byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        x25519PublicKeyParameters.encode(bArr2, 0);
        if (X25519.calculateAgreement(this.data, 0, bArr2, 0, bArr, i)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("X25519 agreement failed");
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public X25519PrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        X25519.generatePrivateKey(secureRandom, bArr);
    }

    public X25519PrivateKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public X25519PrivateKeyParameters(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.data = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }
}
