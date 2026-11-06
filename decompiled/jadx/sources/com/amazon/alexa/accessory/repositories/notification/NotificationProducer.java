package com.amazon.alexa.accessory.repositories.notification;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Notification;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface NotificationProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleAddOutgoingNotification(int i, Notification.NotificationContent notificationContent, Producer.Result<Common.ErrorCode> result);

        void handleRemoveOutgoingNotification(int i, Producer.Result<Common.ErrorCode> result);

        void handleUpdateOutgoingNotification(int i, Notification.NotificationContent notificationContent, Producer.Result<Common.ErrorCode> result);
    }
}
