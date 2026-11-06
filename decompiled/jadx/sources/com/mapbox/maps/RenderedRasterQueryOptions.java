package com.mapbox.maps;

import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RenderedRasterQueryOptions implements Serializable {

    @Nullable
    private final List<String> layers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private List<String> layers;

        public RenderedRasterQueryOptions build() {
            return new RenderedRasterQueryOptions(this.layers);
        }

        public Builder layers(@Nullable List<String> list) {
            this.layers = list;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private RenderedRasterQueryOptions(@Nullable List<String> list) {
        this.layers = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && RenderedRasterQueryOptions.class == obj.getClass() && Objects.equals(this.layers, ((RenderedRasterQueryOptions) obj).layers);
    }

    @Nullable
    public List<String> getLayers() {
        return this.layers;
    }

    public int hashCode() {
        return Objects.hash(this.layers);
    }

    public Builder toBuilder() {
        return new Builder().layers(this.layers);
    }

    public String toString() {
        return "[layers: " + RecordUtils.fieldToString(this.layers) + MarkdownConstants.RIGHT_BRACKET;
    }
}
