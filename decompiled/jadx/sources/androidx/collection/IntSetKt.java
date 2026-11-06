package androidx.collection;

import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a2\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\u000e\u001a\u00020\u0007\u001a\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0080\b\u001a\u0006\u0010\u0011\u001a\u00020\u0007\u001a\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\r\u001a\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r\u001a\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r\u001a\u0012\u0010\u0011\u001a\u00020\u00072\n\u0010\u0015\u001a\u00020\u0001\"\u00020\r\u001a\u0006\u0010\u0016\u001a\u00020\u0005\u001a\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\r\u001a\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r\u001a\u001e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r\u001a\u0012\u0010\u0016\u001a\u00020\u00052\n\u0010\u0015\u001a\u00020\u0001\"\u00020\r\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"EmptyIntArray", "", "getEmptyIntArray", "()[I", "EmptyIntSet", "Landroidx/collection/MutableIntSet;", "buildIntSet", "Landroidx/collection/IntSet;", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyIntSet", "hash", "k", "intSetOf", "element1", "element2", "element3", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "mutableIntSetOf", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,884:1\n1#2:885\n*E\n"})
/* loaded from: classes.dex */
public final class IntSetKt {

    @NotNull
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);

    @NotNull
    private static final int[] EmptyIntArray = new int[0];

    @NotNull
    public static final IntSet buildIntSet(@NotNull Function1<? super MutableIntSet, Unit> function1) {
        function1.getClass();
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        function1.invoke(mutableIntSet);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    @NotNull
    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final int hash(int i) {
        int hashCode = Integer.hashCode(i) * ScatterMapKt.MurmurHashC1;
        return hashCode ^ (hashCode << 16);
    }

    @NotNull
    public static final IntSet intSetOf(@NotNull int... iArr) {
        iArr.getClass();
        MutableIntSet mutableIntSet = new MutableIntSet(iArr.length);
        mutableIntSet.plusAssign(iArr);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i, int i2, int i3) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i2);
        mutableIntSet.plusAssign(i3);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i) {
        return mutableIntSetOf(i);
    }

    @NotNull
    public static final IntSet intSetOf(int i, int i2) {
        return mutableIntSetOf(i, i2);
    }

    @NotNull
    public static final IntSet buildIntSet(int i, @NotNull Function1<? super MutableIntSet, Unit> function1) {
        function1.getClass();
        MutableIntSet mutableIntSet = new MutableIntSet(i);
        function1.invoke(mutableIntSet);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i, int i2, int i3) {
        return mutableIntSetOf(i, i2, i3);
    }

    @NotNull
    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i, int i2) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i2);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(@NotNull int... iArr) {
        iArr.getClass();
        MutableIntSet mutableIntSet = new MutableIntSet(iArr.length);
        mutableIntSet.plusAssign(iArr);
        return mutableIntSet;
    }
}
