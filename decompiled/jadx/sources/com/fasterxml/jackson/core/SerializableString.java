package com.fasterxml.jackson.core;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface SerializableString {
    int appendQuoted(char[] cArr, int i);

    int appendQuotedUTF8(byte[] bArr, int i);

    int appendUnquoted(char[] cArr, int i);

    int appendUnquotedUTF8(byte[] bArr, int i);

    char[] asQuotedChars();

    byte[] asQuotedUTF8();

    byte[] asUnquotedUTF8();

    int charLength();

    String getValue();

    int putQuotedUTF8(ByteBuffer byteBuffer) throws IOException;

    int putUnquotedUTF8(ByteBuffer byteBuffer) throws IOException;

    int writeQuotedUTF8(OutputStream outputStream) throws IOException;

    int writeUnquotedUTF8(OutputStream outputStream) throws IOException;
}
