package com.mapbox.maps.renderer;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.maps.MapboxExperimental;
import java.util.List;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001)Bm\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0010J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u0006*"}, d2 = {"Lcom/mapbox/maps/renderer/RenderThreadStats;", "", "totalTime", "", "totalFrames", "totalDroppedFrames", "totalSkippedVsync", "pacedSkippedVsync", "missedMapRenderFrames", "frameTimeList", "", "", "percentile50", "percentile90", "percentile95", "percentile99", "(JJJJJJLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getFrameTimeList", "()Ljava/util/List;", "getMissedMapRenderFrames", "()J", "getPacedSkippedVsync", "getPercentile50", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPercentile90", "getPercentile95", "getPercentile99", "getTotalDroppedFrames$annotations", "()V", "getTotalDroppedFrames", "getTotalFrames", "getTotalSkippedVsync", "getTotalTime", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Builder", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public final class RenderThreadStats {

    @NotNull
    private final List<Double> frameTimeList;
    private final long missedMapRenderFrames;
    private final long pacedSkippedVsync;

    @Nullable
    private final Double percentile50;

    @Nullable
    private final Double percentile90;

    @Nullable
    private final Double percentile95;

    @Nullable
    private final Double percentile99;
    private final long totalDroppedFrames;
    private final long totalFrames;
    private final long totalSkippedVsync;
    private final long totalTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0015\u0010\u0017\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/mapbox/maps/renderer/RenderThreadStats$Builder;", "", "()V", "frameTimeList", "", "", "missedMapRenderFrames", "", "pacedSkippedVsync", "percentile50", "Ljava/lang/Double;", "percentile90", "percentile95", "percentile99", "totalDroppedFrames", "totalFrames", "totalSkippedVsync", "totalTime", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/renderer/RenderThreadStats;", "setFrameTimeList", "setMissedMapRenderFrames", "setPacedSkippedVsync", "setPercentile50", "(Ljava/lang/Double;)Lcom/mapbox/maps/renderer/RenderThreadStats$Builder;", "setPercentile90", "setPercentile95", "setPercentile99", "setTotalDroppedFrames", "setTotalFrames", "setTotalSkippedVsync", "setTotalTime", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private List<Double> frameTimeList = CollectionsKt.emptyList();
        private long missedMapRenderFrames;
        private long pacedSkippedVsync;

        @Nullable
        private Double percentile50;

        @Nullable
        private Double percentile90;

        @Nullable
        private Double percentile95;

        @Nullable
        private Double percentile99;
        private long totalDroppedFrames;
        private long totalFrames;
        private long totalSkippedVsync;
        private long totalTime;

        @NotNull
        public final RenderThreadStats build() {
            return new RenderThreadStats(this.totalTime, this.totalFrames, this.totalDroppedFrames, this.totalSkippedVsync, this.pacedSkippedVsync, this.missedMapRenderFrames, this.frameTimeList, this.percentile50, this.percentile90, this.percentile95, this.percentile99, null);
        }

        @NotNull
        public final Builder setFrameTimeList(@NotNull List<Double> frameTimeList) {
            frameTimeList.getClass();
            this.frameTimeList = frameTimeList;
            return this;
        }

        @NotNull
        public final Builder setMissedMapRenderFrames(long missedMapRenderFrames) {
            this.missedMapRenderFrames = missedMapRenderFrames;
            return this;
        }

        @NotNull
        public final Builder setPacedSkippedVsync(long pacedSkippedVsync) {
            this.pacedSkippedVsync = pacedSkippedVsync;
            return this;
        }

        @NotNull
        public final Builder setPercentile50(@Nullable Double percentile50) {
            this.percentile50 = percentile50;
            return this;
        }

        @NotNull
        public final Builder setPercentile90(@Nullable Double percentile90) {
            this.percentile90 = percentile90;
            return this;
        }

        @NotNull
        public final Builder setPercentile95(@Nullable Double percentile95) {
            this.percentile95 = percentile95;
            return this;
        }

        @NotNull
        public final Builder setPercentile99(@Nullable Double percentile99) {
            this.percentile99 = percentile99;
            return this;
        }

        @NotNull
        public final Builder setTotalDroppedFrames(long totalDroppedFrames) {
            this.totalDroppedFrames = totalDroppedFrames;
            return this;
        }

        @NotNull
        public final Builder setTotalFrames(long totalFrames) {
            this.totalFrames = totalFrames;
            return this;
        }

        @NotNull
        public final Builder setTotalSkippedVsync(long totalSkippedVsync) {
            this.totalSkippedVsync = totalSkippedVsync;
            return this;
        }

        @NotNull
        public final Builder setTotalTime(long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
    }

    private RenderThreadStats(long j, long j2, long j3, long j4, long j5, long j6, List<Double> list, Double d, Double d2, Double d3, Double d4) {
        this.totalTime = j;
        this.totalFrames = j2;
        this.totalDroppedFrames = j3;
        this.totalSkippedVsync = j4;
        this.pacedSkippedVsync = j5;
        this.missedMapRenderFrames = j6;
        this.frameTimeList = list;
        this.percentile50 = d;
        this.percentile90 = d2;
        this.percentile95 = d3;
        this.percentile99 = d4;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RenderThreadStats.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        RenderThreadStats renderThreadStats = (RenderThreadStats) other;
        return this.totalTime == renderThreadStats.totalTime && this.totalFrames == renderThreadStats.totalFrames && this.totalDroppedFrames == renderThreadStats.totalDroppedFrames && this.totalSkippedVsync == renderThreadStats.totalSkippedVsync && this.pacedSkippedVsync == renderThreadStats.pacedSkippedVsync && this.missedMapRenderFrames == renderThreadStats.missedMapRenderFrames && Intrinsics.areEqual(this.percentile50, renderThreadStats.percentile50) && Intrinsics.areEqual(this.percentile90, renderThreadStats.percentile90) && Intrinsics.areEqual(this.percentile95, renderThreadStats.percentile95) && Intrinsics.areEqual(this.percentile99, renderThreadStats.percentile99) && Intrinsics.areEqual(this.frameTimeList, renderThreadStats.frameTimeList);
    }

    @NotNull
    public final List<Double> getFrameTimeList() {
        return this.frameTimeList;
    }

    public final long getMissedMapRenderFrames() {
        return this.missedMapRenderFrames;
    }

    public final long getPacedSkippedVsync() {
        return this.pacedSkippedVsync;
    }

    @Nullable
    public final Double getPercentile50() {
        return this.percentile50;
    }

    @Nullable
    public final Double getPercentile90() {
        return this.percentile90;
    }

    @Nullable
    public final Double getPercentile95() {
        return this.percentile95;
    }

    @Nullable
    public final Double getPercentile99() {
        return this.percentile99;
    }

    public final long getTotalDroppedFrames() {
        return this.totalDroppedFrames;
    }

    public final long getTotalFrames() {
        return this.totalFrames;
    }

    public final long getTotalSkippedVsync() {
        return this.totalSkippedVsync;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.totalTime), Long.valueOf(this.totalFrames), Long.valueOf(this.totalDroppedFrames), Long.valueOf(this.totalSkippedVsync), Long.valueOf(this.pacedSkippedVsync), Long.valueOf(this.missedMapRenderFrames), this.percentile50, this.percentile90, this.percentile95, this.percentile99);
    }

    @NotNull
    public String toString() {
        return "RenderThreadStats(totalTime=" + this.totalTime + ", totalFrames=" + this.totalFrames + ", totalDroppedFrames=" + this.totalDroppedFrames + ", totalSkippedVsync=" + this.totalSkippedVsync + ", pacedSkippedVsync=" + this.pacedSkippedVsync + ", missedMapRenderFrames=" + this.missedMapRenderFrames + ", frameTimeList=" + this.frameTimeList + ", percentile50=" + this.percentile50 + ", percentile90=" + this.percentile90 + ", percentile95=" + this.percentile95 + ", percentile99=" + this.percentile99 + ')';
    }

    @Deprecated(message = "Renamed to totalSkippedVsync. This field only counts missed-render-deadline VSYNCs; see pacedSkippedVsync for intentional pacing skips.", replaceWith = @ReplaceWith(expression = "totalSkippedVsync", imports = {}))
    public static /* synthetic */ void getTotalDroppedFrames$annotations() {
    }

    public /* synthetic */ RenderThreadStats(long j, long j2, long j3, long j4, long j5, long j6, List list, Double d, Double d2, Double d3, Double d4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, list, d, d2, d3, d4);
    }
}
