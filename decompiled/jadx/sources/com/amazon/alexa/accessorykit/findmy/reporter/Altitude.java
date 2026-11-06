package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_Altitude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_Altitude.Builder.class)
@JsonSerialize(as = Altitude.class)
/* loaded from: classes16.dex */
public abstract class Altitude {
    private static final String ACCURACY_IN_METERS_KEY = "accuracyInMeters";
    private static final String ALTITUDE_IN_METERS_KEY = "altitudeInMeters";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Altitude build();

        @JsonProperty(Altitude.ACCURACY_IN_METERS_KEY)
        public abstract Builder setAccuracyInMeters(double d);

        @JsonProperty(Altitude.ALTITUDE_IN_METERS_KEY)
        public abstract Builder setAltitudeInMeters(double d);
    }

    public static Builder builder() {
        return new AutoValue_Altitude.Builder();
    }

    @JsonProperty(ACCURACY_IN_METERS_KEY)
    public abstract double getAccuracyInMeters();

    @JsonProperty(ALTITUDE_IN_METERS_KEY)
    public abstract double getAltitudeInMeters();
}
