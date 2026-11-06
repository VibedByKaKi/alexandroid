package com.amazon.whisperjoin.provisionerSDK.radios;

import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class RetryHandler<TResult> {
    private static final String TAG = "com.amazon.whisperjoin.provisionerSDK.radios.RetryHandler";
    private final PromiseFactory<TResult> mAction;
    private final ExecutorService mExectuorService;

    public RetryHandler(PromiseFactory<TResult> promiseFactory, ExecutorService executorService) {
        if (promiseFactory == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("action can not be null");
            throw null;
        }
        if (executorService == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("executorService can not be null");
            throw null;
        }
        this.mAction = promiseFactory;
        this.mExectuorService = executorService;
    }

    public Future<TResult> startAttempts(final long j, final TimeUnit timeUnit, final long j2, final String str) {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("timeout must be >= 0");
            return null;
        }
        if (j2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("maxRetry must be >= 0");
            return null;
        }
        if (str != null && str.length() != 0) {
            return this.mExectuorService.submit(new Callable<TResult>() { // from class: com.amazon.whisperjoin.provisionerSDK.radios.RetryHandler.1
                @Override // java.util.concurrent.Callable
                public TResult call() throws Exception {
                    Exception e = null;
                    Future<TResult> future = null;
                    for (long j3 = j2; j3 >= 0; j3--) {
                        try {
                            Future<TResult> future2 = RetryHandler.this.mAction.getFuture();
                            try {
                                return future2.get(j, timeUnit);
                            } catch (Exception e2) {
                                future = future2;
                                e = e2;
                                if (future != null) {
                                    future.cancel(true);
                                }
                                WJLog.e(RetryHandler.TAG, "Attempt failed for Action:" + str + ". Retry count: " + j3, e);
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    WJLog.e(RetryHandler.TAG, "All attempts failed for Action: " + str + " no more retrying.");
                    throw e;
                }
            });
        }
        Single$$ExternalSyntheticBUOutline0.m$3("actionName must not be null or empty");
        return null;
    }
}
