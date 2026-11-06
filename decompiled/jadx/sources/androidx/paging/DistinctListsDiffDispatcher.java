package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0001H\u0002J4\u0010\r\u001a\u00020\u0004\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010¨\u0006\u0012"}, d2 = {"Landroidx/paging/DistinctListsDiffDispatcher;", "", "()V", "dispatchChange", "", "callback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "startBoundary", "", "endBoundary", "start", "end", "payload", "dispatchDiff", ExifInterface.GPS_DIRECTION_TRUE, "oldList", "Landroidx/paging/NullPaddedList;", "newList", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DistinctListsDiffDispatcher {

    @NotNull
    public static final DistinctListsDiffDispatcher INSTANCE = new DistinctListsDiffDispatcher();

    private DistinctListsDiffDispatcher() {
    }

    private final void dispatchChange(ListUpdateCallback callback, int startBoundary, int endBoundary, int start, int end, Object payload) {
        int i = startBoundary - start;
        if (i > 0) {
            callback.onChanged(start, i, payload);
        }
        int i2 = end - endBoundary;
        if (i2 > 0) {
            callback.onChanged(endBoundary, i2, payload);
        }
    }

    public final <T> void dispatchDiff(@NotNull ListUpdateCallback callback, @NotNull NullPaddedList<T> oldList, @NotNull NullPaddedList<T> newList) {
        callback.getClass();
        oldList.getClass();
        newList.getClass();
        int max = Math.max(oldList.getPlaceholdersBefore(), newList.getPlaceholdersBefore());
        int min = Math.min(oldList.getStorageCount() + oldList.getPlaceholdersBefore(), newList.getStorageCount() + newList.getPlaceholdersBefore());
        int i = min - max;
        if (i > 0) {
            callback.onRemoved(max, i);
            callback.onInserted(max, i);
        }
        int min2 = Math.min(max, min);
        int max2 = Math.max(max, min);
        dispatchChange(callback, min2, max2, RangesKt.coerceAtMost(oldList.getPlaceholdersBefore(), newList.getSize()), RangesKt.coerceAtMost(oldList.getStorageCount() + oldList.getPlaceholdersBefore(), newList.getSize()), DiffingChangePayload.ITEM_TO_PLACEHOLDER);
        dispatchChange(callback, min2, max2, RangesKt.coerceAtMost(newList.getPlaceholdersBefore(), oldList.getSize()), RangesKt.coerceAtMost(newList.getStorageCount() + newList.getPlaceholdersBefore(), oldList.getSize()), DiffingChangePayload.PLACEHOLDER_TO_ITEM);
        int size = newList.getSize() - oldList.getSize();
        if (size > 0) {
            callback.onInserted(oldList.getSize(), size);
        } else if (size < 0) {
            callback.onRemoved(oldList.getSize() + size, -size);
        }
    }
}
