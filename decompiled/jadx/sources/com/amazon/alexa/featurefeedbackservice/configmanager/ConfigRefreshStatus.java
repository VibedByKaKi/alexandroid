package com.amazon.alexa.featurefeedbackservice.configmanager;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ConfigRefreshStatus {
    private long lastRefreshTime;
    private boolean success;

    public ConfigRefreshStatus(boolean z, long j) {
        this.success = z;
        this.lastRefreshTime = j;
    }

    public long getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    public boolean isInitial() {
        return !this.success && this.lastRefreshTime == 0;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setLastRefreshTime(long j) {
        this.lastRefreshTime = j;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ success: ");
        sb.append(this.success);
        sb.append(", lastRefreshTime: ");
        return a$$ExternalSyntheticOutline0.m(this.lastRefreshTime, " }", sb);
    }

    public ConfigRefreshStatus() {
        this(false, 0L);
    }
}
