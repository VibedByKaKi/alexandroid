package com.dee.app.contacts.interfaces.models.apis.requestauthstatus;

import com.dee.app.contacts.interfaces.models.data.enums.RequestPermissionResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RequestContactsPermissionResponse {
    private boolean isGranted;
    private RequestPermissionResult reason;

    public RequestContactsPermissionResponse(boolean z, RequestPermissionResult requestPermissionResult) {
        this.isGranted = z;
        this.reason = requestPermissionResult;
    }

    public RequestPermissionResult getReason() {
        return this.reason;
    }

    public boolean isGranted() {
        return this.isGranted;
    }
}
