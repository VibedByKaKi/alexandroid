package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ChunkedWriter extends FilterWriter {
    private static final int DEFAULT_CHUNK_SIZE = 4096;
    private final int chunkSize;

    public ChunkedWriter(Writer writer, int i) {
        super(writer);
        if (i > 0) {
            this.chunkSize = i;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.chunkSize);
            ((FilterWriter) this).out.write(cArr, i, min);
            i2 -= min;
            i += min;
        }
    }

    public ChunkedWriter(Writer writer) {
        this(writer, 4096);
    }
}
