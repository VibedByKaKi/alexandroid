package com.amazon.alexa.benefits.api.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PeekMultipleBenefitsRequest {
    private final List<String> benefitNames;
    private final String mobilyticsOwnerID;

    public PeekMultipleBenefitsRequest(String str, List<String> list) {
        this.mobilyticsOwnerID = str;
        this.benefitNames = Collections.unmodifiableList(list);
    }

    public List<String> getBenefitNames() {
        return new ArrayList(this.benefitNames);
    }

    public String getMobilyticsOwnerID() {
        return this.mobilyticsOwnerID;
    }
}
