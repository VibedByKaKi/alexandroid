package com.amazon.photos.discovery.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/photos/discovery/model/LocalFolderStats;", "", "folderId", "", "itemCount", "(JJ)V", "getFolderId", "()J", "getItemCount", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LocalFolderStats {
    private final long folderId;
    private final long itemCount;

    public LocalFolderStats(long j, long j2) {
        this.folderId = j;
        this.itemCount = j2;
    }

    public static /* synthetic */ LocalFolderStats copy$default(LocalFolderStats localFolderStats, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = localFolderStats.folderId;
        }
        if ((i & 2) != 0) {
            j2 = localFolderStats.itemCount;
        }
        return localFolderStats.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFolderId() {
        return this.folderId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getItemCount() {
        return this.itemCount;
    }

    @NotNull
    public final LocalFolderStats copy(long folderId, long itemCount) {
        return new LocalFolderStats(folderId, itemCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalFolderStats)) {
            return false;
        }
        LocalFolderStats localFolderStats = (LocalFolderStats) other;
        return this.folderId == localFolderStats.folderId && this.itemCount == localFolderStats.itemCount;
    }

    public final long getFolderId() {
        return this.folderId;
    }

    public final long getItemCount() {
        return this.itemCount;
    }

    public int hashCode() {
        return Long.hashCode(this.itemCount) + (Long.hashCode(this.folderId) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LocalFolderStats(folderId=");
        sb.append(this.folderId);
        sb.append(", itemCount=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.itemCount, ')');
    }
}
