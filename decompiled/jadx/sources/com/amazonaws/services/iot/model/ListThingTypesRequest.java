package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingTypesRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String thingTypeName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingTypesRequest)) {
            return false;
        }
        ListThingTypesRequest listThingTypesRequest = (ListThingTypesRequest) obj;
        if ((listThingTypesRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listThingTypesRequest.getNextToken() != null && !listThingTypesRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listThingTypesRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listThingTypesRequest.getMaxResults() != null && !listThingTypesRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listThingTypesRequest.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        return listThingTypesRequest.getThingTypeName() == null || listThingTypesRequest.getThingTypeName().equals(getThingTypeName());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public int hashCode() {
        return (((((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getThingTypeName() != null ? getThingTypeName().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingTypesRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListThingTypesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingTypesRequest withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }
}
