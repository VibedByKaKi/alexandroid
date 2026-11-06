package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.reporter.Altitude;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_Altitude extends Altitude {
    private final double accuracyInMeters;
    private final double altitudeInMeters;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Altitude.Builder {
        private double accuracyInMeters;
        private double altitudeInMeters;
        private byte set$0;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Altitude.Builder
        public Altitude build() {
            if (this.set$0 == 3) {
                return new AutoValue_Altitude(this.altitudeInMeters, this.accuracyInMeters, 0);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" altitudeInMeters");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" accuracyInMeters");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Altitude.Builder
        public Altitude.Builder setAccuracyInMeters(double d) {
            this.accuracyInMeters = d;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Altitude.Builder
        public Altitude.Builder setAltitudeInMeters(double d) {
            this.altitudeInMeters = d;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    private AutoValue_Altitude(double d, double d2) {
        this.altitudeInMeters = d;
        this.accuracyInMeters = d2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Altitude) {
            Altitude altitude = (Altitude) obj;
            if (Double.doubleToLongBits(this.altitudeInMeters) == Double.doubleToLongBits(altitude.getAltitudeInMeters()) && Double.doubleToLongBits(this.accuracyInMeters) == Double.doubleToLongBits(altitude.getAccuracyInMeters())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Altitude
    @JsonProperty("accuracyInMeters")
    public double getAccuracyInMeters() {
        return this.accuracyInMeters;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Altitude
    @JsonProperty("altitudeInMeters")
    public double getAltitudeInMeters() {
        return this.altitudeInMeters;
    }

    public int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.accuracyInMeters) >>> 32) ^ Double.doubleToLongBits(this.accuracyInMeters))) ^ ((((int) ((Double.doubleToLongBits(this.altitudeInMeters) >>> 32) ^ Double.doubleToLongBits(this.altitudeInMeters))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Altitude{altitudeInMeters=");
        sb.append(this.altitudeInMeters);
        sb.append(", accuracyInMeters=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(this.accuracyInMeters, StringSubstitutor.DEFAULT_VAR_END, sb);
    }

    public /* synthetic */ AutoValue_Altitude(double d, double d2, int i) {
        this(d, d2);
    }
}
