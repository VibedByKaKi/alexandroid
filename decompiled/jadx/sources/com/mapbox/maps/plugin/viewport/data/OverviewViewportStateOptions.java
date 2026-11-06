package com.mapbox.maps.plugin.viewport.data;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.ScreenCoordinate;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001+BY\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0006\u0010'\u001a\u00020(J\b\u0010)\u001a\u00020*H\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014R \u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006,"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;", "", "geometry", "Lcom/mapbox/geojson/Geometry;", ViewProps.PADDING, "Lcom/mapbox/maps/EdgeInsets;", "geometryPadding", "bearing", "", ResponseFields.PITCH, "maxZoom", "offset", "Lcom/mapbox/maps/ScreenCoordinate;", "animationDurationMs", "", "verticalFov", "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;JLjava/lang/Double;)V", "getAnimationDurationMs", "()J", "getBearing", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGeometry", "()Lcom/mapbox/geojson/Geometry;", "getGeometryPadding", "()Lcom/mapbox/maps/EdgeInsets;", "getMaxZoom", "getOffset", "()Lcom/mapbox/maps/ScreenCoordinate;", "getPadding", "getPitch", "getVerticalFov$annotations", "()V", "getVerticalFov", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toBuilder", "Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions$Builder;", "toString", "", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class OverviewViewportStateOptions {
    private final long animationDurationMs;

    @Nullable
    private final Double bearing;

    @NotNull
    private final Geometry geometry;

    @NotNull
    private final EdgeInsets geometryPadding;

    @Nullable
    private final Double maxZoom;

    @NotNull
    private final ScreenCoordinate offset;

    @Nullable
    private final EdgeInsets padding;

    @Nullable
    private final Double pitch;

    @Nullable
    private final Double verticalFov;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions$Builder;", "", "()V", "animationDurationMs", "", "bearing", "", "Ljava/lang/Double;", "geometry", "Lcom/mapbox/geojson/Geometry;", "geometryPadding", "Lcom/mapbox/maps/EdgeInsets;", "maxZoom", "offset", "Lcom/mapbox/maps/ScreenCoordinate;", ViewProps.PADDING, ResponseFields.PITCH, "verticalFov", "duration", "(Ljava/lang/Double;)Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions$Builder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private long animationDurationMs;

        @Nullable
        private Double bearing;

        @Nullable
        private Geometry geometry;

        @Nullable
        private Double maxZoom;

        @NotNull
        private ScreenCoordinate offset;

        @Nullable
        private Double pitch;

        @Nullable
        private Double verticalFov;

        @Nullable
        private EdgeInsets padding = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);

        @NotNull
        private EdgeInsets geometryPadding = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);

        public Builder() {
            Double valueOf = Double.valueOf(0.0d);
            this.bearing = valueOf;
            this.pitch = valueOf;
            this.offset = new ScreenCoordinate(0.0d, 0.0d);
            this.animationDurationMs = 1000L;
            this.verticalFov = Double.valueOf(36.87d);
        }

        @NotNull
        public final Builder animationDurationMs(long duration) {
            this.animationDurationMs = duration;
            return this;
        }

        @NotNull
        public final Builder bearing(@Nullable Double bearing) {
            this.bearing = bearing;
            return this;
        }

        @NotNull
        public final OverviewViewportStateOptions build() {
            Geometry geometry = this.geometry;
            if (geometry != null) {
                return new OverviewViewportStateOptions(geometry, this.padding, this.geometryPadding, this.bearing, this.pitch, this.maxZoom, this.offset, this.animationDurationMs, this.verticalFov, null);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Geometry is required for OverviewViewportStateOptions and shouldn't be null");
            return null;
        }

        @NotNull
        public final Builder geometry(@NotNull Geometry geometry) {
            geometry.getClass();
            this.geometry = geometry;
            return this;
        }

        @NotNull
        public final Builder geometryPadding(@NotNull EdgeInsets geometryPadding) {
            geometryPadding.getClass();
            this.geometryPadding = geometryPadding;
            return this;
        }

        @NotNull
        public final Builder maxZoom(@Nullable Double maxZoom) {
            this.maxZoom = maxZoom;
            return this;
        }

        @NotNull
        public final Builder offset(@NotNull ScreenCoordinate offset) {
            offset.getClass();
            this.offset = offset;
            return this;
        }

        @NotNull
        public final Builder padding(@Nullable EdgeInsets padding) {
            this.padding = padding;
            return this;
        }

        @NotNull
        public final Builder pitch(@Nullable Double pitch) {
            this.pitch = pitch;
            return this;
        }

        @MapboxExperimental
        @NotNull
        public final Builder verticalFov(@Nullable Double verticalFov) {
            this.verticalFov = verticalFov;
            return this;
        }
    }

    private OverviewViewportStateOptions(Geometry geometry, EdgeInsets edgeInsets, EdgeInsets edgeInsets2, Double d, Double d2, Double d3, ScreenCoordinate screenCoordinate, long j, Double d4) {
        this.geometry = geometry;
        this.padding = edgeInsets;
        this.geometryPadding = edgeInsets2;
        this.bearing = d;
        this.pitch = d2;
        this.maxZoom = d3;
        this.offset = screenCoordinate;
        this.animationDurationMs = j;
        this.verticalFov = d4;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof OverviewViewportStateOptions)) {
            return false;
        }
        OverviewViewportStateOptions overviewViewportStateOptions = (OverviewViewportStateOptions) other;
        return Intrinsics.areEqual(this.geometry, overviewViewportStateOptions.geometry) && Intrinsics.areEqual(this.padding, overviewViewportStateOptions.padding) && Intrinsics.areEqual(this.geometryPadding, overviewViewportStateOptions.geometryPadding) && Objects.equals(this.bearing, overviewViewportStateOptions.bearing) && Objects.equals(this.pitch, overviewViewportStateOptions.pitch) && Objects.equals(this.maxZoom, overviewViewportStateOptions.maxZoom) && Intrinsics.areEqual(this.offset, overviewViewportStateOptions.offset) && this.animationDurationMs == overviewViewportStateOptions.animationDurationMs && Objects.equals(this.verticalFov, overviewViewportStateOptions.verticalFov);
    }

    public final long getAnimationDurationMs() {
        return this.animationDurationMs;
    }

    @Nullable
    public final Double getBearing() {
        return this.bearing;
    }

    @NotNull
    public final Geometry getGeometry() {
        return this.geometry;
    }

    @NotNull
    public final EdgeInsets getGeometryPadding() {
        return this.geometryPadding;
    }

    @Nullable
    public final Double getMaxZoom() {
        return this.maxZoom;
    }

    @NotNull
    public final ScreenCoordinate getOffset() {
        return this.offset;
    }

    @Nullable
    public final EdgeInsets getPadding() {
        return this.padding;
    }

    @Nullable
    public final Double getPitch() {
        return this.pitch;
    }

    @Nullable
    public final Double getVerticalFov() {
        return this.verticalFov;
    }

    public int hashCode() {
        return Objects.hash(this.geometry, this.padding, this.geometryPadding, this.bearing, this.pitch, this.maxZoom, this.offset, Long.valueOf(this.animationDurationMs), this.verticalFov);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().geometry(this.geometry).padding(this.padding).geometryPadding(this.geometryPadding).bearing(this.bearing).pitch(this.pitch).maxZoom(this.maxZoom).offset(this.offset).animationDurationMs(this.animationDurationMs).verticalFov(this.verticalFov);
    }

    @NotNull
    public String toString() {
        return "OverviewViewportStateOptions(geometry=" + this.geometry + ", padding=" + this.padding + ", geometryPadding=" + this.geometryPadding + ", bearing=" + this.bearing + ", pitch=" + this.pitch + ", maxZoom=" + this.maxZoom + ", offset=" + this.offset + ", animationDurationMs=" + this.animationDurationMs + ", verticalFov=" + this.verticalFov + ')';
    }

    @MapboxExperimental
    public static /* synthetic */ void getVerticalFov$annotations() {
    }

    public /* synthetic */ OverviewViewportStateOptions(Geometry geometry, EdgeInsets edgeInsets, EdgeInsets edgeInsets2, Double d, Double d2, Double d3, ScreenCoordinate screenCoordinate, long j, Double d4, DefaultConstructorMarker defaultConstructorMarker) {
        this(geometry, edgeInsets, edgeInsets2, d, d2, d3, screenCoordinate, j, d4);
    }
}
