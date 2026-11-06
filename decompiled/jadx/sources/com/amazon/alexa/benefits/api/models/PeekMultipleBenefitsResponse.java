package com.amazon.alexa.benefits.api.models;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PeekMultipleBenefitsResponse {
    private final List<String> entitledBenefits;
    private final Map<String, PeekBenefitsEntitlementResponse> entitlementStatusMap;

    public PeekMultipleBenefitsResponse(Map<String, PeekBenefitsEntitlementResponse> map, List<String> list) {
        this.entitlementStatusMap = new HashMap(map);
        this.entitledBenefits = new ArrayList(list);
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public List<String> getEntitledBenefits() {
        return new ArrayList(this.entitledBenefits);
    }

    public Map<String, PeekBenefitsEntitlementResponse> getEntitlementStatusMap() {
        return new HashMap(this.entitlementStatusMap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class PeekMultipleBenefitsResponse {\n    entitlementStatusMap: ");
        sb.append(toIndentedString(this.entitlementStatusMap));
        sb.append("\n    entitledBenefits: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.entitledBenefits), "\n}");
    }
}
