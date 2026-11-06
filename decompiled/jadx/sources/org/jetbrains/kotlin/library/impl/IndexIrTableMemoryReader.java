package org.jetbrains.kotlin.library.impl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.library.impl.ReadBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IndexIrTableMemoryReader;", "Lorg/jetbrains/kotlin/library/impl/IrTableReader;", "", "bytes", "", "([B)V", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class IndexIrTableMemoryReader extends IrTableReader<Long> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexIrTableMemoryReader(@NotNull byte[] bArr) {
        super(new ReadBuffer.MemoryBuffer(bArr), new Function1<ReadBuffer, Long>() { // from class: org.jetbrains.kotlin.library.impl.IndexIrTableMemoryReader.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Long invoke(@NotNull ReadBuffer readBuffer) {
                readBuffer.getClass();
                return Long.valueOf(readBuffer.getLong());
            }
        });
        bArr.getClass();
    }
}
