package com.amazon.ion.impl;

import java.io.IOException;
import java.math.BigDecimal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
interface ByteWriter {
    void insert(int i);

    int position();

    void position(int i);

    void remove(int i);

    void write(byte b) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;

    int writeDecimal(BigDecimal bigDecimal) throws IOException;

    int writeFloat(double d) throws IOException;

    int writeIonInt(int i, int i2) throws IOException;

    int writeIonInt(long j, int i) throws IOException;

    int writeString(String str) throws IOException;

    void writeTypeDesc(int i) throws IOException;

    int writeTypeDescWithLength(int i, int i2) throws IOException;

    int writeTypeDescWithLength(int i, int i2, int i3) throws IOException;

    int writeVarInt(int i, int i2, boolean z) throws IOException;

    int writeVarInt(long j, int i, boolean z) throws IOException;

    int writeVarUInt(int i, int i2, boolean z) throws IOException;

    int writeVarUInt(long j, int i, boolean z) throws IOException;
}
