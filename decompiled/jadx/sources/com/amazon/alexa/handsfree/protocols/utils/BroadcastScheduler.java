package com.amazon.alexa.handsfree.protocols.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class BroadcastScheduler {

    @VisibleForTesting
    static final long LAST_SCHEDULE_CHECK_UNDEFINED = 0;
    private final Context mContext;

    public BroadcastScheduler(@NonNull Context context) {
        this.mContext = context;
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public abstract int getDelayMillis();

    @NonNull
    public abstract Intent getIntentToBroadcast();

    @VisibleForTesting
    public long getLastScheduleCheck() {
        return getSharedPreferences().getLong(getLastScheduleCheckTag(), 0L);
    }

    @NonNull
    public abstract String getLastScheduleCheckTag();

    @NonNull
    public abstract PendingIntent getPendingIntentToBroadcast();

    @NonNull
    @VisibleForTesting
    public SharedPreferences getSharedPreferences() {
        return this.mContext.getSharedPreferences(getSharedPreferencesFile(), 0);
    }

    @NonNull
    public abstract String getSharedPreferencesFile();

    @NonNull
    public abstract String getTag();

    @VisibleForTesting
    public boolean isSchedulingRequired() {
        long lastScheduleCheck = getLastScheduleCheck();
        if (lastScheduleCheck != 0) {
            return SystemClock.elapsedRealtime() - lastScheduleCheck > ((long) getDelayMillis());
        }
        this.mContext.sendBroadcast(getIntentToBroadcast());
        return true;
    }

    public void scheduleNextCheck() {
        if (isSchedulingRequired()) {
            setLastScheduleCheck(SystemClock.elapsedRealtime());
            Log.d(getTag(), "scheduleNextCheck!");
            AlarmManager alarmManager = (AlarmManager) this.mContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent pendingIntentToBroadcast = getPendingIntentToBroadcast();
            Log.v(getTag(), "Cancelling the current alarm(s), if set");
            alarmManager.cancel(pendingIntentToBroadcast);
            alarmManager.set(3, SystemClock.elapsedRealtime() + getDelayMillis(), pendingIntentToBroadcast);
            Log.v(getTag(), "scheduleNextCheck: Scheduled next check.");
        }
    }

    @VisibleForTesting
    public void setLastScheduleCheck(long j) {
        getSharedPreferences().edit().putLong(getLastScheduleCheckTag(), j).apply();
    }
}
