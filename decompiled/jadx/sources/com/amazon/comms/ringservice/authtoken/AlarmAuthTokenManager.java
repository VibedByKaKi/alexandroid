package com.amazon.comms.ringservice.authtoken;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.comms.log.CommsLogger;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AlarmAuthTokenManager implements AuthTokenManager {
    public static final String ACTION_AUTH_TOKEN_ALARM = "com.amazon.comms.ringservice.ACTION_AUTH_TOKEN_ALARM";
    private static final long DEFAULT_ALARM_TIME = 60;
    private static final long REFRESH_BEFORE_IN_SECS = 300;
    private static final int REFRESH_RANDOM_INTERVAL_IN_SECS = 10;
    private static final int VALIDITY_BUFFER_IN_SECS = 10;
    private static final CommsLogger sLog = CommsLogger.getLogger(AlarmAuthTokenManager.class);
    private final AlarmManager alarmManager;
    private final Context context;
    private long expireTime;
    private PendingIntent pendingIntent;

    public AlarmAuthTokenManager(@NonNull Context context) {
        this.context = context;
        this.alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private long generateAlarmTime(long j) {
        long random = (j - 300) - ((long) (Math.random() * 10.0d));
        if (random > 0) {
            return random;
        }
        return 60L;
    }

    @Override // com.amazon.comms.ringservice.authtoken.AuthTokenManager
    public void cancelAuthTokenAlarm() {
        if (this.pendingIntent != null) {
            getLogger().i("Cancelling alarm with actioncom.amazon.comms.ringservice.ACTION_AUTH_TOKEN_ALARM");
            this.alarmManager.cancel(this.pendingIntent);
            this.pendingIntent.cancel();
            this.pendingIntent = null;
        }
    }

    @VisibleForTesting
    public long getExpireTime() {
        return this.expireTime;
    }

    @NonNull
    public CommsLogger getLogger() {
        return sLog;
    }

    @Override // com.amazon.comms.ringservice.authtoken.AuthTokenManager
    public boolean isAuthTokenValid() {
        return this.expireTime - (SystemClock.elapsedRealtime() / 1000) > 10;
    }

    @Override // com.amazon.comms.ringservice.authtoken.AuthTokenManager
    public void setAuthTokenAlarm(int i, long j) {
        sLog.d(ParcelCompat$$ExternalSyntheticOutline0.m(j, "setAuthTokenAlarm: expiryInterval= ", i, " authTokenExpireTime= "));
        this.expireTime = j;
        this.pendingIntent = PendingIntent.getBroadcast(this.context, 0, new Intent(ACTION_AUTH_TOKEN_ALARM), 201326592);
        long generateAlarmTime = generateAlarmTime(i);
        this.alarmManager.setExact(2, (1000 * generateAlarmTime) + SystemClock.elapsedRealtime(), this.pendingIntent);
        getLogger().i(String.format(Locale.getDefault(), "Scheduled auth token alarm in %d seconds", Long.valueOf(generateAlarmTime)));
    }
}
