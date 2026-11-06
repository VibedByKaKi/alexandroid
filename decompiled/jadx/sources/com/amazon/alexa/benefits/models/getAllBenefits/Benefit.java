package com.amazon.alexa.benefits.models.getAllBenefits;

import com.amazon.alexa.benefits.api.models.enums.EntitlementStatus;
import com.amazon.alexa.benefits.api.models.enums.Reasons;
import com.amazon.alexa.benefits.models.customAdapters.EntitlementStatusAdapter;
import com.amazon.alexa.benefits.models.customAdapters.ReasonsListAdapter;
import com.amazon.alexa.benefits.util.TextUtils;
import com.google.gson.annotations.JsonAdapter;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Benefit {
    private String benefitId;
    private BenefitMetadata benefitMetadata;

    @JsonAdapter(EntitlementStatusAdapter.class)
    private EntitlementStatus entitlementStatus;

    @JsonAdapter(ReasonsListAdapter.class)
    private Reasons[] reasons;

    public Benefit(String str, EntitlementStatus entitlementStatus, BenefitMetadata benefitMetadata, Reasons[] reasonsArr) {
        this.benefitId = str;
        this.entitlementStatus = entitlementStatus;
        this.benefitMetadata = benefitMetadata;
        this.reasons = reasonsArr;
    }

    public String getBenefitId() {
        return this.benefitId;
    }

    public BenefitMetadata getBenefitMetadata() {
        return this.benefitMetadata;
    }

    public EntitlementStatus getEntitlementStatus() {
        return this.entitlementStatus;
    }

    public Reasons[] getReasons() {
        return this.reasons;
    }

    public String toString() {
        return "class Benefit {\n    benefitId: " + TextUtils.toIndentedString(this.benefitId) + "\n    entitlementStatus: " + TextUtils.toIndentedString(this.entitlementStatus) + "\n    benefitMetadata: " + TextUtils.toIndentedString(this.benefitMetadata) + "\n    reasons: " + TextUtils.toIndentedString(Arrays.toString(this.reasons)) + "\n}";
    }
}
