package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.Writer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class CloseShieldWriter extends ProxyWriter {
    @Deprecated
    public CloseShieldWriter(Writer writer) {
        super(writer);
    }

    public static CloseShieldWriter wrap(Writer writer) {
        return new CloseShieldWriter(writer);
    }

    @Override // org.apache.commons.io.output.ProxyWriter, java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterWriter) this).out = ClosedWriter.CLOSED_WRITER;
    }
}
