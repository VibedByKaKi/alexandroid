package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetQuotaResponse extends CloudDriveResponse {

    @SerializedName("available")
    @Expose
    private Long available;

    @SerializedName("benefits")
    @Expose
    private List<Benefit> benefits;

    @SerializedName("grants")
    @Expose
    private List<Grant> grants;

    @SerializedName("lastCalculated")
    @Expose
    private String lastCalculated;

    @SerializedName("plans")
    @Expose
    private List<String> plans;

    @SerializedName("quota")
    @Expose
    private Long quota;

    @Generated
    public GetQuotaResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetQuotaResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetQuotaResponse)) {
            return false;
        }
        GetQuotaResponse getQuotaResponse = (GetQuotaResponse) obj;
        if (!getQuotaResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Long quota = getQuota();
        Long quota2 = getQuotaResponse.getQuota();
        if (quota != null ? !quota.equals(quota2) : quota2 != null) {
            return false;
        }
        Long available = getAvailable();
        Long available2 = getQuotaResponse.getAvailable();
        if (available != null ? !available.equals(available2) : available2 != null) {
            return false;
        }
        List<String> plans = getPlans();
        List<String> plans2 = getQuotaResponse.getPlans();
        if (plans != null ? !plans.equals(plans2) : plans2 != null) {
            return false;
        }
        List<Benefit> benefits = getBenefits();
        List<Benefit> benefits2 = getQuotaResponse.getBenefits();
        if (benefits != null ? !benefits.equals(benefits2) : benefits2 != null) {
            return false;
        }
        List<Grant> grants = getGrants();
        List<Grant> grants2 = getQuotaResponse.getGrants();
        if (grants != null ? !grants.equals(grants2) : grants2 != null) {
            return false;
        }
        String lastCalculated = getLastCalculated();
        String lastCalculated2 = getQuotaResponse.getLastCalculated();
        return lastCalculated != null ? lastCalculated.equals(lastCalculated2) : lastCalculated2 == null;
    }

    @Generated
    public Long getAvailable() {
        return this.available;
    }

    @Generated
    public List<Benefit> getBenefits() {
        return this.benefits;
    }

    @Generated
    public List<Grant> getGrants() {
        return this.grants;
    }

    @Generated
    public String getLastCalculated() {
        return this.lastCalculated;
    }

    @Generated
    public List<String> getPlans() {
        return this.plans;
    }

    @Generated
    public Long getQuota() {
        return this.quota;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Long quota = getQuota();
        int hashCode2 = (hashCode * 59) + (quota == null ? 43 : quota.hashCode());
        Long available = getAvailable();
        int hashCode3 = (hashCode2 * 59) + (available == null ? 43 : available.hashCode());
        List<String> plans = getPlans();
        int hashCode4 = (hashCode3 * 59) + (plans == null ? 43 : plans.hashCode());
        List<Benefit> benefits = getBenefits();
        int hashCode5 = (hashCode4 * 59) + (benefits == null ? 43 : benefits.hashCode());
        List<Grant> grants = getGrants();
        int i = hashCode5 * 59;
        int hashCode6 = grants == null ? 43 : grants.hashCode();
        String lastCalculated = getLastCalculated();
        return ((i + hashCode6) * 59) + (lastCalculated != null ? lastCalculated.hashCode() : 43);
    }

    @Generated
    public void setAvailable(Long l) {
        this.available = l;
    }

    @Generated
    public void setBenefits(List<Benefit> list) {
        this.benefits = list;
    }

    @Generated
    public void setGrants(List<Grant> list) {
        this.grants = list;
    }

    @Generated
    public void setLastCalculated(String str) {
        this.lastCalculated = str;
    }

    @Generated
    public void setPlans(List<String> list) {
        this.plans = list;
    }

    @Generated
    public void setQuota(Long l) {
        this.quota = l;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "GetQuotaResponse(quota=" + getQuota() + ", available=" + getAvailable() + ", plans=" + getPlans() + ", benefits=" + getBenefits() + ", grants=" + getGrants() + ", lastCalculated=" + getLastCalculated() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
