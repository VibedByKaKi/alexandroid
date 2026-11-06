package org.apache.commons.io;

import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public enum StandardLineSeparator {
    CR(StringUtils.CR),
    CRLF("\r\n"),
    LF("\n");

    private final String lineSeparator;

    StandardLineSeparator(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.lineSeparator = str;
    }

    public byte[] getBytes(Charset charset) {
        return this.lineSeparator.getBytes(charset);
    }

    public String getString() {
        return this.lineSeparator;
    }
}
