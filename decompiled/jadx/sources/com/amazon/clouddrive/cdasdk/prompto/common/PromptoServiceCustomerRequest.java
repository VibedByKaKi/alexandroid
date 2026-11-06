package com.amazon.clouddrive.cdasdk.prompto.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PromptoServiceCustomerRequest extends PromptoServiceRequest {

    @SerializedName(BizMetricsConstants.CUSTOMER_ID)
    @Expose
    private String customerId;

    @Generated
    public PromptoServiceCustomerRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PromptoServiceCustomerRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromptoServiceCustomerRequest)) {
            return false;
        }
        PromptoServiceCustomerRequest promptoServiceCustomerRequest = (PromptoServiceCustomerRequest) obj;
        if (!promptoServiceCustomerRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String customerId = getCustomerId();
        String customerId2 = promptoServiceCustomerRequest.getCustomerId();
        return customerId != null ? customerId.equals(customerId2) : customerId2 == null;
    }

    @Generated
    public String getCustomerId() {
        return this.customerId;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String customerId = getCustomerId();
        return (hashCode * 59) + (customerId == null ? 43 : customerId.hashCode());
    }

    @Generated
    public void setCustomerId(String str) {
        this.customerId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public String toString() {
        return "PromptoServiceCustomerRequest(customerId=" + getCustomerId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
