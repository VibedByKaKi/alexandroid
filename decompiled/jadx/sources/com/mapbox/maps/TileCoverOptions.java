package com.mapbox.maps;

import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TileCoverOptions implements Serializable {

    @Nullable
    private final Byte maxZoom;

    @Nullable
    private final Byte minZoom;

    @Nullable
    private final Boolean roundZoom;

    @Nullable
    private final Short tileSize;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private Byte maxZoom;

        @Nullable
        private Byte minZoom;

        @Nullable
        private Boolean roundZoom;

        @Nullable
        private Short tileSize;

        public TileCoverOptions build() {
            return new TileCoverOptions(this.tileSize, this.minZoom, this.maxZoom, this.roundZoom);
        }

        public Builder maxZoom(@Nullable Byte b) {
            this.maxZoom = b;
            return this;
        }

        public Builder minZoom(@Nullable Byte b) {
            this.minZoom = b;
            return this;
        }

        public Builder roundZoom(@Nullable Boolean bool) {
            this.roundZoom = bool;
            return this;
        }

        public Builder tileSize(@Nullable Short sh) {
            this.tileSize = sh;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private TileCoverOptions(@Nullable Short sh, @Nullable Byte b, @Nullable Byte b2, @Nullable Boolean bool) {
        this.tileSize = sh;
        this.minZoom = b;
        this.maxZoom = b2;
        this.roundZoom = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileCoverOptions.class != obj.getClass()) {
            return false;
        }
        TileCoverOptions tileCoverOptions = (TileCoverOptions) obj;
        return Objects.equals(this.tileSize, tileCoverOptions.tileSize) && Objects.equals(this.minZoom, tileCoverOptions.minZoom) && Objects.equals(this.maxZoom, tileCoverOptions.maxZoom) && Objects.equals(this.roundZoom, tileCoverOptions.roundZoom);
    }

    @Nullable
    public Byte getMaxZoom() {
        return this.maxZoom;
    }

    @Nullable
    public Byte getMinZoom() {
        return this.minZoom;
    }

    @Nullable
    public Boolean getRoundZoom() {
        return this.roundZoom;
    }

    @Nullable
    public Short getTileSize() {
        return this.tileSize;
    }

    public int hashCode() {
        return Objects.hash(this.tileSize, this.minZoom, this.maxZoom, this.roundZoom);
    }

    public Builder toBuilder() {
        return new Builder().tileSize(this.tileSize).minZoom(this.minZoom).maxZoom(this.maxZoom).roundZoom(this.roundZoom);
    }

    public String toString() {
        return "[tileSize: " + RecordUtils.fieldToString(this.tileSize) + ", minZoom: " + RecordUtils.fieldToString(this.minZoom) + ", maxZoom: " + RecordUtils.fieldToString(this.maxZoom) + ", roundZoom: " + RecordUtils.fieldToString(this.roundZoom) + MarkdownConstants.RIGHT_BRACKET;
    }
}
