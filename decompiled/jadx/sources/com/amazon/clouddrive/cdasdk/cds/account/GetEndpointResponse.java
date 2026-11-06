package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetEndpointResponse extends CloudDriveResponse {

    @SerializedName("contentUrl")
    @Expose
    private String contentUrl;

    @SerializedName("countryAtSignup")
    @Expose
    private String countryAtSignup;

    @SerializedName("customerExists")
    @Expose
    private Boolean customerExists;

    @SerializedName("marketplaceAtSignup")
    @Expose
    private String marketplaceAtSignup;

    @SerializedName("metadataUrl")
    @Expose
    private String metadataUrl;

    @SerializedName("region")
    @Expose
    private String region;

    @SerializedName("retailUrl")
    @Expose
    private String retailUrl;

    @Generated
    public GetEndpointResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetEndpointResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEndpointResponse)) {
            return false;
        }
        GetEndpointResponse getEndpointResponse = (GetEndpointResponse) obj;
        if (!getEndpointResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean customerExists = getCustomerExists();
        Boolean customerExists2 = getEndpointResponse.getCustomerExists();
        if (customerExists != null ? !customerExists.equals(customerExists2) : customerExists2 != null) {
            return false;
        }
        String retailUrl = getRetailUrl();
        String retailUrl2 = getEndpointResponse.getRetailUrl();
        if (retailUrl != null ? !retailUrl.equals(retailUrl2) : retailUrl2 != null) {
            return false;
        }
        String metadataUrl = getMetadataUrl();
        String metadataUrl2 = getEndpointResponse.getMetadataUrl();
        if (metadataUrl != null ? !metadataUrl.equals(metadataUrl2) : metadataUrl2 != null) {
            return false;
        }
        String countryAtSignup = getCountryAtSignup();
        String countryAtSignup2 = getEndpointResponse.getCountryAtSignup();
        if (countryAtSignup != null ? !countryAtSignup.equals(countryAtSignup2) : countryAtSignup2 != null) {
            return false;
        }
        String marketplaceAtSignup = getMarketplaceAtSignup();
        String marketplaceAtSignup2 = getEndpointResponse.getMarketplaceAtSignup();
        if (marketplaceAtSignup != null ? !marketplaceAtSignup.equals(marketplaceAtSignup2) : marketplaceAtSignup2 != null) {
            return false;
        }
        String contentUrl = getContentUrl();
        String contentUrl2 = getEndpointResponse.getContentUrl();
        if (contentUrl != null ? !contentUrl.equals(contentUrl2) : contentUrl2 != null) {
            return false;
        }
        String region = getRegion();
        String region2 = getEndpointResponse.getRegion();
        return region != null ? region.equals(region2) : region2 == null;
    }

    @Generated
    public String getContentUrl() {
        return this.contentUrl;
    }

    @Generated
    public String getCountryAtSignup() {
        return this.countryAtSignup;
    }

    @Generated
    public Boolean getCustomerExists() {
        return this.customerExists;
    }

    @Generated
    public String getMarketplaceAtSignup() {
        return this.marketplaceAtSignup;
    }

    @Generated
    public String getMetadataUrl() {
        return this.metadataUrl;
    }

    @Generated
    public String getRegion() {
        return this.region;
    }

    @Generated
    public String getRetailUrl() {
        return this.retailUrl;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean customerExists = getCustomerExists();
        int hashCode2 = (hashCode * 59) + (customerExists == null ? 43 : customerExists.hashCode());
        String retailUrl = getRetailUrl();
        int hashCode3 = (hashCode2 * 59) + (retailUrl == null ? 43 : retailUrl.hashCode());
        String metadataUrl = getMetadataUrl();
        int hashCode4 = (hashCode3 * 59) + (metadataUrl == null ? 43 : metadataUrl.hashCode());
        String countryAtSignup = getCountryAtSignup();
        int hashCode5 = (hashCode4 * 59) + (countryAtSignup == null ? 43 : countryAtSignup.hashCode());
        String marketplaceAtSignup = getMarketplaceAtSignup();
        int hashCode6 = (hashCode5 * 59) + (marketplaceAtSignup == null ? 43 : marketplaceAtSignup.hashCode());
        String contentUrl = getContentUrl();
        int i = hashCode6 * 59;
        int hashCode7 = contentUrl == null ? 43 : contentUrl.hashCode();
        String region = getRegion();
        return ((i + hashCode7) * 59) + (region != null ? region.hashCode() : 43);
    }

    @Generated
    public void setContentUrl(String str) {
        this.contentUrl = str;
    }

    @Generated
    public void setCountryAtSignup(String str) {
        this.countryAtSignup = str;
    }

    @Generated
    public void setCustomerExists(Boolean bool) {
        this.customerExists = bool;
    }

    @Generated
    public void setMarketplaceAtSignup(String str) {
        this.marketplaceAtSignup = str;
    }

    @Generated
    public void setMetadataUrl(String str) {
        this.metadataUrl = str;
    }

    @Generated
    public void setRegion(String str) {
        this.region = str;
    }

    @Generated
    public void setRetailUrl(String str) {
        this.retailUrl = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "GetEndpointResponse(retailUrl=" + getRetailUrl() + ", metadataUrl=" + getMetadataUrl() + ", customerExists=" + getCustomerExists() + ", countryAtSignup=" + getCountryAtSignup() + ", marketplaceAtSignup=" + getMarketplaceAtSignup() + ", contentUrl=" + getContentUrl() + ", region=" + getRegion() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
