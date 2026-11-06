package com.amazon.alexa.biloba.model;

import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayConstants;
import com.amazon.alexa.biloba.model.Device;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlertConfiguration {

    @SerializedName("id")
    private String id = null;

    @SerializedName("start")
    private String start = null;

    @SerializedName("end")
    private String end = null;

    @SerializedName("temperature")
    private Temperature temperature = null;

    @SerializedName("triggerCondition")
    private TriggerCondition triggerCondition = null;

    @SerializedName("alertCategory")
    private AlertCategory alertCategory = null;

    @SerializedName("deviceActivities")
    private List<DeviceActivity> deviceActivities = null;

    @SerializedName("deviceActivityExclusions")
    private List<DeviceActivity> deviceActivityExclusions = null;

    @SerializedName("status")
    private AlertConfigurationStatus status = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("deviceStatus")
    private DeviceStatus deviceStatus = null;

    @SerializedName(SmartPlayConstants.SMART_PLAY_MEDIA_JSON_FIELD_SUBTITLE)
    private String subtitle = null;

    @SerializedName("deviceCategory")
    private Device.DeviceCategory deviceCategory = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum AlertCategory {
        CUSTOM("CUSTOM"),
        HOUSEHOLD("HOUSEHOLD");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<AlertCategory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public AlertCategory read(JsonReader jsonReader) throws IOException {
                return AlertCategory.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AlertCategory alertCategory) throws IOException {
                jsonWriter.value(alertCategory.getValue());
            }
        }

        AlertCategory(String str) {
            this.value = str;
        }

        public static AlertCategory fromValue(String str) {
            for (AlertCategory alertCategory : values()) {
                if (String.valueOf(alertCategory.value).equals(str)) {
                    return alertCategory;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum AlertConfigurationStatus {
        ENABLED("ENABLED"),
        DISABLED("DISABLED");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<AlertConfigurationStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public AlertConfigurationStatus read(JsonReader jsonReader) throws IOException {
                return AlertConfigurationStatus.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AlertConfigurationStatus alertConfigurationStatus) throws IOException {
                jsonWriter.value(alertConfigurationStatus.getValue());
            }
        }

        AlertConfigurationStatus(String str) {
            this.value = str;
        }

        public static AlertConfigurationStatus fromValue(String str) {
            for (AlertConfigurationStatus alertConfigurationStatus : values()) {
                if (String.valueOf(alertConfigurationStatus.value).equals(str)) {
                    return alertConfigurationStatus;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum DeviceStatus {
        REGISTERED("REGISTERED"),
        DEREGISTERED("DEREGISTERED");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<DeviceStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public DeviceStatus read(JsonReader jsonReader) throws IOException {
                return DeviceStatus.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, DeviceStatus deviceStatus) throws IOException {
                jsonWriter.value(deviceStatus.getValue());
            }
        }

        DeviceStatus(String str) {
            this.value = str;
        }

        public static DeviceStatus fromValue(String str) {
            for (DeviceStatus deviceStatus : values()) {
                if (String.valueOf(deviceStatus.value).equals(str)) {
                    return deviceStatus;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public AlertConfiguration alertCategory(AlertCategory alertCategory) {
        this.alertCategory = alertCategory;
        return this;
    }

    public AlertConfiguration description(String str) {
        this.description = str;
        return this;
    }

    public AlertConfiguration deviceActivities(List<DeviceActivity> list) {
        this.deviceActivities = list;
        return this;
    }

    public AlertConfiguration deviceActivityExclusions(List<DeviceActivity> list) {
        this.deviceActivityExclusions = list;
        return this;
    }

    public AlertConfiguration deviceCategory(Device.DeviceCategory deviceCategory) {
        this.deviceCategory = deviceCategory;
        return this;
    }

    public AlertConfiguration deviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }

    public AlertConfiguration end(String str) {
        this.end = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AlertConfiguration alertConfiguration = (AlertConfiguration) obj;
            if (Objects.equals(this.id, alertConfiguration.id) && Objects.equals(this.start, alertConfiguration.start) && Objects.equals(this.end, alertConfiguration.end) && Objects.equals(this.temperature, alertConfiguration.temperature) && Objects.equals(this.triggerCondition, alertConfiguration.triggerCondition) && Objects.equals(this.alertCategory, alertConfiguration.alertCategory) && Objects.equals(this.deviceActivities, alertConfiguration.deviceActivities) && Objects.equals(this.deviceActivityExclusions, alertConfiguration.deviceActivityExclusions) && Objects.equals(this.status, alertConfiguration.status) && Objects.equals(this.title, alertConfiguration.title) && Objects.equals(this.description, alertConfiguration.description) && Objects.equals(this.deviceStatus, alertConfiguration.deviceStatus) && Objects.equals(this.subtitle, alertConfiguration.subtitle) && Objects.equals(this.deviceCategory, alertConfiguration.deviceCategory)) {
                return true;
            }
        }
        return false;
    }

    public AlertCategory getAlertCategory() {
        return this.alertCategory;
    }

    public String getDescription() {
        return this.description;
    }

    public List<DeviceActivity> getDeviceActivities() {
        return this.deviceActivities;
    }

    public List<DeviceActivity> getDeviceActivityExclusions() {
        return this.deviceActivityExclusions;
    }

    public Device.DeviceCategory getDeviceCategory() {
        return this.deviceCategory;
    }

    public DeviceStatus getDeviceStatus() {
        return this.deviceStatus;
    }

    public String getEnd() {
        return this.end;
    }

    public String getId() {
        return this.id;
    }

    public String getStart() {
        return this.start;
    }

    public AlertConfigurationStatus getStatus() {
        return this.status;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public Temperature getTemperature() {
        return this.temperature;
    }

    public String getTitle() {
        return this.title;
    }

    public TriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.start, this.end, this.temperature, this.triggerCondition, this.alertCategory, this.deviceActivities, this.deviceActivityExclusions, this.status, this.title, this.description, this.deviceStatus, this.subtitle, this.deviceCategory);
    }

    public AlertConfiguration id(String str) {
        this.id = str;
        return this;
    }

    public void setAlertCategory(AlertCategory alertCategory) {
        this.alertCategory = alertCategory;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDeviceActivities(List<DeviceActivity> list) {
        this.deviceActivities = list;
    }

    public void setDeviceActivityExclusions(List<DeviceActivity> list) {
        this.deviceActivityExclusions = list;
    }

    public void setDeviceCategory(Device.DeviceCategory deviceCategory) {
        this.deviceCategory = deviceCategory;
    }

    public void setDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public void setEnd(String str) {
        this.end = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setStart(String str) {
        this.start = str;
    }

    public void setStatus(AlertConfigurationStatus alertConfigurationStatus) {
        this.status = alertConfigurationStatus;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTriggerCondition(TriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
    }

    public AlertConfiguration shallowCopy() {
        return new AlertConfiguration().id(this.id).start(this.start).end(this.end).temperature(this.temperature).triggerCondition(this.triggerCondition).alertCategory(this.alertCategory).deviceActivities(this.deviceActivities).deviceActivityExclusions(this.deviceActivityExclusions).status(this.status).title(this.title).description(this.description).deviceStatus(this.deviceStatus).subtitle(this.subtitle).deviceCategory(this.deviceCategory);
    }

    public AlertConfiguration start(String str) {
        this.start = str;
        return this;
    }

    public AlertConfiguration status(AlertConfigurationStatus alertConfigurationStatus) {
        this.status = alertConfigurationStatus;
        return this;
    }

    public AlertConfiguration subtitle(String str) {
        this.subtitle = str;
        return this;
    }

    public AlertConfiguration temperature(Temperature temperature) {
        this.temperature = temperature;
        return this;
    }

    public AlertConfiguration title(String str) {
        this.title = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class AlertConfiguration {\n    id: ");
        sb.append(toIndentedString(this.id));
        sb.append("\n    start: ");
        sb.append(toIndentedString(this.start));
        sb.append("\n    end: ");
        sb.append(toIndentedString(this.end));
        sb.append("\n    temperature: ");
        sb.append(toIndentedString(this.temperature));
        sb.append("\n    triggerCondition: ");
        sb.append(toIndentedString(this.triggerCondition));
        sb.append("\n    alertCategory: ");
        sb.append(toIndentedString(this.alertCategory));
        sb.append("\n    deviceActivities: ");
        sb.append(toIndentedString(this.deviceActivities));
        sb.append("\n    deviceActivityExclusions: ");
        sb.append(toIndentedString(this.deviceActivityExclusions));
        sb.append("\n    status: ");
        sb.append(toIndentedString(this.status));
        sb.append("\n    title: ");
        sb.append(toIndentedString(this.title));
        sb.append("\n    subtitle: ");
        sb.append(toIndentedString(this.subtitle));
        sb.append("\n    description: ");
        sb.append(toIndentedString(this.description));
        sb.append("\n    deviceStatus: ");
        sb.append(toIndentedString(this.deviceStatus));
        sb.append("\n    deviceCategory: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.deviceCategory), "\n}");
    }

    public AlertConfiguration triggerCondition(TriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }
}
