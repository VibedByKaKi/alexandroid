package com.amazonaws.mobileconnectors.amazonmobileanalytics;

import com.amazonaws.ClientConfiguration;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class AnalyticsConfig {
    private boolean allowEventCollection;
    private boolean allowWANDelivery;
    private ClientConfiguration clientConfiguration;

    public AnalyticsConfig(ClientConfiguration clientConfiguration) {
        this.allowEventCollection = true;
        this.allowWANDelivery = true;
        if (clientConfiguration != null) {
            this.clientConfiguration = new ClientConfiguration(clientConfiguration);
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    public boolean getAllowEventCollection() {
        return this.allowEventCollection;
    }

    public boolean getAllowWANDelivery() {
        return this.allowWANDelivery;
    }

    public ClientConfiguration getClientConfiguration() {
        return this.clientConfiguration;
    }

    public AnalyticsConfig withAllowsEventCollection(boolean z) {
        this.allowEventCollection = z;
        return this;
    }

    public AnalyticsConfig withAllowsWANDelivery(boolean z) {
        this.allowWANDelivery = z;
        return this;
    }

    public AnalyticsConfig withClientConfiguration(ClientConfiguration clientConfiguration) {
        this.clientConfiguration = new ClientConfiguration(clientConfiguration);
        return this;
    }

    public AnalyticsConfig() {
        this(new ClientConfiguration());
    }
}
