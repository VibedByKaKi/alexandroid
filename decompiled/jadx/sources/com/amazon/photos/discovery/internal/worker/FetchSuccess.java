package com.amazon.photos.discovery.internal.worker;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.discovery.internal.model.MutableLocalItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/photos/discovery/internal/worker/FetchSuccess;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/photos/discovery/internal/worker/FetchResult;", "batch", "", "Lcom/amazon/photos/discovery/internal/model/MutableLocalItem;", "(Ljava/util/List;)V", "getBatch", "()Ljava/util/List;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FetchSuccess<T> extends FetchResult<T> {

    @NotNull
    private final List<MutableLocalItem> batch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchSuccess(@NotNull List<MutableLocalItem> list) {
        super(null);
        list.getClass();
        this.batch = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchSuccess copy$default(FetchSuccess fetchSuccess, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fetchSuccess.batch;
        }
        return fetchSuccess.copy(list);
    }

    @NotNull
    public final List<MutableLocalItem> component1() {
        return this.batch;
    }

    @NotNull
    public final FetchSuccess<T> copy(@NotNull List<MutableLocalItem> batch) {
        batch.getClass();
        return new FetchSuccess<>(batch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FetchSuccess) && Intrinsics.areEqual(this.batch, ((FetchSuccess) other).batch);
    }

    @NotNull
    public final List<MutableLocalItem> getBatch() {
        return this.batch;
    }

    public int hashCode() {
        return this.batch.hashCode();
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(new StringBuilder("FetchSuccess(batch="), (List) this.batch, ')');
    }
}
