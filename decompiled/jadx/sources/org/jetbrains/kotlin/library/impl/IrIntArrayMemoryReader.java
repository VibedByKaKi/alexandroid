package org.jetbrains.kotlin.library.impl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.library.impl.ReadBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrIntArrayMemoryReader;", "", "bytes", "", "([B)V", "array", "", "getArray", "()[I", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class IrIntArrayMemoryReader {

    @NotNull
    private final int[] array;

    public IrIntArrayMemoryReader(@NotNull byte[] bArr) {
        bArr.getClass();
        ReadBuffer.MemoryBuffer memoryBuffer = new ReadBuffer.MemoryBuffer(bArr);
        int i = memoryBuffer.getInt();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = memoryBuffer.getInt();
        }
        this.array = iArr;
    }

    @NotNull
    public final int[] getArray() {
        return this.array;
    }
}
