package com.amazon.ion;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public interface IonBinaryWriter extends IonWriter {
    @Deprecated
    int byteSize();

    @Deprecated
    int getBytes(byte[] bArr, int i, int i2) throws IOException;

    @Deprecated
    byte[] getBytes() throws IOException;

    @Deprecated
    int writeBytes(OutputStream outputStream) throws IOException;
}
