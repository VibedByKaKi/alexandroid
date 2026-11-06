package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class AnnotatedLayerFeature implements Serializable {

    @Nullable
    private final String featureId;

    @NonNull
    private final String layerId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private String featureId;

        @NonNull
        private String layerId;

        public AnnotatedLayerFeature build() {
            if (this.layerId != null) {
                return new AnnotatedLayerFeature(this.layerId, this.featureId);
            }
            Single$$ExternalSyntheticBUOutline0.m$1("layerId shouldn't be null");
            return null;
        }

        public Builder featureId(@Nullable String str) {
            this.featureId = str;
            return this;
        }

        public Builder layerId(@NonNull String str) {
            this.layerId = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private AnnotatedLayerFeature(@NonNull String str, @Nullable String str2) {
        this.layerId = str;
        this.featureId = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnnotatedLayerFeature.class != obj.getClass()) {
            return false;
        }
        AnnotatedLayerFeature annotatedLayerFeature = (AnnotatedLayerFeature) obj;
        return Objects.equals(this.layerId, annotatedLayerFeature.layerId) && Objects.equals(this.featureId, annotatedLayerFeature.featureId);
    }

    @Nullable
    public String getFeatureId() {
        return this.featureId;
    }

    @NonNull
    public String getLayerId() {
        return this.layerId;
    }

    public int hashCode() {
        return Objects.hash(this.layerId, this.featureId);
    }

    public Builder toBuilder() {
        return new Builder().layerId(this.layerId).featureId(this.featureId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[layerId: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.layerId, ", featureId: ", sb);
        return RegionDefaults$$ExternalSyntheticOutline0.m(this.featureId, MarkdownConstants.RIGHT_BRACKET, sb);
    }
}
