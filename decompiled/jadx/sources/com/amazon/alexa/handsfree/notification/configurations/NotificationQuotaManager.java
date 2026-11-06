package com.amazon.alexa.handsfree.notification.configurations;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import com.amazon.alexa.handsfree.notification.NotificationType;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NotificationQuotaManager {
    private final Context mContext;
    private final NotificationOccurrenceCounter mNotificationOccurrenceCounter;
    private final QuotaConstraintsHandler mQuotaConstraintsHandler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface QuotaConstraintsHandler {
        List<Long> getConfigTimeIntervals(@NonNull NotificationType notificationType);

        int getTotalNotifications(@NonNull NotificationType notificationType);
    }

    @Inject
    @VisibleForTesting
    public NotificationQuotaManager(@NonNull Context context, @NonNull NotificationOccurrenceCounter notificationOccurrenceCounter, @NonNull QuotaConstraintsHandler quotaConstraintsHandler) {
        this.mContext = context;
        this.mNotificationOccurrenceCounter = notificationOccurrenceCounter;
        this.mQuotaConstraintsHandler = quotaConstraintsHandler;
    }

    public boolean hasQuotaAvailable(@NonNull NotificationType notificationType) {
        return this.mNotificationOccurrenceCounter.getNotificationCount(this.mContext, notificationType) < this.mQuotaConstraintsHandler.getTotalNotifications(notificationType);
    }

    public NotificationQuotaManager(@NonNull Context context, @NonNull QuotaConstraintsHandler quotaConstraintsHandler) {
        this(context, NotificationOccurrenceCounter.getInstance(), quotaConstraintsHandler);
    }
}
