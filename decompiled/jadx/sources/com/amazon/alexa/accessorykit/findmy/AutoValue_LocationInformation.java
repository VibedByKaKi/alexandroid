package com.amazon.alexa.accessorykit.findmy;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.LocationInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_LocationInformation extends LocationInformation {
    private final float accuracyInMeters;
    private final double altitudeInMeters;
    private final float bearingInDegrees;
    private final double latitudeInDegrees;
    private final double longitudeInDegrees;
    private final float speedInMetersPerSecond;
    private final long time;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends LocationInformation.Builder {
        private float accuracyInMeters;
        private double altitudeInMeters;
        private float bearingInDegrees;
        private double latitudeInDegrees;
        private double longitudeInDegrees;
        private byte set$0;
        private float speedInMetersPerSecond;
        private long time;

        @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation.Builder
        public LocationInformation build() {
            if (this.set$0 == Byte.MAX_VALUE) {
                return new AutoValue_LocationInformation(this.latitudeInDegrees, this.longitudeInDegrees, this.accuracyInMeters, this.altitudeInMeters, this.speedInMetersPerSecond, this.bearingInDegrees, this.time, 0);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" latitudeInDegrees");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" longitudeInDegrees");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" accuracyInMeters");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" altitudeInMeters");
            }
            if ((this.set$0 & 16) == 0) {
                sb.append(" speedInMetersPerSecond");
            }
            if ((this.set$0 & 32) == 0) {
                sb.append(" bearingInDegrees");
            }
            if ((this.set$0 & 64) == 0) {
                sb.append(" time");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation.Builder
        public LocationInformation.Builder setAccuracyInMeters(float f) {
            this.accuracyInMeters = f;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation.Builder
        public LocationInformation.Builder setAltitudeInMeters(double d) {
            this.altitudeInMeters = d;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation.Builder
        public LocationInformation.Builder setBearingInDegrees(float f) {
            this.bearingInDegrees = f;
            this.set$0 = (byte) (this.set$0 | 32);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation.Builder
        public LocationInformation.Builder setLatitudeInDegrees(double d) {
            this.latitudeInDegrees = d;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation.Builder
        public LocationInformation.Builder setLongitudeInDegrees(double d) {
            this.longitudeInDegrees = d;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation.Builder
        public LocationInformation.Builder setSpeedInMetersPerSecond(float f) {
            this.speedInMetersPerSecond = f;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation.Builder
        public LocationInformation.Builder setTime(long j) {
            this.time = j;
            this.set$0 = (byte) (this.set$0 | 64);
            return this;
        }
    }

    private AutoValue_LocationInformation(double d, double d2, float f, double d3, float f2, float f3, long j) {
        this.latitudeInDegrees = d;
        this.longitudeInDegrees = d2;
        this.accuracyInMeters = f;
        this.altitudeInMeters = d3;
        this.speedInMetersPerSecond = f2;
        this.bearingInDegrees = f3;
        this.time = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocationInformation) {
            LocationInformation locationInformation = (LocationInformation) obj;
            if (Double.doubleToLongBits(this.latitudeInDegrees) == Double.doubleToLongBits(locationInformation.getLatitudeInDegrees()) && Double.doubleToLongBits(this.longitudeInDegrees) == Double.doubleToLongBits(locationInformation.getLongitudeInDegrees()) && Float.floatToIntBits(this.accuracyInMeters) == Float.floatToIntBits(locationInformation.getAccuracyInMeters()) && Double.doubleToLongBits(this.altitudeInMeters) == Double.doubleToLongBits(locationInformation.getAltitudeInMeters()) && Float.floatToIntBits(this.speedInMetersPerSecond) == Float.floatToIntBits(locationInformation.getSpeedInMetersPerSecond()) && Float.floatToIntBits(this.bearingInDegrees) == Float.floatToIntBits(locationInformation.getBearingInDegrees()) && this.time == locationInformation.getTime()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation
    @JsonProperty("accuracyInMeters")
    public float getAccuracyInMeters() {
        return this.accuracyInMeters;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation
    @JsonProperty("altitudeInMeters")
    public double getAltitudeInMeters() {
        return this.altitudeInMeters;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation
    @JsonProperty("bearingInDegrees")
    public float getBearingInDegrees() {
        return this.bearingInDegrees;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation
    @JsonProperty("latitudeInDegrees")
    public double getLatitudeInDegrees() {
        return this.latitudeInDegrees;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation
    @JsonProperty("longitudeInDegrees")
    public double getLongitudeInDegrees() {
        return this.longitudeInDegrees;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation
    @JsonProperty("speedInMetersPerSecond")
    public float getSpeedInMetersPerSecond() {
        return this.speedInMetersPerSecond;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.LocationInformation
    @JsonProperty("time")
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        int doubleToLongBits = (((((((((((((int) ((Double.doubleToLongBits(this.latitudeInDegrees) >>> 32) ^ Double.doubleToLongBits(this.latitudeInDegrees))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.longitudeInDegrees) >>> 32) ^ Double.doubleToLongBits(this.longitudeInDegrees)))) * 1000003) ^ Float.floatToIntBits(this.accuracyInMeters)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.altitudeInMeters) >>> 32) ^ Double.doubleToLongBits(this.altitudeInMeters)))) * 1000003) ^ Float.floatToIntBits(this.speedInMetersPerSecond)) * 1000003) ^ Float.floatToIntBits(this.bearingInDegrees)) * 1000003;
        long j = this.time;
        return ((int) ((j >>> 32) ^ j)) ^ doubleToLongBits;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocationInformation{latitudeInDegrees=");
        sb.append(this.latitudeInDegrees);
        sb.append(", longitudeInDegrees=");
        sb.append(this.longitudeInDegrees);
        sb.append(", accuracyInMeters=");
        sb.append(this.accuracyInMeters);
        sb.append(", altitudeInMeters=");
        sb.append(this.altitudeInMeters);
        sb.append(", speedInMetersPerSecond=");
        sb.append(this.speedInMetersPerSecond);
        sb.append(", bearingInDegrees=");
        sb.append(this.bearingInDegrees);
        sb.append(", time=");
        return a$$ExternalSyntheticOutline0.m(this.time, StringSubstitutor.DEFAULT_VAR_END, sb);
    }

    public /* synthetic */ AutoValue_LocationInformation(double d, double d2, float f, double d3, float f2, float f3, long j, int i) {
        this(d, d2, f, d3, f2, f3, j);
    }
}
