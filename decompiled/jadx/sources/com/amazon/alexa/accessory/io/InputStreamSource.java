package com.amazon.alexa.accessory.io;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class InputStreamSource implements Source {
    private final InputStream inputStream;

    public InputStreamSource(InputStream inputStream) {
        Preconditions.notNull(inputStream, "inputStream");
        this.inputStream = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
    }

    @Override // com.amazon.alexa.accessory.io.Source
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.inputStream.read(bArr, i, i2);
    }
}
