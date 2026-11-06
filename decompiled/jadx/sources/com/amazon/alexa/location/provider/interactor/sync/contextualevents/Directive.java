package com.amazon.alexa.location.provider.interactor.sync.contextualevents;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class Directive {
    private String correlationToken;
    private String customerId;
    private String deviceId;
    private List<Subscription> subscriptions;
    private String type;
    private String version;

    public String getCorrelationToken() {
        return this.correlationToken;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public List<Subscription> getSubscriptions() {
        return this.subscriptions;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }
}
