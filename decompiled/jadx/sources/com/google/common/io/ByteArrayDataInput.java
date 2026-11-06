package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInput;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes8.dex */
public interface ByteArrayDataInput extends DataInput {
    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    boolean readBoolean();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    byte readByte();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    char readChar();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    double readDouble();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] bArr);

    @Override // java.io.DataInput
    void readFully(byte[] bArr, int i, int i2);

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    int readInt();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    String readLine();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    long readLong();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    short readShort();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    String readUTF();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    int readUnsignedByte();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int i);
}
