package com.amazon.clouddrive.cdasdk.prompto.common;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PromptoServicePaginatedRequest extends PromptoServiceCustomerRequest {

    @SerializedName("maxResults")
    @Expose
    private Integer maxResults;

    @SerializedName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    @Expose
    private String nextToken;

    @Generated
    public PromptoServicePaginatedRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PromptoServicePaginatedRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromptoServicePaginatedRequest)) {
            return false;
        }
        PromptoServicePaginatedRequest promptoServicePaginatedRequest = (PromptoServicePaginatedRequest) obj;
        if (!promptoServicePaginatedRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Integer maxResults = getMaxResults();
        Integer maxResults2 = promptoServicePaginatedRequest.getMaxResults();
        if (maxResults != null ? !maxResults.equals(maxResults2) : maxResults2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = promptoServicePaginatedRequest.getNextToken();
        return nextToken != null ? nextToken.equals(nextToken2) : nextToken2 == null;
    }

    @Generated
    public Integer getMaxResults() {
        return this.maxResults;
    }

    @Generated
    public String getNextToken() {
        return this.nextToken;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Integer maxResults = getMaxResults();
        int i = hashCode * 59;
        int hashCode2 = maxResults == null ? 43 : maxResults.hashCode();
        String nextToken = getNextToken();
        return ((i + hashCode2) * 59) + (nextToken != null ? nextToken.hashCode() : 43);
    }

    @Generated
    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    @Generated
    public void setNextToken(String str) {
        this.nextToken = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public String toString() {
        return "PromptoServicePaginatedRequest(nextToken=" + getNextToken() + ", maxResults=" + getMaxResults() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
