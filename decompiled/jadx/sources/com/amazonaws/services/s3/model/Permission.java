package com.amazonaws.services.s3.model;

import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum Permission {
    FullControl("FULL_CONTROL", "x-amz-grant-full-control"),
    Read(MessagingControllerConstant.MESSAGING_CONTROLLER_MAP_STATUS_READ, "x-amz-grant-read"),
    Write("WRITE", "x-amz-grant-write"),
    ReadAcp("READ_ACP", "x-amz-grant-read-acp"),
    WriteAcp("WRITE_ACP", "x-amz-grant-write-acp");

    private String headerName;
    private String permissionString;

    Permission(String str, String str2) {
        this.permissionString = str;
        this.headerName = str2;
    }

    public static Permission parsePermission(String str) {
        for (Permission permission : values()) {
            if (permission.permissionString.equals(str)) {
                return permission;
            }
        }
        return null;
    }

    public String getHeaderName() {
        return this.headerName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.permissionString;
    }
}
