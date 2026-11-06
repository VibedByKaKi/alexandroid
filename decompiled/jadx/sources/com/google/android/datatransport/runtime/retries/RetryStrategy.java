package com.google.android.datatransport.runtime.retries;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface RetryStrategy<TInput, TResult> {
    @Nullable
    TInput shouldRetry(TInput tinput, TResult tresult);
}
