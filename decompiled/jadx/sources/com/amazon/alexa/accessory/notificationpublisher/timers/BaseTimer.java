package com.amazon.alexa.accessory.notificationpublisher.timers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.notificationpublisher.AccessoryTtsStateManager;
import com.amazon.alexa.accessory.notificationpublisher.notificationsource.NotificationSource;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class BaseTimer {
    long durationInMillis;
    private String logTag;

    @Nullable
    private NotificationSource notificationSource;
    private volatile boolean running;
    private long startTimeInMillis;
    private Timer timer;
    private TimerExpiredCallback timerExpiredCallback;
    private TimerTask timerTask;
    int timerType;

    public BaseTimer(@NonNull String str) {
        this();
        this.logTag = str;
    }

    private void startTimerTask() {
        Log.i(this.logTag, "startTimerTask starting a timer for duration (Millis) - " + this.durationInMillis);
        this.timer = new Timer();
        BaseTimerTask baseTimerTask = new BaseTimerTask(this);
        this.timerTask = baseTimerTask;
        this.timer.schedule(baseTimerTask, this.durationInMillis);
        this.running = true;
        this.startTimeInMillis = System.currentTimeMillis();
        Log.d(this.logTag, "startTimerTask - Start timestamp - " + this.startTimeInMillis);
        int i = this.timerType;
        if (i == 1 || i == 4) {
            AccessoryTtsStateManager.getInstance().updateAccessoryTtsState(this.durationInMillis);
        }
    }

    public synchronized void cancel() {
        Log.i(this.logTag, "cancel called");
        if (this.timer != null && this.running) {
            Log.i(this.logTag, "cancel - Time is running, cancel it");
            this.timer.cancel();
            this.timerTask.cancel();
            this.running = false;
        }
    }

    @Nullable
    public synchronized NotificationSource getNotificationSource() {
        return this.notificationSource;
    }

    public synchronized boolean isRunning(@Nullable NotificationSource notificationSource) {
        Log.i(this.logTag, "isRunning called for source - " + this.running);
        if (notificationSource == null && this.notificationSource == null) {
            Log.i(this.logTag, "isRunning - No source");
            return this.running;
        }
        boolean z = false;
        if (notificationSource == null || this.notificationSource == null) {
            Log.i(this.logTag, "isRunning returning false");
            return false;
        }
        Log.d(this.logTag, "isRunning source - " + notificationSource.displayString());
        Log.d(this.logTag, "isRunning this.source - " + this.notificationSource.displayString());
        if (this.running && notificationSource.equals(this.notificationSource)) {
            z = true;
        }
        return z;
    }

    public synchronized void restart(@Nullable NotificationSource notificationSource, @NonNull TimerExpiredCallback timerExpiredCallback) throws IllegalStateException, IllegalArgumentException {
        try {
            Log.i(this.logTag, "reset called with Source");
            if (notificationSource != null) {
                Log.d(this.logTag, "reset with source - " + notificationSource.displayString());
            }
            cancel();
            start(notificationSource, timerExpiredCallback);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void start(@Nullable NotificationSource notificationSource, @NonNull TimerExpiredCallback timerExpiredCallback) throws IllegalStateException, IllegalArgumentException {
        try {
            Log.i(this.logTag, "start called");
            if (this.running) {
                Log.e(this.logTag, "Timer is already running, cannot start a running timer");
                throw new IllegalStateException("Cannot start a timer if it is already running");
            }
            if (timerExpiredCallback == null) {
                Log.e(this.logTag, "Timer expired callback cannot be null");
                throw new IllegalArgumentException("TimerExpiredCallback cannot be null");
            }
            if (notificationSource != null) {
                Log.d(this.logTag, "start with source - " + notificationSource.displayString());
            }
            this.notificationSource = notificationSource;
            this.timerExpiredCallback = timerExpiredCallback;
            startTimerTask();
        } catch (Throwable th) {
            throw th;
        }
    }

    public long timeElapsedInMillis() {
        if (this.running) {
            return System.currentTimeMillis() - this.startTimeInMillis;
        }
        return Long.MIN_VALUE;
    }

    public long timeRemainingInMillis() {
        if (this.running) {
            return this.durationInMillis - timeElapsedInMillis();
        }
        return Long.MAX_VALUE;
    }

    public synchronized void timerExpired() {
        try {
            Log.i(this.logTag, "timerExpired - Timer expired");
            TimerExpiredCallback timerExpiredCallback = this.timerExpiredCallback;
            if (timerExpiredCallback != null) {
                timerExpiredCallback.onTimerExpired(this.timerType, this.notificationSource);
            }
            this.timer.cancel();
            this.running = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void updateDefaultTimeDuration() {
        throw new UnsupportedOperationException("Implementation to be provided by inherited class.");
    }

    private BaseTimer() {
    }

    public synchronized void restart() {
        Log.i(this.logTag, "reset called");
        cancel();
        startTimerTask();
    }

    public synchronized boolean isRunning() {
        Log.d(this.logTag, "isRunning called - " + this.running);
        return this.running;
    }
}
