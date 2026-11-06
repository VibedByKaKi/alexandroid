package com.amazon.alexa.benefits.api.models;

import androidx.annotation.Nullable;
import com.amazon.alexa.benefits.api.models.enums.Reasons;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BenefitsMetadata {
    private final DisclaimerInfo disclaimerInfo;
    private final boolean isSupported;
    private final Long latestEnrolledTime;
    private final Reasons[] reasons;

    public BenefitsMetadata(Long l, DisclaimerInfo disclaimerInfo, boolean z, Reasons[] reasonsArr) {
        this.latestEnrolledTime = l;
        this.disclaimerInfo = disclaimerInfo;
        this.isSupported = z;
        this.reasons = reasonsArr;
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    @Nullable
    public DisclaimerInfo getDisclaimerInfo() {
        return this.disclaimerInfo;
    }

    @Nullable
    public Long getLatestEnrolledTime() {
        return this.latestEnrolledTime;
    }

    @Nullable
    public Reasons[] getReasons() {
        return this.reasons;
    }

    public boolean isSupported() {
        return this.isSupported;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class BenefitsMetadata {\n    latestEnrolledTime: ");
        sb.append(toIndentedString(this.latestEnrolledTime));
        sb.append("\n    disclaimerInfo: ");
        sb.append(toIndentedString(this.disclaimerInfo));
        sb.append("\n    isSupported: ");
        sb.append(toIndentedString(Boolean.valueOf(this.isSupported)));
        sb.append("\n    reasons: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(Arrays.toString(this.reasons)), "\n}");
    }
}
