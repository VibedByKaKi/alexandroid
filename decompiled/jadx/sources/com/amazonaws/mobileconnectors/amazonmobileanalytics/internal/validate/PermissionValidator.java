package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.validate;

import android.content.Context;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class PermissionValidator {
    private final String permission;

    public PermissionValidator(String str) {
        this.permission = str;
    }

    private boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public void validate(Context context) {
        if (hasPermission(context, this.permission)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.permission, " permission is not granted."));
    }
}
