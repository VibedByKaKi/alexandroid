package com.amazon.whisperjoin.softap.observables;

import com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder;
import com.amazon.whisperjoin.softap.wifi.requests.RequestBuilderProvider;
import rx.Single;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public abstract class HttpRequestOperation<T> {
    protected RequestBuilderProvider requestBuilderProvider;

    public HttpRequestOperation(RequestBuilderProvider requestBuilderProvider) {
        this.requestBuilderProvider = requestBuilderProvider;
    }

    public abstract Single<T> observe() throws Exception;

    public RequestBuilder requestBuilder() {
        return this.requestBuilderProvider.getBuilder();
    }
}
