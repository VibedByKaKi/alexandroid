package androidx.collection;

import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\u001a2\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0001\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f\u001a\u001e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u0012\u0010\n\u001a\u00020\u00012\n\u0010\u000f\u001a\u00020\u0010\"\u00020\f\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\t\u0010\u0012\u001a\u00020\u0005H\u0086\b\u001a\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f\u001a\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u0015\u0010\u0012\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u0010\"\u00020\fH\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"EmptyDoubleList", "Landroidx/collection/DoubleList;", "buildDoubleList", "builderAction", "Lkotlin/Function1;", "Landroidx/collection/MutableDoubleList;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "doubleListOf", "element1", "", "element2", "element3", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "emptyDoubleList", "mutableDoubleListOf", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n1#1,983:1\n1#2:984\n678#3,2:985\n718#3,2:987\n718#3,2:989\n718#3,2:991\n718#3,2:993\n718#3,2:995\n718#3,2:997\n678#3,2:999\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n*L\n912#1:985,2\n920#1:987,2\n927#1:989,2\n928#1:991,2\n942#1:993,2\n943#1:995,2\n944#1:997,2\n950#1:999,2\n*E\n"})
/* loaded from: classes.dex */
public final class DoubleListKt {

    @NotNull
    private static final DoubleList EmptyDoubleList = new MutableDoubleList(0);

    @NotNull
    public static final DoubleList buildDoubleList(@NotNull Function1<? super MutableDoubleList, Unit> function1) {
        function1.getClass();
        MutableDoubleList mutableDoubleList = new MutableDoubleList(0, 1, null);
        function1.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList doubleListOf(@NotNull double... dArr) {
        dArr.getClass();
        MutableDoubleList mutableDoubleList = new MutableDoubleList(dArr.length);
        mutableDoubleList.addAll(mutableDoubleList._size, dArr);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList emptyDoubleList() {
        return EmptyDoubleList;
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf(double d, double d2, double d3) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(3);
        mutableDoubleList.add(d);
        mutableDoubleList.add(d2);
        mutableDoubleList.add(d3);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList buildDoubleList(int i, @NotNull Function1<? super MutableDoubleList, Unit> function1) {
        function1.getClass();
        MutableDoubleList mutableDoubleList = new MutableDoubleList(i);
        function1.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList doubleListOf(double d) {
        return mutableDoubleListOf(d);
    }

    @NotNull
    public static final DoubleList doubleListOf(double d, double d2) {
        return mutableDoubleListOf(d, d2);
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf(double d) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(1);
        mutableDoubleList.add(d);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList doubleListOf(double d, double d2, double d3) {
        return mutableDoubleListOf(d, d2, d3);
    }

    @NotNull
    public static final DoubleList doubleListOf() {
        return EmptyDoubleList;
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf(double d, double d2) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(2);
        mutableDoubleList.add(d);
        mutableDoubleList.add(d2);
        return mutableDoubleList;
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf() {
        return new MutableDoubleList(0, 1, null);
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf(@NotNull double... dArr) {
        dArr.getClass();
        MutableDoubleList mutableDoubleList = new MutableDoubleList(dArr.length);
        mutableDoubleList.addAll(mutableDoubleList._size, dArr);
        return mutableDoubleList;
    }
}
