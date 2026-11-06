package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
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
        return listTagsForResourceRequest.getResourceArn() == null || listTagsForResourceRequest.getResourceArn().equals(getResourceArn());
    }

    public String getResourceArn() {
        return this.resourceArn;
    }

    public int hashCode() {
        return 31 + (getResourceArn() == null ? 0 : getResourceArn().hashCode());
    }

    public void setResourceArn(String str) {
        this.resourceArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getResourceArn() != null) {
            sb.append("ResourceArn: " + getResourceArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTagsForResourceRequest withResourceArn(String str) {
        this.resourceArn = str;
        return this;
    }
}
