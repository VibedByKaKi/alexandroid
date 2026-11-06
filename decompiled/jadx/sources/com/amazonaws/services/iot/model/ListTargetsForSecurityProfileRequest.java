package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTargetsForSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String securityProfileName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTargetsForSecurityProfileRequest)) {
            return false;
        }
        ListTargetsForSecurityProfileRequest listTargetsForSecurityProfileRequest = (ListTargetsForSecurityProfileRequest) obj;
        if ((listTargetsForSecurityProfileRequest.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        if (listTargetsForSecurityProfileRequest.getSecurityProfileName() != null && !listTargetsForSecurityProfileRequest.getSecurityProfileName().equals(getSecurityProfileName())) {
            return false;
        }
        if ((listTargetsForSecurityProfileRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listTargetsForSecurityProfileRequest.getNextToken() != null && !listTargetsForSecurityProfileRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listTargetsForSecurityProfileRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listTargetsForSecurityProfileRequest.getMaxResults() == null || listTargetsForSecurityProfileRequest.getMaxResults().equals(getMaxResults());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    public int hashCode() {
        return (((((getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSecurityProfileName(String str) {
        this.securityProfileName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileName() != null) {
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTargetsForSecurityProfileRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListTargetsForSecurityProfileRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListTargetsForSecurityProfileRequest withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }
}
