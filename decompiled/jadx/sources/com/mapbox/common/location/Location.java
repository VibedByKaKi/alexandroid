package com.mapbox.common.location;

import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Location implements Serializable {

    @Nullable
    private Double altitude;

    @Nullable
    private Double bearing;

    @Nullable
    private Double bearingAccuracy;

    @Nullable
    private final Value extra;

    @Nullable
    private Long floor;

    @Nullable
    private Double horizontalAccuracy;
    private final double latitude;
    private final double longitude;

    @Nullable
    private Long monotonicTimestamp;

    @Nullable
    private String source;

    @Nullable
    private Double speed;

    @Nullable
    private Double speedAccuracy;
    private final long timestamp;

    @Nullable
    private Double verticalAccuracy;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private Double altitude;

        @Nullable
        private Double bearing;

        @Nullable
        private Double bearingAccuracy;

        @Nullable
        private Value extra;

        @Nullable
        private Long floor;

        @Nullable
        private Double horizontalAccuracy;
        private double latitude;
        private double longitude;

        @Nullable
        private Long monotonicTimestamp;

        @Nullable
        private String source;

        @Nullable
        private Double speed;

        @Nullable
        private Double speedAccuracy;
        private long timestamp;

        @Nullable
        private Double verticalAccuracy;

        public Builder altitude(@Nullable Double d) {
            this.altitude = d;
            return this;
        }

        public Builder bearing(@Nullable Double d) {
            this.bearing = d;
            return this;
        }

        public Builder bearingAccuracy(@Nullable Double d) {
            this.bearingAccuracy = d;
            return this;
        }

        public Location build() {
            return new Location(this.latitude, this.longitude, this.timestamp, this.monotonicTimestamp, this.altitude, this.horizontalAccuracy, this.verticalAccuracy, this.speed, this.speedAccuracy, this.bearing, this.bearingAccuracy, this.floor, this.source, this.extra);
        }

        public Builder extra(@Nullable Value value) {
            this.extra = value;
            return this;
        }

        public Builder floor(@Nullable Long l) {
            this.floor = l;
            return this;
        }

        public Builder horizontalAccuracy(@Nullable Double d) {
            this.horizontalAccuracy = d;
            return this;
        }

        public Builder latitude(double d) {
            this.latitude = d;
            return this;
        }

        public Builder longitude(double d) {
            this.longitude = d;
            return this;
        }

        public Builder monotonicTimestamp(@Nullable Long l) {
            this.monotonicTimestamp = l;
            return this;
        }

        public Builder source(@Nullable String str) {
            this.source = str;
            return this;
        }

        public Builder speed(@Nullable Double d) {
            this.speed = d;
            return this;
        }

        public Builder speedAccuracy(@Nullable Double d) {
            this.speedAccuracy = d;
            return this;
        }

        public Builder timestamp(long j) {
            this.timestamp = j;
            return this;
        }

        public Builder verticalAccuracy(@Nullable Double d) {
            this.verticalAccuracy = d;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private Location(double d, double d2, long j, @Nullable Long l, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9, @Nullable Long l2, @Nullable String str, @Nullable Value value) {
        this.latitude = d;
        this.longitude = d2;
        this.timestamp = j;
        this.monotonicTimestamp = l;
        this.altitude = d3;
        this.horizontalAccuracy = d4;
        this.verticalAccuracy = d5;
        this.speed = d6;
        this.speedAccuracy = d7;
        this.bearing = d8;
        this.bearingAccuracy = d9;
        this.floor = l2;
        this.source = str;
        this.extra = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location location = (Location) obj;
        return PartialEq.compare(this.latitude, location.latitude) && PartialEq.compare(this.longitude, location.longitude) && this.timestamp == location.timestamp && Objects.equals(this.monotonicTimestamp, location.monotonicTimestamp) && Objects.equals(this.altitude, location.altitude) && Objects.equals(this.horizontalAccuracy, location.horizontalAccuracy) && Objects.equals(this.verticalAccuracy, location.verticalAccuracy) && Objects.equals(this.speed, location.speed) && Objects.equals(this.speedAccuracy, location.speedAccuracy) && Objects.equals(this.bearing, location.bearing) && Objects.equals(this.bearingAccuracy, location.bearingAccuracy) && Objects.equals(this.floor, location.floor) && Objects.equals(this.source, location.source) && Objects.equals(this.extra, location.extra);
    }

    @Nullable
    public Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    public Double getBearing() {
        return this.bearing;
    }

    @Nullable
    public Double getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    @Nullable
    public Value getExtra() {
        return this.extra;
    }

    @Nullable
    public Long getFloor() {
        return this.floor;
    }

    @Nullable
    public Double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public Long getMonotonicTimestamp() {
        return this.monotonicTimestamp;
    }

    @Nullable
    public String getSource() {
        return this.source;
    }

    @Nullable
    public Double getSpeed() {
        return this.speed;
    }

    @Nullable
    public Double getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public Double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.latitude), Double.valueOf(this.longitude), Long.valueOf(this.timestamp), this.monotonicTimestamp, this.altitude, this.horizontalAccuracy, this.verticalAccuracy, this.speed, this.speedAccuracy, this.bearing, this.bearingAccuracy, this.floor, this.source, this.extra);
    }

    public void setAltitude(@Nullable Double d) {
        this.altitude = d;
    }

    public void setBearing(@Nullable Double d) {
        this.bearing = d;
    }

    public void setBearingAccuracy(@Nullable Double d) {
        this.bearingAccuracy = d;
    }

    public void setFloor(@Nullable Long l) {
        this.floor = l;
    }

    public void setHorizontalAccuracy(@Nullable Double d) {
        this.horizontalAccuracy = d;
    }

    public void setMonotonicTimestamp(@Nullable Long l) {
        this.monotonicTimestamp = l;
    }

    public void setSource(@Nullable String str) {
        this.source = str;
    }

    public void setSpeed(@Nullable Double d) {
        this.speed = d;
    }

    public void setSpeedAccuracy(@Nullable Double d) {
        this.speedAccuracy = d;
    }

    public void setVerticalAccuracy(@Nullable Double d) {
        this.verticalAccuracy = d;
    }

    public Builder toBuilder() {
        return new Builder().latitude(this.latitude).longitude(this.longitude).timestamp(this.timestamp).monotonicTimestamp(this.monotonicTimestamp).altitude(this.altitude).horizontalAccuracy(this.horizontalAccuracy).verticalAccuracy(this.verticalAccuracy).speed(this.speed).speedAccuracy(this.speedAccuracy).bearing(this.bearing).bearingAccuracy(this.bearingAccuracy).floor(this.floor).source(this.source).extra(this.extra);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[latitude: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.latitude, ", longitude: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.longitude, ", timestamp: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.timestamp, ", monotonicTimestamp: ", sb);
        sb.append(RecordUtils.fieldToString(this.monotonicTimestamp));
        sb.append(", altitude: ");
        sb.append(RecordUtils.fieldToString(this.altitude));
        sb.append(", horizontalAccuracy: ");
        sb.append(RecordUtils.fieldToString(this.horizontalAccuracy));
        sb.append(", verticalAccuracy: ");
        sb.append(RecordUtils.fieldToString(this.verticalAccuracy));
        sb.append(", speed: ");
        sb.append(RecordUtils.fieldToString(this.speed));
        sb.append(", speedAccuracy: ");
        sb.append(RecordUtils.fieldToString(this.speedAccuracy));
        sb.append(", bearing: ");
        sb.append(RecordUtils.fieldToString(this.bearing));
        sb.append(", bearingAccuracy: ");
        sb.append(RecordUtils.fieldToString(this.bearingAccuracy));
        sb.append(", floor: ");
        sb.append(RecordUtils.fieldToString(this.floor));
        sb.append(", source: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.source, ", extra: ", sb);
        sb.append(RecordUtils.fieldToString(this.extra));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
