package com.amazon.alexa.app.notification.messaging;

import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class MessagingSettingsMetricsHandler {
    private Lazy<Mobilytics> mobilytics;

    public MessagingSettingsMetricsHandler(Lazy<Mobilytics> lazy) {
        this.mobilytics = lazy;
    }

    public void recordAndroidOSNotificationEnabledMetrics(boolean z) {
        MobilyticsUserInteractionEvent createUserInteractionEvent = this.mobilytics.get().createUserInteractionEvent(z ? Constants.MetricEvents.NOTIFICATIONS_OS_SETTING_ENABLED : Constants.MetricEvents.NOTIFICATIONS_OS_SETTING_DISABLED, "click", "PushNotifications", "PushNotifications", "1235005e-4e8f-4ef2-82bc-34157415015b");
        createUserInteractionEvent.setChannelName("coreapp");
        this.mobilytics.get().recordUserInteractionEvent(createUserInteractionEvent);
        this.mobilytics.get().recordOccurrence(Constants.MetricEvents.NOTIFICATIONS_PERMISSION_ENABLED, z, "PushNotifications", "PushNotifications", "1235005e-4e8f-4ef2-82bc-34157415015b");
    }
}
