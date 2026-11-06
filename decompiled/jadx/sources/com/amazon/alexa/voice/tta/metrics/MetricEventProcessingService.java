package com.amazon.alexa.voice.tta.metrics;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.tta.utils.Worker;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;
import com.amazon.apl.android.Content$$ExternalSyntheticLambda0;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class MetricEventProcessingService {
    private static final String TAG = "MetricEventProcessingService";
    private final MetricEventProcessor[] eventProcessors;
    private final Worker.Spawner workerSpawner;

    @Nullable
    private Worker worker = null;
    private boolean running = false;
    private final ReadWriteLock lock = new ReentrantReadWriteLock(true);

    public MetricEventProcessingService(Worker.Spawner spawner, MetricEventProcessor... metricEventProcessorArr) {
        this.workerSpawner = spawner;
        this.eventProcessors = metricEventProcessorArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runEventProcessors, reason: merged with bridge method [inline-methods] */
    public void lambda$processEvent$2(@NonNull TtaEvent ttaEvent, @NonNull EventTime eventTime) {
        boolean z = false;
        for (MetricEventProcessor metricEventProcessor : this.eventProcessors) {
            if (metricEventProcessor.processEvent(ttaEvent, eventTime)) {
                ttaEvent.getName();
                z = true;
            }
        }
        if (z) {
            return;
        }
        ttaEvent.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startEventProcessors, reason: merged with bridge method [inline-methods] */
    public void lambda$start$0(EventTime eventTime) {
        lambda$processEvent$2(MetricsLifecycleEvent.EVENT_SERVICE_START, eventTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: stopEventProcessors, reason: merged with bridge method [inline-methods] */
    public void lambda$stop$1(EventTime eventTime) {
        Worker worker;
        lambda$processEvent$2(MetricsLifecycleEvent.EVENT_SERVICE_STOP, eventTime);
        this.lock.writeLock().lock();
        try {
            if (!this.running && (worker = this.worker) != null) {
                worker.quit();
                this.worker = null;
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void processEvent(@NonNull TtaEvent ttaEvent, @NonNull EventTime eventTime) {
        Worker worker;
        this.lock.readLock().lock();
        try {
            if (this.running && (worker = this.worker) != null) {
                worker.post(new Content$$ExternalSyntheticLambda0(this, 28, ttaEvent, eventTime));
            }
            String str = TAG;
            Log.e(str, "processEvent: Event '" + ttaEvent.getName() + "' sent while " + str + " was not running.");
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void start(EventTime eventTime) {
        this.lock.writeLock().lock();
        try {
            if (!this.running) {
                this.running = true;
                if (this.worker == null) {
                    this.worker = this.workerSpawner.spawn();
                }
                this.worker.post(new MetricEventProcessingService$$ExternalSyntheticLambda0(this, eventTime, 1));
            }
            this.lock.writeLock().unlock();
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    public void stop(EventTime eventTime) {
        Worker worker;
        this.lock.writeLock().lock();
        try {
            if (this.running && (worker = this.worker) != null) {
                this.running = false;
                worker.post(new MetricEventProcessingService$$ExternalSyntheticLambda0(this, eventTime, 0));
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }
}
