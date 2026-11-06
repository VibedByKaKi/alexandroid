package com.amazon.identity.auth.device.framework;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
enum MAPRuntimePermissionHandler$PermissionAction {
    ACTION_READ_MOBILE_NUMBER(1, new String[]{"android.permission.READ_PHONE_STATE"});

    final String[] mPermissions;
    final int mRequestId;

    MAPRuntimePermissionHandler$PermissionAction(int i, String[] strArr) {
        this.mRequestId = i;
        this.mPermissions = strArr;
    }
}
