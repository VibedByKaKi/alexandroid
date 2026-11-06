package com.amazon.alexa.handsfree.notification.configurations.scheduler;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.Calendar;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class NotificationTimeResolver {
    private static final int HOUR_OF_MORNING = 8;
    private static final int HOUR_OF_NOON = 12;

    @VisibleForTesting
    static final long MIN_DELAY_MILLIS_BEFORE_RESCHEDULING = 86400000;
    private static final int MIN_OF_NOON = 0;
    private static final int SEC_OF_NOON = 0;
    private static final String TAG = "NotificationTimeResolver";
    private final NotificationQuotaManager.QuotaConstraintsHandler mConfigIntervalHandler;
    private final Context mContext;
    private final ScheduleTransformation mDefaultTransformation;
    private final NotificationOccurrenceCounter mNotificationOccurrenceCounter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ScheduleTransformation {
        void transformScheduledTime(@NonNull Calendar calendar);
    }

    public NotificationTimeResolver(@NonNull Context context, @NonNull NotificationQuotaManager.QuotaConstraintsHandler quotaConstraintsHandler) {
        this(context, quotaConstraintsHandler, NotificationOccurrenceCounter.getInstance(), new NotificationTimeResolver$$ExternalSyntheticLambda0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Calendar calendar) {
        calendar.set(11, 12);
        calendar.set(12, 0);
        calendar.set(13, 0);
    }

    @Nullable
    @VisibleForTesting
    public Calendar getCalendarForOneTimeNotification(@NonNull NotificationType notificationType) {
        if (!isValidOccurrenceCount(this.mNotificationOccurrenceCounter.getNotificationCount(this.mContext, notificationType), notificationType)) {
            Log.v(TAG, "No valid notification occurrence found.");
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        if (calendar2.after(calendar)) {
            calendar.add(5, 1);
        }
        return calendar;
    }

    @Nullable
    @VisibleForTesting
    public Long getElapsedTimeUntilNextNotification(@NonNull NotificationType notificationType, @NonNull ScheduleTransformation scheduleTransformation, long j, @NonNull Calendar calendar, boolean z) {
        long j2;
        long transformedTimeInMillis;
        int notificationCount = this.mNotificationOccurrenceCounter.getNotificationCount(this.mContext, notificationType);
        List<Long> configTimeIntervals = this.mConfigIntervalHandler.getConfigTimeIntervals(notificationType);
        if (!isValidOccurrenceCount(notificationCount, notificationType)) {
            Log.v(TAG, "No valid notification occurrence found.");
            return null;
        }
        if (notificationCount == 0) {
            transformedTimeInMillis = configTimeIntervals.get(notificationCount).longValue();
            j2 = j;
        } else {
            j2 = j;
            transformedTimeInMillis = getTransformedTimeInMillis(configTimeIntervals.get(notificationCount), scheduleTransformation, j2, calendar);
        }
        if (z && transformedTimeInMillis < 86400000) {
            transformedTimeInMillis = 86400000;
        }
        return Long.valueOf(j2 + transformedTimeInMillis);
    }

    @VisibleForTesting
    public long getTransformedTimeInMillis(@NonNull Long l, @NonNull ScheduleTransformation scheduleTransformation, long j, @NonNull Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeInMillis(l.longValue() + calendar2.getTimeInMillis());
        String str = TAG;
        Log.d(str, "Raw next notification schedule calendar time: " + calendar2.getTimeInMillis() + " Raw next notification schedule elapsed real time: " + j + l);
        scheduleTransformation.transformScheduledTime(calendar2);
        Log.d(str, "Adjusted next notification schedule calendar time: " + calendar2.getTimeInMillis() + " Adjusted next notification schedule elapsed real time: " + ((calendar2.getTimeInMillis() + j) - calendar.getTimeInMillis()));
        return calendar2.getTimeInMillis() - calendar.getTimeInMillis();
    }

    @VisibleForTesting
    public boolean isValidOccurrenceCount(int i, @NonNull NotificationType notificationType) {
        return i < this.mConfigIntervalHandler.getTotalNotifications(notificationType);
    }

    @Inject
    @VisibleForTesting
    public NotificationTimeResolver(@NonNull Context context, @NonNull NotificationQuotaManager.QuotaConstraintsHandler quotaConstraintsHandler, @NonNull NotificationOccurrenceCounter notificationOccurrenceCounter, @NonNull ScheduleTransformation scheduleTransformation) {
        this.mContext = context;
        this.mConfigIntervalHandler = quotaConstraintsHandler;
        this.mNotificationOccurrenceCounter = notificationOccurrenceCounter;
        this.mDefaultTransformation = scheduleTransformation;
    }

    @Nullable
    public Long getElapsedTimeUntilNextNotification(@NonNull NotificationType notificationType, boolean z) {
        return getElapsedTimeUntilNextNotification(notificationType, this.mDefaultTransformation, SystemClock.elapsedRealtime(), Calendar.getInstance(), z);
    }
}
