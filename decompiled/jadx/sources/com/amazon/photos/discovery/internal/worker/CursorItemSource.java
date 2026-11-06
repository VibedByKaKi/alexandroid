package com.amazon.photos.discovery.internal.worker;

import android.database.Cursor;
import com.amazon.clouddrive.android.core.interfaces.MetricRecordingType;
import com.amazon.clouddrive.android.core.interfaces.Metrics;
import com.amazon.photos.discovery.internal.ConstantsKt;
import com.amazon.photos.discovery.internal.model.MutableLocalItem;
import com.amazon.photos.discovery.internal.util.RetryableOperationUtil;
import com.amazon.photos.discovery.metrics.DiscoveryMetrics;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00020\u0003H$J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\bH$J \u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0004R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u000b\u0010\f*\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/photos/discovery/internal/worker/CursorItemSource;", "Lcom/amazon/photos/discovery/internal/worker/ItemSource;", "lastAddedRowId", "", "metrics", "Lcom/amazon/clouddrive/android/core/interfaces/Metrics;", "(JLcom/amazon/clouddrive/android/core/interfaces/Metrics;)V", "cursor", "Landroid/database/Cursor;", "getCursor$delegate", "(Lcom/amazon/photos/discovery/internal/worker/CursorItemSource;)Ljava/lang/Object;", "getCursor", "()Landroid/database/Cursor;", "cursorDelegate", "Lkotlin/Lazy;", "close", "", "createCursor", "createItem", "Lcom/amazon/photos/discovery/internal/model/MutableLocalItem;", "getItemCount", "", "()Ljava/lang/Integer;", "getNextItem", "itemFromCursor", "selectDateTaken", "dateTaken", "dateModified", "dateAdded", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CursorItemSource implements ItemSource {

    @NotNull
    private final Lazy<Cursor> cursorDelegate;

    @NotNull
    private final Metrics metrics;

    public CursorItemSource(final long j, @NotNull Metrics metrics) {
        metrics.getClass();
        this.metrics = metrics;
        this.cursorDelegate = LazyKt.lazy(new Function0<Cursor>() { // from class: com.amazon.photos.discovery.internal.worker.CursorItemSource$cursorDelegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Cursor invoke() {
                return CursorItemSource.this.createCursor(j);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MutableLocalItem createItem(final Cursor cursor) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        RetryableOperationUtil.INSTANCE.runWithRetry(3, new RetryableOperationUtil.RetryableOperation() { // from class: com.amazon.photos.discovery.internal.worker.CursorItemSource$createItem$1
            @Override // com.amazon.photos.discovery.internal.util.RetryableOperationUtil.RetryableOperation
            public void finalOperation(boolean completed, int numRetry) {
                Metrics metrics;
                Unit unit;
                Metrics metrics2;
                Metrics metrics3;
                if (completed) {
                    if (numRetry < 2) {
                        metrics = this.metrics;
                        metrics.recordSimpleEvent(ConstantsKt.SCAN_ADDED_WORKER_UTIL, DiscoveryMetrics.GetCursorItemSucceedWithException, MetricRecordingType.STANDARD);
                        return;
                    }
                    return;
                }
                Exception exc = objectRef2.element;
                if (exc != null) {
                    metrics3 = this.metrics;
                    metrics3.recordSimpleErrorEvent(ConstantsKt.SCAN_ADDED_WORKER_UTIL, DiscoveryMetrics.GetCursorItemFailed, exc);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    metrics2 = this.metrics;
                    metrics2.recordSimpleEvent(ConstantsKt.SCAN_ADDED_WORKER_UTIL, DiscoveryMetrics.GetCursorItemFailed, MetricRecordingType.STANDARD);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amazon.photos.discovery.internal.util.RetryableOperationUtil.RetryableOperation
            public void handleException(@Nullable Exception e, int numRetry) {
                objectRef2.element = e;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, com.amazon.photos.discovery.internal.model.MutableLocalItem] */
            @Override // com.amazon.photos.discovery.internal.util.RetryableOperationUtil.RetryableOperation
            public void run() {
                objectRef.element = this.itemFromCursor(cursor);
            }
        });
        return (MutableLocalItem) objectRef.element;
    }

    private final Cursor getCursor() {
        return this.cursorDelegate.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Cursor cursor;
        if (!this.cursorDelegate.isInitialized() || (cursor = getCursor()) == null) {
            return;
        }
        cursor.close();
    }

    @Nullable
    public abstract Cursor createCursor(long lastAddedRowId);

    @Override // com.amazon.photos.discovery.internal.worker.ItemSource
    @Nullable
    public Integer getItemCount() {
        Cursor cursor = getCursor();
        if (cursor != null) {
            return Integer.valueOf(cursor.getCount());
        }
        return null;
    }

    @Override // com.amazon.photos.discovery.internal.worker.ItemSource
    @Nullable
    public MutableLocalItem getNextItem() {
        Cursor cursor;
        Cursor cursor2 = getCursor();
        if (cursor2 == null || !cursor2.moveToNext() || (cursor = getCursor()) == null) {
            return null;
        }
        return createItem(cursor);
    }

    @Nullable
    public abstract MutableLocalItem itemFromCursor(@NotNull Cursor cursor);

    public final long selectDateTaken(long dateTaken, long dateModified, long dateAdded) {
        if (dateTaken != 0) {
            return dateTaken;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return dateModified != 0 ? timeUnit.toMillis(dateModified) : timeUnit.toMillis(dateAdded);
    }
}
