package com.dee.app.contacts.interfaces.models.apis.getauthstatus;

import com.dee.app.contacts.interfaces.models.data.enums.PermissionRequestInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsAuthStatusRequest {
    private PermissionRequestInfo permissionInfo;

    public GetContactsAuthStatusRequest(PermissionRequestInfo permissionRequestInfo) {
        this.permissionInfo = permissionRequestInfo;
    }

    public PermissionRequestInfo getPermissionInfo() {
        return this.permissionInfo;
    }
}
