package org.bouncycastle.crypto.params;

import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public final class X448PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 56;
    private final byte[] data;

    public X448PublicKeyParameters(InputStream inputStream) throws IOException {
        super(false);
        byte[] bArr = new byte[56];
        this.data = bArr;
        if (56 == Streams.readFully(inputStream, bArr)) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3("EOF encountered in middle of X448 public key");
        throw null;
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 56) {
            return bArr;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("'buf' must have length 56");
        return null;
    }

    public void encode(byte[] bArr, int i) {
        System.arraycopy(this.data, 0, bArr, i, 56);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public X448PublicKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public X448PublicKeyParameters(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.data = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 56);
    }
}
