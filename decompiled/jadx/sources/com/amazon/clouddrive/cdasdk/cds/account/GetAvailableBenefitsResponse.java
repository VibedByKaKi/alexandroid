package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetAvailableBenefitsResponse extends CloudDriveResponse {

    @SerializedName("benefits")
    @Expose
    private List<AvailableBenefit> benefits;

    @SerializedName("count")
    @Expose
    private Long count;

    @Generated
    public GetAvailableBenefitsResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetAvailableBenefitsResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAvailableBenefitsResponse)) {
            return false;
        }
        GetAvailableBenefitsResponse getAvailableBenefitsResponse = (GetAvailableBenefitsResponse) obj;
        if (!getAvailableBenefitsResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Long count = getCount();
        Long count2 = getAvailableBenefitsResponse.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        List<AvailableBenefit> benefits = getBenefits();
        List<AvailableBenefit> benefits2 = getAvailableBenefitsResponse.getBenefits();
        return benefits != null ? benefits.equals(benefits2) : benefits2 == null;
    }

    @Generated
    public List<AvailableBenefit> getBenefits() {
        return this.benefits;
    }

    @Generated
    public Long getCount() {
        return this.count;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Long count = getCount();
        int i = hashCode * 59;
        int hashCode2 = count == null ? 43 : count.hashCode();
        List<AvailableBenefit> benefits = getBenefits();
        return ((i + hashCode2) * 59) + (benefits != null ? benefits.hashCode() : 43);
    }

    @Generated
    public void setBenefits(List<AvailableBenefit> list) {
        this.benefits = list;
    }

    @Generated
    public void setCount(Long l) {
        this.count = l;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "GetAvailableBenefitsResponse(benefits=" + getBenefits() + ", count=" + getCount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
