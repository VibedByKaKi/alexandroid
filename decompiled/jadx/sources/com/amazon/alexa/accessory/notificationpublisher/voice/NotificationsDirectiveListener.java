package com.amazon.alexa.accessory.notificationpublisher.voice;

import com.amazon.alexa.accessory.notificationpublisher.automode.listeners.NotificationListener;
import com.amazon.alexa.externalnotifications.capability.directive.ExternalNotificationsDirectiveListener;
import com.amazon.alexa.externalnotifications.capability.models.NotificationId;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NotificationsDirectiveListener implements ExternalNotificationsDirectiveListener {
    private static final String TAG = "NotificationsDirectiveListener";
    private Set<NotificationListener> notificationListeners = new HashSet();

    public synchronized void addNotificationListener(NotificationListener notificationListener) {
        this.notificationListeners.add(notificationListener);
    }

    @Override // com.amazon.alexa.externalnotifications.capability.directive.ExternalNotificationsDirectiveListener
    public synchronized void onSetReadDirective(List<NotificationId> list) {
        Objects.toString(list);
        Iterator<NotificationListener> it2 = this.notificationListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onNotificationRead(list);
        }
    }

    public synchronized void removeNotificationListener(NotificationListener notificationListener) {
        this.notificationListeners.remove(notificationListener);
    }
}
