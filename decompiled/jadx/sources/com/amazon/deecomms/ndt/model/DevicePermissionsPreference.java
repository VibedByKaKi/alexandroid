package com.amazon.deecomms.ndt.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DevicePermissionsPreference {

    @JsonProperty("allowed")
    private boolean allowed;

    @JsonProperty("state")
    private String state;

    public boolean getAllowed() {
        return this.allowed;
    }

    public String getState() {
        return this.state;
    }

    public void setAllowed(boolean z) {
        this.allowed = z;
    }

    public void setState(String str) {
        this.state = str;
    }
}
