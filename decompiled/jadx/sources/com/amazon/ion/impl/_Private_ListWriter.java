package com.amazon.ion.impl;

import com.amazon.ion.IonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface _Private_ListWriter extends IonWriter {
    void writeBoolList(boolean[] zArr) throws IOException;

    void writeFloatList(double[] dArr) throws IOException;

    void writeFloatList(float[] fArr) throws IOException;

    void writeIntList(byte[] bArr) throws IOException;

    void writeIntList(int[] iArr) throws IOException;

    void writeIntList(long[] jArr) throws IOException;

    void writeIntList(short[] sArr) throws IOException;

    void writeStringList(String[] strArr) throws IOException;
}
