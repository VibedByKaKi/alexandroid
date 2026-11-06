package com.amazon.ion.impl.bin;

import com.amazon.ion.IonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public interface _Private_IonRawWriter extends IonWriter {
    void addTypeAnnotationSymbol(int i);

    void setFieldNameSymbol(int i);

    void setTypeAnnotationSymbols(int... iArr);

    void writeString(byte[] bArr, int i, int i2) throws IOException;

    void writeSymbolToken(int i) throws IOException;
}
