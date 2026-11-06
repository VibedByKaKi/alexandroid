package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FFSAllowListPolicyResponse {
    private int ffsScanningEnabled;
    private int hoursToNextCall;
    private int minBatteryLevel;

    public FFSAllowListPolicyResponse(int i, int i2, int i3) {
        this.minBatteryLevel = i;
        this.hoursToNextCall = i2;
        this.ffsScanningEnabled = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FFSAllowListPolicyResponse fFSAllowListPolicyResponse = (FFSAllowListPolicyResponse) obj;
            if (this.minBatteryLevel == fFSAllowListPolicyResponse.minBatteryLevel && this.hoursToNextCall == fFSAllowListPolicyResponse.hoursToNextCall && this.ffsScanningEnabled == fFSAllowListPolicyResponse.ffsScanningEnabled) {
                return true;
            }
        }
        return false;
    }

    public int getFfsScanningEnabled() {
        return this.ffsScanningEnabled;
    }

    public int getHoursToNextCall() {
        return this.hoursToNextCall;
    }

    public int getMinBatteryLevel() {
        return this.minBatteryLevel;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.minBatteryLevel), Integer.valueOf(this.hoursToNextCall), Integer.valueOf(this.ffsScanningEnabled));
    }

    public void setFfsScanningEnabled(int i) {
        this.ffsScanningEnabled = i;
    }

    public void setHoursToNextCall(int i) {
        this.hoursToNextCall = i;
    }

    public void setMinBatteryLevel(int i) {
        this.minBatteryLevel = i;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("minBatteryLevel", this.minBatteryLevel).add("hoursToNextCall", this.hoursToNextCall).add("ffsScanningEnabled", this.ffsScanningEnabled).toString();
    }

    public FFSAllowListPolicyResponse() {
    }
}
