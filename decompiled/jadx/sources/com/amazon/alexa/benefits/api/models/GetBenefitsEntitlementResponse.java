package com.amazon.alexa.benefits.api.models;

import com.amazon.alexa.benefits.api.models.enums.EntitlementStatus;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GetBenefitsEntitlementResponse {
    private final BenefitsMetadata benefitsMetadata;
    private final EntitlementStatus entitlementStatus;

    public GetBenefitsEntitlementResponse(EntitlementStatus entitlementStatus, BenefitsMetadata benefitsMetadata) {
        this.entitlementStatus = entitlementStatus;
        this.benefitsMetadata = benefitsMetadata;
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public BenefitsMetadata getBenefitsMetadata() {
        return this.benefitsMetadata;
    }

    public EntitlementStatus getEntitlementStatus() {
        return this.entitlementStatus;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class GetBenefitsEntitlementResponse {\n    entitlementStatus: ");
        sb.append(toIndentedString(this.entitlementStatus));
        sb.append("\n    benefitsMetadata: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.benefitsMetadata), "\n}");
    }
}
