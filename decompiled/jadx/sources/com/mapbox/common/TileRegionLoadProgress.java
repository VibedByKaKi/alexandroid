package com.mapbox.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class TileRegionLoadProgress implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long erroredResourceCount;
    private final long loadedResourceCount;
    private final long loadedResourceSize;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionLoadProgress(long j, long j2, long j3, long j4, long j5, long j6) {
        this.completedResourceCount = j;
        this.completedResourceSize = j2;
        this.erroredResourceCount = j3;
        this.requiredResourceCount = j4;
        this.loadedResourceCount = j5;
        this.loadedResourceSize = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionLoadProgress tileRegionLoadProgress = (TileRegionLoadProgress) obj;
        return this.completedResourceCount == tileRegionLoadProgress.completedResourceCount && this.completedResourceSize == tileRegionLoadProgress.completedResourceSize && this.erroredResourceCount == tileRegionLoadProgress.erroredResourceCount && this.requiredResourceCount == tileRegionLoadProgress.requiredResourceCount && this.loadedResourceCount == tileRegionLoadProgress.loadedResourceCount && this.loadedResourceSize == tileRegionLoadProgress.loadedResourceSize;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public long getLoadedResourceCount() {
        return this.loadedResourceCount;
    }

    public long getLoadedResourceSize() {
        return this.loadedResourceSize;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.requiredResourceCount), Long.valueOf(this.loadedResourceCount), Long.valueOf(this.loadedResourceSize));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[completedResourceCount: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.completedResourceCount, ", completedResourceSize: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.completedResourceSize, ", erroredResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.erroredResourceCount, ", requiredResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.requiredResourceCount, ", loadedResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.loadedResourceCount, ", loadedResourceSize: ", sb);
        sb.append(RecordUtils.fieldToString(Long.valueOf(this.loadedResourceSize)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
