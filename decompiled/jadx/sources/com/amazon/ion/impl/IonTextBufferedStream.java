package com.amazon.ion.impl;

import java.io.IOException;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
abstract class IonTextBufferedStream extends InputStream {
    public static IonTextBufferedStream makeStream(byte[] bArr) {
        return new SimpleBufferStream(bArr);
    }

    public abstract int getByte(int i);

    public abstract int position();

    public abstract IonTextBufferedStream setPosition(int i);

    public static IonTextBufferedStream makeStream(byte[] bArr, int i, int i2) {
        return new OffsetBufferStream(bArr, i, i2);
    }

    public static IonTextBufferedStream makeStream(String str) {
        return new StringStream(str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StringStream extends IonTextBufferedStream {
        int _end;
        int _pos = 0;
        String _string;

        public StringStream(String str) {
            this._string = str;
            this._end = str.length();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this._pos = this._end;
            super.close();
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final int getByte(int i) {
            if (i >= 0 && i < this._end) {
                return this._string.charAt(i);
            }
            return -1;
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final int position() {
            return this._pos;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            int i = this._pos;
            if (i >= this._end) {
                return -1;
            }
            String str = this._string;
            this._pos = i + 1;
            return str.charAt(i);
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final StringStream setPosition(int i) {
            if (i < 0) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            if (i <= this._end) {
                this._pos = i;
                return this;
            }
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OffsetBufferStream extends IonTextBufferedStream {
        byte[] _buffer;
        int _end;
        int _pos;
        int _start;

        public OffsetBufferStream(byte[] bArr, int i, int i2) {
            this._buffer = bArr;
            this._pos = i;
            this._start = i;
            this._end = i + i2;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this._pos = this._end;
            super.close();
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final int getByte(int i) {
            int i2;
            if (i >= 0 && (i2 = i + this._start) < this._end) {
                return this._buffer[i2] & 255;
            }
            return -1;
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final int position() {
            return this._pos - this._start;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (i < 0) {
                Path$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            int i3 = this._pos;
            int i4 = i3 + i2;
            int i5 = this._end;
            if (i4 >= i5) {
                i2 = i5 - i3;
            }
            System.arraycopy(this._buffer, i3, bArr, i, i2);
            this._pos += i2;
            return i2;
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final OffsetBufferStream setPosition(int i) {
            if (i < 0) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            int i2 = i + this._start;
            if (i2 <= this._end) {
                this._pos = i2;
                return this;
            }
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            int i = this._pos;
            if (i >= this._end) {
                return -1;
            }
            byte[] bArr = this._buffer;
            this._pos = i + 1;
            return bArr[i] & 255;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SimpleBufferStream extends IonTextBufferedStream {
        byte[] _buffer;
        int _len;
        int _pos = 0;

        public SimpleBufferStream(byte[] bArr) {
            this._buffer = bArr;
            this._len = bArr.length;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this._pos = this._len;
            super.close();
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final int getByte(int i) {
            if (i < 0 || i >= this._len) {
                return -1;
            }
            return this._buffer[i] & 255;
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final int position() {
            return this._pos;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (i < 0) {
                Path$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            int i3 = this._pos;
            int i4 = i3 + i2;
            int i5 = this._len;
            if (i4 >= i5) {
                i2 = i5 - i3;
            }
            System.arraycopy(this._buffer, i3, bArr, i, i2);
            this._pos += i2;
            return i2;
        }

        @Override // com.amazon.ion.impl.IonTextBufferedStream
        public final SimpleBufferStream setPosition(int i) {
            int i2 = this._pos;
            if (i2 < 0 || i2 > this._len) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this._pos = i;
            return this;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            int i = this._pos;
            if (i >= this._len) {
                return -1;
            }
            byte[] bArr = this._buffer;
            this._pos = i + 1;
            return bArr[i];
        }
    }
}
