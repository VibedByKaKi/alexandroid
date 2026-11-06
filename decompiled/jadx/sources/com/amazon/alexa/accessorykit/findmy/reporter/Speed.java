package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_Speed;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_Speed.Builder.class)
@JsonSerialize(as = Speed.class)
/* loaded from: classes16.dex */
public abstract class Speed {
    private static final String ACCURACY_KEY = "accuracyInMetersPerSecond";
    private static final String SPEED_KEY = "speedInMetersPerSecond";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Speed build();

        @JsonProperty(Speed.ACCURACY_KEY)
        public abstract Builder setAccuracyInMetersPerSecond(double d);

        @JsonProperty(Speed.SPEED_KEY)
        public abstract Builder setSpeedInMetersPerSecond(double d);
    }

    public static Builder builder() {
        return new AutoValue_Speed.Builder();
    }

    @JsonProperty(ACCURACY_KEY)
    public abstract double getAccuracyInMetersPerSecond();

    @JsonProperty(SPEED_KEY)
    public abstract double getSpeedInMetersPerSecond();
}
