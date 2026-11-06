package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class AbstractRepeatableCipherInputStream<T> extends SdkFilterInputStream {
    private final T cipherFactory;
    private boolean hasBeenAccessed;
    private final InputStream unencryptedDataStream;

    public AbstractRepeatableCipherInputStream(InputStream inputStream, FilterInputStream filterInputStream, T t) {
        super(filterInputStream);
        this.unencryptedDataStream = inputStream;
        this.cipherFactory = t;
    }

    public abstract FilterInputStream createCipherInputStream(InputStream inputStream, T t);

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        abortIfNeeded();
        if (this.hasBeenAccessed) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Marking is only supported before your first call to read or skip.");
        } else {
            this.unencryptedDataStream.mark(i);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return this.unencryptedDataStream.markSupported();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        this.hasBeenAccessed = true;
        return super.read();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        this.unencryptedDataStream.reset();
        ((FilterInputStream) this).in = createCipherInputStream(this.unencryptedDataStream, this.cipherFactory);
        this.hasBeenAccessed = false;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        this.hasBeenAccessed = true;
        return super.skip(j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        this.hasBeenAccessed = true;
        return super.read(bArr);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.hasBeenAccessed = true;
        return super.read(bArr, i, i2);
    }
}
