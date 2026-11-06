package com.amazon.coral.google.common.io;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import java.io.DataOutput;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface ByteArrayDataOutput extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int i);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i, int i2);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z);

    @Override // java.io.DataOutput
    void writeByte(int i);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i);

    @Override // java.io.DataOutput
    void writeChars(String str);

    @Override // java.io.DataOutput
    void writeDouble(double d);

    @Override // java.io.DataOutput
    void writeFloat(float f);

    @Override // java.io.DataOutput
    void writeInt(int i);

    @Override // java.io.DataOutput
    void writeLong(long j);

    @Override // java.io.DataOutput
    void writeShort(int i);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}
