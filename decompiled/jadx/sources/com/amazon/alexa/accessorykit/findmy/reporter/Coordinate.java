package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_Coordinate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_Coordinate.Builder.class)
@JsonSerialize(as = Coordinate.class)
/* loaded from: classes16.dex */
public abstract class Coordinate {
    private static final String ACCURACY_IN_METERS_KEY = "accuracyInMeters";
    private static final String LATITUDE_IN_DEGREES_KEY = "latitudeInDegrees";
    private static final String LONGITUDE_IN_DEGREES_KEY = "longitudeInDegrees";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Coordinate build();

        @JsonProperty(Coordinate.ACCURACY_IN_METERS_KEY)
        public abstract Builder setAccuracyInMeters(double d);

        @JsonProperty(Coordinate.LATITUDE_IN_DEGREES_KEY)
        public abstract Builder setLatitudeInDegrees(double d);

        @JsonProperty(Coordinate.LONGITUDE_IN_DEGREES_KEY)
        public abstract Builder setLongitudeInDegrees(double d);
    }

    public static Builder builder() {
        return new AutoValue_Coordinate.Builder();
    }

    @JsonProperty(ACCURACY_IN_METERS_KEY)
    public abstract double getAccuracyInMeters();

    @JsonProperty(LATITUDE_IN_DEGREES_KEY)
    public abstract double getLatitudeInDegrees();

    @JsonProperty(LONGITUDE_IN_DEGREES_KEY)
    public abstract double getLongitudeInDegrees();
}
