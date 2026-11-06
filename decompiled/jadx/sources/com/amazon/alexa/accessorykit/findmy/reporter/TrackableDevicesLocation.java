package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_TrackableDevicesLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_TrackableDevicesLocation.Builder.class)
@JsonSerialize(as = TrackableDevicesLocation.class)
/* loaded from: classes16.dex */
public abstract class TrackableDevicesLocation {
    private static final String GEOLOCATION_KEY = "geolocation";
    static final String TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String TRACKABLE_DEVICES_KEY = "trackableDevices";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TrackableDevicesLocation build();

        @JsonProperty(TrackableDevicesLocation.GEOLOCATION_KEY)
        public abstract Builder setGeolocation(Geolocation geolocation);

        @JsonProperty("timestamp")
        public abstract Builder setTimestamp(String str);

        @JsonProperty(TrackableDevicesLocation.TRACKABLE_DEVICES_KEY)
        public abstract Builder setTrackableDevices(List<TrackableDevice> list);
    }

    public static Builder builder() {
        return new AutoValue_TrackableDevicesLocation.Builder();
    }

    @JsonProperty(GEOLOCATION_KEY)
    public abstract Geolocation getGeolocation();

    @JsonProperty("timestamp")
    public abstract String getTimestamp();

    @JsonProperty(TRACKABLE_DEVICES_KEY)
    public abstract List<TrackableDevice> getTrackableDevices();
}
