package com.amazon.clouddrive.cdasdk.dps.collections;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.dps.common.DPSRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DPSCollectionsRequest extends DPSRequest {

    @SerializedName("locale")
    @Expose
    private String locale;

    @Generated
    public DPSCollectionsRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof DPSCollectionsRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DPSCollectionsRequest)) {
            return false;
        }
        DPSCollectionsRequest dPSCollectionsRequest = (DPSCollectionsRequest) obj;
        if (!dPSCollectionsRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String locale = getLocale();
        String locale2 = dPSCollectionsRequest.getLocale();
        return locale != null ? locale.equals(locale2) : locale2 == null;
    }

    @Generated
    public String getLocale() {
        return this.locale;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String locale = getLocale();
        return (hashCode * 59) + (locale == null ? 43 : locale.hashCode());
    }

    @Generated
    public void setLocale(String str) {
        this.locale = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public String toString() {
        return "DPSCollectionsRequest(locale=" + getLocale() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
