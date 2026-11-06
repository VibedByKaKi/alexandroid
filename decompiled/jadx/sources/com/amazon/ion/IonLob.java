package com.amazon.ion;

import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonLob extends IonValue {
    int byteSize();

    @Override // com.amazon.ion.IonValue
    IonLob clone() throws UnknownSymbolException;

    byte[] getBytes();

    InputStream newInputStream();

    void setBytes(byte[] bArr);

    void setBytes(byte[] bArr, int i, int i2);
}
