package com.amazon.alexa.biloba.generated.models;

import com.amazon.alexa.biloba.model.Device;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DevicesResponse {

    @SerializedName("devices")
    private List<Device> devices = new ArrayList();

    @SerializedName("messages")
    private Map<String, Message> messages = new HashMap();

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public DevicesResponse addDevicesItem(Device device) {
        this.devices.add(device);
        return this;
    }

    public DevicesResponse devices(List<Device> list) {
        this.devices = list;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DevicesResponse devicesResponse = (DevicesResponse) obj;
            if (Objects.equals(this.devices, devicesResponse.devices) && Objects.equals(this.messages, devicesResponse.messages)) {
                return true;
            }
        }
        return false;
    }

    public List<Device> getDevices() {
        return this.devices;
    }

    public Map<String, Message> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return Objects.hash(this.devices, this.messages);
    }

    public DevicesResponse messages(Map<String, Message> map) {
        this.messages = map;
        return this;
    }

    public DevicesResponse putMessagesItem(String str, Message message) {
        this.messages.put(str, message);
        return this;
    }

    public void setDevices(List<Device> list) {
        this.devices = list;
    }

    public void setMessages(Map<String, Message> map) {
        this.messages = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class DevicesResponse {\n    devices: ");
        sb.append(toIndentedString(this.devices));
        sb.append("\n    messages: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.messages), "\n}");
    }
}
