package kotlin.collections;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a/\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0006\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003\"\u0002H\u0002¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u0010\"\u0004\b\u0000\u0010\u0002H\u0087\b¢\u0006\u0002\u0010\u0011\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r\"\u0004\b\u0000\u0010\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003\"\u0002H\u0002¢\u0006\u0002\u0010\u000b\u001a5\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u0010\"\u0004\b\u0000\u0010\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003\"\u0002H\u0002¢\u0006\u0002\u0010\u0012\u001a%\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0016\u001a3\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00142\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00020\u0003\"\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u000b\u001aC\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0018\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002H\u00020\u001bH\u0087\bø\u0001\u0000\u001aC\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0018\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002H\u00020\u001bH\u0087\bø\u0001\u0000\u001aF\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\b\"\u0004\b\u0000\u0010!2\u001f\b\u0001\u0010\"\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0\r\u0012\u0004\u0012\u00020#0\u001b¢\u0006\u0002\b$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aN\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\b\"\u0004\b\u0000\u0010!2\u0006\u0010%\u001a\u00020\u00192\u001f\b\u0001\u0010\"\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0\r\u0012\u0004\u0012\u00020#0\u001b¢\u0006\u0002\b$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0019\u0010-\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\b\u001a,\u0010.\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a!\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a!\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\bH\u0087\b\u001aH\u00100\u001a\u0002H1\"\u0010\b\u0000\u00102*\u0006\u0012\u0002\b\u00030\u0001*\u0002H1\"\u0004\b\u0001\u00101*\u0002H22\f\u00103\u001a\b\u0012\u0004\u0012\u0002H104H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u00105\u001a,\u00106\u001a\u00020\u0005\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b7*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\b\u001a&\u00108\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u0002092\u0006\u0010:\u001a\u00020;H\u0007\u001a\u001e\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0000\u001aE\u0010=\u001a\u00020\u0019\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020>*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u0001H\u00022\b\b\u0002\u0010?\u001a\u00020\u00192\b\b\u0002\u0010@\u001a\u00020\u0019¢\u0006\u0002\u0010A\u001aS\u0010=\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\u0015\u001a\u0002H\u00022\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`D2\b\b\u0002\u0010?\u001a\u00020\u00192\b\b\u0002\u0010@\u001a\u00020\u0019¢\u0006\u0002\u0010E\u001ag\u0010F\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010G*\b\u0012\u0004\u0012\u0002HG0>*\b\u0012\u0004\u0012\u0002H\u00020\b2\b\u0010H\u001a\u0004\u0018\u0001HG2\b\b\u0002\u0010?\u001a\u00020\u00192\b\b\u0002\u0010@\u001a\u00020\u00192\u0016\b\u0004\u0010I\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001HG0\u001bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010J\u001a>\u0010=\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\b\b\u0002\u0010?\u001a\u00020\u00192\b\b\u0002\u0010@\u001a\u00020\u00192\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00190\u001b\u001a%\u0010L\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0019H\u0002¢\u0006\u0002\bM\u001a\b\u0010N\u001a\u00020#H\u0001\u001a\b\u0010O\u001a\u00020#H\u0001\u001a!\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00032\n\u0010Q\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0002\u0010R\u001a3\u0010P\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u00022\n\u0010Q\u001a\u0006\u0012\u0002\b\u00030\u00012\f\u0010S\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¢\u0006\u0002\u0010T\"\u0019\u0010&\u001a\u00020'*\u0006\u0012\u0002\b\u00030\u00018F¢\u0006\u0006\u001a\u0004\b(\u0010)\"!\u0010*\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006U"}, d2 = {"asCollection", "", ExifInterface.GPS_DIRECTION_TRUE, "", "isVarargs", "", "([Ljava/lang/Object;Z)Ljava/util/Collection;", "emptyList", "", "listOf", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "([Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "()Ljava/util/ArrayList;", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "listOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "List", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "buildList", ExifInterface.LONGITUDE_EAST, "builderAction", "", "Lkotlin/ExtensionFunctionType;", "capacity", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "(Ljava/util/List;)I", "isNotEmpty", "isNullOrEmpty", "orEmpty", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "containsAll", "Lkotlin/internal/OnlyInputTypes;", "shuffled", "", "random", "Lkotlin/random/Random;", "optimizeReadOnlyList", "binarySearch", "", "fromIndex", "toIndex", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "comparison", "rangeCheck", "rangeCheck$CollectionsKt__CollectionsKt", "throwIndexOverflow", "throwCountOverflow", "collectionToArrayCommonImpl", "collection", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n1#2:528\n*E\n"})
/* loaded from: classes10.dex */
public class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> List(int i, Function1<? super Integer, ? extends T> function1) {
        function1.getClass();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(function1.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> MutableList(int i, Function1<? super Integer, ? extends T> function1) {
        function1.getClass();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(function1.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @NotNull
    public static <T> ArrayList<T> arrayListOf(@NotNull T... tArr) {
        tArr.getClass();
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(asCollection(tArr, true));
    }

    @NotNull
    public static final <T> Collection<T> asCollection(@NotNull T[] tArr, boolean z) {
        tArr.getClass();
        return new ArrayAsCollection(tArr, z);
    }

    public static /* synthetic */ Collection asCollection$default(Object[] objArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return asCollection(objArr, z);
    }

    public static <T> int binarySearch(@NotNull List<? extends T> list, int i, int i2, @NotNull Function1<? super T, Integer> function1) {
        list.getClass();
        function1.getClass();
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = function1.invoke(list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else {
                if (intValue <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return binarySearch((List<? extends Comparable>) list, comparable, i, i2);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(@NotNull List<? extends T> list, @Nullable K k, int i, int i2, @NotNull Function1<? super T, ? extends K> function1) {
        list.getClass();
        function1.getClass();
        return binarySearch(list, i, i2, new CollectionsKt__CollectionsKt$binarySearchBy$1(function1, k));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        list.getClass();
        function1.getClass();
        return binarySearch(list, i, i2, new CollectionsKt__CollectionsKt$binarySearchBy$1(function1, comparable));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <E> List<E> buildList(@BuilderInference Function1<? super List<E>, Unit> function1) {
        function1.getClass();
        List createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        function1.invoke(createListBuilder);
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    @NotNull
    public static final <T> T[] collectionToArrayCommonImpl(@NotNull Collection<?> collection, @NotNull T[] tArr) {
        collection.getClass();
        tArr.getClass();
        int i = 0;
        if (collection.isEmpty()) {
            return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(0, tArr);
        }
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < collection.size()) {
            objArr = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, collection.size());
        }
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = it2.next();
            i++;
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(collection.size(), objArr);
    }

    @InlineOnly
    private static final <T> boolean containsAll(Collection<? extends T> collection, Collection<? extends T> collection2) {
        collection.getClass();
        collection2.getClass();
        return collection.containsAll(collection2);
    }

    @NotNull
    public static <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    @NotNull
    public static IntRange getIndices(@NotNull Collection<?> collection) {
        collection.getClass();
        return new IntRange(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(@NotNull List<? extends T> list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Collection collection, Function0 function0) {
        function0.getClass();
        return collection.isEmpty() ? function0.invoke() : collection;
    }

    @InlineOnly
    private static final <T> boolean isNotEmpty(Collection<? extends T> collection) {
        collection.getClass();
        return !collection.isEmpty();
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> boolean isNullOrEmpty(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @NotNull
    public static <T> List<T> listOf(@NotNull T... tArr) {
        tArr.getClass();
        return tArr.length > 0 ? ArraysKt___ArraysJvmKt.asList(tArr) : emptyList();
    }

    @NotNull
    public static <T> List<T> listOfNotNull(@Nullable T t) {
        return t != null ? CollectionsKt__CollectionsJVMKt.listOf(t) : emptyList();
    }

    @NotNull
    public static <T> List<T> mutableListOf(@NotNull T... tArr) {
        tArr.getClass();
        return tArr.length == 0 ? new ArrayList() : new ArrayList(asCollection(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> optimizeReadOnlyList(@NotNull List<? extends T> list) {
        list.getClass();
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt__CollectionsJVMKt.listOf(list.get(0)) : emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Collection<T> orEmpty(Collection<? extends T> collection) {
        return collection == 0 ? emptyList() : collection;
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i, int i2, int i3) {
        if (i2 > i3) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(i2, i3, "fromIndex (", ") is greater than toIndex (", ")."));
        } else if (i2 < 0) {
            XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i2, "fromIndex (", ") is less than zero."));
        } else {
            if (i3 <= i) {
                return;
            }
            XML$$ExternalSyntheticBUOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m(i3, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        iterable.getClass();
        random.getClass();
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        CollectionsKt___CollectionsKt.shuffle(mutableList, random);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> List<T> orEmpty(List<? extends T> list) {
        return list == 0 ? emptyList() : list;
    }

    @NotNull
    public static <T> List<T> listOfNotNull(@NotNull T... tArr) {
        tArr.getClass();
        return ArraysKt___ArraysKt.filterNotNull(tArr);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <E> List<E> buildList(int i, @BuilderInference Function1<? super List<E>, Unit> function1) {
        function1.getClass();
        List createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(i);
        function1.invoke(createListBuilder);
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    @InlineOnly
    private static final <T> List<T> listOf() {
        return emptyList();
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return binarySearch(list, obj, comparator, i, i2);
    }

    public static /* synthetic */ int binarySearch$default(List list, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return binarySearch(list, i, i2, function1);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList<>();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    public static final <T> int binarySearch(@NotNull List<? extends T> list, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        list.getClass();
        comparator.getClass();
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare(list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else {
                if (compare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(@NotNull List<? extends T> list, @Nullable T t, int i, int i2) {
        list.getClass();
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compareValues = ComparisonsKt.compareValues(list.get(i4), t);
            if (compareValues < 0) {
                i = i4 + 1;
            } else {
                if (compareValues <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    @NotNull
    public static final Object[] collectionToArrayCommonImpl(@NotNull Collection<?> collection) {
        collection.getClass();
        int i = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = it2.next();
            i++;
        }
        return objArr;
    }
}
