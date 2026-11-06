package com.amazon.alexa.voice.handsfree.mike.vesper.notifications.configurations;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.NotificationOccurrenceCounter;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class NotificationTimeResolver {
    private static final int HOUR_OF_NOON = 12;
    private static final int MIN_OF_NOON = 0;
    private static final int SEC_OF_NOON = 0;
    private static final String TAG = "NotificationTimeResolver";
    private final Context mContext;
    private final ScheduleTransformation mDefaultTransformation;
    private final NotificationOccurrenceCounter mNotificationOccurrenceCounter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ScheduleTransformation {
        void transformScheduledTime(@NonNull Calendar calendar);
    }

    public NotificationTimeResolver(@NonNull Context context) {
        this(context, NotificationOccurrenceCounter.getInstance(), new ScheduleTransformation() { // from class: com.amazon.alexa.voice.handsfree.mike.vesper.notifications.configurations.NotificationTimeResolver.1
            @Override // com.amazon.alexa.voice.handsfree.mike.vesper.notifications.configurations.NotificationTimeResolver.ScheduleTransformation
            public void transformScheduledTime(@NonNull Calendar calendar) {
                calendar.set(11, 12);
                calendar.set(12, 0);
                calendar.set(13, 0);
            }
        });
    }

    @NonNull
    public List<Long> getConfigTimeIntervals(@NonNull Context context) {
        int[] intArray = context.getResources().getIntArray(R.array.notification_time_intervals_vesper);
        ArrayList arrayList = new ArrayList(intArray.length);
        for (int i : intArray) {
            arrayList.add(Long.valueOf(Integer.valueOf(i).longValue()));
        }
        Log.d(TAG, "Default configured notification intervals: " + arrayList);
        return arrayList;
    }

    @Nullable
    @VisibleForTesting
    public Long getElapsedTimeUntilNextNotification(@NonNull ScheduleTransformation scheduleTransformation, long j, @NonNull Calendar calendar) {
        int notificationCount = this.mNotificationOccurrenceCounter.getNotificationCount(this.mContext);
        List<Long> configTimeIntervals = getConfigTimeIntervals(this.mContext);
        if (hasQuotaAvailable()) {
            return notificationCount == 0 ? Long.valueOf(configTimeIntervals.get(notificationCount).longValue() + j) : Long.valueOf(j + getTransformedTimeInMillis(configTimeIntervals.get(notificationCount), scheduleTransformation, j, calendar));
        }
        Log.v(TAG, "No valid notification occurrence found.");
        return null;
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

    public boolean hasQuotaAvailable() {
        return this.mNotificationOccurrenceCounter.getNotificationCount(this.mContext) < getConfigTimeIntervals(this.mContext).size();
    }

    @VisibleForTesting
    public NotificationTimeResolver(@NonNull Context context, @NonNull NotificationOccurrenceCounter notificationOccurrenceCounter, @NonNull ScheduleTransformation scheduleTransformation) {
        this.mContext = context;
        this.mNotificationOccurrenceCounter = notificationOccurrenceCounter;
        this.mDefaultTransformation = scheduleTransformation;
    }

    @Nullable
    public Long getElapsedTimeUntilNextNotification() {
        return getElapsedTimeUntilNextNotification(this.mDefaultTransformation, SystemClock.elapsedRealtime(), Calendar.getInstance());
    }
}
