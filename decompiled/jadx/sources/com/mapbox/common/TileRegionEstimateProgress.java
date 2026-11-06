package com.mapbox.common;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class TileRegionEstimateProgress implements Serializable {
    private final long completedResourceCount;
    private final long erroredResourceCount;

    @NonNull
    private final TileRegionEstimateResult partialResult;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateProgress(long j, long j2, long j3, @NonNull TileRegionEstimateResult tileRegionEstimateResult) {
        this.requiredResourceCount = j;
        this.erroredResourceCount = j2;
        this.completedResourceCount = j3;
        this.partialResult = tileRegionEstimateResult;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateProgress tileRegionEstimateProgress = (TileRegionEstimateProgress) obj;
        return this.requiredResourceCount == tileRegionEstimateProgress.requiredResourceCount && this.erroredResourceCount == tileRegionEstimateProgress.erroredResourceCount && this.completedResourceCount == tileRegionEstimateProgress.completedResourceCount && Objects.equals(this.partialResult, tileRegionEstimateProgress.partialResult);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    @NonNull
    public TileRegionEstimateResult getPartialResult() {
        return this.partialResult;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.requiredResourceCount), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.completedResourceCount), this.partialResult);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[requiredResourceCount: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.requiredResourceCount, ", erroredResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.erroredResourceCount, ", completedResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.completedResourceCount, ", partialResult: ", sb);
        sb.append(RecordUtils.fieldToString(this.partialResult));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
