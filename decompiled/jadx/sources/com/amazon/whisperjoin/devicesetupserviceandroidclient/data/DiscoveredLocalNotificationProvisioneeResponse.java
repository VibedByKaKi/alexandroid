package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredLocalNotificationProvisioneeResponse {
    private final boolean mCanProceed;
    private final LegacyIdentifierData mLegacyIdentifierData;

    public DiscoveredLocalNotificationProvisioneeResponse(boolean z, LegacyIdentifierData legacyIdentifierData) {
        this.mCanProceed = z;
        this.mLegacyIdentifierData = legacyIdentifierData;
    }

    public boolean canProceed() {
        return this.mCanProceed;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DiscoveredLocalNotificationProvisioneeResponse discoveredLocalNotificationProvisioneeResponse = (DiscoveredLocalNotificationProvisioneeResponse) obj;
            if (this.mCanProceed == discoveredLocalNotificationProvisioneeResponse.mCanProceed && Objects.equal(this.mLegacyIdentifierData, discoveredLocalNotificationProvisioneeResponse.mLegacyIdentifierData)) {
                return true;
            }
        }
        return false;
    }

    public LegacyIdentifierData getLegacyIdentifier() {
        return this.mLegacyIdentifierData;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.mCanProceed), this.mLegacyIdentifierData);
    }
}
