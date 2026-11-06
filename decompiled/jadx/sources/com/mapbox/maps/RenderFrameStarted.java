package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RenderFrameStarted implements Serializable {

    @NonNull
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public RenderFrameStarted(@NonNull Date date) {
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && RenderFrameStarted.class == obj.getClass() && Objects.equals(this.timestamp, ((RenderFrameStarted) obj).timestamp);
    }

    @NonNull
    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.timestamp);
    }

    public String toString() {
        return "[timestamp: " + RecordUtils.fieldToString(this.timestamp) + MarkdownConstants.RIGHT_BRACKET;
    }
}
