package com.amazon.alexa.accessory.notificationpublisher.notificationsource;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.google.common.base.Strings;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class NotificationSource {
    protected String packageId;

    public NotificationSource(@NonNull JSONObject jSONObject) throws IllegalArgumentException {
        if (jSONObject == null || Strings.isNullOrEmpty(jSONObject.optString(NotificationConstants.PACKAGE_IDENTIFIER_KEY, ""))) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot create a source without valid notification object");
            throw null;
        }
        this.packageId = jSONObject.optString(NotificationConstants.PACKAGE_IDENTIFIER_KEY);
    }

    public abstract String displayString();

    public abstract boolean equals(Object obj);

    public String getPackageId() {
        return this.packageId;
    }

    public String getSourceId() {
        return getPackageId();
    }

    public abstract int hashCode();

    public NotificationSource(@NonNull String str) throws IllegalArgumentException {
        if (!Strings.isNullOrEmpty(str)) {
            this.packageId = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot create a source without valid package identifier");
            throw null;
        }
    }
}
