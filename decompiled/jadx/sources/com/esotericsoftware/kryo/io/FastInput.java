package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class FastInput extends Input {
    public FastInput() {
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt(boolean z) throws KryoException {
        return readInt();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong(boolean z) throws KryoException {
        return readLong();
    }

    public FastInput(int i) {
        super(i);
    }

    public FastInput(byte[] bArr) {
        super(bArr);
    }

    public FastInput(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public FastInput(InputStream inputStream) {
        super(inputStream);
    }

    public FastInput(InputStream inputStream, int i) {
        super(inputStream, i);
    }
}
