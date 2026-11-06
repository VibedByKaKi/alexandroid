package com.amazonaws.util;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StringInputStream extends ByteArrayInputStream {
    private final String string;

    public StringInputStream(String str) throws UnsupportedEncodingException {
        super(str.getBytes(StringUtils.UTF8));
        this.string = str;
    }

    public String getString() {
        return this.string;
    }
}
