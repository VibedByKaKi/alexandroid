package org.apache.commons.io.input;

import java.io.DataInput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.io.EndianUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class SwappedDataInputStream extends ProxyInputStream implements DataInput {
    public SwappedDataInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException, EOFException {
        return readByte() != 0;
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException, EOFException {
        return (byte) ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException, EOFException {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException, EOFException {
        return EndianUtils.readSwappedDouble(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException, EOFException {
        return EndianUtils.readSwappedFloat(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException, EOFException {
        int i3 = i2;
        while (i3 > 0) {
            int read = read(bArr, (i + i2) - i3, i3);
            if (-1 == read) {
                Buffer$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            i3 -= read;
        }
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException, EOFException {
        return EndianUtils.readSwappedInteger(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException, EOFException {
        throw UnsupportedOperationExceptions.method("readLine");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException, EOFException {
        return EndianUtils.readSwappedLong(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException, EOFException {
        return EndianUtils.readSwappedShort(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException, EOFException {
        throw UnsupportedOperationExceptions.method("readUTF");
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException, EOFException {
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException, EOFException {
        return EndianUtils.readSwappedUnsignedShort(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException, EOFException {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException, EOFException {
        readFully(bArr, 0, bArr.length);
    }
}
