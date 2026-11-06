package org.apache.thrift.orig;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TByteArrayOutputStream extends ByteArrayOutputStream {
    private final int initialSize;

    public TByteArrayOutputStream(int i) {
        super(i);
        this.initialSize = i;
    }

    public byte[] get() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int len() {
        return ((ByteArrayOutputStream) this).count;
    }

    @Override // java.io.ByteArrayOutputStream
    public void reset() {
        super.reset();
        int length = ((ByteArrayOutputStream) this).buf.length;
        int i = this.initialSize;
        if (length > i) {
            ((ByteArrayOutputStream) this).buf = new byte[i];
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString(Charset charset) {
        return new String(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, charset);
    }

    public TByteArrayOutputStream() {
        this(32);
    }
}
