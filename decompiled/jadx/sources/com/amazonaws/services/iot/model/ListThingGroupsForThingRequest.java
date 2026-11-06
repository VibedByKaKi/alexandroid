package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingGroupsForThingRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingGroupsForThingRequest)) {
            return false;
        }
        ListThingGroupsForThingRequest listThingGroupsForThingRequest = (ListThingGroupsForThingRequest) obj;
        if ((listThingGroupsForThingRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (listThingGroupsForThingRequest.getThingName() != null && !listThingGroupsForThingRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((listThingGroupsForThingRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listThingGroupsForThingRequest.getNextToken() != null && !listThingGroupsForThingRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listThingGroupsForThingRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listThingGroupsForThingRequest.getMaxResults() == null || listThingGroupsForThingRequest.getMaxResults().equals(getMaxResults());
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
        return (((((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
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
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
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

    public ListThingGroupsForThingRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListThingGroupsForThingRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingGroupsForThingRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
