package com.amazon.alexa.accessory.io;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface SizedSource extends Source {
    public static final SizedSource EMPTY = new SizedSource() { // from class: com.amazon.alexa.accessory.io.SizedSource.1
        @Override // com.amazon.alexa.accessory.io.Source
        public int read(byte[] bArr, int i, int i2) throws IOException {
            return -1;
        }

        @Override // com.amazon.alexa.accessory.io.SizedSource
        public int size() throws IOException {
            return 0;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.amazon.alexa.accessory.io.SizedSource
        public void reset() throws IOException {
        }
    };

    void reset() throws IOException;

    int size() throws IOException;
}
