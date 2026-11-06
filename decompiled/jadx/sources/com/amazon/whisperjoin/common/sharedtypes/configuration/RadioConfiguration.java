package com.amazon.whisperjoin.common.sharedtypes.configuration;

import com.amazon.whisperjoin.common.sharedtypes.radios.ConnectionFactory;
import com.amazon.whisperjoin.common.sharedtypes.radios.DiscoveryService;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RadioConfiguration {
    private final ConnectionFactory mConnectionFactory;
    private final DiscoveryService mDiscoveryService;
    private final String mSupportedRadio;

    public RadioConfiguration(DiscoveryService discoveryService, String str, ConnectionFactory connectionFactory) {
        if (discoveryService == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("discoveryService can not be null");
            throw null;
        }
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("supportedRadio can not be null or empty");
            throw null;
        }
        if (connectionFactory == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("connectionFactory can not be null");
            throw null;
        }
        this.mDiscoveryService = discoveryService;
        this.mSupportedRadio = str;
        this.mConnectionFactory = connectionFactory;
    }

    public ConnectionFactory getConnectionFactory() {
        return this.mConnectionFactory;
    }

    public DiscoveryService getDiscoveryService() {
        return this.mDiscoveryService;
    }

    public String getRadioType() {
        return this.mSupportedRadio;
    }
}
