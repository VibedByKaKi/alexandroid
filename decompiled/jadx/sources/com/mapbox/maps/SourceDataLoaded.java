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

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SourceDataLoaded implements Serializable {

    @Nullable
    private final String dataId;

    @Nullable
    private final Boolean loaded;

    @NonNull
    private final String sourceId;

    @Nullable
    private final CanonicalTileID tileId;

    @NonNull
    private final EventTimeInterval timeInterval;

    @NonNull
    private final SourceDataLoadedType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public SourceDataLoaded(@NonNull String str, @NonNull SourceDataLoadedType sourceDataLoadedType, @Nullable Boolean bool, @Nullable CanonicalTileID canonicalTileID, @Nullable String str2, @NonNull EventTimeInterval eventTimeInterval) {
        this.sourceId = str;
        this.type = sourceDataLoadedType;
        this.loaded = bool;
        this.tileId = canonicalTileID;
        this.dataId = str2;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceDataLoaded.class != obj.getClass()) {
            return false;
        }
        SourceDataLoaded sourceDataLoaded = (SourceDataLoaded) obj;
        return Objects.equals(this.sourceId, sourceDataLoaded.sourceId) && Objects.equals(this.type, sourceDataLoaded.type) && Objects.equals(this.loaded, sourceDataLoaded.loaded) && Objects.equals(this.tileId, sourceDataLoaded.tileId) && Objects.equals(this.dataId, sourceDataLoaded.dataId) && Objects.equals(this.timeInterval, sourceDataLoaded.timeInterval);
    }

    @Nullable
    public String getDataId() {
        return this.dataId;
    }

    @Nullable
    public Boolean getLoaded() {
        return this.loaded;
    }

    @NonNull
    public String getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public CanonicalTileID getTileId() {
        return this.tileId;
    }

    @NonNull
    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    @NonNull
    public SourceDataLoadedType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.sourceId, this.type, this.loaded, this.tileId, this.dataId, this.timeInterval);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sourceId: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.sourceId, ", type: ", sb);
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", loaded: ");
        sb.append(RecordUtils.fieldToString(this.loaded));
        sb.append(", tileId: ");
        sb.append(RecordUtils.fieldToString(this.tileId));
        sb.append(", dataId: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.dataId, ", timeInterval: ", sb);
        sb.append(RecordUtils.fieldToString(this.timeInterval));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
