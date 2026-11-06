package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingRegistrationTasksRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingRegistrationTasksRequest)) {
            return false;
        }
        ListThingRegistrationTasksRequest listThingRegistrationTasksRequest = (ListThingRegistrationTasksRequest) obj;
        if ((listThingRegistrationTasksRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listThingRegistrationTasksRequest.getNextToken() != null && !listThingRegistrationTasksRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listThingRegistrationTasksRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listThingRegistrationTasksRequest.getMaxResults() != null && !listThingRegistrationTasksRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listThingRegistrationTasksRequest.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        return listThingRegistrationTasksRequest.getStatus() == null || listThingRegistrationTasksRequest.getStatus().equals(getStatus());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getStatus() != null ? getStatus().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStatus(Status status) {
        this.status = status.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingRegistrationTasksRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListThingRegistrationTasksRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingRegistrationTasksRequest withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public ListThingRegistrationTasksRequest withStatus(String str) {
        this.status = str;
        return this;
    }
}
