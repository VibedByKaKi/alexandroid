package com.amazon.clouddrive.cdasdk.cdrs;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.ResourceVersion;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateOnboardingContextRequest extends CDRSServiceCustomerRequest {

    @SerializedName("contextType")
    @Expose
    private String contextType;

    @SerializedName("data")
    @Expose
    private HashMap<String, String> data;

    @SerializedName("dataVersion")
    @Expose
    private String dataVersion;

    @Generated
    public CreateOnboardingContextRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceCustomerRequest, com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CreateOnboardingContextRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceCustomerRequest, com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateOnboardingContextRequest)) {
            return false;
        }
        CreateOnboardingContextRequest createOnboardingContextRequest = (CreateOnboardingContextRequest) obj;
        if (!createOnboardingContextRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String contextType = getContextType();
        String contextType2 = createOnboardingContextRequest.getContextType();
        if (contextType != null ? !contextType.equals(contextType2) : contextType2 != null) {
            return false;
        }
        String dataVersion = getDataVersion();
        String dataVersion2 = createOnboardingContextRequest.getDataVersion();
        if (dataVersion != null ? !dataVersion.equals(dataVersion2) : dataVersion2 != null) {
            return false;
        }
        HashMap<String, String> data = getData();
        HashMap<String, String> data2 = createOnboardingContextRequest.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public /* bridge */ /* synthetic */ String getApplicationId() {
        return super.getApplicationId();
    }

    @Generated
    public String getContextType() {
        return this.contextType;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceCustomerRequest
    @Generated
    public /* bridge */ /* synthetic */ String getCustomerId() {
        return super.getCustomerId();
    }

    @Generated
    public HashMap<String, String> getData() {
        return this.data;
    }

    @Generated
    public String getDataVersion() {
        return this.dataVersion;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public /* bridge */ /* synthetic */ String getLang() {
        return super.getLang();
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public /* bridge */ /* synthetic */ ResourceVersion getResourceVersion() {
        return super.getResourceVersion();
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceCustomerRequest, com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String contextType = getContextType();
        int hashCode2 = (hashCode * 59) + (contextType == null ? 43 : contextType.hashCode());
        String dataVersion = getDataVersion();
        int i = hashCode2 * 59;
        int hashCode3 = dataVersion == null ? 43 : dataVersion.hashCode();
        HashMap<String, String> data = getData();
        return ((i + hashCode3) * 59) + (data != null ? data.hashCode() : 43);
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public /* bridge */ /* synthetic */ void setApplicationId(String str) {
        super.setApplicationId(str);
    }

    @Generated
    public void setContextType(String str) {
        this.contextType = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceCustomerRequest
    @Generated
    public /* bridge */ /* synthetic */ void setCustomerId(String str) {
        super.setCustomerId(str);
    }

    @Generated
    public void setData(HashMap<String, String> hashMap) {
        this.data = hashMap;
    }

    @Generated
    public void setDataVersion(String str) {
        this.dataVersion = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public /* bridge */ /* synthetic */ void setLang(String str) {
        super.setLang(str);
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public /* bridge */ /* synthetic */ void setResourceVersion(ResourceVersion resourceVersion) {
        super.setResourceVersion(resourceVersion);
    }

    @Override // com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceCustomerRequest, com.amazon.clouddrive.cdasdk.cdrs.CDRSServiceRequest
    @Generated
    public String toString() {
        return "CreateOnboardingContextRequest(contextType=" + getContextType() + ", dataVersion=" + getDataVersion() + ", data=" + getData() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
