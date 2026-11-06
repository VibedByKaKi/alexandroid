package com.amazon.alexa.mosaic.components.timer;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.amazon.alexa.ttcf.TTCFService$$ExternalSyntheticLambda0;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class EventTimer {
    private static final EventTimer INSTANCE = new EventTimer();
    private static final long TIMEOUT_MS = 5000;
    private Map<String, String> data;
    private ScheduledFuture<?> scheduledFuture;
    private long startTime = -1;
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    private EventTimer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void clearEvent() {
        this.data = null;
        this.startTime = -1L;
        ScheduledFuture<?> scheduledFuture = this.scheduledFuture;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.scheduledFuture.cancel(true);
        }
    }

    public static EventTimer getInstance() {
        return INSTANCE;
    }

    public synchronized void startTimer(@NonNull Map<String, String> map) {
        clearEvent();
        this.data = new HashMap(map);
        this.startTime = SystemClock.elapsedRealtime();
        this.scheduledFuture = this.scheduler.schedule(new TTCFService$$ExternalSyntheticLambda0(this, 9), 5000L, TimeUnit.MILLISECONDS);
    }

    public synchronized AbstractMap.SimpleEntry<Long, Map<String, String>> stopTimer() {
        if (this.startTime == -1) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
        Map<String, String> map = this.data;
        clearEvent();
        return new AbstractMap.SimpleEntry<>(Long.valueOf(elapsedRealtime), map);
    }
}
