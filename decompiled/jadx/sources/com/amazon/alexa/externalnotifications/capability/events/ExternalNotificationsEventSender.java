package com.amazon.alexa.externalnotifications.capability.events;

import com.amazon.alexa.externalnotifications.capability.models.Notification;
import com.amazon.alexa.externalnotifications.capability.models.NotificationId;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ExternalNotificationsEventSender {
    void initialize();

    void sendNotificationsDismissedEvent(NotificationId notificationId);

    void sendNotificationsDismissedEvent(List<NotificationId> list);

    void sendNotificationsReadEvent(NotificationId notificationId);

    void sendNotificationsReadEvent(List<NotificationId> list);

    void sendNotificationsReceivedEvent(Notification notification);

    void sendNotificationsReceivedEvent(List<Notification> list);

    void sendPlayPendingNotificationsEvent();

    void teardown();
}
