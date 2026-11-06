package com.amazon.ion.util;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface _Private_FastAppendable extends Appendable {
    void appendAscii(char c) throws IOException;

    void appendAscii(CharSequence charSequence) throws IOException;

    void appendAscii(CharSequence charSequence, int i, int i2) throws IOException;

    void appendUtf16(char c) throws IOException;

    void appendUtf16Surrogate(char c, char c2) throws IOException;
}
