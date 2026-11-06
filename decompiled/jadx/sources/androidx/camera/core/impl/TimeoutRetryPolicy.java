package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.RetryPolicy;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public final class TimeoutRetryPolicy implements RetryPolicy {
    private final RetryPolicy mDelegatePolicy;
    private final long mTimeoutInMillis;

    public TimeoutRetryPolicy(long j, @NonNull RetryPolicy retryPolicy) {
        Preconditions.checkArgument(j >= 0, "Timeout must be non-negative.");
        this.mTimeoutInMillis = j;
        this.mDelegatePolicy = retryPolicy;
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mTimeoutInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy
    @NonNull
    public RetryPolicy.RetryConfig onRetryDecisionRequested(@NonNull RetryPolicy.ExecutionState executionState) {
        RetryPolicy.RetryConfig onRetryDecisionRequested = this.mDelegatePolicy.onRetryDecisionRequested(executionState);
        return (getTimeoutInMillis() <= 0 || executionState.getExecutedTimeInMillis() < getTimeoutInMillis() - onRetryDecisionRequested.getRetryDelayInMillis()) ? onRetryDecisionRequested : RetryPolicy.RetryConfig.NOT_RETRY;
    }
}
