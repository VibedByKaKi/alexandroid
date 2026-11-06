package com.amazon.deecomms.contacts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GetPersonalDevicesResponse {

    @JsonProperty("devices")
    private List<Device> devices;

    @JsonProperty("masterDeviceId")
    private String masterDeviceId;

    public List<Device> getDevices() {
        return this.devices;
    }

    public String getMasterDeviceId() {
        return this.masterDeviceId;
    }

    public void setDevices(List<Device> list) {
        this.devices = list;
    }

    public void setMasterDeviceId(String str) {
        this.masterDeviceId = str;
    }
}
