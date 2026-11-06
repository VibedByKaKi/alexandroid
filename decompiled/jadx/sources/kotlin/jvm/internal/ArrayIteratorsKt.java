package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u000e\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t\u001a\u000e\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b\u001a\u000e\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u000e\u0010\u0000\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a\u000e\u0010\u0000\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"iterator", "Lkotlin/collections/ByteIterator;", "array", "", "Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/ShortIterator;", "", "Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/BooleanIterator;", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ArrayIteratorsKt {
    @NotNull
    public static final ByteIterator iterator(@NotNull byte[] bArr) {
        bArr.getClass();
        return new ArrayByteIterator(bArr);
    }

    @NotNull
    public static final CharIterator iterator(@NotNull char[] cArr) {
        cArr.getClass();
        return new ArrayCharIterator(cArr);
    }

    @NotNull
    public static final ShortIterator iterator(@NotNull short[] sArr) {
        sArr.getClass();
        return new ArrayShortIterator(sArr);
    }

    @NotNull
    public static final IntIterator iterator(@NotNull int[] iArr) {
        iArr.getClass();
        return new ArrayIntIterator(iArr);
    }

    @NotNull
    public static final LongIterator iterator(@NotNull long[] jArr) {
        jArr.getClass();
        return new ArrayLongIterator(jArr);
    }

    @NotNull
    public static final FloatIterator iterator(@NotNull float[] fArr) {
        fArr.getClass();
        return new ArrayFloatIterator(fArr);
    }

    @NotNull
    public static final DoubleIterator iterator(@NotNull double[] dArr) {
        dArr.getClass();
        return new ArrayDoubleIterator(dArr);
    }

    @NotNull
    public static final BooleanIterator iterator(@NotNull boolean[] zArr) {
        zArr.getClass();
        return new ArrayBooleanIterator(zArr);
    }
}
