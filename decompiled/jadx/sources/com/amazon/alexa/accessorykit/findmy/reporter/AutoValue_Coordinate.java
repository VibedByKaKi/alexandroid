package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.reporter.Coordinate;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_Coordinate extends Coordinate {
    private final double accuracyInMeters;
    private final double latitudeInDegrees;
    private final double longitudeInDegrees;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Coordinate.Builder {
        private double accuracyInMeters;
        private double latitudeInDegrees;
        private double longitudeInDegrees;
        private byte set$0;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Coordinate.Builder
        public Coordinate build() {
            if (this.set$0 == 7) {
                return new AutoValue_Coordinate(this.latitudeInDegrees, this.longitudeInDegrees, this.accuracyInMeters, 0);
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
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Coordinate.Builder
        public Coordinate.Builder setAccuracyInMeters(double d) {
            this.accuracyInMeters = d;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Coordinate.Builder
        public Coordinate.Builder setLatitudeInDegrees(double d) {
            this.latitudeInDegrees = d;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Coordinate.Builder
        public Coordinate.Builder setLongitudeInDegrees(double d) {
            this.longitudeInDegrees = d;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }
    }

    private AutoValue_Coordinate(double d, double d2, double d3) {
        this.latitudeInDegrees = d;
        this.longitudeInDegrees = d2;
        this.accuracyInMeters = d3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Coordinate) {
            Coordinate coordinate = (Coordinate) obj;
            if (Double.doubleToLongBits(this.latitudeInDegrees) == Double.doubleToLongBits(coordinate.getLatitudeInDegrees()) && Double.doubleToLongBits(this.longitudeInDegrees) == Double.doubleToLongBits(coordinate.getLongitudeInDegrees()) && Double.doubleToLongBits(this.accuracyInMeters) == Double.doubleToLongBits(coordinate.getAccuracyInMeters())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Coordinate
    @JsonProperty("accuracyInMeters")
    public double getAccuracyInMeters() {
        return this.accuracyInMeters;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Coordinate
    @JsonProperty("latitudeInDegrees")
    public double getLatitudeInDegrees() {
        return this.latitudeInDegrees;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Coordinate
    @JsonProperty("longitudeInDegrees")
    public double getLongitudeInDegrees() {
        return this.longitudeInDegrees;
    }

    public int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.accuracyInMeters) >>> 32) ^ Double.doubleToLongBits(this.accuracyInMeters))) ^ ((((((int) ((Double.doubleToLongBits(this.latitudeInDegrees) >>> 32) ^ Double.doubleToLongBits(this.latitudeInDegrees))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.longitudeInDegrees) >>> 32) ^ Double.doubleToLongBits(this.longitudeInDegrees)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Coordinate{latitudeInDegrees=");
        sb.append(this.latitudeInDegrees);
        sb.append(", longitudeInDegrees=");
        sb.append(this.longitudeInDegrees);
        sb.append(", accuracyInMeters=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(this.accuracyInMeters, StringSubstitutor.DEFAULT_VAR_END, sb);
    }

    public /* synthetic */ AutoValue_Coordinate(double d, double d2, double d3, int i) {
        this(d, d2, d3);
    }
}
