package com.dee.app.contacts.interfaces.models.data.enums;

import com.amazon.dee.app.util.PermissionsUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum RequestPermissionResult {
    NO_PERMISSION(PermissionsUtils.NO_PERMISSION),
    GRANTED_PERMISSION("All Permission Granted"),
    APP_ACTIVITY_EMPTY("Failed to fetch App current activity"),
    UNKNOWN_EXCEPTION("Unknown exception occurred");

    private final String reason;

    RequestPermissionResult(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}
