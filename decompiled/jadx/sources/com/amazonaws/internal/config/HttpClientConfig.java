package com.amazonaws.internal.config;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class HttpClientConfig {
    private final String serviceName;

    public HttpClientConfig(String str) {
        this.serviceName = str;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String toString() {
        return "serviceName: " + this.serviceName;
    }
}
