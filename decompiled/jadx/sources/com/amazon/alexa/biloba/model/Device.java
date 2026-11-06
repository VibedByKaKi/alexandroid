package com.amazon.alexa.biloba.model;

import com.amazon.alexa.ra.core.data.fragments.CardContext;
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
public class Device {

    @SerializedName("icon")
    private String icon;

    @SerializedName("name")
    private String name = null;

    @SerializedName(CardContext.ACTIONS)
    private List<DeviceAction> actions = null;

    @SerializedName("deviceIdentifier")
    private DeviceIdentifier deviceIdentifier = null;

    @SerializedName("category")
    private DeviceCategory category = null;

    @SerializedName("nameSpace")
    private String nameSpace = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum DeviceCategory {
        CONTACT_SENSOR("CONTACT_SENSOR"),
        ECHO_ALEXA_DEVICE("ECHO_ALEXA_DEVICE"),
        LIGHT("LIGHT"),
        MOTION_SENSOR("MOTION_SENSOR"),
        SMARTLOCK("SMARTLOCK"),
        SMARTPLUG("SMARTPLUG"),
        UNKNOWN("UNKNOWN");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<DeviceCategory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public DeviceCategory read(JsonReader jsonReader) throws IOException {
                return DeviceCategory.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, DeviceCategory deviceCategory) throws IOException {
                jsonWriter.value(deviceCategory.getValue());
            }
        }

        DeviceCategory(String str) {
            this.value = str;
        }

        public static DeviceCategory fromValue(String str) {
            for (DeviceCategory deviceCategory : values()) {
                if (String.valueOf(deviceCategory.value).equals(str)) {
                    return deviceCategory;
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

    public Device actions(List<DeviceAction> list) {
        this.actions = list;
        return this;
    }

    public Device category(DeviceCategory deviceCategory) {
        this.category = deviceCategory;
        return this;
    }

    public Device deviceIdentifier(DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Device device = (Device) obj;
            if (Objects.equals(this.name, device.name) && Objects.equals(this.actions, device.actions) && Objects.equals(this.deviceIdentifier, device.deviceIdentifier) && Objects.equals(this.category, device.category) && Objects.equals(this.nameSpace, device.nameSpace) && Objects.equals(this.icon, device.icon)) {
                return true;
            }
        }
        return false;
    }

    public List<DeviceAction> getActions() {
        return this.actions;
    }

    public DeviceCategory getCategory() {
        return this.category;
    }

    public DeviceIdentifier getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getNameSpace() {
        return this.nameSpace;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.actions, this.deviceIdentifier, this.category, this.nameSpace, this.icon);
    }

    public Device name(String str) {
        this.name = str;
        return this;
    }

    public Device nameSpace(String str) {
        this.nameSpace = str;
        return this;
    }

    public void setActions(List<DeviceAction> list) {
        this.actions = list;
    }

    public void setCategory(DeviceCategory deviceCategory) {
        this.category = deviceCategory;
    }

    public void setDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNameSpace(String str) {
        this.nameSpace = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Device {\n    name: ");
        sb.append(toIndentedString(this.name));
        sb.append("\n    actions: ");
        sb.append(toIndentedString(this.actions));
        sb.append("\n    identifier: ");
        sb.append(toIndentedString(this.deviceIdentifier));
        sb.append("\n    category: ");
        sb.append(toIndentedString(this.category));
        sb.append("\n    nameSpace: ");
        sb.append(toIndentedString(this.nameSpace));
        sb.append("\n    icon: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.icon), "\n}");
    }
}
