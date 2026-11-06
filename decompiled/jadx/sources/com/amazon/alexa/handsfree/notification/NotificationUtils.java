package com.amazon.alexa.handsfree.notification;

import android.app.Notification;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.handsfree.notification.metrics.NotificationEventMetadata;
import com.amazon.alexa.handsfree.notification.notifiers.Notifier;
import com.amazon.alexa.handsfree.notification.views.base.NotificationView;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import java.util.Objects;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NotificationUtils {
    private static final String EMPTY_STRING = "";
    private final Context mContext;
    private final MetricsBuilderProvider mMetricsBuilderProvider;
    private final NotificationOccurrenceCounter mNotificationOccurrenceCounter;
    private final NotificationType mNotificationType;

    public NotificationUtils(@NonNull Context context, @NonNull NotificationType notificationType) {
        this(context, notificationType, MetricsBuilderProvider.getInstance(context), NotificationOccurrenceCounter.getInstance());
    }

    public int getNotificationOccurrenceCount() {
        return this.mNotificationOccurrenceCounter.getNotificationCount(this.mContext, this.mNotificationType);
    }

    public void reportNotificationMetric(@NonNull NotificationView notificationView, @NonNull NotificationEventMetadata.Component component, @NonNull NotificationEventMetadata.NotificationType notificationType, @NonNull Notifier notifier) {
        Notification notification = notificationView.getNotification(this.mContext);
        String string = notification.extras.getString(NotificationCompat.EXTRA_TEXT);
        this.mMetricsBuilderProvider.newBuilder().withNotificationEventMetric(notifier.getClass().getSimpleName(), component, notificationType, Objects.toString(notification.extras.getString(NotificationCompat.EXTRA_TITLE), ""), Objects.toString(string, "")).emit(this.mContext);
    }

    public void updateNotificationCount() {
        this.mNotificationOccurrenceCounter.incrementNotificationCount(this.mContext, this.mNotificationType);
        this.mNotificationOccurrenceCounter.saveUtteranceNotificationTime(this.mContext, this.mNotificationType);
    }

    @Inject
    public NotificationUtils(@NonNull Context context, @NonNull NotificationType notificationType, @NonNull MetricsBuilderProvider metricsBuilderProvider, @NonNull NotificationOccurrenceCounter notificationOccurrenceCounter) {
        this.mContext = context;
        this.mNotificationType = notificationType;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
        this.mNotificationOccurrenceCounter = notificationOccurrenceCounter;
    }
}
