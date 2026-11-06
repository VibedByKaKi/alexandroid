package com.amazon.alexa.client.alexaservice.networking.downchannel;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.TimeProvider;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DownchannelRecoveryThrottle {

    @VisibleForTesting
    static final long MIN_RECOVERY_INTERVAL_MS = 60000;
    private long lastRecoveryElapsedRealTimeMs;
    private boolean rebuildAwaitingEstablishment;
    private final TimeProvider timeProvider;

    @Inject
    public DownchannelRecoveryThrottle() {
        this(new TimeProvider());
    }

    public synchronized boolean consumeRebuildAttempted() {
        boolean z;
        z = this.rebuildAwaitingEstablishment;
        this.rebuildAwaitingEstablishment = false;
        return z;
    }

    public synchronized void markRebuildAttempted() {
        this.rebuildAwaitingEstablishment = true;
    }

    public synchronized long millisSinceLastRecovery() {
        return this.timeProvider.elapsedRealTime() - this.lastRecoveryElapsedRealTimeMs;
    }

    public synchronized boolean tryAcquire() {
        long elapsedRealTime = this.timeProvider.elapsedRealTime();
        long j = this.lastRecoveryElapsedRealTimeMs;
        if (j != 0 && elapsedRealTime - j < 60000) {
            return false;
        }
        this.lastRecoveryElapsedRealTimeMs = elapsedRealTime;
        return true;
    }

    @VisibleForTesting
    public DownchannelRecoveryThrottle(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }
}
