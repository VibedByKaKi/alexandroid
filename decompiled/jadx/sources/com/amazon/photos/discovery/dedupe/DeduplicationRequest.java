package com.amazon.photos.discovery.dedupe;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.discovery.dao.DedupeDao;
import com.amazon.photos.discovery.model.UnifiedItem;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/photos/discovery/dedupe/DeduplicationRequest;", "", "unifiedItems", "", "Lcom/amazon/photos/discovery/model/UnifiedItem;", "dedupeDao", "Lcom/amazon/photos/discovery/dao/DedupeDao;", "stageId", "", "(Ljava/util/Collection;Lcom/amazon/photos/discovery/dao/DedupeDao;I)V", "getDedupeDao", "()Lcom/amazon/photos/discovery/dao/DedupeDao;", "getStageId", "()I", "getUnifiedItems", "()Ljava/util/Collection;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeduplicationRequest {

    @NotNull
    private final DedupeDao dedupeDao;
    private final int stageId;

    @NotNull
    private final Collection<UnifiedItem> unifiedItems;

    public DeduplicationRequest(@NotNull Collection<UnifiedItem> collection, @NotNull DedupeDao dedupeDao, int i) {
        collection.getClass();
        dedupeDao.getClass();
        this.unifiedItems = collection;
        this.dedupeDao = dedupeDao;
        this.stageId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeduplicationRequest copy$default(DeduplicationRequest deduplicationRequest, Collection collection, DedupeDao dedupeDao, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            collection = deduplicationRequest.unifiedItems;
        }
        if ((i2 & 2) != 0) {
            dedupeDao = deduplicationRequest.dedupeDao;
        }
        if ((i2 & 4) != 0) {
            i = deduplicationRequest.stageId;
        }
        return deduplicationRequest.copy(collection, dedupeDao, i);
    }

    @NotNull
    public final Collection<UnifiedItem> component1() {
        return this.unifiedItems;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DedupeDao getDedupeDao() {
        return this.dedupeDao;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStageId() {
        return this.stageId;
    }

    @NotNull
    public final DeduplicationRequest copy(@NotNull Collection<UnifiedItem> unifiedItems, @NotNull DedupeDao dedupeDao, int stageId) {
        unifiedItems.getClass();
        dedupeDao.getClass();
        return new DeduplicationRequest(unifiedItems, dedupeDao, stageId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeduplicationRequest)) {
            return false;
        }
        DeduplicationRequest deduplicationRequest = (DeduplicationRequest) other;
        return Intrinsics.areEqual(this.unifiedItems, deduplicationRequest.unifiedItems) && Intrinsics.areEqual(this.dedupeDao, deduplicationRequest.dedupeDao) && this.stageId == deduplicationRequest.stageId;
    }

    @NotNull
    public final DedupeDao getDedupeDao() {
        return this.dedupeDao;
    }

    public final int getStageId() {
        return this.stageId;
    }

    @NotNull
    public final Collection<UnifiedItem> getUnifiedItems() {
        return this.unifiedItems;
    }

    public int hashCode() {
        return Integer.hashCode(this.stageId) + ((this.dedupeDao.hashCode() + (this.unifiedItems.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DeduplicationRequest(unifiedItems=");
        sb.append(this.unifiedItems);
        sb.append(", dedupeDao=");
        sb.append(this.dedupeDao);
        sb.append(", stageId=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.stageId, ')');
    }
}
