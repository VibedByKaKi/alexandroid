package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.reporter.Speed;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_Speed extends Speed {
    private final double accuracyInMetersPerSecond;
    private final double speedInMetersPerSecond;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Speed.Builder {
        private double accuracyInMetersPerSecond;
        private byte set$0;
        private double speedInMetersPerSecond;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Speed.Builder
        public Speed build() {
            if (this.set$0 == 3) {
                return new AutoValue_Speed(this.speedInMetersPerSecond, this.accuracyInMetersPerSecond, 0);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" speedInMetersPerSecond");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" accuracyInMetersPerSecond");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Speed.Builder
        public Speed.Builder setAccuracyInMetersPerSecond(double d) {
            this.accuracyInMetersPerSecond = d;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Speed.Builder
        public Speed.Builder setSpeedInMetersPerSecond(double d) {
            this.speedInMetersPerSecond = d;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    private AutoValue_Speed(double d, double d2) {
        this.speedInMetersPerSecond = d;
        this.accuracyInMetersPerSecond = d2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Speed) {
            Speed speed = (Speed) obj;
            if (Double.doubleToLongBits(this.speedInMetersPerSecond) == Double.doubleToLongBits(speed.getSpeedInMetersPerSecond()) && Double.doubleToLongBits(this.accuracyInMetersPerSecond) == Double.doubleToLongBits(speed.getAccuracyInMetersPerSecond())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Speed
    @JsonProperty("accuracyInMetersPerSecond")
    public double getAccuracyInMetersPerSecond() {
        return this.accuracyInMetersPerSecond;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Speed
    @JsonProperty("speedInMetersPerSecond")
    public double getSpeedInMetersPerSecond() {
        return this.speedInMetersPerSecond;
    }

    public int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.accuracyInMetersPerSecond) >>> 32) ^ Double.doubleToLongBits(this.accuracyInMetersPerSecond))) ^ ((((int) ((Double.doubleToLongBits(this.speedInMetersPerSecond) >>> 32) ^ Double.doubleToLongBits(this.speedInMetersPerSecond))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Speed{speedInMetersPerSecond=");
        sb.append(this.speedInMetersPerSecond);
        sb.append(", accuracyInMetersPerSecond=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(this.accuracyInMetersPerSecond, StringSubstitutor.DEFAULT_VAR_END, sb);
    }

    public /* synthetic */ AutoValue_Speed(double d, double d2, int i) {
        this(d, d2);
    }
}
