package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class QueriedFeature implements Serializable {

    @NonNull
    private final Feature feature;

    @Nullable
    private final FeaturesetFeatureId featuresetFeatureId;

    @NonNull
    private final String source;

    @Nullable
    private final String sourceLayer;

    @NonNull
    private final Value state;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public QueriedFeature(@NonNull Feature feature, @NonNull String str, @Nullable String str2, @NonNull Value value, @Nullable FeaturesetFeatureId featuresetFeatureId) {
        this.feature = feature;
        this.source = str;
        this.sourceLayer = str2;
        this.state = value;
        this.featuresetFeatureId = featuresetFeatureId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueriedFeature.class != obj.getClass()) {
            return false;
        }
        QueriedFeature queriedFeature = (QueriedFeature) obj;
        return Objects.equals(this.feature, queriedFeature.feature) && Objects.equals(this.source, queriedFeature.source) && Objects.equals(this.sourceLayer, queriedFeature.sourceLayer) && Objects.equals(this.state, queriedFeature.state) && Objects.equals(this.featuresetFeatureId, queriedFeature.featuresetFeatureId);
    }

    @NonNull
    public Feature getFeature() {
        return this.feature;
    }

    @Nullable
    public FeaturesetFeatureId getFeaturesetFeatureId() {
        return this.featuresetFeatureId;
    }

    @NonNull
    public String getSource() {
        return this.source;
    }

    @Nullable
    public String getSourceLayer() {
        return this.sourceLayer;
    }

    @NonNull
    public Value getState() {
        return this.state;
    }

    public int hashCode() {
        return Objects.hash(this.feature, this.source, this.sourceLayer, this.state, this.featuresetFeatureId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[feature: ");
        sb.append(RecordUtils.fieldToString(this.feature));
        sb.append(", source: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.source, ", sourceLayer: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.sourceLayer, ", state: ", sb);
        sb.append(RecordUtils.fieldToString(this.state));
        sb.append(", featuresetFeatureId: ");
        sb.append(RecordUtils.fieldToString(this.featuresetFeatureId));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
