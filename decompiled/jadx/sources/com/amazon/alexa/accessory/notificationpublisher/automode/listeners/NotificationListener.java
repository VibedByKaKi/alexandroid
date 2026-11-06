package com.amazon.alexa.accessory.notificationpublisher.automode.listeners;

import com.amazon.alexa.accessory.notificationpublisher.exceptions.RxBlockingCallException;
import com.amazon.alexa.externalnotifications.capability.models.Notification;
import com.amazon.alexa.externalnotifications.capability.models.NotificationId;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface NotificationListener {
    void onFeatureToggleChanged(boolean z);

    void onNotificationDismissed(List<NotificationId> list);

    void onNotificationRead(List<NotificationId> list);

    void onNotificationReceived(Notification notification) throws RxBlockingCallException, JSONException, UnsupportedEncodingException;
}
