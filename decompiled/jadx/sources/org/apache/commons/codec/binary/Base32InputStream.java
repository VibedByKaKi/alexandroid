package org.apache.commons.codec.binary;

import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class Base32InputStream extends BaseNCodecInputStream {
    public Base32InputStream(InputStream inputStream, boolean z) {
        super(inputStream, new Base32(false), z);
    }

    public Base32InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base32InputStream(InputStream inputStream, boolean z, int i, byte[] bArr) {
        super(inputStream, new Base32(i, bArr), z);
    }
}
