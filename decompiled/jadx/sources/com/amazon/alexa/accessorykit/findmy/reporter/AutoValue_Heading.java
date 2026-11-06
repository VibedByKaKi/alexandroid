package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.reporter.Heading;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_Heading extends Heading {
    private final double accuracyInDegrees;
    private final double directionInDegrees;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Heading.Builder {
        private double accuracyInDegrees;
        private double directionInDegrees;
        private byte set$0;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Heading.Builder
        public Heading build() {
            if (this.set$0 == 3) {
                return new AutoValue_Heading(this.directionInDegrees, this.accuracyInDegrees, 0);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" directionInDegrees");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" accuracyInDegrees");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Heading.Builder
        public Heading.Builder setAccuracyInDegrees(double d) {
            this.accuracyInDegrees = d;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Heading.Builder
        public Heading.Builder setDirectionInDegrees(double d) {
            this.directionInDegrees = d;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    private AutoValue_Heading(double d, double d2) {
        this.directionInDegrees = d;
        this.accuracyInDegrees = d2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Heading) {
            Heading heading = (Heading) obj;
            if (Double.doubleToLongBits(this.directionInDegrees) == Double.doubleToLongBits(heading.getDirectionInDegrees()) && Double.doubleToLongBits(this.accuracyInDegrees) == Double.doubleToLongBits(heading.getAccuracyInDegrees())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Heading
    @JsonProperty("accuracyInDegrees")
    public double getAccuracyInDegrees() {
        return this.accuracyInDegrees;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Heading
    @JsonProperty("directionInDegrees")
    public double getDirectionInDegrees() {
        return this.directionInDegrees;
    }

    public int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.accuracyInDegrees) >>> 32) ^ Double.doubleToLongBits(this.accuracyInDegrees))) ^ ((((int) ((Double.doubleToLongBits(this.directionInDegrees) >>> 32) ^ Double.doubleToLongBits(this.directionInDegrees))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Heading{directionInDegrees=");
        sb.append(this.directionInDegrees);
        sb.append(", accuracyInDegrees=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(this.accuracyInDegrees, StringSubstitutor.DEFAULT_VAR_END, sb);
    }

    public /* synthetic */ AutoValue_Heading(double d, double d2, int i) {
        this(d, d2);
    }
}
