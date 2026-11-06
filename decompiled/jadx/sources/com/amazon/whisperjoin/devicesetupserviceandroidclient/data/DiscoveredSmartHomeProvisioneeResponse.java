package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredSmartHomeProvisioneeResponse {
    private final boolean mCanProceed;
    private final String mProvisionerReportUrl;
    private final long mWaitTimeMs;

    public DiscoveredSmartHomeProvisioneeResponse(String str, boolean z, long j) {
        this.mProvisionerReportUrl = str;
        this.mCanProceed = z;
        this.mWaitTimeMs = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveredSmartHomeProvisioneeResponse)) {
            return false;
        }
        DiscoveredSmartHomeProvisioneeResponse discoveredSmartHomeProvisioneeResponse = (DiscoveredSmartHomeProvisioneeResponse) obj;
        return this.mCanProceed == discoveredSmartHomeProvisioneeResponse.mCanProceed && Objects.equal(this.mProvisionerReportUrl, discoveredSmartHomeProvisioneeResponse.mProvisionerReportUrl) && Objects.equal(Long.valueOf(this.mWaitTimeMs), Long.valueOf(discoveredSmartHomeProvisioneeResponse.mWaitTimeMs));
    }

    public String getProvisionerReportUrl() {
        return this.mProvisionerReportUrl;
    }

    public long getWaitTimeMs() {
        return this.mWaitTimeMs;
    }

    public int hashCode() {
        return Objects.hashCode(this.mProvisionerReportUrl, Boolean.valueOf(this.mCanProceed), Long.valueOf(this.mWaitTimeMs));
    }

    public boolean isCanProceed() {
        return this.mCanProceed;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mProvisionerReportUrl", this.mProvisionerReportUrl).add("mCanProceed", this.mCanProceed).add("mWaitTimeMs", this.mWaitTimeMs).toString();
    }
}
