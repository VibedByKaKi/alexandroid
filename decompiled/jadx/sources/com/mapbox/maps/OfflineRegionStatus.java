package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes8.dex */
public final class OfflineRegionStatus implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long completedTileCount;
    private final long completedTileSize;

    @NonNull
    private final OfflineRegionDownloadState downloadState;
    private final long requiredResourceCount;
    private final boolean requiredResourceCountIsPrecise;
    private final long requiredTileCount;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionStatus(@NonNull OfflineRegionDownloadState offlineRegionDownloadState, long j, long j2, long j3, long j4, long j5, long j6, boolean z) {
        this.downloadState = offlineRegionDownloadState;
        this.completedResourceCount = j;
        this.completedResourceSize = j2;
        this.completedTileCount = j3;
        this.requiredTileCount = j4;
        this.completedTileSize = j5;
        this.requiredResourceCount = j6;
        this.requiredResourceCountIsPrecise = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionStatus.class != obj.getClass()) {
            return false;
        }
        OfflineRegionStatus offlineRegionStatus = (OfflineRegionStatus) obj;
        return Objects.equals(this.downloadState, offlineRegionStatus.downloadState) && this.completedResourceCount == offlineRegionStatus.completedResourceCount && this.completedResourceSize == offlineRegionStatus.completedResourceSize && this.completedTileCount == offlineRegionStatus.completedTileCount && this.requiredTileCount == offlineRegionStatus.requiredTileCount && this.completedTileSize == offlineRegionStatus.completedTileSize && this.requiredResourceCount == offlineRegionStatus.requiredResourceCount && this.requiredResourceCountIsPrecise == offlineRegionStatus.requiredResourceCountIsPrecise;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getCompletedTileCount() {
        return this.completedTileCount;
    }

    public long getCompletedTileSize() {
        return this.completedTileSize;
    }

    @NonNull
    public OfflineRegionDownloadState getDownloadState() {
        return this.downloadState;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public boolean getRequiredResourceCountIsPrecise() {
        return this.requiredResourceCountIsPrecise;
    }

    public long getRequiredTileCount() {
        return this.requiredTileCount;
    }

    public int hashCode() {
        return Objects.hash(this.downloadState, Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.completedTileCount), Long.valueOf(this.requiredTileCount), Long.valueOf(this.completedTileSize), Long.valueOf(this.requiredResourceCount), Boolean.valueOf(this.requiredResourceCountIsPrecise));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[downloadState: ");
        sb.append(RecordUtils.fieldToString(this.downloadState));
        sb.append(", completedResourceCount: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.completedResourceCount, ", completedResourceSize: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.completedResourceSize, ", completedTileCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.completedTileCount, ", requiredTileCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.requiredTileCount, ", completedTileSize: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.completedTileSize, ", requiredResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.requiredResourceCount, ", requiredResourceCountIsPrecise: ", sb);
        sb.append(RecordUtils.fieldToString(Boolean.valueOf(this.requiredResourceCountIsPrecise)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
