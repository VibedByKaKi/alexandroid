package com.mapbox.maps;

import androidx.annotation.NonNull;
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
public final class StyleImageRemoveUnused implements Serializable {

    @NonNull
    private final String imageId;

    @NonNull
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleImageRemoveUnused(@NonNull String str, @NonNull Date date) {
        this.imageId = str;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleImageRemoveUnused.class != obj.getClass()) {
            return false;
        }
        StyleImageRemoveUnused styleImageRemoveUnused = (StyleImageRemoveUnused) obj;
        return Objects.equals(this.imageId, styleImageRemoveUnused.imageId) && Objects.equals(this.timestamp, styleImageRemoveUnused.timestamp);
    }

    @NonNull
    public String getImageId() {
        return this.imageId;
    }

    @NonNull
    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.imageId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[imageId: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.imageId, ", timestamp: ", sb);
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
