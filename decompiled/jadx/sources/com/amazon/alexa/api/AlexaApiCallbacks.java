package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.Nullable;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class AlexaApiCallbacks {
    private final AtomicBoolean callbackMethodCalled;
    private final String id;

    @Nullable
    private final TimeUnit timeoutUnit;

    @Nullable
    private final Long timeoutValue;

    public AlexaApiCallbacks(@Nullable Long l, @Nullable TimeUnit timeUnit) {
        this.timeoutValue = l;
        this.timeoutUnit = timeUnit;
        this.id = UUID.randomUUID().toString();
        this.callbackMethodCalled = new AtomicBoolean(false);
    }

    public final void doOnFailure(ApiCallFailure apiCallFailure) {
        if (this.callbackMethodCalled.compareAndSet(false, true)) {
            onFailure(apiCallFailure);
        }
    }

    public final void doOnSuccess() {
        if (this.callbackMethodCalled.compareAndSet(false, true)) {
            onSuccess();
        }
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public TimeUnit getTimeoutUnit() {
        return this.timeoutUnit;
    }

    @Nullable
    public Long getTimeoutValue() {
        return this.timeoutValue;
    }

    public void onSuccess() {
    }

    public void onFailure(ApiCallFailure apiCallFailure) {
    }

    public AlexaApiCallbacks() {
        this(null, null);
    }
}
