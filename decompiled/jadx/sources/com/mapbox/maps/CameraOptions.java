package com.mapbox.maps;

import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CameraOptions implements Serializable {

    @Nullable
    private final ScreenCoordinate anchor;

    @Nullable
    private final Double bearing;

    @Nullable
    private final Point center;

    @Nullable
    private final EdgeInsets padding;

    @Nullable
    private final Double pitch;

    @Nullable
    private final Double verticalFov;

    @Nullable
    private final Double zoom;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private ScreenCoordinate anchor;

        @Nullable
        private Double bearing;

        @Nullable
        private Point center;

        @Nullable
        private EdgeInsets padding;

        @Nullable
        private Double pitch;

        @Nullable
        private Double verticalFov = null;

        @Nullable
        private Double zoom;

        public Builder anchor(@Nullable ScreenCoordinate screenCoordinate) {
            this.anchor = screenCoordinate;
            return this;
        }

        public Builder bearing(@Nullable Double d) {
            this.bearing = d;
            return this;
        }

        public CameraOptions build() {
            return new CameraOptions(this.center, this.padding, this.anchor, this.zoom, this.bearing, this.pitch, this.verticalFov);
        }

        public Builder center(@Nullable Point point) {
            this.center = point;
            return this;
        }

        public Builder padding(@Nullable EdgeInsets edgeInsets) {
            this.padding = edgeInsets;
            return this;
        }

        public Builder pitch(@Nullable Double d) {
            this.pitch = d;
            return this;
        }

        @com.mapbox.annotation.MapboxExperimental
        public Builder verticalFov(@Nullable Double d) {
            this.verticalFov = d;
            return this;
        }

        public Builder zoom(@Nullable Double d) {
            this.zoom = d;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private CameraOptions(@Nullable Point point, @Nullable EdgeInsets edgeInsets, @Nullable ScreenCoordinate screenCoordinate, @Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
        this.center = point;
        this.padding = edgeInsets;
        this.anchor = screenCoordinate;
        this.zoom = d;
        this.bearing = d2;
        this.pitch = d3;
        this.verticalFov = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraOptions.class != obj.getClass()) {
            return false;
        }
        CameraOptions cameraOptions = (CameraOptions) obj;
        return Objects.equals(this.center, cameraOptions.center) && Objects.equals(this.padding, cameraOptions.padding) && Objects.equals(this.anchor, cameraOptions.anchor) && Objects.equals(this.zoom, cameraOptions.zoom) && Objects.equals(this.bearing, cameraOptions.bearing) && Objects.equals(this.pitch, cameraOptions.pitch) && Objects.equals(this.verticalFov, cameraOptions.verticalFov);
    }

    @Nullable
    public ScreenCoordinate getAnchor() {
        return this.anchor;
    }

    @Nullable
    public Double getBearing() {
        return this.bearing;
    }

    @Nullable
    public Point getCenter() {
        return this.center;
    }

    @Nullable
    public EdgeInsets getPadding() {
        return this.padding;
    }

    @Nullable
    public Double getPitch() {
        return this.pitch;
    }

    @Nullable
    @com.mapbox.annotation.MapboxExperimental
    public Double getVerticalFov() {
        return this.verticalFov;
    }

    @Nullable
    public Double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.center, this.padding, this.anchor, this.zoom, this.bearing, this.pitch, this.verticalFov);
    }

    public Builder toBuilder() {
        return new Builder().center(this.center).padding(this.padding).anchor(this.anchor).zoom(this.zoom).bearing(this.bearing).pitch(this.pitch).verticalFov(this.verticalFov);
    }

    public String toString() {
        return "[center: " + RecordUtils.fieldToString(this.center) + ", padding: " + RecordUtils.fieldToString(this.padding) + ", anchor: " + RecordUtils.fieldToString(this.anchor) + ", zoom: " + RecordUtils.fieldToString(this.zoom) + ", bearing: " + RecordUtils.fieldToString(this.bearing) + ", pitch: " + RecordUtils.fieldToString(this.pitch) + ", verticalFov: " + RecordUtils.fieldToString(this.verticalFov) + MarkdownConstants.RIGHT_BRACKET;
    }

    private CameraOptions(@Nullable Point point, @Nullable EdgeInsets edgeInsets, @Nullable ScreenCoordinate screenCoordinate, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4) {
        this.center = point;
        this.padding = edgeInsets;
        this.anchor = screenCoordinate;
        this.zoom = d;
        this.bearing = d2;
        this.pitch = d3;
        this.verticalFov = d4;
    }
}
