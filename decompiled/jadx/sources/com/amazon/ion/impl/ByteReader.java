package com.amazon.ion.impl;

import com.amazon.ion.Decimal;
import com.amazon.ion.Timestamp;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
interface ByteReader {
    public static final int EOF = -1;

    int position();

    void position(int i);

    int read() throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    Decimal readDecimal(int i) throws IOException;

    double readFloat(int i) throws IOException;

    String readString(int i) throws IOException;

    Timestamp readTimestamp(int i) throws IOException;

    int readTypeDesc() throws IOException;

    long readULong(int i) throws IOException;

    int readVarInt() throws IOException;

    long readVarLong() throws IOException;

    int readVarUInt() throws IOException;

    long readVarULong() throws IOException;

    void skip(int i);
}
