package com.amazon.alexa.accessory.notificationpublisher.eventBus.models;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum SyncType {
    UPDATE("UPDATE"),
    DELETE("DELETE"),
    ADD("ADD");

    private final String value;

    SyncType(String str) {
        this.value = str;
    }

    @Nullable
    public static SyncType fromString(String str) {
        for (SyncType syncType : values()) {
            if (syncType.value.equals(str)) {
                return syncType;
            }
        }
        return null;
    }

    public String getValue() {
        return this.value;
    }
}
