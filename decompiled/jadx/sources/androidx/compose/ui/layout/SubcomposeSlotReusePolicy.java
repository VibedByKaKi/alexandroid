package androidx.compose.ui.layout;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.OrderedScatterSetKt;
import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.metrics.MetricsConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "getSlotsToRetain", "", "slotIds", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "areCompatible", "", Constants.SubmitFeedbackContentDetails.REQUEST_SLOT_ID, "reusableSlotId", "SlotIdsSet", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SubcomposeSlotReusePolicy {
    boolean areCompatible(@Nullable Object slotId, @Nullable Object reusableSlotId);

    void getSlotsToRetain(@NotNull SlotIdsSet slotIds);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0016J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0017\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\b\u0017J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0019H\u0096\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u001b\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u001b\u001a\u00020\u00102\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00100\u001eJ\u0016\u0010\u001f\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u001f\u001a\u00020\u00102\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00100\u001eJ\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\fJ\u001c\u0010$\u001a\u00020!2\u0014\u0010%\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020!0\u001eJ\u001f\u0010&\u001a\u00020!2\u0014\u0010%\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020!0\u001eH\u0086\bR$\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006'"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "", "set", "Landroidx/collection/MutableOrderedScatterSet;", "<init>", "(Landroidx/collection/MutableOrderedScatterSet;)V", "getSet$annotations", "()V", "getSet", "()Landroidx/collection/MutableOrderedScatterSet;", "size", "", "getSize", "()I", "isEmpty", "", "containsAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "contains", "element", BulkOperationType.add, Constants.SubmitFeedbackContentDetails.REQUEST_SLOT_ID, "add$ui_release", "iterator", "", BulkOperationType.remove, "removeAll", "slotIds", "predicate", "Lkotlin/Function1;", "retainAll", MetricsConstants.Method.CACHE_CLEAR, "", "trimToSize", "maxSlotsToRetainForReuse", "forEach", "block", "fastForEach", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n+ 4 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1351:1\n1863#2,2:1352\n938#3,2:1354\n941#3,4:1370\n945#3:1380\n1009#3,3:1381\n1013#3,4:1398\n1017#3:1408\n269#4,7:1356\n280#4,3:1364\n283#4,2:1368\n286#4,6:1374\n269#4,7:1384\n280#4,3:1392\n283#4,2:1396\n286#4,6:1402\n301#4,7:1409\n308#4,4:1417\n301#4,7:1421\n308#4,4:1429\n1399#5:1363\n1270#5:1367\n1399#5:1391\n1270#5:1395\n1123#6:1416\n1123#6:1428\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n*L\n406#1:1352,2\n441#1:1354,2\n441#1:1370,4\n441#1:1380\n457#1:1381,3\n457#1:1398,4\n457#1:1408\n441#1:1356,7\n441#1:1364,3\n441#1:1368,2\n441#1:1374,6\n457#1:1384,7\n457#1:1392,3\n457#1:1396,2\n457#1:1402,6\n478#1:1409,7\n478#1:1417,4\n489#1:1421,7\n489#1:1429,4\n441#1:1363\n441#1:1367\n457#1:1391\n457#1:1395\n478#1:1416\n489#1:1428\n*E\n"})
    public static final class SlotIdsSet implements Collection<Object>, KMappedMarker {
        public static final int $stable = 8;

        @NotNull
        private final MutableOrderedScatterSet<Object> set;

        public /* synthetic */ SlotIdsSet(MutableOrderedScatterSet mutableOrderedScatterSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? OrderedScatterSetKt.mutableOrderedScatterSetOf() : mutableOrderedScatterSet);
        }

        @Override // java.util.Collection
        /* renamed from: add$ui_release, reason: merged with bridge method [inline-methods] */
        public final boolean add(@Nullable Object slotId) {
            return this.set.add(slotId);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        @Override // java.util.Collection
        public boolean contains(@Nullable Object element) {
            return this.set.contains(element);
        }

        @Override // java.util.Collection
        public boolean containsAll(@NotNull Collection<?> elements) {
            Iterator<T> it2 = elements.iterator();
            while (it2.hasNext()) {
                if (!this.set.contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        public final void fastForEach(@NotNull Function1<Object, Unit> block) {
            MutableOrderedScatterSet<Object> set = getSet();
            Object[] objArr = set.elements;
            long[] jArr = set.nodes;
            int i = set.tail;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
                block.invoke(objArr[i]);
                i = i2;
            }
        }

        public final void forEach(@NotNull Function1<Object, Unit> block) {
            MutableOrderedScatterSet<Object> mutableOrderedScatterSet = this.set;
            Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.nodes;
            int i = mutableOrderedScatterSet.tail;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
                block.invoke(objArr[i]);
                i = i2;
            }
        }

        @NotNull
        public final MutableOrderedScatterSet<Object> getSet() {
            return this.set;
        }

        public int getSize() {
            return this.set.get_size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<Object> iterator() {
            return this.set.asMutableSet().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@Nullable Object slotId) {
            return this.set.remove(slotId);
        }

        public final boolean removeAll(@NotNull Function1<Object, Boolean> predicate) {
            int i = this.set.get_size();
            MutableOrderedScatterSet<Object> mutableOrderedScatterSet = this.set;
            Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (predicate.invoke(objArr[i5]).booleanValue()) {
                                    mutableOrderedScatterSet.removeElementAt(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i != this.set.get_size();
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(@NotNull Function1<Object, Boolean> predicate) {
            MutableOrderedScatterSet<Object> mutableOrderedScatterSet = this.set;
            Object[] objArr = mutableOrderedScatterSet.elements;
            int i = mutableOrderedScatterSet.get_size();
            long[] jArr = mutableOrderedScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (!predicate.invoke(objArr[i5]).booleanValue()) {
                                    mutableOrderedScatterSet.removeElementAt(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i != mutableOrderedScatterSet.get_size();
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        public final void trimToSize(int maxSlotsToRetainForReuse) {
            this.set.trimToSize(maxSlotsToRetainForReuse);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        public SlotIdsSet(@NotNull MutableOrderedScatterSet<Object> mutableOrderedScatterSet) {
            this.set = mutableOrderedScatterSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SlotIdsSet() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @PublishedApi
        public static /* synthetic */ void getSet$annotations() {
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NotNull Collection<?> slotIds) {
            return this.set.retainAll((Collection<? extends Object>) slotIds);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NotNull Collection<?> slotIds) {
            return this.set.remove(slotIds);
        }
    }
}
