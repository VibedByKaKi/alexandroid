package com.dee.app.contacts.interfaces.models.data.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum DeviceCommsSupportedFeature {
    IN_BOUND_DROP_IN("inbound_drop_in"),
    UNKNOWN("unknown");

    private final String mFeature;

    DeviceCommsSupportedFeature(String str) {
        this.mFeature = str;
    }

    @JsonValue
    public String getFeature() {
        return this.mFeature;
    }
}
