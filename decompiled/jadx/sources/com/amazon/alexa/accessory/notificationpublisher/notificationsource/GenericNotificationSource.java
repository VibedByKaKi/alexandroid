package com.amazon.alexa.accessory.notificationpublisher.notificationsource;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class GenericNotificationSource extends NotificationSource {
    public GenericNotificationSource(@NonNull JSONObject jSONObject) throws IllegalArgumentException {
        super(jSONObject.optString(NotificationConstants.PACKAGE_IDENTIFIER_KEY));
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.notificationsource.NotificationSource
    @NonNull
    public String displayString() {
        return a$$ExternalSyntheticOutline0.m("Package: ", this.packageId);
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.notificationsource.NotificationSource
    public boolean equals(Object obj) {
        if (!(obj instanceof GenericNotificationSource)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return ((GenericNotificationSource) obj).packageId.equals(this.packageId);
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.notificationsource.NotificationSource
    public int hashCode() {
        return Objects.hash(this.packageId);
    }

    public GenericNotificationSource(@NonNull String str) throws IllegalArgumentException {
        super(str);
    }
}
