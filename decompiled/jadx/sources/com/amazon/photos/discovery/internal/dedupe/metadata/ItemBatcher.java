package com.amazon.photos.discovery.internal.dedupe.metadata;

import androidx.annotation.WorkerThread;
import com.amazon.photos.discovery.internal.util.DateUtils;
import com.amazon.photos.discovery.model.LocalItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010*\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015J(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/amazon/photos/discovery/internal/dedupe/metadata/ItemBatcher;", "", "dayAggregations", "Lcom/amazon/photos/discovery/internal/dedupe/metadata/DayAggregations;", "(Lcom/amazon/photos/discovery/internal/dedupe/metadata/DayAggregations;)V", "addItemToBatch", "", "item", "Lcom/amazon/photos/discovery/model/LocalItem;", "listNodesBatch", "Lcom/amazon/photos/discovery/internal/dedupe/metadata/ListNodesBatch;", "computeEnd", "", "utcTime", "computeStart", "createBatch", "localItemItr", "", "createBatches", "", "localItems", "", "sameDayRanges", "startA", "endA", "startB", "endB", "Companion", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WorkerThread
/* loaded from: classes5.dex */
public final class ItemBatcher {
    private static final int MAX_BATCH_RESULTS = 200;
    private static final long TIMEZONE_MAX_NEG_OFFSET;
    private static final long TIMEZONE_MAX_POS_OFFSET;

    @NotNull
    private final DayAggregations dayAggregations;

    static {
        long j = 2000;
        TIMEZONE_MAX_POS_OFFSET = 50400000 + j;
        TIMEZONE_MAX_NEG_OFFSET = 43200000 + j;
    }

    public ItemBatcher(@NotNull DayAggregations dayAggregations) {
        dayAggregations.getClass();
        this.dayAggregations = dayAggregations;
    }

    private final boolean addItemToBatch(LocalItem item, ListNodesBatch listNodesBatch) {
        if (item.getDateTaken() == 0) {
            return true;
        }
        long computeStart = computeStart(item.getDateTaken());
        long computeEnd = computeEnd(item.getDateTaken());
        long countForRange = this.dayAggregations.getCountForRange(computeStart, computeEnd);
        if (countForRange == 0) {
            return true;
        }
        if (listNodesBatch.getLocalItems().isEmpty()) {
            listNodesBatch.add(item, computeStart, computeEnd);
            listNodesBatch.setExpectedResultCount(countForRange);
            return true;
        }
        long rangeStart = listNodesBatch.getRangeStart();
        long rangeEnd = listNodesBatch.getRangeEnd();
        long j = computeStart < rangeStart ? computeStart : rangeStart;
        long j2 = computeEnd > rangeEnd ? computeEnd : rangeEnd;
        boolean sameDayRanges = sameDayRanges(j, j2, rangeStart, rangeEnd);
        long j3 = j;
        long j4 = j2;
        if (sameDayRanges) {
            listNodesBatch.add(item, rangeStart, rangeEnd);
            return true;
        }
        long countForRange2 = this.dayAggregations.getCountForRange(j3, j4);
        if (countForRange2 != listNodesBatch.getExpectedResultCount() && countForRange2 > 200) {
            return false;
        }
        listNodesBatch.add(item, computeStart, computeEnd);
        listNodesBatch.setExpectedResultCount(countForRange2);
        return true;
    }

    private final long computeEnd(long utcTime) {
        return utcTime + TIMEZONE_MAX_POS_OFFSET;
    }

    private final long computeStart(long utcTime) {
        return utcTime - TIMEZONE_MAX_NEG_OFFSET;
    }

    private final ListNodesBatch createBatch(ListIterator<LocalItem> localItemItr) {
        ListNodesBatch listNodesBatch = new ListNodesBatch();
        boolean z = false;
        while (localItemItr.hasNext() && !z) {
            boolean addItemToBatch = addItemToBatch(localItemItr.next(), listNodesBatch);
            boolean z2 = !addItemToBatch;
            if (!addItemToBatch) {
                localItemItr.previous();
            }
            z = z2;
        }
        return listNodesBatch;
    }

    private final boolean sameDayRanges(long startA, long endA, long startB, long endB) {
        DateUtils dateUtils = DateUtils.INSTANCE;
        return Intrinsics.areEqual(dateUtils.getDayString(startA), dateUtils.getDayString(startB)) && Intrinsics.areEqual(dateUtils.getDayString(endA), dateUtils.getDayString(endB));
    }

    @NotNull
    public final List<ListNodesBatch> createBatches(@NotNull Collection<LocalItem> localItems) {
        localItems.getClass();
        ArrayList arrayList = new ArrayList();
        ListIterator<LocalItem> listIterator = new ArrayList(localItems).listIterator();
        listIterator.getClass();
        while (listIterator.hasNext()) {
            ListNodesBatch createBatch = createBatch(listIterator);
            if (createBatch.isNotEmpty()) {
                arrayList.add(createBatch);
            }
        }
        return arrayList;
    }
}
