package com.mapbox.maps.plugin.viewport.data;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.plugin.viewport.data.FollowPuckViewportStateBearing;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB9\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010¨\u0006 "}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions;", "", ViewProps.PADDING, "Lcom/mapbox/maps/EdgeInsets;", "zoom", "", "bearing", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", ResponseFields.PITCH, "verticalFov", "(Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;Ljava/lang/Double;Ljava/lang/Double;)V", "getBearing", "()Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", "getPadding", "()Lcom/mapbox/maps/EdgeInsets;", "getPitch", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVerticalFov$annotations", "()V", "getVerticalFov", "getZoom", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toBuilder", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions$Builder;", "toString", "", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FollowPuckViewportStateOptions {

    @Nullable
    private final FollowPuckViewportStateBearing bearing;

    @Nullable
    private final EdgeInsets padding;

    @Nullable
    private final Double pitch;

    @Nullable
    private final Double verticalFov;

    @Nullable
    private final Double zoom;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000fJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions$Builder;", "", "()V", "bearing", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", ViewProps.PADDING, "Lcom/mapbox/maps/EdgeInsets;", ResponseFields.PITCH, "", "Ljava/lang/Double;", "verticalFov", "zoom", "options", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions;", "(Ljava/lang/Double;)Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions$Builder;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private EdgeInsets padding;

        @Nullable
        private Double zoom = Double.valueOf(16.35d);

        @Nullable
        private FollowPuckViewportStateBearing bearing = FollowPuckViewportStateBearing.SyncWithLocationPuck.INSTANCE;

        @Nullable
        private Double pitch = Double.valueOf(45.0d);

        @Nullable
        private Double verticalFov = Double.valueOf(36.87d);

        @NotNull
        public final Builder bearing(@Nullable FollowPuckViewportStateBearing options) {
            this.bearing = options;
            return this;
        }

        @NotNull
        public final FollowPuckViewportStateOptions build() {
            return new FollowPuckViewportStateOptions(this.padding, this.zoom, this.bearing, this.pitch, this.verticalFov, null);
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

        @NotNull
        public final Builder zoom(@Nullable Double zoom) {
            this.zoom = zoom;
            return this;
        }
    }

    private FollowPuckViewportStateOptions(EdgeInsets edgeInsets, Double d, FollowPuckViewportStateBearing followPuckViewportStateBearing, Double d2, Double d3) {
        this.padding = edgeInsets;
        this.zoom = d;
        this.bearing = followPuckViewportStateBearing;
        this.pitch = d2;
        this.verticalFov = d3;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof FollowPuckViewportStateOptions)) {
            return false;
        }
        FollowPuckViewportStateOptions followPuckViewportStateOptions = (FollowPuckViewportStateOptions) other;
        return Intrinsics.areEqual(this.padding, followPuckViewportStateOptions.padding) && Objects.equals(this.zoom, followPuckViewportStateOptions.zoom) && Intrinsics.areEqual(this.bearing, followPuckViewportStateOptions.bearing) && Objects.equals(this.pitch, followPuckViewportStateOptions.pitch) && Objects.equals(this.verticalFov, followPuckViewportStateOptions.verticalFov);
    }

    @Nullable
    public final FollowPuckViewportStateBearing getBearing() {
        return this.bearing;
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

    @Nullable
    public final Double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.padding, this.zoom, this.bearing, this.pitch, this.verticalFov);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().padding(this.padding).zoom(this.zoom).bearing(this.bearing).pitch(this.pitch).verticalFov(this.verticalFov);
    }

    @NotNull
    public String toString() {
        return "FollowPuckViewportStateOptions(padding=" + this.padding + ", zoom=" + this.zoom + ", bearing=" + this.bearing + ", pitch=" + this.pitch + ", verticalFov=" + this.verticalFov + ')';
    }

    public /* synthetic */ FollowPuckViewportStateOptions(EdgeInsets edgeInsets, Double d, FollowPuckViewportStateBearing followPuckViewportStateBearing, Double d2, Double d3, DefaultConstructorMarker defaultConstructorMarker) {
        this(edgeInsets, d, followPuckViewportStateBearing, d2, d3);
    }

    @MapboxExperimental
    public static /* synthetic */ void getVerticalFov$annotations() {
    }
}
