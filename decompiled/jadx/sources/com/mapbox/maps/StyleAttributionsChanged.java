package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class StyleAttributionsChanged implements Serializable {

    @NonNull
    private final List<String> attributions;

    @NonNull
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleAttributionsChanged(@NonNull List<String> list, @NonNull Date date) {
        this.attributions = list;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleAttributionsChanged.class != obj.getClass()) {
            return false;
        }
        StyleAttributionsChanged styleAttributionsChanged = (StyleAttributionsChanged) obj;
        return Objects.equals(this.attributions, styleAttributionsChanged.attributions) && Objects.equals(this.timestamp, styleAttributionsChanged.timestamp);
    }

    @NonNull
    public List<String> getAttributions() {
        return this.attributions;
    }

    @NonNull
    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.attributions, this.timestamp);
    }

    public String toString() {
        return "[attributions: " + RecordUtils.fieldToString(this.attributions) + ", timestamp: " + RecordUtils.fieldToString(this.timestamp) + MarkdownConstants.RIGHT_BRACKET;
    }
}
