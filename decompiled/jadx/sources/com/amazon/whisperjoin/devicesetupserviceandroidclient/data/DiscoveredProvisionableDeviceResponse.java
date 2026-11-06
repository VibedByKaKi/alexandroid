package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredProvisionableDeviceResponse {
    private final boolean mCanProceed;
    private final String mProvisionableEventReportUrl;
    private final String mProvisionerEventReportUrl;
    private final long mWaitTime;

    public DiscoveredProvisionableDeviceResponse(String str, String str2, boolean z, long j) {
        this.mProvisionerEventReportUrl = str;
        this.mProvisionableEventReportUrl = str2;
        this.mCanProceed = z;
        this.mWaitTime = j;
    }

    public boolean canProceed() {
        return this.mCanProceed;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DiscoveredProvisionableDeviceResponse discoveredProvisionableDeviceResponse = (DiscoveredProvisionableDeviceResponse) obj;
            if (this.mCanProceed == discoveredProvisionableDeviceResponse.mCanProceed && this.mWaitTime == discoveredProvisionableDeviceResponse.mWaitTime && Objects.equal(this.mProvisionerEventReportUrl, discoveredProvisionableDeviceResponse.mProvisionerEventReportUrl) && Objects.equal(this.mProvisionableEventReportUrl, discoveredProvisionableDeviceResponse.mProvisionableEventReportUrl)) {
                return true;
            }
        }
        return false;
    }

    public String getProvisionableEventReportUrl() {
        return this.mProvisionableEventReportUrl;
    }

    public String getProvisionerEventReportUrl() {
        return this.mProvisionerEventReportUrl;
    }

    public long getWaitTime() {
        return this.mWaitTime;
    }

    public int hashCode() {
        return Objects.hashCode(this.mProvisionerEventReportUrl, this.mProvisionableEventReportUrl, Boolean.valueOf(this.mCanProceed), Long.valueOf(this.mWaitTime));
    }
}
