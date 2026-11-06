package com.amazon.rtvi.capture.client.retry;

import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class AsyncRetryExecutor {
    private static final String TAG = "AsyncRetryExecutor";
    private final ScheduledExecutorService scheduler;
    private final RetryStrategy strategy;

    public AsyncRetryExecutor(@NonNull RetryStrategy retryStrategy, @NonNull ScheduledExecutorService scheduledExecutorService) {
        if (retryStrategy == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Retry strategy cannot be null");
            throw null;
        }
        if (scheduledExecutorService == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Scheduler cannot be null");
            throw null;
        }
        this.strategy = retryStrategy;
        this.scheduler = scheduledExecutorService;
    }

    private <T> void executeAttempt(@NonNull Callable<CompletableFuture<T>> callable, int i, @NonNull CompletableFuture<T> completableFuture) {
        this.scheduler.execute(new AsyncRetryExecutor$$ExternalSyntheticLambda1(this, i, callable, completableFuture));
    }

    private <T> void handleFailure(@NonNull Callable<CompletableFuture<T>> callable, int i, @NonNull Throwable th, @NonNull CompletableFuture<T> completableFuture) {
        if (!this.strategy.shouldRetry(i, th)) {
            completableFuture.completeExceptionally(th);
        } else {
            this.scheduler.schedule(new AsyncRetryExecutor$$ExternalSyntheticLambda1(this, callable, i, completableFuture), this.strategy.getDelayMs(i, th), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeAttempt$0(CompletableFuture completableFuture, int i, Callable callable, Object obj, Throwable th) {
        if (th == null) {
            completableFuture.complete(obj);
            return;
        }
        StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i, "Attempt ", " failed: ");
        m0m.append(th.getMessage());
        Log.w(TAG, m0m.toString());
        handleFailure(callable, i, th, completableFuture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeAttempt$1(final int i, final Callable callable, final CompletableFuture completableFuture) {
        try {
            this.strategy.getMaxAttempts();
            ((CompletableFuture) callable.call()).whenComplete(new BiConsumer() { // from class: com.amazon.rtvi.capture.client.retry.AsyncRetryExecutor$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AsyncRetryExecutor.this.lambda$executeAttempt$0(completableFuture, i, callable, obj, (Throwable) obj2);
                }
            });
        } catch (Exception e) {
            StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i, "Attempt ", " threw exception: ");
            m0m.append(e.getMessage());
            Log.w(TAG, m0m.toString());
            handleFailure(callable, i, e, completableFuture);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleFailure$2(Callable callable, int i, CompletableFuture completableFuture) {
        executeAttempt(callable, i + 1, completableFuture);
    }

    @NonNull
    public <T> CompletableFuture<T> execute(@NonNull Callable<CompletableFuture<T>> callable) {
        if (callable == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Callable cannot be null");
            return null;
        }
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        executeAttempt(callable, 1, completableFuture);
        return completableFuture;
    }

    @NonNull
    public RetryStrategy getStrategy() {
        return this.strategy;
    }

    public String toString() {
        return "AsyncRetryExecutor{strategy=" + this.strategy + StringSubstitutor.DEFAULT_VAR_END;
    }
}
