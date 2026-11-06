package com.amazon.alexa.wakeword.speakerverification.profile.retry;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProfileGenerationRetryScheduler {
    private static final int[] DELAY_MILLIS;
    static final String EXTRA_QUOTA_ID = "ExtraQuotaId";
    static final int INITIAL_QUOTA_ID = 0;
    private static final int PENDING_INTENT_REQUEST_CODE = 1;
    static final int QUOTA_COUNT;
    private static final String TAG = "ProfileGenerationRetryScheduler";

    static {
        int[] iArr = {300000, 1800000, 3600000, 86400000};
        DELAY_MILLIS = iArr;
        QUOTA_COUNT = iArr.length;
    }

    @VisibleForTesting
    public PendingIntent getPendingIntent(@NonNull Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) ProfileGenerationRetryReceiver.class);
        intent.putExtra(EXTRA_QUOTA_ID, i);
        return PendingIntent.getBroadcast(context, 1, intent, 67108864);
    }

    public void scheduleRetry(@NonNull Context context, int i) {
        if (i < 0 || i >= QUOTA_COUNT) {
            Log.i(TAG, String.format("scheduleRetry: not scheduling alarm for quota id: %d", Integer.valueOf(i)));
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            return;
        }
        PendingIntent pendingIntent = getPendingIntent(context, i);
        alarmManager.cancel(pendingIntent);
        alarmManager.set(3, SystemClock.elapsedRealtime() + DELAY_MILLIS[i], pendingIntent);
    }
}
