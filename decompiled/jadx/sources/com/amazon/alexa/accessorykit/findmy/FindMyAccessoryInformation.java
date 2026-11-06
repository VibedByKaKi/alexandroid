package com.amazon.alexa.accessorykit.findmy;

import com.amazon.alexa.accessorykit.findmy.AutoValue_FindMyAccessoryInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_FindMyAccessoryInformation.Builder.class)
@JsonSerialize(as = FindMyAccessoryInformation.class)
/* loaded from: classes16.dex */
public abstract class FindMyAccessoryInformation {
    private static final String DEVICE_TYPE_KEY = "deviceType";
    private static final String DSN_KEY = "deviceSerialNumber";
    private static final String EVENT_CAUSE_KEY = "eventCause";
    private static final String IDENTIFIER_KEY = "identifier";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract FindMyAccessoryInformation build();

        @JsonProperty("deviceSerialNumber")
        public abstract Builder setDeviceSerialNumber(String str);

        @JsonProperty("deviceType")
        public abstract Builder setDeviceType(String str);

        @JsonProperty(FindMyAccessoryInformation.EVENT_CAUSE_KEY)
        public abstract Builder setEventCause(EventCause eventCause);

        @JsonProperty("identifier")
        public abstract Builder setIdentifier(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EventCause {
        BLUETOOTH_LINK("BlueToothLink"),
        BLUETOOTH_UNLINK("BlueToothUnLink"),
        PRESENCE("Presence"),
        BATTERY("Battery");

        public String description;

        EventCause(String str) {
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }
    }

    public static Builder builder() {
        return new AutoValue_FindMyAccessoryInformation.Builder();
    }

    @JsonProperty("deviceSerialNumber")
    public abstract String getDeviceSerialNumber();

    @JsonProperty("deviceType")
    public abstract String getDeviceType();

    @JsonProperty(EVENT_CAUSE_KEY)
    public abstract EventCause getEventCause();

    @JsonProperty("identifier")
    public abstract String getIdentifier();
}
