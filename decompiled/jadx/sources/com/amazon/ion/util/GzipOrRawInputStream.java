package com.amazon.ion.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class GzipOrRawInputStream extends FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final byte[] GZIP_HEADER = {31, -117};

    public GzipOrRawInputStream(InputStream inputStream, int i) throws IOException {
        super(null);
        int length = GZIP_HEADER.length;
        byte[] bArr = new byte[length];
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int i2 = 0;
        while (i2 < length) {
            int read = pushbackInputStream.read();
            if (read == -1) {
                break;
            }
            bArr[i2] = (byte) read;
            i2++;
        }
        pushbackInputStream.unread(bArr, 0, i2);
        if (i2 == 2 && Arrays.equals(bArr, GZIP_HEADER)) {
            ((FilterInputStream) this).in = new GZIPInputStream(pushbackInputStream, i);
        } else {
            ((FilterInputStream) this).in = pushbackInputStream;
        }
    }

    public GzipOrRawInputStream(InputStream inputStream) throws IOException {
        this(inputStream, 512);
    }
}
