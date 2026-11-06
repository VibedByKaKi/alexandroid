package com.amazon.rtvi.capture.client.retry;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
final class ConditionalRetryStrategy implements RetryStrategy {
    private final RetryStrategy baseStrategy;
    private final Set<Class<? extends Throwable>> retryableExceptions;

    public ConditionalRetryStrategy(@NonNull RetryStrategy retryStrategy, @NonNull Class<? extends Throwable>... clsArr) {
        if (retryStrategy == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Base strategy cannot be null");
            throw null;
        }
        if (clsArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Must specify at least one retryable exception type");
            throw null;
        }
        this.baseStrategy = retryStrategy;
        this.retryableExceptions = new HashSet(Arrays.asList(clsArr));
    }

    private boolean isRetryableException(@NonNull Throwable th) {
        Class<?> cls = th.getClass();
        Iterator<Class<? extends Throwable>> it2 = this.retryableExceptions.iterator();
        while (it2.hasNext()) {
            if (it2.next().isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.rtvi.capture.client.retry.RetryStrategy
    public long getDelayMs(int i, @NonNull Throwable th) {
        return this.baseStrategy.getDelayMs(i, th);
    }

    @Override // com.amazon.rtvi.capture.client.retry.RetryStrategy
    public int getMaxAttempts() {
        return this.baseStrategy.getMaxAttempts();
    }

    @Override // com.amazon.rtvi.capture.client.retry.RetryStrategy
    public boolean shouldRetry(int i, @NonNull Throwable th) {
        return isRetryableException(th) && this.baseStrategy.shouldRetry(i, th);
    }

    public String toString() {
        return "ConditionalRetryStrategy{baseStrategy=" + this.baseStrategy + ", retryableExceptions=" + this.retryableExceptions + StringSubstitutor.DEFAULT_VAR_END;
    }
}
