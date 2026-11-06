package com.amazon.alexa.benefits.api.models;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DisclaimerInfo {
    private final Long disclaimerRenderedDateTime;
    private final String disclaimerVersion;
    private final boolean shouldShowDisclaimer;

    public DisclaimerInfo(String str, Long l, boolean z) {
        this.disclaimerVersion = str;
        this.disclaimerRenderedDateTime = l;
        this.shouldShowDisclaimer = z;
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public Long getDisclaimerRenderedDateTime() {
        return this.disclaimerRenderedDateTime;
    }

    public String getDisclaimerVersion() {
        return this.disclaimerVersion;
    }

    public boolean isShouldShowDisclaimer() {
        return this.shouldShowDisclaimer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class DisclaimerInfo {\n    disclaimerVersion: ");
        sb.append(toIndentedString(this.disclaimerVersion));
        sb.append("\n    disclaimerRenderedDateTime: ");
        sb.append(toIndentedString(this.disclaimerRenderedDateTime));
        sb.append("\n    shouldShowDisclaimer: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(Boolean.valueOf(this.shouldShowDisclaimer)), "\n}");
    }
}
