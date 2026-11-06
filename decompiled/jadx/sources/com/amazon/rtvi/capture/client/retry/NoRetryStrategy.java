package com.amazon.rtvi.capture.client.retry;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
final class NoRetryStrategy implements RetryStrategy {
    @Override // com.amazon.rtvi.capture.client.retry.RetryStrategy
    public long getDelayMs(int i, @NonNull Throwable th) {
        return 0L;
    }

    @Override // com.amazon.rtvi.capture.client.retry.RetryStrategy
    public int getMaxAttempts() {
        return 1;
    }

    @Override // com.amazon.rtvi.capture.client.retry.RetryStrategy
    public boolean shouldRetry(int i, @NonNull Throwable th) {
        return false;
    }

    public String toString() {
        return "NoRetryStrategy{}";
    }
}
