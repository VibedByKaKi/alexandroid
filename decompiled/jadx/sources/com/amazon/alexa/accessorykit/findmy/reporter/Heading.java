package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_Heading;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_Heading.Builder.class)
@JsonSerialize(as = Heading.class)
/* loaded from: classes16.dex */
public abstract class Heading {
    private static final String ACCURACY_IN_DEGREES_KEY = "accuracyInDegrees";
    private static final String DIRECTION_IN_DEGREES_KEY = "directionInDegrees";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Heading build();

        @JsonProperty(Heading.ACCURACY_IN_DEGREES_KEY)
        public abstract Builder setAccuracyInDegrees(double d);

        @JsonProperty(Heading.DIRECTION_IN_DEGREES_KEY)
        public abstract Builder setDirectionInDegrees(double d);
    }

    public static Builder builder() {
        return new AutoValue_Heading.Builder();
    }

    @JsonProperty(ACCURACY_IN_DEGREES_KEY)
    public abstract double getAccuracyInDegrees();

    @JsonProperty(DIRECTION_IN_DEGREES_KEY)
    public abstract double getDirectionInDegrees();
}
