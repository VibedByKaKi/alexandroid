package com.amazon.alexa.mobilytics.integration.ama;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MobilyticsEntitlementStatusImpl implements MobilyticsEntitlementStatus {
    private final long status;

    public MobilyticsEntitlementStatusImpl(@NonNull long j) {
        this.status = j;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus
    @NonNull
    public String benefitsEntitled() {
        return "alexa_premium_default";
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus
    @NonNull
    public long status() {
        return this.status;
    }
}
