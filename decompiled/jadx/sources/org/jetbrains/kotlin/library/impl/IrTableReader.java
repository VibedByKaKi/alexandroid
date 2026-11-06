package org.jetbrains.kotlin.library.impl;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B&\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrTableReader;", "K", "", "buffer", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer;", "keyReader", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lorg/jetbrains/kotlin/library/impl/ReadBuffer;Lkotlin/jvm/functions/Function1;)V", "indexToOffset", "", "Lkotlin/Pair;", "", "tableItemBytes", "", "id", "(Ljava/lang/Object;)[B", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class IrTableReader<K> {

    @NotNull
    private final ReadBuffer buffer;

    @NotNull
    private final Map<K, Pair<Integer, Integer>> indexToOffset;

    public IrTableReader(@NotNull ReadBuffer readBuffer, @NotNull Function1<? super ReadBuffer, ? extends K> function1) {
        readBuffer.getClass();
        function1.getClass();
        this.buffer = readBuffer;
        this.indexToOffset = new LinkedHashMap();
        int i = readBuffer.getInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.indexToOffset.put(function1.invoke(this.buffer), TuplesKt.to(Integer.valueOf(this.buffer.getInt()), Integer.valueOf(this.buffer.getInt())));
        }
    }

    @NotNull
    public final byte[] tableItemBytes(K id) {
        Pair<Integer, Integer> pair = this.indexToOffset.get(id);
        if (pair == null) {
            Single$$ExternalSyntheticBUOutline0.m$2(BitVector$$ExternalSyntheticOutline0.m(id, "No coordinates found for "));
            return null;
        }
        int intValue = pair.getFirst().intValue();
        int intValue2 = pair.getSecond().intValue();
        byte[] bArr = new byte[intValue2];
        this.buffer.setPosition(intValue);
        this.buffer.get(bArr, 0, intValue2);
        return bArr;
    }
}
