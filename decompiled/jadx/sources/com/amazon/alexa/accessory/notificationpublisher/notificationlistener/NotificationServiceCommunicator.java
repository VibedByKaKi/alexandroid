package com.amazon.alexa.accessory.notificationpublisher.notificationlistener;

import android.content.ServiceConnection;
import android.service.notification.StatusBarNotification;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface NotificationServiceCommunicator {
    ServiceConnection getServiceConnection();

    boolean safeCallCancelNotification(String str);

    boolean safeCallDoesNotificationExistInStatusBar(String str);

    boolean safeCallDoesNotificationSupportReply(String str);

    List<StatusBarNotification> safeCallGetActiveNotificationsWithKeys(String[] strArr);

    int safeCallGetInterruptionFilter();

    boolean safeCallIsListenerConnected();

    boolean safeCallIsReplyNotification(String str, String str2, String str3);

    boolean safeCallOnDeviceConnectionChanged(boolean z);

    boolean safeCallSendReply(String str, String str2);

    boolean safeCallSetApplicationRunning(boolean z);
}
