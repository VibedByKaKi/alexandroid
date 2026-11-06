package com.mapbox.maps;

import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapOptions implements Serializable {

    @Nullable
    private final ConstrainMode constrainMode;

    @Nullable
    private final ContextMode contextMode;

    @Nullable
    private final Boolean crossSourceCollisions;

    @Nullable
    private final EmissiveColorPrecision emissiveColorPrecision;

    @Nullable
    private final GlyphsRasterizationOptions glyphsRasterizationOptions;

    @Nullable
    private final NorthOrientation orientation;
    private final float pixelRatio;
    private final float scaleFactor;

    @Nullable
    private final Size size;

    @Nullable
    private final ViewportMode viewportMode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private ConstrainMode constrainMode;

        @Nullable
        private ContextMode contextMode;

        @Nullable
        private Boolean crossSourceCollisions;

        @Nullable
        private EmissiveColorPrecision emissiveColorPrecision;

        @Nullable
        private GlyphsRasterizationOptions glyphsRasterizationOptions;

        @Nullable
        private NorthOrientation orientation;
        private float pixelRatio = 1.0f;
        private float scaleFactor = 1.0f;

        @Nullable
        private Size size;

        @Nullable
        private ViewportMode viewportMode;

        public MapOptions build() {
            return new MapOptions(this.contextMode, this.constrainMode, this.viewportMode, this.orientation, this.crossSourceCollisions, this.size, this.pixelRatio, this.glyphsRasterizationOptions, this.scaleFactor, this.emissiveColorPrecision);
        }

        public Builder constrainMode(@Nullable ConstrainMode constrainMode) {
            this.constrainMode = constrainMode;
            return this;
        }

        public Builder contextMode(@Nullable ContextMode contextMode) {
            this.contextMode = contextMode;
            return this;
        }

        public Builder crossSourceCollisions(@Nullable Boolean bool) {
            this.crossSourceCollisions = bool;
            return this;
        }

        @com.mapbox.annotation.MapboxExperimental
        public Builder emissiveColorPrecision(@Nullable EmissiveColorPrecision emissiveColorPrecision) {
            this.emissiveColorPrecision = emissiveColorPrecision;
            return this;
        }

        public Builder glyphsRasterizationOptions(@Nullable GlyphsRasterizationOptions glyphsRasterizationOptions) {
            this.glyphsRasterizationOptions = glyphsRasterizationOptions;
            return this;
        }

        public Builder orientation(@Nullable NorthOrientation northOrientation) {
            this.orientation = northOrientation;
            return this;
        }

        public Builder pixelRatio(float f) {
            this.pixelRatio = f;
            return this;
        }

        @com.mapbox.annotation.MapboxExperimental
        public Builder scaleFactor(float f) {
            this.scaleFactor = f;
            return this;
        }

        public Builder size(@Nullable Size size) {
            this.size = size;
            return this;
        }

        public Builder viewportMode(@Nullable ViewportMode viewportMode) {
            this.viewportMode = viewportMode;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private MapOptions(@Nullable ContextMode contextMode, @Nullable ConstrainMode constrainMode, @Nullable ViewportMode viewportMode, @Nullable NorthOrientation northOrientation, @Nullable Boolean bool, @Nullable Size size, @Nullable GlyphsRasterizationOptions glyphsRasterizationOptions, @Nullable EmissiveColorPrecision emissiveColorPrecision) {
        this.contextMode = contextMode;
        this.constrainMode = constrainMode;
        this.viewportMode = viewportMode;
        this.orientation = northOrientation;
        this.crossSourceCollisions = bool;
        this.size = size;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.emissiveColorPrecision = emissiveColorPrecision;
        this.pixelRatio = 1.0f;
        this.scaleFactor = 1.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapOptions.class != obj.getClass()) {
            return false;
        }
        MapOptions mapOptions = (MapOptions) obj;
        return Objects.equals(this.contextMode, mapOptions.contextMode) && Objects.equals(this.constrainMode, mapOptions.constrainMode) && Objects.equals(this.viewportMode, mapOptions.viewportMode) && Objects.equals(this.orientation, mapOptions.orientation) && Objects.equals(this.crossSourceCollisions, mapOptions.crossSourceCollisions) && Objects.equals(this.size, mapOptions.size) && PartialEq.compare(this.pixelRatio, mapOptions.pixelRatio) && Objects.equals(this.glyphsRasterizationOptions, mapOptions.glyphsRasterizationOptions) && PartialEq.compare(this.scaleFactor, mapOptions.scaleFactor) && Objects.equals(this.emissiveColorPrecision, mapOptions.emissiveColorPrecision);
    }

    @Nullable
    public ConstrainMode getConstrainMode() {
        return this.constrainMode;
    }

    @Nullable
    public ContextMode getContextMode() {
        return this.contextMode;
    }

    @Nullable
    public Boolean getCrossSourceCollisions() {
        return this.crossSourceCollisions;
    }

    @Nullable
    @com.mapbox.annotation.MapboxExperimental
    public EmissiveColorPrecision getEmissiveColorPrecision() {
        return this.emissiveColorPrecision;
    }

    @Nullable
    public GlyphsRasterizationOptions getGlyphsRasterizationOptions() {
        return this.glyphsRasterizationOptions;
    }

    @Nullable
    public NorthOrientation getOrientation() {
        return this.orientation;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    @com.mapbox.annotation.MapboxExperimental
    public float getScaleFactor() {
        return this.scaleFactor;
    }

    @Nullable
    public Size getSize() {
        return this.size;
    }

    @Nullable
    public ViewportMode getViewportMode() {
        return this.viewportMode;
    }

    public int hashCode() {
        return Objects.hash(this.contextMode, this.constrainMode, this.viewportMode, this.orientation, this.crossSourceCollisions, this.size, Float.valueOf(this.pixelRatio), this.glyphsRasterizationOptions, Float.valueOf(this.scaleFactor), this.emissiveColorPrecision);
    }

    public Builder toBuilder() {
        return new Builder().contextMode(this.contextMode).constrainMode(this.constrainMode).viewportMode(this.viewportMode).orientation(this.orientation).crossSourceCollisions(this.crossSourceCollisions).size(this.size).pixelRatio(this.pixelRatio).glyphsRasterizationOptions(this.glyphsRasterizationOptions).scaleFactor(this.scaleFactor).emissiveColorPrecision(this.emissiveColorPrecision);
    }

    public String toString() {
        return "[contextMode: " + RecordUtils.fieldToString(this.contextMode) + ", constrainMode: " + RecordUtils.fieldToString(this.constrainMode) + ", viewportMode: " + RecordUtils.fieldToString(this.viewportMode) + ", orientation: " + RecordUtils.fieldToString(this.orientation) + ", crossSourceCollisions: " + RecordUtils.fieldToString(this.crossSourceCollisions) + ", size: " + RecordUtils.fieldToString(this.size) + ", pixelRatio: " + RecordUtils.fieldToString(Float.valueOf(this.pixelRatio)) + ", glyphsRasterizationOptions: " + RecordUtils.fieldToString(this.glyphsRasterizationOptions) + ", scaleFactor: " + RecordUtils.fieldToString(Float.valueOf(this.scaleFactor)) + ", emissiveColorPrecision: " + RecordUtils.fieldToString(this.emissiveColorPrecision) + MarkdownConstants.RIGHT_BRACKET;
    }

    private MapOptions(@Nullable ContextMode contextMode, @Nullable ConstrainMode constrainMode, @Nullable ViewportMode viewportMode, @Nullable NorthOrientation northOrientation, @Nullable Boolean bool, @Nullable Size size, float f, @Nullable GlyphsRasterizationOptions glyphsRasterizationOptions, float f2, @Nullable EmissiveColorPrecision emissiveColorPrecision) {
        this.contextMode = contextMode;
        this.constrainMode = constrainMode;
        this.viewportMode = viewportMode;
        this.orientation = northOrientation;
        this.crossSourceCollisions = bool;
        this.size = size;
        this.pixelRatio = f;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.scaleFactor = f2;
        this.emissiveColorPrecision = emissiveColorPrecision;
    }
}
