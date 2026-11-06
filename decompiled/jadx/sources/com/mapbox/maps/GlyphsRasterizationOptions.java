package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GlyphsRasterizationOptions implements Serializable {

    @Nullable
    private final String fontFamily;

    @NonNull
    private final GlyphsRasterizationMode rasterizationMode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private String fontFamily;

        @NonNull
        private GlyphsRasterizationMode rasterizationMode;

        public GlyphsRasterizationOptions build() {
            if (this.rasterizationMode != null) {
                return new GlyphsRasterizationOptions(this.rasterizationMode, this.fontFamily);
            }
            Single$$ExternalSyntheticBUOutline0.m$1("rasterizationMode shouldn't be null");
            return null;
        }

        public Builder fontFamily(@Nullable String str) {
            this.fontFamily = str;
            return this;
        }

        public Builder rasterizationMode(@NonNull GlyphsRasterizationMode glyphsRasterizationMode) {
            this.rasterizationMode = glyphsRasterizationMode;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private GlyphsRasterizationOptions(@NonNull GlyphsRasterizationMode glyphsRasterizationMode, @Nullable String str) {
        this.rasterizationMode = glyphsRasterizationMode;
        this.fontFamily = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GlyphsRasterizationOptions.class != obj.getClass()) {
            return false;
        }
        GlyphsRasterizationOptions glyphsRasterizationOptions = (GlyphsRasterizationOptions) obj;
        return Objects.equals(this.rasterizationMode, glyphsRasterizationOptions.rasterizationMode) && Objects.equals(this.fontFamily, glyphsRasterizationOptions.fontFamily);
    }

    @Nullable
    public String getFontFamily() {
        return this.fontFamily;
    }

    @NonNull
    public GlyphsRasterizationMode getRasterizationMode() {
        return this.rasterizationMode;
    }

    public int hashCode() {
        return Objects.hash(this.rasterizationMode, this.fontFamily);
    }

    public Builder toBuilder() {
        return new Builder().rasterizationMode(this.rasterizationMode).fontFamily(this.fontFamily);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[rasterizationMode: ");
        sb.append(RecordUtils.fieldToString(this.rasterizationMode));
        sb.append(", fontFamily: ");
        return RegionDefaults$$ExternalSyntheticOutline0.m(this.fontFamily, MarkdownConstants.RIGHT_BRACKET, sb);
    }
}
