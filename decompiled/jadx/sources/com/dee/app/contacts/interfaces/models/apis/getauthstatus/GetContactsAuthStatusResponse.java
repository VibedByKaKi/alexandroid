package com.dee.app.contacts.interfaces.models.apis.getauthstatus;

import com.dee.app.contacts.interfaces.models.data.enums.PermissionAuthStatus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsAuthStatusResponse {
    private PermissionAuthStatus status;

    public PermissionAuthStatus getStatus() {
        return this.status;
    }

    public void setStatus(PermissionAuthStatus permissionAuthStatus) {
        this.status = permissionAuthStatus;
    }
}
