package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListPrincipalThingsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String principal;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListPrincipalThingsRequest)) {
            return false;
        }
        ListPrincipalThingsRequest listPrincipalThingsRequest = (ListPrincipalThingsRequest) obj;
        if ((listPrincipalThingsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listPrincipalThingsRequest.getNextToken() != null && !listPrincipalThingsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listPrincipalThingsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listPrincipalThingsRequest.getMaxResults() != null && !listPrincipalThingsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listPrincipalThingsRequest.getPrincipal() == null) ^ (getPrincipal() == null)) {
            return false;
        }
        return listPrincipalThingsRequest.getPrincipal() == null || listPrincipalThingsRequest.getPrincipal().equals(getPrincipal());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getPrincipal() {
        return this.principal;
    }

    public int hashCode() {
        return (((((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getPrincipal() != null ? getPrincipal().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setPrincipal(String str) {
        this.principal = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getPrincipal() != null) {
            sb.append("principal: " + getPrincipal());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListPrincipalThingsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListPrincipalThingsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListPrincipalThingsRequest withPrincipal(String str) {
        this.principal = str;
        return this;
    }
}
