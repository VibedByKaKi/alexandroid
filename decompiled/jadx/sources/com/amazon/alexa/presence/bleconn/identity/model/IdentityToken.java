package com.amazon.alexa.presence.bleconn.identity.model;

import com.amazon.alexa.presence.bleconn.helpers.LoggingHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class IdentityToken {
    private String rollingProximityIdentifierToken;
    private ValidTimePeriod validTimePeriod;

    public IdentityToken(String str, ValidTimePeriod validTimePeriod) {
        this.rollingProximityIdentifierToken = str;
        this.validTimePeriod = validTimePeriod;
    }

    public String getRollingProximityIdentifierToken() {
        return this.rollingProximityIdentifierToken;
    }

    public ValidTimePeriod getValidTimePeriod() {
        return this.validTimePeriod;
    }

    public void setRollingProximityIdentifierToken(String str) {
        this.rollingProximityIdentifierToken = str;
    }

    public void setValidTimePeriod(ValidTimePeriod validTimePeriod) {
        this.validTimePeriod = validTimePeriod;
    }

    public String toString() {
        return LoggingHelper.dump(this);
    }

    public IdentityToken() {
    }
}
