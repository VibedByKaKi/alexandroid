package com.amazon.alexa.app.notification.tap;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.amazon.alexa.app.notification.dismiss.UniversalDismissEventSender;
import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent;
import dagger.Lazy;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class NotificationTapAcknowledger {
    public static final String NOTIFICATION_TAP_EVENT_WORK_NAME = "notificationTapEvent";
    private static final int WORKER_START_DELAY_MS = 2500;
    Lazy<FeatureServiceV2> featureServiceV2;
    Lazy<Mobilytics> mobilytics;
    private final UniversalDismissEventSender universalDismissEventSender;
    Lazy<WorkManager> workManager;

    public NotificationTapAcknowledger(Lazy<Mobilytics> lazy, Lazy<FeatureServiceV2> lazy2, Lazy<WorkManager> lazy3, UniversalDismissEventSender universalDismissEventSender) {
        this.mobilytics = lazy;
        this.featureServiceV2 = lazy2;
        this.workManager = lazy3;
        this.universalDismissEventSender = universalDismissEventSender;
    }

    private boolean isNotificationUniversalDismissCandidate(Bundle bundle) {
        return bundle.containsKey("notificationId");
    }

    private void notifyAlexaNotificationRead(Context context, Bundle bundle) {
        if (isNotificationUniversalDismissCandidate(bundle)) {
            this.workManager.get().enqueueUniqueWork(NOTIFICATION_TAP_EVENT_WORK_NAME, ExistingWorkPolicy.APPEND_OR_REPLACE, new OneTimeWorkRequest.Builder(NotificationTapEventWorker.class).setInitialDelay(2500L, TimeUnit.MILLISECONDS).setInputData(new Data.Builder().putString("notificationId", bundle.getString("notificationId")).build()).build());
        }
    }

    private void notifyClickedOnNotificationV2(@NonNull Bundle bundle) {
        MobilyticsUserInteractionEvent createUserInteractionEvent = this.mobilytics.get().createUserInteractionEvent("NOTIFICATION_CLICK_V2", "click", "PushNotifications", "NotificationsLandingPage", "1235005e-4e8f-4ef2-82bc-34157415015b");
        createUserInteractionEvent.setChannelName("coreapp");
        createUserInteractionEvent.setInputType(Constants.NotificationInteraction.Default.name());
        PayloadUtils.setNotificationMetricDimensionsV2(createUserInteractionEvent, bundle);
        this.mobilytics.get().recordUserInteractionEvent(createUserInteractionEvent);
    }

    private void recordMetricOccurrence(String str, boolean z) {
        this.mobilytics.get().recordOccurrence(str, z, "PushNotifications", "PushNotifications", "1235005e-4e8f-4ef2-82bc-34157415015b");
    }

    private void sendUniversalDismissInvokeOperation(@NonNull Bundle bundle) {
        this.universalDismissEventSender.sendDismissEvent(bundle.getString("publisherContentId"));
    }

    public void acknowledgeNotificationTap(Context context, @NonNull Bundle bundle) {
        recordMetricOccurrence(Constants.MetricEvents.NOTIFICATION_CLICK_COUNT, true);
        notifyClickedOnNotificationV2(bundle);
        notifyAlexaNotificationRead(context, bundle);
        sendUniversalDismissInvokeOperation(bundle);
    }
}
