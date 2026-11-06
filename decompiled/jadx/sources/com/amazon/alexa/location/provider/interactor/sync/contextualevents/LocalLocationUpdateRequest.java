package com.amazon.alexa.location.provider.interactor.sync.contextualevents;

import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LocalLocationUpdateRequest {
    private static final String SINGLE_LOCATION_UPDATE_INTERFACE = "OneTimePreciseLocation";
    private String cause;
    private String featureId;
    private String interfaceName;

    @VisibleForTesting
    public LocalLocationUpdateRequest(String str, String str2, String str3) {
        this.interfaceName = str;
        this.featureId = str2;
        this.cause = str3;
    }

    public String getCause() {
        return this.cause;
    }

    public String getFeatureId() {
        return this.featureId;
    }

    public String getInterfaceName() {
        return this.interfaceName;
    }

    public boolean isSingleLocationUpdate() {
        return "OneTimePreciseLocation".equals(this.interfaceName);
    }

    public LocalLocationUpdateRequest() {
    }
}
