package com.amazon.alexa.accessorykit.findmy;

import com.amazon.alexa.accessorykit.findmy.AutoValue_LocationInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_LocationInformation.Builder.class)
@JsonSerialize(as = LocationInformation.class)
/* loaded from: classes16.dex */
public abstract class LocationInformation {
    private static final String ACCURACY_KEY = "accuracyInMeters";
    private static final String ALTITUDE_KEY = "altitudeInMeters";
    private static final String BEARING_KEY = "bearingInDegrees";
    private static final String LATITUDE_KEY = "latitudeInDegrees";
    private static final String LONGITUDE_KEY = "longitudeInDegrees";
    private static final String SPEED_KEY = "speedInMetersPerSecond";
    private static final String TIME_KEY = "time";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract LocationInformation build();

        @JsonProperty(LocationInformation.ACCURACY_KEY)
        public abstract Builder setAccuracyInMeters(float f);

        @JsonProperty(LocationInformation.ALTITUDE_KEY)
        public abstract Builder setAltitudeInMeters(double d);

        @JsonProperty(LocationInformation.BEARING_KEY)
        public abstract Builder setBearingInDegrees(float f);

        @JsonProperty(LocationInformation.LATITUDE_KEY)
        public abstract Builder setLatitudeInDegrees(double d);

        @JsonProperty(LocationInformation.LONGITUDE_KEY)
        public abstract Builder setLongitudeInDegrees(double d);

        @JsonProperty(LocationInformation.SPEED_KEY)
        public abstract Builder setSpeedInMetersPerSecond(float f);

        @JsonProperty("time")
        public abstract Builder setTime(long j);
    }

    public static Builder builder() {
        return new AutoValue_LocationInformation.Builder();
    }

    @JsonProperty(ACCURACY_KEY)
    public abstract float getAccuracyInMeters();

    @JsonProperty(ALTITUDE_KEY)
    public abstract double getAltitudeInMeters();

    @JsonProperty(BEARING_KEY)
    public abstract float getBearingInDegrees();

    @JsonProperty(LATITUDE_KEY)
    public abstract double getLatitudeInDegrees();

    @JsonProperty(LONGITUDE_KEY)
    public abstract double getLongitudeInDegrees();

    @JsonProperty(SPEED_KEY)
    public abstract float getSpeedInMetersPerSecond();

    @JsonProperty("time")
    public abstract long getTime();
}
