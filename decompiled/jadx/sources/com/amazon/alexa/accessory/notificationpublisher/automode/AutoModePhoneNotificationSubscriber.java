package com.amazon.alexa.accessory.notificationpublisher.automode;

import com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification;
import com.amazon.alexa.externalnotifications.capability.models.NotificationId;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AutoModePhoneNotificationSubscriber {
    void onPhoneNotificationDismissed(List<NotificationId> list);

    void onPhoneNotificationRead(List<NotificationId> list);

    void onPhoneNotificationReceived(AutoModePhoneNotification autoModePhoneNotification);

    void onVipFilterToggleChanged(boolean z);
}
