package com.amazon.whisperjoin.softap.observables;

import com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder;
import com.amazon.whisperjoin.softap.wifi.requests.RequestBuilderProvider;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public abstract class SoftApRequestOperation<T> extends HttpRequestOperation<T> {
    private static final String SERVER_ADDRESS = "192.168.1.1";
    private static final String SERVER_SCHEME = "http";
    private static final String V2_API_VERSION_PREFIX = "v2";

    public SoftApRequestOperation(RequestBuilderProvider requestBuilderProvider) {
        super(requestBuilderProvider);
    }

    private String createRequestPath() {
        return a$$ExternalSyntheticOutline0.m("/", getApiVersion(), getPath());
    }

    public String getApiVersion() {
        return V2_API_VERSION_PREFIX;
    }

    public abstract String getPath();

    @Override // com.amazon.whisperjoin.softap.observables.HttpRequestOperation
    public RequestBuilder requestBuilder() {
        return super.requestBuilder().setScheme("http").setAuthority(SERVER_ADDRESS).setPath(createRequestPath());
    }
}
