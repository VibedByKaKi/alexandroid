package com.amazon.alexa.handsfree.settings.voxsettings;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class VoxSettingsSetRequestRetryPolicy {
    private static final long BASE_DELAY_MILLIS = 5000;
    private static final int MAX_RETRIES = 60;
    private static final int REQUEST_CODE = 1010;
    private static final String TAG = "VoxRequestRetryPolicy";
    private final Context mContext;

    public VoxSettingsSetRequestRetryPolicy(@NonNull Context context) {
        this.mContext = context;
    }

    public void scheduleRetry(int i) {
        if (i > 60) {
            Log.i(TAG, "Reached max number of retries (60). Stop retrying.");
            return;
        }
        AlarmManager alarmManager = (AlarmManager) this.mContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            Log.w(TAG, "No AlarmManager available, failed to schedule retry attempt");
            return;
        }
        Log.i(TAG, String.format("Scheduling retry number %d for %d milliseconds from now", Integer.valueOf(i), 5000L));
        alarmManager.set(3, SystemClock.elapsedRealtime() + 5000, PendingIntent.getBroadcast(this.mContext, 1010, new Intent(this.mContext, (Class<?>) VoxSettingsSetRetryAttemptReceiver.class).putExtra("retryAttempt", i), 201326592));
    }
}
