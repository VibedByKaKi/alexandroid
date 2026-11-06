package com.amazon.alexa.location.provider.interactor.sync.contextualevents;

import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LocationReportingRule {
    private int intervalInSeconds;
    private String type;

    @VisibleForTesting
    public LocationReportingRule(String str, int i) {
        this.type = str;
        this.intervalInSeconds = i;
    }

    public int getIntervalInSeconds() {
        return this.intervalInSeconds;
    }

    public String getType() {
        return this.type;
    }

    public LocationReportingRule() {
    }
}
