package com.amazon.clouddrive.cdasdk.retry;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.clouddrive.cdasdk.util.SystemUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExponentialJitterBackoffStrategy implements BackoffStrategy {
    private static final int DEFAULT_BASE_DELAY = 1000;
    private static final long DEFAULT_MAX_BACKOFF_TIME = 20000;
    private final int baseDelay;
    private final BackoffStrategy equalJitterStrategy;
    private final BackoffStrategy fullJitterStrategy;
    private final long maxBackoffTime;
    private final SystemUtil systemUtil;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EqualJitterBackoffStrategy implements BackoffStrategy {
        public EqualJitterBackoffStrategy() {
        }

        @Override // com.amazon.clouddrive.cdasdk.retry.BackoffStrategy
        public long computeDelayBeforeNextRetry(@NonNull RetryContext retryContext) {
            int calculateExponentialDelay = ExponentialJitterBackoffStrategy.calculateExponentialDelay(retryContext.getNumRetriesAttempted(), ExponentialJitterBackoffStrategy.this.baseDelay, ExponentialJitterBackoffStrategy.this.maxBackoffTime) / 2;
            return ExponentialJitterBackoffStrategy.this.systemUtil.randomNextInt(calculateExponentialDelay + 1) + calculateExponentialDelay;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class FullJitterBackoffStrategy implements BackoffStrategy {
        public FullJitterBackoffStrategy() {
        }

        @Override // com.amazon.clouddrive.cdasdk.retry.BackoffStrategy
        public long computeDelayBeforeNextRetry(@NonNull RetryContext retryContext) {
            return ExponentialJitterBackoffStrategy.this.systemUtil.randomNextInt(ExponentialJitterBackoffStrategy.calculateExponentialDelay(retryContext.getNumRetriesAttempted(), ExponentialJitterBackoffStrategy.this.baseDelay, ExponentialJitterBackoffStrategy.this.maxBackoffTime));
        }
    }

    public ExponentialJitterBackoffStrategy(@NonNull SystemUtil systemUtil) {
        this.fullJitterStrategy = new FullJitterBackoffStrategy();
        this.equalJitterStrategy = new EqualJitterBackoffStrategy();
        this.baseDelay = 1000;
        this.maxBackoffTime = 20000L;
        this.systemUtil = systemUtil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calculateExponentialDelay(int i, int i2, long j) {
        return (int) Math.min((1 << i) * i2, j);
    }

    @Override // com.amazon.clouddrive.cdasdk.retry.BackoffStrategy
    public long computeDelayBeforeNextRetry(@NonNull RetryContext retryContext) {
        return (retryContext.getResponse() == null || !RetryUtil.isThrottlingError(retryContext.getResponse())) ? this.fullJitterStrategy.computeDelayBeforeNextRetry(retryContext) : this.equalJitterStrategy.computeDelayBeforeNextRetry(retryContext);
    }

    @VisibleForTesting
    public ExponentialJitterBackoffStrategy(@NonNull SystemUtil systemUtil, int i, long j) {
        this.fullJitterStrategy = new FullJitterBackoffStrategy();
        this.equalJitterStrategy = new EqualJitterBackoffStrategy();
        this.baseDelay = i;
        this.maxBackoffTime = j;
        this.systemUtil = systemUtil;
    }
}
