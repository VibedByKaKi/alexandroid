package com.mapbox.maps;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CustomLayerRenderConfiguration implements Serializable {
    private final boolean isRenderToTileSupported;
    private final boolean shouldRerenderTiles;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private boolean isRenderToTileSupported = false;
        private boolean shouldRerenderTiles = false;

        public CustomLayerRenderConfiguration build() {
            return new CustomLayerRenderConfiguration(this.isRenderToTileSupported, this.shouldRerenderTiles);
        }

        public Builder isRenderToTileSupported(boolean z) {
            this.isRenderToTileSupported = z;
            return this;
        }

        public Builder shouldRerenderTiles(boolean z) {
            this.shouldRerenderTiles = z;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private CustomLayerRenderConfiguration() {
        this.isRenderToTileSupported = false;
        this.shouldRerenderTiles = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomLayerRenderConfiguration.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderConfiguration customLayerRenderConfiguration = (CustomLayerRenderConfiguration) obj;
        return this.isRenderToTileSupported == customLayerRenderConfiguration.isRenderToTileSupported && this.shouldRerenderTiles == customLayerRenderConfiguration.shouldRerenderTiles;
    }

    public boolean getIsRenderToTileSupported() {
        return this.isRenderToTileSupported;
    }

    public boolean getShouldRerenderTiles() {
        return this.shouldRerenderTiles;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isRenderToTileSupported), Boolean.valueOf(this.shouldRerenderTiles));
    }

    public Builder toBuilder() {
        return new Builder().isRenderToTileSupported(this.isRenderToTileSupported).shouldRerenderTiles(this.shouldRerenderTiles);
    }

    public String toString() {
        return "[isRenderToTileSupported: " + RecordUtils.fieldToString(Boolean.valueOf(this.isRenderToTileSupported)) + ", shouldRerenderTiles: " + RecordUtils.fieldToString(Boolean.valueOf(this.shouldRerenderTiles)) + MarkdownConstants.RIGHT_BRACKET;
    }

    private CustomLayerRenderConfiguration(boolean z, boolean z2) {
        this.isRenderToTileSupported = z;
        this.shouldRerenderTiles = z2;
    }
}
