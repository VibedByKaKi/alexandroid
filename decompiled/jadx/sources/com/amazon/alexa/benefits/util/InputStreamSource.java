package com.amazon.alexa.benefits.util;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class InputStreamSource implements Source {
    private final InputStream inputStream;

    public InputStreamSource(@NonNull InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
    }

    @Override // com.amazon.alexa.benefits.util.Source
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.inputStream.read(bArr, i, i2);
    }
}
