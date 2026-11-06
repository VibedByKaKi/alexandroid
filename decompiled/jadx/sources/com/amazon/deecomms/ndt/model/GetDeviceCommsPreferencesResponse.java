package com.amazon.deecomms.ndt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GetDeviceCommsPreferencesResponse {

    @JsonProperty("deviceId")
    private String deviceId;

    @JsonProperty("devicePermissionsPreferences")
    private List<DevicePermissionsPreference> devicePermissionsPreferences;

    @JsonProperty("deviceType")
    private String deviceType;

    public String getDeviceId() {
        return this.deviceId;
    }

    public List<DevicePermissionsPreference> getDevicePermissionsPreferences() {
        return this.devicePermissionsPreferences;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDevicePermissionsPreferences(List<DevicePermissionsPreference> list) {
        this.devicePermissionsPreferences = list;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }
}
