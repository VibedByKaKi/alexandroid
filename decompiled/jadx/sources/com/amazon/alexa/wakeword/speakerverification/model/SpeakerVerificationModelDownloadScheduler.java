package com.amazon.alexa.wakeword.speakerverification.model;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeakerVerificationModelDownloadScheduler {
    private static final int DELAY_MILLIS = 86400000;
    private static final int PENDING_INTENT_REQUEST_CODE = 0;

    @VisibleForTesting
    public PendingIntent getPendingIntent(@NonNull Context context, @NonNull Intent intent) {
        return PendingIntent.getBroadcast(context, 0, intent, 67108864);
    }

    public void scheduleModelDownload(@NonNull Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager != null) {
            PendingIntent pendingIntent = getPendingIntent(context, new Intent(context, (Class<?>) SpeakerVerificationModelDownloadReceiver.class));
            alarmManager.cancel(pendingIntent);
            alarmManager.set(3, SystemClock.elapsedRealtime() + 86400000, pendingIntent);
        }
    }
}
