package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    private String nextToken;
    private String resourceArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsForResourceRequest)) {
            return false;
        }
        ListTagsForResourceRequest listTagsForResourceRequest = (ListTagsForResourceRequest) obj;
        if ((listTagsForResourceRequest.getResourceArn() == null) ^ (getResourceArn() == null)) {
            return false;
        }
        if (listTagsForResourceRequest.getResourceArn() != null && !listTagsForResourceRequest.getResourceArn().equals(getResourceArn())) {
            return false;
        }
        if ((listTagsForResourceRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listTagsForResourceRequest.getNextToken() == null || listTagsForResourceRequest.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getResourceArn() {
        return this.resourceArn;
    }

    public int hashCode() {
        return (((getResourceArn() == null ? 0 : getResourceArn().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setResourceArn(String str) {
        this.resourceArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getResourceArn() != null) {
            sb.append("resourceArn: " + getResourceArn() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTagsForResourceRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListTagsForResourceRequest withResourceArn(String str) {
        this.resourceArn = str;
        return this;
    }
}
