package androidx.collection;

import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a2\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0001\u001a\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\u00012\n\u0010\u000f\u001a\u00020\u0010\"\u00020\t\u001a\t\u0010\u0011\u001a\u00020\u0005H\u0086\b\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0015\u0010\u0011\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u0010\"\u00020\tH\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"EmptyIntList", "Landroidx/collection/IntList;", "buildIntList", "builderAction", "Lkotlin/Function1;", "Landroidx/collection/MutableIntList;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyIntList", "intListOf", "element1", "element2", "element3", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "mutableIntListOf", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,968:1\n1#2:969\n672#3,2:970\n712#3,2:972\n712#3,2:974\n712#3,2:976\n712#3,2:978\n712#3,2:980\n712#3,2:982\n672#3,2:984\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n902#1:970,2\n910#1:972,2\n917#1:974,2\n918#1:976,2\n927#1:978,2\n928#1:980,2\n929#1:982,2\n935#1:984,2\n*E\n"})
/* loaded from: classes.dex */
public final class IntListKt {

    @NotNull
    private static final IntList EmptyIntList = new MutableIntList(0);

    @NotNull
    public static final IntList buildIntList(@NotNull Function1<? super MutableIntList, Unit> function1) {
        function1.getClass();
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        function1.invoke(mutableIntList);
        return mutableIntList;
    }

    @NotNull
    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    @NotNull
    public static final IntList intListOf(@NotNull int... iArr) {
        iArr.getClass();
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.addAll(mutableIntList._size, iArr);
        return mutableIntList;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i, int i2, int i3) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i);
        mutableIntList.add(i2);
        mutableIntList.add(i3);
        return mutableIntList;
    }

    @NotNull
    public static final IntList buildIntList(int i, @NotNull Function1<? super MutableIntList, Unit> function1) {
        function1.getClass();
        MutableIntList mutableIntList = new MutableIntList(i);
        function1.invoke(mutableIntList);
        return mutableIntList;
    }

    @NotNull
    public static final IntList intListOf(int i) {
        return mutableIntListOf(i);
    }

    @NotNull
    public static final IntList intListOf(int i, int i2) {
        return mutableIntListOf(i, i2);
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i);
        return mutableIntList;
    }

    @NotNull
    public static final IntList intListOf(int i, int i2, int i3) {
        return mutableIntListOf(i, i2, i3);
    }

    @NotNull
    public static final IntList intListOf() {
        return EmptyIntList;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i, int i2) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i);
        mutableIntList.add(i2);
        return mutableIntList;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(@NotNull int... iArr) {
        iArr.getClass();
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.addAll(mutableIntList._size, iArr);
        return mutableIntList;
    }
}
