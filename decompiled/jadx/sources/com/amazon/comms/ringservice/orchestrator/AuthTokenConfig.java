package com.amazon.comms.ringservice.orchestrator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AuthTokenConfig {
    String authToken;
    int authTokenIntervalInSecs;
    boolean forceRegister;

    public AuthTokenConfig(String str, int i, boolean z) {
        this.authToken = str;
        this.authTokenIntervalInSecs = i;
        this.forceRegister = z;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public int getAuthTokenIntervalInSecs() {
        return this.authTokenIntervalInSecs;
    }

    public boolean isForceRegister() {
        return this.forceRegister;
    }
}
