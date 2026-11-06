package org.codehaus.jackson.io;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.util.BufferRecycler;
import org.codehaus.jackson.util.TextBuffer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class IOContext {
    protected final BufferRecycler _bufferRecycler;
    protected JsonEncoding _encoding;
    protected final boolean _managedResource;
    protected final Object _sourceRef;
    protected byte[] _readIOBuffer = null;
    protected byte[] _writeEncodingBuffer = null;
    protected char[] _tokenCBuffer = null;
    protected char[] _concatCBuffer = null;
    protected char[] _nameCopyBuffer = null;

    public IOContext(BufferRecycler bufferRecycler, Object obj, boolean z) {
        this._bufferRecycler = bufferRecycler;
        this._sourceRef = obj;
        this._managedResource = z;
    }

    public final char[] allocConcatBuffer() {
        if (this._concatCBuffer != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to call allocConcatBuffer() second time");
            return null;
        }
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(BufferRecycler.CharBufferType.CONCAT_BUFFER);
        this._concatCBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public final char[] allocNameCopyBuffer(int i) {
        if (this._nameCopyBuffer != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to call allocNameCopyBuffer() second time");
            return null;
        }
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(BufferRecycler.CharBufferType.NAME_COPY_BUFFER, i);
        this._nameCopyBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public final byte[] allocReadIOBuffer() {
        if (this._readIOBuffer != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to call allocReadIOBuffer() second time");
            return null;
        }
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(BufferRecycler.ByteBufferType.READ_IO_BUFFER);
        this._readIOBuffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public final char[] allocTokenBuffer() {
        if (this._tokenCBuffer != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to call allocTokenBuffer() second time");
            return null;
        }
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(BufferRecycler.CharBufferType.TOKEN_BUFFER);
        this._tokenCBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public final byte[] allocWriteEncodingBuffer() {
        if (this._writeEncodingBuffer != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to call allocWriteEncodingBuffer() second time");
            return null;
        }
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER);
        this._writeEncodingBuffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public final TextBuffer constructTextBuffer() {
        return new TextBuffer(this._bufferRecycler);
    }

    public final JsonEncoding getEncoding() {
        return this._encoding;
    }

    public final Object getSourceReference() {
        return this._sourceRef;
    }

    public final boolean isResourceManaged() {
        return this._managedResource;
    }

    public final void releaseConcatBuffer(char[] cArr) {
        if (cArr != null) {
            if (cArr != this._concatCBuffer) {
                Single$$ExternalSyntheticBUOutline0.m$3("Trying to release buffer not owned by the context");
            } else {
                this._concatCBuffer = null;
                this._bufferRecycler.releaseCharBuffer(BufferRecycler.CharBufferType.CONCAT_BUFFER, cArr);
            }
        }
    }

    public final void releaseNameCopyBuffer(char[] cArr) {
        if (cArr != null) {
            if (cArr != this._nameCopyBuffer) {
                Single$$ExternalSyntheticBUOutline0.m$3("Trying to release buffer not owned by the context");
            } else {
                this._nameCopyBuffer = null;
                this._bufferRecycler.releaseCharBuffer(BufferRecycler.CharBufferType.NAME_COPY_BUFFER, cArr);
            }
        }
    }

    public final void releaseReadIOBuffer(byte[] bArr) {
        if (bArr != null) {
            if (bArr != this._readIOBuffer) {
                Single$$ExternalSyntheticBUOutline0.m$3("Trying to release buffer not owned by the context");
            } else {
                this._readIOBuffer = null;
                this._bufferRecycler.releaseByteBuffer(BufferRecycler.ByteBufferType.READ_IO_BUFFER, bArr);
            }
        }
    }

    public final void releaseTokenBuffer(char[] cArr) {
        if (cArr != null) {
            if (cArr != this._tokenCBuffer) {
                Single$$ExternalSyntheticBUOutline0.m$3("Trying to release buffer not owned by the context");
            } else {
                this._tokenCBuffer = null;
                this._bufferRecycler.releaseCharBuffer(BufferRecycler.CharBufferType.TOKEN_BUFFER, cArr);
            }
        }
    }

    public final void releaseWriteEncodingBuffer(byte[] bArr) {
        if (bArr != null) {
            if (bArr != this._writeEncodingBuffer) {
                Single$$ExternalSyntheticBUOutline0.m$3("Trying to release buffer not owned by the context");
            } else {
                this._writeEncodingBuffer = null;
                this._bufferRecycler.releaseByteBuffer(BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER, bArr);
            }
        }
    }

    public void setEncoding(JsonEncoding jsonEncoding) {
        this._encoding = jsonEncoding;
    }
}
