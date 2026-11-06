package com.mapbox.maps;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapRecorderOptions implements Serializable {
    private final boolean compressed;
    private final boolean loggingEnabled;
    private final Long timeWindow;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private Long timeWindow;
        private boolean loggingEnabled = false;
        private boolean compressed = true;

        public MapRecorderOptions build() {
            return new MapRecorderOptions(this.timeWindow, this.loggingEnabled, this.compressed);
        }

        public Builder compressed(boolean z) {
            this.compressed = z;
            return this;
        }

        public Builder loggingEnabled(boolean z) {
            this.loggingEnabled = z;
            return this;
        }

        public Builder timeWindow(Long l) {
            this.timeWindow = l;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private MapRecorderOptions(Long l) {
        this.timeWindow = l;
        this.loggingEnabled = false;
        this.compressed = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapRecorderOptions.class != obj.getClass()) {
            return false;
        }
        MapRecorderOptions mapRecorderOptions = (MapRecorderOptions) obj;
        return Objects.equals(this.timeWindow, mapRecorderOptions.timeWindow) && this.loggingEnabled == mapRecorderOptions.loggingEnabled && this.compressed == mapRecorderOptions.compressed;
    }

    public boolean getCompressed() {
        return this.compressed;
    }

    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public int hashCode() {
        return Objects.hash(this.timeWindow, Boolean.valueOf(this.loggingEnabled), Boolean.valueOf(this.compressed));
    }

    public Builder toBuilder() {
        return new Builder().timeWindow(this.timeWindow).loggingEnabled(this.loggingEnabled).compressed(this.compressed);
    }

    public String toString() {
        return "[timeWindow: " + RecordUtils.fieldToString(this.timeWindow) + ", loggingEnabled: " + RecordUtils.fieldToString(Boolean.valueOf(this.loggingEnabled)) + ", compressed: " + RecordUtils.fieldToString(Boolean.valueOf(this.compressed)) + MarkdownConstants.RIGHT_BRACKET;
    }

    private MapRecorderOptions(Long l, boolean z, boolean z2) {
        this.timeWindow = l;
        this.loggingEnabled = z;
        this.compressed = z2;
    }
}
