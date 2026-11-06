package com.amazon.photos.discovery.internal.worker;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.featureservice.constants.FeatureServiceMetrics;
import com.amazon.photos.discovery.internal.model.MutableLocalItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u0004\u0018\u00018\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH&J\b\u0010\f\u001a\u00020\rH&J\r\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/amazon/photos/discovery/internal/worker/TraverseOperations;", ExifInterface.GPS_DIRECTION_TRUE, "", "batchOperation", "batch", "", "Lcom/amazon/photos/discovery/internal/model/MutableLocalItem;", "(Ljava/util/List;)Ljava/lang/Object;", FeatureServiceMetrics.EventType.PREFETCH_COMPLETED, "()Ljava/lang/Object;", "fetchOneBatch", "Lcom/amazon/photos/discovery/internal/worker/FetchResult;", "init", "", "stopped", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TraverseOperations<T> {
    @Nullable
    T batchOperation(@NotNull List<MutableLocalItem> batch);

    T completed();

    @NotNull
    FetchResult<T> fetchOneBatch();

    void init();

    T stopped();
}
