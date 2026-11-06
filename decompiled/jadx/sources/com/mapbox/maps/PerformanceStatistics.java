package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PerformanceStatistics implements Serializable {
    private final double collectionDurationMillis;

    @Nullable
    private final CumulativeRenderingStatistics cumulativeStatistics;

    @NonNull
    private final DurationStatistics mapRenderDurationStatistics;

    @Nullable
    private final PerFrameRenderingStatistics perFrameStatistics;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public PerformanceStatistics(double d, @NonNull DurationStatistics durationStatistics, @Nullable CumulativeRenderingStatistics cumulativeRenderingStatistics, @Nullable PerFrameRenderingStatistics perFrameRenderingStatistics) {
        this.collectionDurationMillis = d;
        this.mapRenderDurationStatistics = durationStatistics;
        this.cumulativeStatistics = cumulativeRenderingStatistics;
        this.perFrameStatistics = perFrameRenderingStatistics;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PerformanceStatistics.class != obj.getClass()) {
            return false;
        }
        PerformanceStatistics performanceStatistics = (PerformanceStatistics) obj;
        return PartialEq.compare(this.collectionDurationMillis, performanceStatistics.collectionDurationMillis) && Objects.equals(this.mapRenderDurationStatistics, performanceStatistics.mapRenderDurationStatistics) && Objects.equals(this.cumulativeStatistics, performanceStatistics.cumulativeStatistics) && Objects.equals(this.perFrameStatistics, performanceStatistics.perFrameStatistics);
    }

    public double getCollectionDurationMillis() {
        return this.collectionDurationMillis;
    }

    @Nullable
    public CumulativeRenderingStatistics getCumulativeStatistics() {
        return this.cumulativeStatistics;
    }

    @NonNull
    public DurationStatistics getMapRenderDurationStatistics() {
        return this.mapRenderDurationStatistics;
    }

    @Nullable
    public PerFrameRenderingStatistics getPerFrameStatistics() {
        return this.perFrameStatistics;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.collectionDurationMillis), this.mapRenderDurationStatistics, this.cumulativeStatistics, this.perFrameStatistics);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[collectionDurationMillis: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.collectionDurationMillis, ", mapRenderDurationStatistics: ", sb);
        sb.append(RecordUtils.fieldToString(this.mapRenderDurationStatistics));
        sb.append(", cumulativeStatistics: ");
        sb.append(RecordUtils.fieldToString(this.cumulativeStatistics));
        sb.append(", perFrameStatistics: ");
        sb.append(RecordUtils.fieldToString(this.perFrameStatistics));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
