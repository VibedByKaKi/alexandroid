package org.openjdk.tools.sjavac;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class AutoFlushWriter extends FilterWriter {
    public AutoFlushWriter(Writer writer) {
        super(writer);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        super.write(str, i, i2);
        if (str.contains("\n") || str.contains(StringUtils.CR)) {
            flush();
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) throws IOException {
        super.write(i);
        if (i == 10 || i == 13) {
            flush();
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        super.write(cArr, i, i2);
        for (char c : cArr) {
            if (c == '\n' || c == '\r') {
                flush();
                return;
            }
        }
    }
}
