package com.amazon.alexa.client.alexaservice.vad.deferredbargein;

import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DeferredBargeInConfiguration {
    private static final long DEFAULT_TIMEOUT_MS = 5000;
    private volatile long timeoutMs = 5000;

    @Inject
    public DeferredBargeInConfiguration() {
    }

    public long getTimeoutMs() {
        return this.timeoutMs;
    }

    public void setTimeoutMs(long j) {
        this.timeoutMs = j;
    }
}
