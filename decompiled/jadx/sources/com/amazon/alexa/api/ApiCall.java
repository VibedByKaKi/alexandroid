package com.amazon.alexa.api;

import com.amazon.alexa.api.ApiCallFailure;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class ApiCall implements Runnable {
    private final AlexaApiCallbacks apiCallbacks;

    public ApiCall(@Nullable AlexaApiCallbacks alexaApiCallbacks) {
        this.apiCallbacks = alexaApiCallbacks;
    }

    private void onError(@Nullable Exception exc) {
        if (this.apiCallbacks != null) {
            this.apiCallbacks.doOnFailure(ApiCallFailure.MessagingFailure.create(exc == null ? "Unable to execute API call" : exc.getMessage(), exc));
        }
    }

    public abstract void call() throws Exception;

    @Override // java.lang.Runnable
    public void run() {
        try {
            call();
        } catch (Exception e) {
            onError(e);
        }
    }

    public ApiCall() {
        this(null);
    }
}
