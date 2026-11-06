package com.mapbox.maps;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapPlayerOptions implements Serializable {
    private final boolean avoidPlaybackPauses;
    private final int playbackCount;
    private final double playbackSpeedMultiplier;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private int playbackCount = 1;
        private double playbackSpeedMultiplier = 1.0d;
        private boolean avoidPlaybackPauses = false;

        public Builder avoidPlaybackPauses(boolean z) {
            this.avoidPlaybackPauses = z;
            return this;
        }

        public MapPlayerOptions build() {
            return new MapPlayerOptions(this.playbackCount, this.playbackSpeedMultiplier, this.avoidPlaybackPauses);
        }

        public Builder playbackCount(int i) {
            this.playbackCount = i;
            return this;
        }

        public Builder playbackSpeedMultiplier(double d) {
            this.playbackSpeedMultiplier = d;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private MapPlayerOptions() {
        this.playbackCount = 1;
        this.playbackSpeedMultiplier = 1.0d;
        this.avoidPlaybackPauses = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapPlayerOptions.class != obj.getClass()) {
            return false;
        }
        MapPlayerOptions mapPlayerOptions = (MapPlayerOptions) obj;
        return this.playbackCount == mapPlayerOptions.playbackCount && PartialEq.compare(this.playbackSpeedMultiplier, mapPlayerOptions.playbackSpeedMultiplier) && this.avoidPlaybackPauses == mapPlayerOptions.avoidPlaybackPauses;
    }

    public boolean getAvoidPlaybackPauses() {
        return this.avoidPlaybackPauses;
    }

    public int getPlaybackCount() {
        return this.playbackCount;
    }

    public double getPlaybackSpeedMultiplier() {
        return this.playbackSpeedMultiplier;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.playbackCount), Double.valueOf(this.playbackSpeedMultiplier), Boolean.valueOf(this.avoidPlaybackPauses));
    }

    public Builder toBuilder() {
        return new Builder().playbackCount(this.playbackCount).playbackSpeedMultiplier(this.playbackSpeedMultiplier).avoidPlaybackPauses(this.avoidPlaybackPauses);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[playbackCount: ");
        sb.append(RecordUtils.fieldToString(Integer.valueOf(this.playbackCount)));
        sb.append(", playbackSpeedMultiplier: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.playbackSpeedMultiplier, ", avoidPlaybackPauses: ", sb);
        sb.append(RecordUtils.fieldToString(Boolean.valueOf(this.avoidPlaybackPauses)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    private MapPlayerOptions(int i, double d, boolean z) {
        this.playbackCount = i;
        this.playbackSpeedMultiplier = d;
        this.avoidPlaybackPauses = z;
    }
}
