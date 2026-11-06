package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_TrackableDevice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_TrackableDevice.Builder.class)
@JsonSerialize(as = TrackableDevice.class)
/* loaded from: classes16.dex */
public abstract class TrackableDevice {
    private static final String CAUSE_KEY = "cause";
    private static final String DEVICE_INFO_KEY = "deviceInfo";
    private static final String ESTIMATED_PROXIMITY_KEY = "estimatedProximityDistance";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TrackableDevice build();

        @JsonProperty(TrackableDevice.CAUSE_KEY)
        public abstract Builder setCause(String str);

        @JsonProperty(TrackableDevice.DEVICE_INFO_KEY)
        public abstract Builder setDeviceInfo(DeviceInfo deviceInfo);

        @JsonProperty(TrackableDevice.ESTIMATED_PROXIMITY_KEY)
        public abstract Builder setEstimatedProximityDistance(String str);
    }

    public static Builder builder() {
        return new AutoValue_TrackableDevice.Builder();
    }

    @JsonProperty(CAUSE_KEY)
    public abstract String getCause();

    @JsonProperty(DEVICE_INFO_KEY)
    public abstract DeviceInfo getDeviceInfo();

    @JsonProperty(ESTIMATED_PROXIMITY_KEY)
    public abstract String getEstimatedProximityDistance();
}
