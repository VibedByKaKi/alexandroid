package com.amazon.alexa.alertsca.notification;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.alertsca.AlertRecord;
import com.amazon.alexa.alertsca.notification.AlexaAlertsNotificationBuilderFactory;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class CountdownClock implements Runnable {
    private static final String LONG_NEGATIVE_TIMER_DISPLAY_FORMAT = "-%d:%02d:%02d";
    private static final String LONG_TIMER_DISPLAY_FORMAT = "%d:%02d:%02d";
    private static final String SHORT_NEGATIVE_TIMER_DISPLAY_FORMAT = "-%02d:%02d";
    private static final String SHORT_TIMER_DISPLAY_FORMAT = "%02d:%02d";
    private static final long UPDATE_FREQUENCY_MS = 20;
    private final AlertRecord alertRecord;
    private RemainingTime currentDisplayedTime;
    private final long initialCurrentTimeMillis;
    private final long initialElapsedTimeMillis;
    private final ScheduledFuture<?> timeUpdater;
    private final AlexaAlertsNotificationBuilderFactory.NotificationUpdateHandler updateHandler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RemainingTime {
        private final long hoursRemaining;
        private final long minutesRemaining;
        private final long secondsRemaining;

        public RemainingTime(long j, long j2, long j3) {
            this.hoursRemaining = j;
            this.minutesRemaining = j2;
            this.secondsRemaining = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                RemainingTime remainingTime = (RemainingTime) obj;
                if (this.hoursRemaining == remainingTime.hoursRemaining && this.minutesRemaining == remainingTime.minutesRemaining && this.secondsRemaining == remainingTime.secondsRemaining) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.hoursRemaining), Long.valueOf(this.minutesRemaining), Long.valueOf(this.secondsRemaining));
        }

        public String toString() {
            long j = this.secondsRemaining;
            long j2 = this.hoursRemaining;
            return j > 0 ? j2 > 0 ? String.format(Locale.US, CountdownClock.LONG_TIMER_DISPLAY_FORMAT, Long.valueOf(j2), Long.valueOf(this.minutesRemaining), Long.valueOf(this.secondsRemaining)) : String.format(Locale.US, CountdownClock.SHORT_TIMER_DISPLAY_FORMAT, Long.valueOf(this.minutesRemaining), Long.valueOf(this.secondsRemaining)) : j2 < 0 ? String.format(Locale.US, CountdownClock.LONG_NEGATIVE_TIMER_DISPLAY_FORMAT, Long.valueOf(Math.abs(j2)), Long.valueOf(Math.abs(this.minutesRemaining)), Long.valueOf(Math.abs(this.secondsRemaining))) : String.format(Locale.US, CountdownClock.SHORT_NEGATIVE_TIMER_DISPLAY_FORMAT, Long.valueOf(Math.abs(this.minutesRemaining)), Long.valueOf(Math.abs(this.secondsRemaining)));
        }
    }

    public CountdownClock(AlertRecord alertRecord, ScheduledExecutorService scheduledExecutorService, AlexaAlertsNotificationBuilderFactory.NotificationUpdateHandler notificationUpdateHandler) {
        this.alertRecord = alertRecord;
        this.updateHandler = notificationUpdateHandler;
        long currentTimeMillis = System.currentTimeMillis();
        this.initialCurrentTimeMillis = currentTimeMillis;
        this.initialElapsedTimeMillis = SystemClock.elapsedRealtime();
        this.currentDisplayedTime = getRemainingTime(alertRecord, currentTimeMillis, 0L);
        this.timeUpdater = scheduledExecutorService.scheduleAtFixedRate(this, 0L, 20L, TimeUnit.MILLISECONDS);
    }

    @VisibleForTesting
    public static RemainingTime getRemainingTime(AlertRecord alertRecord, long j, long j2) {
        long time = alertRecord.getScheduledTime().getTime() - (j + j2);
        long j3 = time / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (time - timeUnit.toMillis(j3)) / 60000;
        return new RemainingTime(j3, millis, ((time - timeUnit.toMillis(j3)) - TimeUnit.MINUTES.toMillis(millis)) / 1000);
    }

    @Override // java.lang.Runnable
    public void run() {
        RemainingTime remainingTime = getRemainingTime(this.alertRecord, this.initialCurrentTimeMillis, SystemClock.elapsedRealtime() - this.initialElapsedTimeMillis);
        if (this.currentDisplayedTime.equals(remainingTime)) {
            return;
        }
        this.currentDisplayedTime = remainingTime;
        this.updateHandler.onUpdate(this.alertRecord, remainingTime.toString());
    }

    public void stop() {
        this.timeUpdater.cancel(true);
    }
}
