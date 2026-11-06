package org.jetbrains.kotlin.library.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrMultiArrayReader;", "", "buffer", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer;", "(Lorg/jetbrains/kotlin/library/impl/ReadBuffer;)V", "indexIndexToOffset", "", "", "", "indexToOffset", "readOffsets", "position", "tableItemBytes", "", "id", "row", "column", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nIrFileReaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IrFileReaders.kt\norg/jetbrains/kotlin/library/impl/IrMultiArrayReader\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,233:1\n372#2,7:234\n*S KotlinDebug\n*F\n+ 1 IrFileReaders.kt\norg/jetbrains/kotlin/library/impl/IrMultiArrayReader\n*L\n102#1:234,7\n*E\n"})
/* loaded from: classes11.dex */
public abstract class IrMultiArrayReader {

    @NotNull
    private final ReadBuffer buffer;

    @NotNull
    private final Map<Integer, int[]> indexIndexToOffset;

    @NotNull
    private final int[] indexToOffset;

    public IrMultiArrayReader(@NotNull ReadBuffer readBuffer) {
        readBuffer.getClass();
        this.buffer = readBuffer;
        this.indexIndexToOffset = new LinkedHashMap();
        this.indexToOffset = readOffsets(0);
    }

    private final int[] readOffsets(int position) {
        this.buffer.setPosition(position);
        int i = this.buffer.getInt();
        int i2 = i + 1;
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = i2 * 4;
        while (i3 < i) {
            int i4 = i3 + 1;
            iArr[i4] = iArr[i3] + this.buffer.getInt();
            i3 = i4;
        }
        return iArr;
    }

    @NotNull
    public final byte[] tableItemBytes(int row, int column) {
        int i = this.indexToOffset[row];
        Map<Integer, int[]> map = this.indexIndexToOffset;
        Integer valueOf = Integer.valueOf(row);
        int[] iArr = map.get(valueOf);
        if (iArr == null) {
            iArr = readOffsets(i);
            map.put(valueOf, iArr);
        }
        int[] iArr2 = iArr;
        int i2 = iArr2[column];
        int i3 = iArr2[column + 1] - i2;
        byte[] bArr = new byte[i3];
        this.buffer.setPosition(i + i2);
        this.buffer.get(bArr, 0, i3);
        return bArr;
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
