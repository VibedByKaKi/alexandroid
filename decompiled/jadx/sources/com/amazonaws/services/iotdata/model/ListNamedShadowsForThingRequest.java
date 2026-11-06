package com.amazonaws.services.iotdata.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListNamedShadowsForThingRequest extends AmazonWebServiceRequest implements Serializable {
    private String nextToken;
    private Integer pageSize;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListNamedShadowsForThingRequest)) {
            return false;
        }
        ListNamedShadowsForThingRequest listNamedShadowsForThingRequest = (ListNamedShadowsForThingRequest) obj;
        if ((listNamedShadowsForThingRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (listNamedShadowsForThingRequest.getThingName() != null && !listNamedShadowsForThingRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((listNamedShadowsForThingRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listNamedShadowsForThingRequest.getNextToken() != null && !listNamedShadowsForThingRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listNamedShadowsForThingRequest.getPageSize() == null) ^ (getPageSize() == null)) {
            return false;
        }
        return listNamedShadowsForThingRequest.getPageSize() == null || listNamedShadowsForThingRequest.getPageSize().equals(getPageSize());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getPageSize() != null ? getPageSize().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setPageSize(Integer num) {
        this.pageSize = num;
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
        if (getPageSize() != null) {
            sb.append("pageSize: " + getPageSize());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListNamedShadowsForThingRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListNamedShadowsForThingRequest withPageSize(Integer num) {
        this.pageSize = num;
        return this;
    }

    public ListNamedShadowsForThingRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
