package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class FastOutput extends Output {
    public FastOutput(byte[] bArr) {
        this(bArr, bArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeInt(int i, boolean z) throws KryoException {
        writeInt(i);
        return 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeLong(long j, boolean z) throws KryoException {
        writeLong(j);
        return 8;
    }

    public FastOutput(int i) {
        this(i, i);
    }

    public FastOutput(int i, int i2) {
        super(i, i2);
    }

    public FastOutput() {
    }

    public FastOutput(byte[] bArr, int i) {
        super(bArr, i);
    }

    public FastOutput(OutputStream outputStream) {
        super(outputStream);
    }

    public FastOutput(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
