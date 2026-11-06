package com.dee.app.contacts.interfaces.models.apis.getmasterdeviceid;

import com.dee.app.contacts.interfaces.models.data.enums.SyncType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetMasterDeviceIdRequest {
    private GetMasterDeviceIdQueryConfig queryConfig;
    private String userId;

    public GetMasterDeviceIdRequest() {
        this.queryConfig = new GetMasterDeviceIdQueryConfig(SyncType.MASTER);
    }

    public GetMasterDeviceIdQueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setQueryConfig(GetMasterDeviceIdQueryConfig getMasterDeviceIdQueryConfig) {
        this.queryConfig = getMasterDeviceIdQueryConfig;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public GetMasterDeviceIdRequest(GetMasterDeviceIdQueryConfig getMasterDeviceIdQueryConfig) {
        this.queryConfig = getMasterDeviceIdQueryConfig;
    }

    public GetMasterDeviceIdRequest(String str, GetMasterDeviceIdQueryConfig getMasterDeviceIdQueryConfig) {
        this.userId = str;
        this.queryConfig = getMasterDeviceIdQueryConfig;
    }
}
