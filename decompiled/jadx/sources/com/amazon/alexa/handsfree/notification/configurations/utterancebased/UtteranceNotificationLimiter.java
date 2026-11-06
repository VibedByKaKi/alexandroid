package com.amazon.alexa.handsfree.notification.configurations.utterancebased;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import com.amazon.alexa.handsfree.notification.NotificationType;
import java.util.Date;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UtteranceNotificationLimiter {
    private final Context mContext;
    private final NotificationOccurrenceCounter mNotificationOccurrenceCounter;
    private final NotificationType mNotificationType;
    private final UtteranceConfigHandler mUtteranceConfigHandler;

    public UtteranceNotificationLimiter(@NonNull Context context, @NonNull NotificationType notificationType) {
        this(context, notificationType, NotificationOccurrenceCounter.getInstance(), new UtteranceConfigHandler(context));
    }

    public boolean isMaxDaysPastFirstUtterance() {
        long utteranceNotificationTime = this.mNotificationOccurrenceCounter.getUtteranceNotificationTime(this.mContext, 1, this.mNotificationType);
        return utteranceNotificationTime != 0 && (new Date().getTime() - utteranceNotificationTime) / 86400000 > ((long) this.mUtteranceConfigHandler.getConfigDaysAfterFirstUtterance(this.mNotificationType));
    }

    public boolean isMinHrsFromLastUtterance() {
        NotificationOccurrenceCounter notificationOccurrenceCounter = this.mNotificationOccurrenceCounter;
        Context context = this.mContext;
        long utteranceNotificationTime = notificationOccurrenceCounter.getUtteranceNotificationTime(context, notificationOccurrenceCounter.getNotificationCount(context, this.mNotificationType), this.mNotificationType);
        return utteranceNotificationTime == 0 || (new Date().getTime() - utteranceNotificationTime) / 3600000 >= ((long) this.mUtteranceConfigHandler.getConfigHoursBeforeNextUtterance(this.mNotificationType));
    }

    @Inject
    @VisibleForTesting
    public UtteranceNotificationLimiter(@NonNull Context context, @NonNull NotificationType notificationType, @NonNull NotificationOccurrenceCounter notificationOccurrenceCounter, @NonNull UtteranceConfigHandler utteranceConfigHandler) {
        this.mContext = context;
        this.mNotificationType = notificationType;
        this.mNotificationOccurrenceCounter = notificationOccurrenceCounter;
        this.mUtteranceConfigHandler = utteranceConfigHandler;
    }
}
