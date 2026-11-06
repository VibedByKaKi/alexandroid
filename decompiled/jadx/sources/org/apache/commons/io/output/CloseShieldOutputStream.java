package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class CloseShieldOutputStream extends ProxyOutputStream {
    @Deprecated
    public CloseShieldOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public static CloseShieldOutputStream wrap(OutputStream outputStream) {
        return new CloseShieldOutputStream(outputStream);
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out = ClosedOutputStream.CLOSED_OUTPUT_STREAM;
    }
}
