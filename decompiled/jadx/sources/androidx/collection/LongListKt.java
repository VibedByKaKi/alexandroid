package androidx.collection;

import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\u001a2\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0001\u001a\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a\u001e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r\u001a\u0012\u0010\u000b\u001a\u00020\u00012\n\u0010\u0010\u001a\u00020\u0011\"\u00020\r\u001a\t\u0010\u0012\u001a\u00020\u0005H\u0086\b\u001a\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r\u001a\u0015\u0010\u0012\u001a\u00020\u00052\n\u0010\u0010\u001a\u00020\u0011\"\u00020\rH\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"EmptyLongList", "Landroidx/collection/LongList;", "buildLongList", "builderAction", "Lkotlin/Function1;", "Landroidx/collection/MutableLongList;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyLongList", "longListOf", "element1", "", "element2", "element3", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "mutableLongListOf", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,972:1\n1#2:973\n673#3,2:974\n713#3,2:976\n713#3,2:978\n713#3,2:980\n713#3,2:982\n713#3,2:984\n713#3,2:986\n673#3,2:988\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n905#1:974,2\n913#1:976,2\n920#1:978,2\n921#1:980,2\n931#1:982,2\n932#1:984,2\n933#1:986,2\n939#1:988,2\n*E\n"})
/* loaded from: classes.dex */
public final class LongListKt {

    @NotNull
    private static final LongList EmptyLongList = new MutableLongList(0);

    @NotNull
    public static final LongList buildLongList(@NotNull Function1<? super MutableLongList, Unit> function1) {
        function1.getClass();
        MutableLongList mutableLongList = new MutableLongList(0, 1, null);
        function1.invoke(mutableLongList);
        return mutableLongList;
    }

    @NotNull
    public static final LongList emptyLongList() {
        return EmptyLongList;
    }

    @NotNull
    public static final LongList longListOf(@NotNull long... jArr) {
        jArr.getClass();
        MutableLongList mutableLongList = new MutableLongList(jArr.length);
        mutableLongList.addAll(mutableLongList._size, jArr);
        return mutableLongList;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long j, long j2, long j3) {
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j);
        mutableLongList.add(j2);
        mutableLongList.add(j3);
        return mutableLongList;
    }

    @NotNull
    public static final LongList buildLongList(int i, @NotNull Function1<? super MutableLongList, Unit> function1) {
        function1.getClass();
        MutableLongList mutableLongList = new MutableLongList(i);
        function1.invoke(mutableLongList);
        return mutableLongList;
    }

    @NotNull
    public static final LongList longListOf(long j) {
        return mutableLongListOf(j);
    }

    @NotNull
    public static final LongList longListOf(long j, long j2) {
        return mutableLongListOf(j, j2);
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long j) {
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j);
        return mutableLongList;
    }

    @NotNull
    public static final LongList longListOf(long j, long j2, long j3) {
        return mutableLongListOf(j, j2, j3);
    }

    @NotNull
    public static final LongList longListOf() {
        return EmptyLongList;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long j, long j2) {
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j);
        mutableLongList.add(j2);
        return mutableLongList;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(@NotNull long... jArr) {
        jArr.getClass();
        MutableLongList mutableLongList = new MutableLongList(jArr.length);
        mutableLongList.addAll(mutableLongList._size, jArr);
        return mutableLongList;
    }
}
