package com.amazon.rtvi.capture.client.retry;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface RetryStrategy {
    @NonNull
    static RetryStrategy exponentialBackoff(int i, long j, long j2) {
        return new ExponentialBackoffRetryStrategy(i, j, j2);
    }

    @NonNull
    static RetryStrategy fixedDelay(int i, long j) {
        return new FixedDelayRetryStrategy(i, j);
    }

    @NonNull
    static RetryStrategy noRetry() {
        return new NoRetryStrategy();
    }

    @NonNull
    static RetryStrategy retryOn(@NonNull RetryStrategy retryStrategy, @NonNull Class<? extends Throwable>... clsArr) {
        return new ConditionalRetryStrategy(retryStrategy, clsArr);
    }

    long getDelayMs(int i, @NonNull Throwable th);

    int getMaxAttempts();

    boolean shouldRetry(int i, @NonNull Throwable th);
}
