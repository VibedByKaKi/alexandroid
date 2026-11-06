package org.openjdk.tools.javac.util;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ByteBuffer {
    public byte[] elems;
    public int length;

    public ByteBuffer(int i) {
        this.elems = new byte[i];
        this.length = 0;
    }

    public void appendByte(int i) {
        byte[] ensureCapacity = ArrayUtils.ensureCapacity(this.elems, this.length);
        this.elems = ensureCapacity;
        int i2 = this.length;
        this.length = i2 + 1;
        ensureCapacity[i2] = (byte) i;
    }

    public void appendBytes(byte[] bArr, int i, int i2) {
        byte[] ensureCapacity = ArrayUtils.ensureCapacity(this.elems, this.length + i2);
        this.elems = ensureCapacity;
        System.arraycopy(bArr, i, ensureCapacity, this.length, i2);
        this.length += i2;
    }

    public void appendChar(int i) {
        byte[] ensureCapacity = ArrayUtils.ensureCapacity(this.elems, this.length + 1);
        this.elems = ensureCapacity;
        int i2 = this.length;
        ensureCapacity[i2] = (byte) ((i >> 8) & 255);
        ensureCapacity[i2 + 1] = (byte) (i & 255);
        this.length = i2 + 2;
    }

    public void appendDouble(double d) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        try {
            new DataOutputStream(byteArrayOutputStream).writeDouble(d);
            appendBytes(byteArrayOutputStream.toByteArray(), 0, 8);
        } catch (IOException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "write");
        }
    }

    public void appendFloat(float f) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
        try {
            new DataOutputStream(byteArrayOutputStream).writeFloat(f);
            appendBytes(byteArrayOutputStream.toByteArray(), 0, 4);
        } catch (IOException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "write");
        }
    }

    public void appendInt(int i) {
        byte[] ensureCapacity = ArrayUtils.ensureCapacity(this.elems, this.length + 3);
        this.elems = ensureCapacity;
        int i2 = this.length;
        ensureCapacity[i2] = (byte) ((i >> 24) & 255);
        ensureCapacity[i2 + 1] = (byte) ((i >> 16) & 255);
        ensureCapacity[i2 + 2] = (byte) ((i >> 8) & 255);
        ensureCapacity[i2 + 3] = (byte) (i & 255);
        this.length = i2 + 4;
    }

    public void appendLong(long j) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        try {
            new DataOutputStream(byteArrayOutputStream).writeLong(j);
            appendBytes(byteArrayOutputStream.toByteArray(), 0, 8);
        } catch (IOException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "write");
        }
    }

    public void appendName(Name name) {
        appendBytes(name.getByteArray(), name.getByteOffset(), name.getByteLength());
    }

    public void reset() {
        this.length = 0;
    }

    public Name toName(Names names) {
        return names.fromUtf(this.elems, 0, this.length);
    }

    public ByteBuffer() {
        this(64);
    }

    public void appendBytes(byte[] bArr) {
        appendBytes(bArr, 0, bArr.length);
    }
}
