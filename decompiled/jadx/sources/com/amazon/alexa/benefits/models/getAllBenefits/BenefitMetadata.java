package com.amazon.alexa.benefits.models.getAllBenefits;

import com.amazon.alexa.benefits.util.TextUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BenefitMetadata {
    private Long disclaimerRenderedDateTime;
    private String disclaimerVersion;
    private boolean isSupported;
    private Long latestEnrolledTime;

    public BenefitMetadata(Long l, String str, Long l2, boolean z) {
        this.disclaimerRenderedDateTime = l;
        this.disclaimerVersion = str;
        this.latestEnrolledTime = l2;
        this.isSupported = z;
    }

    public Long getDisclaimerRenderedDateTime() {
        return this.disclaimerRenderedDateTime;
    }

    public String getDisclaimerVersion() {
        return this.disclaimerVersion;
    }

    public Long getLatestEnrolledTime() {
        return this.latestEnrolledTime;
    }

    public boolean isSupported() {
        return this.isSupported;
    }

    public String toString() {
        return "class GetAllBenefitsResponse {\n    disclaimerRenderedDateTime: " + TextUtils.toIndentedString(this.disclaimerRenderedDateTime) + "\n    disclaimerVersion: " + TextUtils.toIndentedString(this.disclaimerVersion) + "\n    latestEnrolledTime: " + TextUtils.toIndentedString(this.latestEnrolledTime) + "\n    isSupported: " + TextUtils.toIndentedString(Boolean.valueOf(this.isSupported)) + "\n}";
    }
}
