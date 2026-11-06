package com.amazon.clouddrive.cdasdk.prompto.common;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PromptoServicePaginatedResponse {

    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    @Expose
    private String nextToken;

    @Generated
    public PromptoServicePaginatedResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PromptoServicePaginatedResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromptoServicePaginatedResponse)) {
            return false;
        }
        PromptoServicePaginatedResponse promptoServicePaginatedResponse = (PromptoServicePaginatedResponse) obj;
        if (!promptoServicePaginatedResponse.canEqual(this)) {
            return false;
        }
        Integer count = getCount();
        Integer count2 = promptoServicePaginatedResponse.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = promptoServicePaginatedResponse.getNextToken();
        return nextToken != null ? nextToken.equals(nextToken2) : nextToken2 == null;
    }

    @Generated
    public Integer getCount() {
        return this.count;
    }

    @Generated
    public String getNextToken() {
        return this.nextToken;
    }

    @Generated
    public int hashCode() {
        Integer count = getCount();
        int hashCode = count == null ? 43 : count.hashCode();
        String nextToken = getNextToken();
        return ((hashCode + 59) * 59) + (nextToken != null ? nextToken.hashCode() : 43);
    }

    @Generated
    public void setCount(Integer num) {
        this.count = num;
    }

    @Generated
    public void setNextToken(String str) {
        this.nextToken = str;
    }

    @Generated
    public String toString() {
        return "PromptoServicePaginatedResponse(nextToken=" + getNextToken() + ", count=" + getCount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
