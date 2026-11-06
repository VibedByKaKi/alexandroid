package com.dee.app.contacts.interfaces.models.apis.getmasterdeviceid;

import com.dee.app.contacts.interfaces.models.data.enums.OwnerIdType;
import com.dee.app.contacts.interfaces.models.data.enums.SyncType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetMasterDeviceIdQueryConfig {
    private OwnerIdType ownerIdType;
    private SyncType syncType;

    public GetMasterDeviceIdQueryConfig(OwnerIdType ownerIdType, SyncType syncType) {
        this.ownerIdType = ownerIdType;
        this.syncType = syncType;
    }

    public OwnerIdType getOwnerIdType() {
        return this.ownerIdType;
    }

    public SyncType getSyncType() {
        return this.syncType;
    }

    public void setOwnerIdType(OwnerIdType ownerIdType) {
        this.ownerIdType = ownerIdType;
    }

    public void setSyncType(SyncType syncType) {
        this.syncType = syncType;
    }

    public GetMasterDeviceIdQueryConfig(SyncType syncType) {
        this.syncType = syncType;
    }

    public GetMasterDeviceIdQueryConfig(OwnerIdType ownerIdType) {
        this.ownerIdType = ownerIdType;
    }

    public GetMasterDeviceIdQueryConfig() {
    }
}
