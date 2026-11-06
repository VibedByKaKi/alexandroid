package com.amazon.photos.autosave.internal.utils;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0000¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"traverseAllByBatch", ExifInterface.GPS_DIRECTION_TRUE, "operations", "Lcom/amazon/photos/autosave/internal/utils/TraverseOperations;", "(Lcom/amazon/photos/autosave/internal/utils/TraverseOperations;)Ljava/lang/Object;", "AndroidPhotosAutosave_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BatchOperationUtilsKt {
    public static final <T> T traverseAllByBatch(@NotNull TraverseOperations<T> traverseOperations) {
        traverseOperations.getClass();
        boolean z = false;
        T t = null;
        try {
            traverseOperations.init();
            while (!z && t == null) {
                FetchResult<T> fetchOneBatch = traverseOperations.fetchOneBatch();
                if (fetchOneBatch instanceof FetchFailure) {
                    t = (T) ((FetchFailure) fetchOneBatch).getFailureResult();
                } else if ((fetchOneBatch instanceof FetchSuccess) && ((FetchSuccess) fetchOneBatch).getBatch().isEmpty()) {
                    z = true;
                } else if (fetchOneBatch instanceof FetchSuccess) {
                    t = traverseOperations.batchOperation(((FetchSuccess) fetchOneBatch).getBatch());
                }
            }
            if (z) {
                return traverseOperations.completed();
            }
            return t == null ? traverseOperations.stopped() : t;
        } catch (Throwable unused) {
            if (z) {
                return traverseOperations.completed();
            }
            return t == null ? traverseOperations.stopped() : t;
        }
    }
}
