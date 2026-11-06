package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingPrincipalsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingPrincipalsRequest)) {
            return false;
        }
        ListThingPrincipalsRequest listThingPrincipalsRequest = (ListThingPrincipalsRequest) obj;
        if ((listThingPrincipalsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listThingPrincipalsRequest.getNextToken() != null && !listThingPrincipalsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listThingPrincipalsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listThingPrincipalsRequest.getMaxResults() != null && !listThingPrincipalsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listThingPrincipalsRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        return listThingPrincipalsRequest.getThingName() == null || listThingPrincipalsRequest.getThingName().equals(getThingName());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getThingName() != null ? getThingName().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingPrincipalsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListThingPrincipalsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingPrincipalsRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
