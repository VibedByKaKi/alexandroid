package com.amazon.alexa.benefits.api.models;

import androidx.annotation.Nullable;
import com.amazon.alexa.benefits.api.models.enums.CacheState;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PeekBenefitsEntitlementResponse {
    private final CacheState cacheState;
    private final GetBenefitsEntitlementResponse response;

    public PeekBenefitsEntitlementResponse(CacheState cacheState, @Nullable GetBenefitsEntitlementResponse getBenefitsEntitlementResponse) {
        this.cacheState = cacheState;
        this.response = getBenefitsEntitlementResponse;
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public CacheState getCacheState() {
        return this.cacheState;
    }

    @Nullable
    public GetBenefitsEntitlementResponse getGetBenefitsEntitlementResponse() {
        return this.response;
    }

    @Nullable
    public GetBenefitsEntitlementResponse getResponse() {
        return this.response;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class PeekBenefitsEntitlementResponse {\n    cacheState: ");
        sb.append(toIndentedString(this.cacheState));
        sb.append("\n    response: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.response), "\n}");
    }
}
