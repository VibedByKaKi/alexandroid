package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.Reader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class CloseShieldReader extends ProxyReader {
    @Deprecated
    public CloseShieldReader(Reader reader) {
        super(reader);
    }

    public static CloseShieldReader wrap(Reader reader) {
        return new CloseShieldReader(reader);
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterReader) this).in = ClosedReader.CLOSED_READER;
    }
}
