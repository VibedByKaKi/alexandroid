package com.amazon.alexa.accessory.notificationpublisher.voice.ampd;

import com.amazon.alexa.externalnotifications.capability.ExternalNotificationsProvider;
import com.amazon.alexa.externalnotifications.capability.models.Notification;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NoOpNotificationProvider implements ExternalNotificationsProvider {
    @Override // com.amazon.alexa.externalnotifications.capability.ExternalNotificationsProvider
    public List<Notification> getActiveNotifications() {
        return Collections.EMPTY_LIST;
    }
}
