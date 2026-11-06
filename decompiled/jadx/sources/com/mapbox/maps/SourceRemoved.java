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
public final class SourceRemoved implements Serializable {

    @NonNull
    private final String sourceId;

    @NonNull
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public SourceRemoved(@NonNull String str, @NonNull Date date) {
        this.sourceId = str;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceRemoved.class != obj.getClass()) {
            return false;
        }
        SourceRemoved sourceRemoved = (SourceRemoved) obj;
        return Objects.equals(this.sourceId, sourceRemoved.sourceId) && Objects.equals(this.timestamp, sourceRemoved.timestamp);
    }

    @NonNull
    public String getSourceId() {
        return this.sourceId;
    }

    @NonNull
    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.sourceId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sourceId: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.sourceId, ", timestamp: ", sb);
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
