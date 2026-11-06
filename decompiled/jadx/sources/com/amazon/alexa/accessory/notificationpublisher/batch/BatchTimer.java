package com.amazon.alexa.accessory.notificationpublisher.batch;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BatchTimer {

    @VisibleForTesting
    static final long DEFAULT_BATCH_WINDOW_MS = 10000;

    @VisibleForTesting
    static final long MAX_BATCH_DURATION_MS = 30000;
    private static final String TAG = "BatchTimer";
    private long batchStartTime;
    private final long batchWindowMs;
    private long currentExpiryTime;
    private final Handler handler;
    private final BatchTimerListener listener;
    private final long maxDurationMs;
    private final Runnable timerRunnable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface BatchTimerListener {
        void onBatchTimerExpired();
    }

    public BatchTimer(@NonNull Handler handler, long j, long j2, @NonNull BatchTimerListener batchTimerListener) {
        this.timerRunnable = new Runnable() { // from class: com.amazon.alexa.accessory.notificationpublisher.batch.BatchTimer.1
            @Override // java.lang.Runnable
            public void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Log.i(BatchTimer.TAG, "Timer expired at: %d, batchStartTime: %d, total duration: %d ms", Long.valueOf(elapsedRealtime), Long.valueOf(BatchTimer.this.batchStartTime), Long.valueOf(elapsedRealtime - BatchTimer.this.batchStartTime));
                BatchTimer.this.batchStartTime = -1L;
                BatchTimer.this.currentExpiryTime = -1L;
                BatchTimer.this.listener.onBatchTimerExpired();
            }
        };
        this.handler = handler;
        this.batchWindowMs = j;
        this.maxDurationMs = j2;
        this.listener = batchTimerListener;
        this.batchStartTime = -1L;
        this.currentExpiryTime = -1L;
    }

    public void cancel() {
        Log.i(TAG, "Timer cancelled");
        this.handler.removeCallbacks(this.timerRunnable);
        this.batchStartTime = -1L;
        this.currentExpiryTime = -1L;
    }

    public void extend() {
        if (!isActive()) {
            Log.w(TAG, "extend() called but timer is not active, no-op");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(this.currentExpiryTime + this.batchWindowMs, this.batchStartTime + this.maxDurationMs);
        this.currentExpiryTime = min;
        this.handler.removeCallbacks(this.timerRunnable);
        if (min <= elapsedRealtime) {
            Log.i(TAG, "Timer extended past max cap, firing asynchronously");
            this.handler.post(this.timerRunnable);
            return;
        }
        String str = TAG;
        Long valueOf = Long.valueOf(min);
        long j = min - elapsedRealtime;
        Log.i(str, "Timer extended - expiresAt: %d, delay: %d ms", valueOf, Long.valueOf(j));
        this.handler.postDelayed(this.timerRunnable, j);
    }

    public boolean isActive() {
        return this.batchStartTime >= 0;
    }

    public void start() {
        if (isActive()) {
            Log.d(TAG, "start() called but timer is already active, no-op");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.batchStartTime = elapsedRealtime;
        long j = this.batchWindowMs;
        this.currentExpiryTime = elapsedRealtime + j;
        Log.i(TAG, "Timer started with duration: %d ms, batchStartTime: %d", Long.valueOf(j), Long.valueOf(this.batchStartTime));
        this.handler.postDelayed(this.timerRunnable, this.batchWindowMs);
    }

    public BatchTimer(@NonNull Handler handler, @NonNull BatchTimerListener batchTimerListener) {
        this(handler, 10000L, 30000L, batchTimerListener);
    }
}
