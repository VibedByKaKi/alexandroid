package com.amazon.alexa.wakeword.speakerverification.mlis;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.wakeword.speakerverification.enrollment.EnrollmentController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UtterancesUploadToMlisRetry {
    private static final long MINUTES_TO_WAIT_IN_MILLIS = 3600000;
    private static final int PENDING_INTENT_REQUEST_CODE = 1;
    private static final String TAG = "UtterancesUploadToMlisRetry";

    @VisibleForTesting
    public PendingIntent getPendingIntent(@NonNull Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) UtterancesUploadToMlisReceiver.class);
        intent.putExtra(EnrollmentController.UPLOAD_UTTERANCES_RETRIES, i - 1);
        return PendingIntent.getBroadcast(context, 1, intent, 201326592);
    }

    public void scheduleRetry(@NonNull Context context, int i) {
        if (i <= 0) {
            Log.d(TAG, "onHandleWork: There are no more upload retries");
            return;
        }
        String str = TAG;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            Log.d(str, "onHandleWork: Alarm could not be set. Alarm manager is NULL");
            return;
        }
        PendingIntent pendingIntent = getPendingIntent(context, i);
        alarmManager.cancel(pendingIntent);
        alarmManager.setAndAllowWhileIdle(0, System.currentTimeMillis() + 3600000, pendingIntent);
        Log.d(str, "onHandleWork: Alarm is set, waiting for next upload attempt.");
    }
}
