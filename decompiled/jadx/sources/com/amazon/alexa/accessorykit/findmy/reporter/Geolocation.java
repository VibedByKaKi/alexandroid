package com.amazon.alexa.accessorykit.findmy.reporter;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_Geolocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_Geolocation.Builder.class)
@JsonSerialize(as = Geolocation.class)
/* loaded from: classes16.dex */
public abstract class Geolocation {
    private static final String ALTITUDE_KEY = "altitude";
    private static final String COORDINATE_KEY = "coordinate";
    private static final String HEADING_KEY = "heading";
    private static final String SPEED_KEY = "speed";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Geolocation build();

        @JsonProperty("altitude")
        public abstract Builder setAltitude(Altitude altitude);

        @JsonProperty("coordinate")
        public abstract Builder setCoordinate(Coordinate coordinate);

        @JsonProperty("heading")
        public abstract Builder setHeading(Heading heading);

        @JsonProperty("speed")
        public abstract Builder setSpeed(Speed speed);
    }

    public static Builder builder() {
        return new AutoValue_Geolocation.Builder();
    }

    @Nullable
    @JsonProperty("altitude")
    public abstract Altitude getAltitude();

    @JsonProperty("coordinate")
    public abstract Coordinate getCoordinate();

    @Nullable
    @JsonProperty("heading")
    public abstract Heading getHeading();

    @Nullable
    @JsonProperty("speed")
    public abstract Speed getSpeed();
}
