package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapLoadingError implements Serializable {

    @NonNull
    private final String message;

    @Nullable
    private final String sourceId;

    @Nullable
    private final CanonicalTileID tileId;

    @NonNull
    private final Date timestamp;

    @NonNull
    private final MapLoadingErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapLoadingError(@NonNull MapLoadingErrorType mapLoadingErrorType, @NonNull String str, @Nullable String str2, @Nullable CanonicalTileID canonicalTileID, @NonNull Date date) {
        this.type = mapLoadingErrorType;
        this.message = str;
        this.sourceId = str2;
        this.tileId = canonicalTileID;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapLoadingError.class != obj.getClass()) {
            return false;
        }
        MapLoadingError mapLoadingError = (MapLoadingError) obj;
        return Objects.equals(this.type, mapLoadingError.type) && Objects.equals(this.message, mapLoadingError.message) && Objects.equals(this.sourceId, mapLoadingError.sourceId) && Objects.equals(this.tileId, mapLoadingError.tileId) && Objects.equals(this.timestamp, mapLoadingError.timestamp);
    }

    @NonNull
    public String getMessage() {
        return this.message;
    }

    @Nullable
    public String getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public CanonicalTileID getTileId() {
        return this.tileId;
    }

    @NonNull
    public Date getTimestamp() {
        return this.timestamp;
    }

    @NonNull
    public MapLoadingErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, this.sourceId, this.tileId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", message: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.message, ", sourceId: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.sourceId, ", tileId: ", sb);
        sb.append(RecordUtils.fieldToString(this.tileId));
        sb.append(", timestamp: ");
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
