package com.amazon.photos.discovery.internal.dedupe.metadata;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.photos.discovery.model.LocalItem;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010 \u001a\u00020\u000eJ\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u0006\u0010$\u001a\u00020%R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u000fj\b\u0012\u0004\u0012\u00020\u0005`\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u001e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\t¨\u0006&"}, d2 = {"Lcom/amazon/photos/discovery/internal/dedupe/metadata/ListNodesBatch;", "", "()V", "_localItems", "Ljava/util/LinkedList;", "Lcom/amazon/photos/discovery/model/LocalItem;", "expectedResultCount", "", "getExpectedResultCount", "()J", "setExpectedResultCount", "(J)V", "fileNameMap", "Ljava/util/LinkedHashMap;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "localItems", "", "getLocalItems", "()Ljava/util/List;", "<set-?>", "rangeEnd", "getRangeEnd", "rangeStart", "getRangeStart", BulkOperationType.add, "", "item", "itemRangeStart", "itemRangeEnd", "getLocalItemsByName", "fileName", "isEmpty", "", "isNotEmpty", "size", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListNodesBatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListNodesBatch.kt\ncom/amazon/photos/discovery/internal/dedupe/metadata/ListNodesBatch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
/* loaded from: classes5.dex */
public final class ListNodesBatch {

    @NotNull
    private final LinkedList<LocalItem> _localItems;
    private long expectedResultCount;

    @NotNull
    private final LinkedHashMap<String, ArrayList<LocalItem>> fileNameMap = new LinkedHashMap<>();

    @NotNull
    private final List<LocalItem> localItems;
    private long rangeEnd;
    private long rangeStart;

    public ListNodesBatch() {
        LinkedList<LocalItem> linkedList = new LinkedList<>();
        this._localItems = linkedList;
        this.localItems = linkedList;
        this.rangeStart = Long.MAX_VALUE;
        this.rangeEnd = Long.MIN_VALUE;
    }

    public final void add(@NotNull LocalItem item, long itemRangeStart, long itemRangeEnd) {
        item.getClass();
        String filePath = item.getFilePath();
        if (filePath == null) {
            return;
        }
        String name = new File(filePath).getName();
        if (!this.fileNameMap.containsKey(name)) {
            LinkedHashMap<String, ArrayList<LocalItem>> linkedHashMap = this.fileNameMap;
            name.getClass();
            linkedHashMap.put(name, new ArrayList<>());
        }
        this._localItems.add(item);
        ArrayList<LocalItem> arrayList = this.fileNameMap.get(name);
        if (arrayList != null) {
            arrayList.add(item);
        }
        if (itemRangeStart < this.rangeStart) {
            this.rangeStart = itemRangeStart;
        }
        if (itemRangeEnd > this.rangeEnd) {
            this.rangeEnd = itemRangeEnd;
        }
    }

    public final long getExpectedResultCount() {
        return this.expectedResultCount;
    }

    @NotNull
    public final List<LocalItem> getLocalItems() {
        return this.localItems;
    }

    @NotNull
    public final List<LocalItem> getLocalItemsByName(@NotNull String fileName) {
        fileName.getClass();
        ArrayList<LocalItem> arrayList = this.fileNameMap.get(fileName);
        if (arrayList == null) {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    public final long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final boolean isEmpty() {
        return this.localItems.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.localItems.isEmpty();
    }

    public final void setExpectedResultCount(long j) {
        this.expectedResultCount = j;
    }

    public final int size() {
        return this.localItems.size();
    }
}
