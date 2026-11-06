package org.jetbrains.kotlin.library.impl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrArrayReader;", "", "buffer", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer;", "(Lorg/jetbrains/kotlin/library/impl/ReadBuffer;)V", "indexToOffset", "", "entryCount", "", "tableItemBytes", "", "id", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class IrArrayReader {

    @NotNull
    private final ReadBuffer buffer;

    @NotNull
    private final int[] indexToOffset;

    public IrArrayReader(@NotNull ReadBuffer readBuffer) {
        readBuffer.getClass();
        this.buffer = readBuffer;
        int i = readBuffer.getInt();
        int i2 = i + 1;
        int[] iArr = new int[i2];
        this.indexToOffset = iArr;
        int i3 = 0;
        iArr[0] = i2 * 4;
        while (i3 < i) {
            int i4 = this.buffer.getInt();
            int[] iArr2 = this.indexToOffset;
            int i5 = i3 + 1;
            iArr2[i5] = iArr2[i3] + i4;
            i3 = i5;
        }
    }

    public final int entryCount() {
        return this.indexToOffset.length - 1;
    }

    @NotNull
    public final byte[] tableItemBytes(int id) {
        int[] iArr = this.indexToOffset;
        int i = iArr[id];
        int i2 = iArr[id + 1] - i;
        byte[] bArr = new byte[i2];
        this.buffer.setPosition(i);
        this.buffer.get(bArr, 0, i2);
        return bArr;
    }
}
