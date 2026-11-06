package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class DemuxInputStream extends InputStream {
    private final InheritableThreadLocal<InputStream> inputStreamLocal = new InheritableThreadLocal<>();

    public InputStream bindStream(InputStream inputStream) {
        InputStream inputStream2 = this.inputStreamLocal.get();
        this.inputStreamLocal.set(inputStream);
        return inputStream2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOUtils.close(this.inputStreamLocal.get());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.inputStreamLocal.get();
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }
}
