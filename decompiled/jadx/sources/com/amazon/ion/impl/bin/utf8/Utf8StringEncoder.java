package com.amazon.ion.impl.bin.utf8;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Utf8StringEncoder extends Poolable<Utf8StringEncoder> {
    private static final int SMALL_STRING_SIZE = 4096;
    final char[] charArray;
    final CharBuffer charBuffer;
    final CharsetEncoder utf8Encoder;
    final ByteBuffer utf8EncodingBuffer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result {
        private final byte[] buffer;
        private final int encodedLength;

        public Result(int i, byte[] bArr) {
            this.encodedLength = i;
            this.buffer = bArr;
        }

        public byte[] getBuffer() {
            return this.buffer;
        }

        public int getEncodedLength() {
            return this.encodedLength;
        }
    }

    public Utf8StringEncoder(Pool<Utf8StringEncoder> pool) {
        super(pool);
        CharsetEncoder newEncoder = Charset.forName("UTF-8").newEncoder();
        this.utf8Encoder = newEncoder;
        this.utf8EncodingBuffer = ByteBuffer.allocate((int) (newEncoder.maxBytesPerChar() * 4096.0f));
        char[] cArr = new char[4096];
        this.charArray = cArr;
        this.charBuffer = CharBuffer.wrap(cArr);
    }

    @Override // com.amazon.ion.impl.bin.utf8.Poolable, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public Result encode(String str) {
        ByteBuffer byteBuffer;
        CharBuffer charBuffer;
        if (str.length() > 4096) {
            byteBuffer = ByteBuffer.allocate((int) (this.utf8Encoder.maxBytesPerChar() * str.length()));
            char[] cArr = new char[str.length()];
            str.getChars(0, str.length(), cArr, 0);
            charBuffer = CharBuffer.wrap(cArr);
        } else {
            byteBuffer = this.utf8EncodingBuffer;
            byteBuffer.clear();
            charBuffer = this.charBuffer;
            str.getChars(0, str.length(), this.charArray, 0);
            this.charBuffer.rewind();
            this.charBuffer.limit(str.length());
        }
        if (this.utf8Encoder.encode(charBuffer, byteBuffer, true).isUnderflow()) {
            byteBuffer.flip();
            return new Result(byteBuffer.remaining(), byteBuffer.array());
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Could not encode string as UTF8 bytes: ".concat(str));
        return null;
    }
}
