package com.amazon.alexa.benefits.api.models;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GetBenefitsEntitlementRequest {
    private final String benefitName;
    private final String mobilyticsOwnerID;

    public GetBenefitsEntitlementRequest(@NonNull String str, @NonNull String str2) {
        this.mobilyticsOwnerID = str;
        this.benefitName = str2;
    }

    public String getBenefitName() {
        return this.benefitName;
    }

    public String getMobilyticsOwnerID() {
        return this.mobilyticsOwnerID;
    }
}
