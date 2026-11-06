package com.dee.app.contacts.interfaces.models.apis.cansync;

import com.dee.app.contacts.interfaces.models.data.enums.OwnerIdType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CanSyncContactsQueryConfig {
    private OwnerIdType ownerIdType;
    private String sourceDeviceId;

    public CanSyncContactsQueryConfig(String str, OwnerIdType ownerIdType) {
        this.sourceDeviceId = str;
        this.ownerIdType = ownerIdType;
    }

    public OwnerIdType getOwnerIdType() {
        return this.ownerIdType;
    }

    public String getSourceDeviceId() {
        return this.sourceDeviceId;
    }

    public void setOwnerIdType(OwnerIdType ownerIdType) {
        this.ownerIdType = ownerIdType;
    }

    public void setSourceDeviceId(String str) {
        this.sourceDeviceId = str;
    }

    public CanSyncContactsQueryConfig(String str) {
        this.sourceDeviceId = str;
    }

    public CanSyncContactsQueryConfig() {
    }
}
