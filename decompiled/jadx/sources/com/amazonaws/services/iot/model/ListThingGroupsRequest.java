package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingGroupsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String namePrefixFilter;
    private String nextToken;
    private String parentGroup;
    private Boolean recursive;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingGroupsRequest)) {
            return false;
        }
        ListThingGroupsRequest listThingGroupsRequest = (ListThingGroupsRequest) obj;
        if ((listThingGroupsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listThingGroupsRequest.getNextToken() != null && !listThingGroupsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listThingGroupsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listThingGroupsRequest.getMaxResults() != null && !listThingGroupsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listThingGroupsRequest.getParentGroup() == null) ^ (getParentGroup() == null)) {
            return false;
        }
        if (listThingGroupsRequest.getParentGroup() != null && !listThingGroupsRequest.getParentGroup().equals(getParentGroup())) {
            return false;
        }
        if ((listThingGroupsRequest.getNamePrefixFilter() == null) ^ (getNamePrefixFilter() == null)) {
            return false;
        }
        if (listThingGroupsRequest.getNamePrefixFilter() != null && !listThingGroupsRequest.getNamePrefixFilter().equals(getNamePrefixFilter())) {
            return false;
        }
        if ((listThingGroupsRequest.getRecursive() == null) ^ (getRecursive() == null)) {
            return false;
        }
        return listThingGroupsRequest.getRecursive() == null || listThingGroupsRequest.getRecursive().equals(getRecursive());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNamePrefixFilter() {
        return this.namePrefixFilter;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getParentGroup() {
        return this.parentGroup;
    }

    public Boolean getRecursive() {
        return this.recursive;
    }

    public int hashCode() {
        return (((((((((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getParentGroup() == null ? 0 : getParentGroup().hashCode())) * 31) + (getNamePrefixFilter() == null ? 0 : getNamePrefixFilter().hashCode())) * 31) + (getRecursive() != null ? getRecursive().hashCode() : 0);
    }

    public Boolean isRecursive() {
        return this.recursive;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNamePrefixFilter(String str) {
        this.namePrefixFilter = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setParentGroup(String str) {
        this.parentGroup = str;
    }

    public void setRecursive(Boolean bool) {
        this.recursive = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getParentGroup() != null) {
            sb.append("parentGroup: " + getParentGroup() + ",");
        }
        if (getNamePrefixFilter() != null) {
            sb.append("namePrefixFilter: " + getNamePrefixFilter() + ",");
        }
        if (getRecursive() != null) {
            sb.append("recursive: " + getRecursive());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingGroupsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListThingGroupsRequest withNamePrefixFilter(String str) {
        this.namePrefixFilter = str;
        return this;
    }

    public ListThingGroupsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingGroupsRequest withParentGroup(String str) {
        this.parentGroup = str;
        return this;
    }

    public ListThingGroupsRequest withRecursive(Boolean bool) {
        this.recursive = bool;
        return this;
    }
}
