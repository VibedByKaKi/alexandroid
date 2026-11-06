package com.dee.app.contacts.interfaces.models.data.enums;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum PermissionRequestInfo {
    READ_CONTACTS(1000, "contacts", new String[]{"android.permission.READ_CONTACTS"}, "permissions.contacts");

    public final String feature;
    public final String metric;
    public final String name;
    public final String[] permissions;
    public final int requestCode;

    PermissionRequestInfo(int i, String str, String[] strArr, String str2, String str3) {
        this.name = str;
        this.requestCode = i;
        this.permissions = strArr;
        this.metric = str2;
        this.feature = str3;
    }

    public static PermissionRequestInfo byName(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid permission name. The permission name is null.");
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (PermissionRequestInfo permissionRequestInfo : values()) {
            if (lowerCase.equals(permissionRequestInfo.name)) {
                return permissionRequestInfo;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid permission name. No RequestInfo found for: ", lowerCase));
        return null;
    }

    public static PermissionRequestInfo byRequestCode(int i) {
        for (PermissionRequestInfo permissionRequestInfo : values()) {
            if (i == permissionRequestInfo.requestCode) {
                return permissionRequestInfo;
            }
        }
        return null;
    }

    PermissionRequestInfo(int i, String str, String[] strArr, String str2) {
        this(i, str, strArr, str2, null);
    }
}
