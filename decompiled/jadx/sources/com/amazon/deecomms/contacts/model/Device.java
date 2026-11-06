package com.amazon.deecomms.contacts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Device {

    @JsonProperty("deviceId")
    private String deviceId;

    @JsonProperty("isMasterDevice")
    private boolean isMasterDevice;

    public String getDeviceId() {
        return this.deviceId;
    }

    public boolean isMasterDevice() {
        return this.isMasterDevice;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setMasterDevice(boolean z) {
        this.isMasterDevice = z;
    }
}
