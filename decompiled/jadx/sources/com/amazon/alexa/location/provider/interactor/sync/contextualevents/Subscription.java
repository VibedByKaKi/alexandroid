package com.amazon.alexa.location.provider.interactor.sync.contextualevents;

import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class Subscription {
    private static final String SUBSCRIPTION_TYPE_PRECISE_LOCATION = "PreciseLocation";
    private String correlationToken;
    private String interfaceName;
    private LocationReportingRule reporting;
    private String subscriptionId;

    @VisibleForTesting
    public Subscription(String str, LocationReportingRule locationReportingRule) {
        this.interfaceName = str;
        this.reporting = locationReportingRule;
    }

    public String getCorrelationToken() {
        return this.correlationToken;
    }

    public String getInterfaceName() {
        return this.interfaceName;
    }

    public LocationReportingRule getReportingRule() {
        return this.reporting;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public boolean isLocationSubscription() {
        return SUBSCRIPTION_TYPE_PRECISE_LOCATION.equals(this.interfaceName);
    }

    public Subscription() {
    }
}
